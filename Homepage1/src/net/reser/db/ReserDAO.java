package net.reser.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import net.reser.action.ReserAction;

public class ReserDAO {
	DataSource ds;
	Connection con = null;
	PreparedStatement pstmt = null;
	PreparedStatement pstmt1 = null;
	PreparedStatement pstmt2 = null;
	ResultSet rs = null;
	ResultSet rs1 = null;
	ResultSet rs2 = null;
	int num = 0;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public ReserDAO() {
		try {
			Context init = new InitialContext();
			ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			System.out.println("DAO생성자");
		} catch (Exception ex) {
			System.out.println("DB 연결 실패 : " + ex);
			return;
		}
	}
	
	
	public ReserBean getGuest(String guestname){
        String sql="SELECT * FROM guest where guestname=?";
        
        String guest =null;
        ReserBean mb=new ReserBean();
        try{
            con=ds.getConnection();
            pstmt=con.prepareStatement(sql);            
            pstmt.setString(1, guestname);
            rs=pstmt.executeQuery();
            
            if(rs.next()){
                mb.setG_GUESTNAME(rs.getString("guestname"));
                mb.setG_PHONE1(rs.getString("phone1"));
                mb.setG_PHONE2(rs.getString("phone2"));
                mb.setG_PHONE3(rs.getString("phone3"));
                mb.setG_ARRIVAL_TIME(rs.getString("arrivaltime"));
                mb.setG_MEMO(rs.getString("memo"));
                mb.setPassword(rs.getString("pw"));
                mb.setResernum(rs.getInt("resernum"));
                
            }
            
            return mb;
        }catch(Exception ex){
            System.out.println("getguestlist 에러: " + ex);            
        }finally{
            if(rs!=null) try{rs.close();}catch(SQLException ex){}
            if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
            if(con!=null) try{con.close();}catch(SQLException ex){}
        }
        return null;
    }
	
	public List getGuestList(){
        String sql="SELECT * FROM guest";
        List guestlist=new ArrayList();
        
        try{
            con=ds.getConnection();
            pstmt=con.prepareStatement(sql);
            rs=pstmt.executeQuery();
            
            while(rs.next()){
                ReserBean mb=new ReserBean();
                mb.setG_GUESTNAME(rs.getString("guestname"));
                mb.setG_PHONE1(rs.getString("phone1"));
                mb.setG_PHONE2(rs.getString("phone2"));
                mb.setG_PHONE3(rs.getString("phone3"));
                mb.setG_ARRIVAL_TIME(rs.getString("arrivaltime"));
                mb.setG_MEMO(rs.getString("memo"));
                mb.setPassword(rs.getString("pw"));
                mb.setResernum(rs.getInt("resernum"));
                
                guestlist.add(mb);
            }
            
            return guestlist;
        }catch(Exception ex){
            System.out.println("getguestlist 에러: " + ex);            
        }finally{
            if(rs!=null) try{rs.close();}catch(SQLException ex){}
            if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
            if(con!=null) try{con.close();}catch(SQLException ex){}
        }
        return null;
    }
	
	
	public List getRoomList(){
        String sql="SELECT * FROM ROOM";
        List roomlist=new ArrayList();
        
        try{
            con=ds.getConnection();
            pstmt=con.prepareStatement(sql);
            rs=pstmt.executeQuery();
            
            while(rs.next()){
                ReserBean mb=new ReserBean();
                mb.setR_ROOMNAME(rs.getString("roomname"));
                mb.setR_OVERGUEST(rs.getString("overguest"));
                mb.setR_ARRIVAL(rs.getString("arrival"));
                mb.setR_STAY(rs.getString("stay"));
                mb.setR_pay(rs.getString("pay"));
                
                
                roomlist.add(mb);
            }
            
            return roomlist;
        }catch(Exception ex){
            System.out.println("getDeatilMember 에러: " + ex);            
        }finally{
            if(rs!=null) try{rs.close();}catch(SQLException ex){}
            if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
            if(con!=null) try{con.close();}catch(SQLException ex){}
        }
        return null;
    }
	
	
	
	
	
	// 예약할때 정보 입력해준다
	public boolean reservation_RoomInfo(ReserBean rb) {
		String roomsql = "insert into ROOM(ROOMNAME, OVERGUEST, ARRIVAL, STAY, PAY, PW, RESERNUM) values(?,?,?,?,?,?,?)";
		String guestsql = "insert into GUEST(GUESTNAME, PHONE1, PHONE2, PHONE3, ARRIVALTIME, MEMO, PW, RESERNUM) values(?,?,?,?,?,?,?,?)";

		ReserAction ra = new ReserAction();

		int result = 0;

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement("select max(resernum) from room");
			rs = pstmt.executeQuery();

			if (rs.next())
				num = rs.getInt(1) + 1;
			else
				num = 1;

			pstmt = con.prepareStatement(roomsql);
			pstmt1 = con.prepareStatement(guestsql);

			pstmt.setString(1, rb.getR_ROOMNAME());
			pstmt.setString(2, rb.getR_OVERGUEST());
			pstmt.setString(3, rb.getR_ARRIVAL());
			pstmt.setString(4, rb.getR_STAY());
			pstmt.setString(5, rb.getR_pay());
			pstmt.setString(6, rb.getPassword());
			pstmt.setInt(7, num);

			pstmt1.setString(1, rb.getG_GUESTNAME());
			pstmt1.setString(2, rb.getG_PHONE1());
			pstmt1.setString(3, rb.getG_PHONE2());
			pstmt1.setString(4, rb.getG_PHONE3());
			pstmt1.setString(5, rb.getG_ARRIVAL_TIME());
			pstmt1.setString(6, rb.getG_MEMO());
			pstmt1.setString(7, rb.getPassword());
			pstmt1.setInt(8, num);

			System.out.println("예약번호값은 잘 들어갔을까????????????????????" + num);

			result = pstmt.executeUpdate();
			result = pstmt1.executeUpdate();
			if (result == 0)
				return false;
			return true;

		} catch (Exception ex) {
			System.out.println("DAO 예약정보 입력 에러 : " + ex);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException ex) {
				}
		}
		return false;
	}

	// 예약 취소를 해주는 부분 예약 비밀번호, 예약번호를 이용하여 방 정보, 예약자 정보에서 row를 삭제한다
	public boolean rescancel1(String pw) {
		String rcancel = "delete room where pw = ?";

		int result = 0;
		System.out.println("rescancel1의 try직전");

		try {
			System.out.println("try진입");

			con = ds.getConnection();
			pstmt = con.prepareStatement(rcancel);
			pstmt.setString(1, pw);
			result = pstmt.executeUpdate();
			System.out.println("쿼리문 수행 완료");

			
			if (result == 0)
				return false;

			return true;
		} catch (Exception ex) {
			System.out.println("예약취소 에러 : " + ex);
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception ex) {
			}

		}
		return false;
	}
	
	// 예약 취소를 해주는 부분 예약 비밀번호, 예약번호를 이용하여 방 정보, 예약자 정보에서 row를 삭제한다
		public boolean rescancel2(String pw) {
			String rcancel = "delete guest where pw = ?";

			int result = 0;

			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(rcancel);
				pstmt.setString(1, pw);
				result = pstmt.executeUpdate();
				if (result == 0)
					return false;

				return true;
			} catch (Exception ex) {
				System.out.println("예약취소 에러 : " + ex);
			} finally {
				try {
					if (pstmt != null)
						pstmt.close();
					if (con != null)
						con.close();
				} catch (Exception ex) {
				}

			}
			return false;
		}

		
		public boolean rescancel3(int num) {
			String rcancel = "delete guest where resernum = ?";

			int result = 0;

			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(rcancel);
				pstmt.setInt(1, num);
				result = pstmt.executeUpdate();
				if (result == 0)
					return false;

				return true;
			} catch (Exception ex) {
				System.out.println("예약취소 에러 : " + ex);
			} finally {
				try {
					if (pstmt != null)
						pstmt.close();
					if (con != null)
						con.close();
				} catch (Exception ex) {
				}

			}
			return false;
		}
		

	// 예약 최종확인 해주는 부분
	public ReserBean finalcheck(int resernum) throws Exception {
		String gcheck = "select * from guest where resernum = ? ";// 예약번호를 이용하여
																	// guest테이블
																	// 값을 불러온다
		ReserBean reser = null;

		System.out.println("try진입 직전");
		try {
			con = ds.getConnection();
			pstmt1 = con.prepareStatement(gcheck);
			pstmt1.setInt(1, resernum);
			rs = pstmt1.executeQuery(); // <- 여기가 문제있음

			if (rs.next()) {
				reser = new ReserBean();
				System.out.println("if문 안으로 들어옴");
				System.out.println("------------finalcheck 확인해보자----------------");

				reser.setG_GUESTNAME(rs.getString("GUESTNAME")); // 이름 g
				System.out.println(rs.getString("GUESTNAME"));
				System.out.println(reser.getG_GUESTNAME());

				reser.setG_PHONE1(rs.getString("PHONE1"));// 휴대폰 번호 g
				System.out.println(rs.getString("PHONE1"));
				System.out.println(reser.getG_PHONE1());

				reser.setG_PHONE2(rs.getString("PHONE2"));// 휴대폰 번호 g
				System.out.println(rs.getString("PHONE2"));
				System.out.println(reser.getG_PHONE2());

				reser.setG_PHONE3(rs.getString("PHONE3"));// 휴대폰 번호 g
				System.out.println(rs.getString("PHONE3"));
				System.out.println(reser.getG_PHONE3());

				reser.setG_ARRIVAL_TIME(rs.getString("ARRIVALTIME"));// 도착예정시간 g
				System.out.println(rs.getString("ARRIVALTIME"));
				System.out.println(reser.getG_ARRIVAL_TIME());

				reser.setG_MEMO(rs.getString("MEMO"));// 기타 메모 g
				System.out.println(rs.getString("MEMO"));
				System.out.println(reser.getG_MEMO());
				System.out.println("------------finalcheck 확인해보자 끝----------------");
			}

			return reser;
		} catch (Exception ex) {
			System.out.println("최종확인 에러: " + ex);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException ex) {
				}
		}
		return null;
	}

	// 예약 최종확인 해주는 부분
	public ReserBean finalcheck1(int resernum) throws Exception {
		String rcheck = "select * from room where resernum = ? ";// 예약번호를 이용하여
																	// room테이블
																	// 값을 불러온다
		ReserBean reser = null;

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(rcheck);
			pstmt.setInt(1, resernum);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				reser = new ReserBean();
				System.out.println("------------finalcheck1 확인해보자----------------");
				reser.setR_ARRIVAL(rs.getString("ARRIVAL"));// 예약일 r
				System.out.println(rs.getString("ARRIVAL"));
				System.out.println(reser.getR_ARRIVAL());

				reser.setR_ROOMNAME(rs.getString("ROOMNAME"));// 예약객실 r
				System.out.println(rs.getString("ROOMNAME"));
				System.out.println(reser.getR_ROOMNAME());

				reser.setR_OVERGUEST(rs.getString("OVERGUEST"));// 추가인원 r
				System.out.println(rs.getString("OVERGUEST"));
				System.out.println(reser.getR_OVERGUEST());

				reser.setR_STAY(rs.getString("STAY"));// 숙박기간 r
				System.out.println(rs.getString("STAY"));
				System.out.println(reser.getR_STAY());
				
				reser.setResernum(resernum);
				
				System.out.println("------------finalcheck1 확인해보자 끝----------------");
			}

			return reser;
		} catch (Exception ex) {
			System.out.println("최종확인 에러: " + ex);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException ex) {
				}
		}
		return null;
	}
	
	// 예약 목록을 보여주는 부분
	public ReserBean reserlist(String G_GUESTNAME, String password, String G_PHONE1, String G_PHONE2, String G_PHONE3)
			throws Exception {
		System.out.println("DAO의 reserlist메서드 진입");
		String frsql = "select resernum from guest where GUESTNAME=? and pw=? and phone1=? and phone2=? and phone3=?";
		// 이름 비밀번호 연락처로 예약번호를 검색해주는 쿼리문
		ReserBean reser = null;
		System.out.println("DAO의 reserlist메서드 필드 통과 & try문 바로 윗줄까지 진입");
		System.out.println(G_GUESTNAME+"\t"+password+"\t"+G_PHONE1+"\t"+G_PHONE2+"\t"+G_PHONE3);
		try {
			System.out.println("try문 진입");
			// 받아온 값으로 예약번호 조회하는 부분
			con = ds.getConnection();
			pstmt = con.prepareStatement(frsql);
			pstmt.setString(1, G_GUESTNAME);
			pstmt.setString(2, password);
			pstmt.setString(3, G_PHONE1);
			pstmt.setString(4, G_PHONE2);
			pstmt.setString(5, G_PHONE3);
			rs = pstmt.executeQuery();
			reser = new ReserBean();
			if (rs.next()) {
				reser.setResernum(rs.getInt("resernum"));
			}
			System.out.println("reser에 들어간 예약번호 값은 :"+reser.getResernum());
			return reser;
			// 예약번호 조회 종료
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("예약목록 보여주기 에러 :" + ex);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException ex) {
				}
		}
		return null;
	}

	// 예약 목록을 보여주는 부분
	public ReserBean reserlist1(ReserBean reserdata)
			throws Exception {
		System.out.println("DAO의 reserlist1메서드 진입");
		String rsql = "select * from room where resernum=?";
		// frsql을 통해 찾아온 예약번호를 통해 방정보 테이블에서 값을 찾아오는 쿼리문
		System.out.println("DAO의 reserlist1메서드 필드 통과 & try문 바로 윗줄까지 진입");
		try {
			System.out.println("try문 진입");
			// 예약번호를 이용하여 방 정보 조회 / 객실명 - roomname / 숙박기간 - stay / 예약번호 -
			// resernum
			ReserBean reser1 = new ReserBean();
			System.out.println("pstmt = con.prepareStatement(rsql); <- 이게 문제일까?");
			con = ds.getConnection();
			pstmt = con.prepareStatement(rsql);
			System.out.println("지금 이게 출력되면 pstmt는 문제가 없다는 말인데 아마도 이건 출력이 안될꺼야.....");
			pstmt.setInt(1, reserdata.getResernum());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				reser1.setR_ROOMNAME(rs.getString("roomname"));
				System.out.println("reser1에 들어간 방 이름 값은 :"+reser1.getR_ROOMNAME());
				reser1.setR_STAY(rs.getString("stay"));
				System.out.println("reser1에 들어간 숙박일수 값은:"+reser1.getR_STAY());
				reser1.setResernum(rs.getInt("resernum"));
				System.out.println("reser1에 들어간 예약번호 값은:"+reser1.getResernum());
			}
			// 예약 번호를 이용하여 방 정보 조회 종료
			return reser1;

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("예약목록 보여주기 에러 :" + ex);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException ex) {
				}
		}
		return null;
	}
	
	// 예약 목록을 보여주는 부분
	public ReserBean reserlist2(ReserBean reser)
			throws Exception {
		String gsql = "select * from guest where resernum=?";
		// frsql을 통해 찾아온 예약번호를 통해 고객 테이블에서 값을 찾아오는 쿼리문
		System.out.println("DAO의 reserlist2메서드 필드 통과 & try문 바로 윗줄까지 진입");
		try {
			System.out.println("try문 진입");
			// 예약 번호를 이용하여 고객 정보 조회 / 이름 - guestname / 메모 - memo
			// ReserBean reser2 = new ReserBean();
			ReserBean reser1 = new ReserBean();
			con = ds.getConnection();
			pstmt = con.prepareStatement(gsql);
			pstmt.setInt(1, reser.getResernum());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				reser1.setG_GUESTNAME(rs.getString("guestname"));
				System.out.println("reser1에 들어간 고객 이름 값은:"+reser1.getG_GUESTNAME());
				reser1.setG_MEMO(rs.getString("memo"));
				System.out.println("reser1에 들어간 메모 값은:"+reser1.getG_MEMO());
			}
			// 예약 번호를 이용하여 고객 정보 조회 종료
			return reser1;
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("예약목록 보여주기 에러 :" + ex);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException ex) {
				}
		}
		return null;
	}
}