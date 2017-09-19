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
			System.out.println("DAO������");
		} catch (Exception ex) {
			System.out.println("DB ���� ���� : " + ex);
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
            System.out.println("getguestlist ����: " + ex);            
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
            System.out.println("getguestlist ����: " + ex);            
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
            System.out.println("getDeatilMember ����: " + ex);            
        }finally{
            if(rs!=null) try{rs.close();}catch(SQLException ex){}
            if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
            if(con!=null) try{con.close();}catch(SQLException ex){}
        }
        return null;
    }
	
	
	
	
	
	// �����Ҷ� ���� �Է����ش�
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

			System.out.println("�����ȣ���� �� ������????????????????????" + num);

			result = pstmt.executeUpdate();
			result = pstmt1.executeUpdate();
			if (result == 0)
				return false;
			return true;

		} catch (Exception ex) {
			System.out.println("DAO �������� �Է� ���� : " + ex);
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

	// ���� ��Ҹ� ���ִ� �κ� ���� ��й�ȣ, �����ȣ�� �̿��Ͽ� �� ����, ������ �������� row�� �����Ѵ�
	public boolean rescancel1(String pw) {
		String rcancel = "delete room where pw = ?";

		int result = 0;
		System.out.println("rescancel1�� try����");

		try {
			System.out.println("try����");

			con = ds.getConnection();
			pstmt = con.prepareStatement(rcancel);
			pstmt.setString(1, pw);
			result = pstmt.executeUpdate();
			System.out.println("������ ���� �Ϸ�");

			
			if (result == 0)
				return false;

			return true;
		} catch (Exception ex) {
			System.out.println("������� ���� : " + ex);
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
	
	// ���� ��Ҹ� ���ִ� �κ� ���� ��й�ȣ, �����ȣ�� �̿��Ͽ� �� ����, ������ �������� row�� �����Ѵ�
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
				System.out.println("������� ���� : " + ex);
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
				System.out.println("������� ���� : " + ex);
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
		

	// ���� ����Ȯ�� ���ִ� �κ�
	public ReserBean finalcheck(int resernum) throws Exception {
		String gcheck = "select * from guest where resernum = ? ";// �����ȣ�� �̿��Ͽ�
																	// guest���̺�
																	// ���� �ҷ��´�
		ReserBean reser = null;

		System.out.println("try���� ����");
		try {
			con = ds.getConnection();
			pstmt1 = con.prepareStatement(gcheck);
			pstmt1.setInt(1, resernum);
			rs = pstmt1.executeQuery(); // <- ���Ⱑ ��������

			if (rs.next()) {
				reser = new ReserBean();
				System.out.println("if�� ������ ����");
				System.out.println("------------finalcheck Ȯ���غ���----------------");

				reser.setG_GUESTNAME(rs.getString("GUESTNAME")); // �̸� g
				System.out.println(rs.getString("GUESTNAME"));
				System.out.println(reser.getG_GUESTNAME());

				reser.setG_PHONE1(rs.getString("PHONE1"));// �޴��� ��ȣ g
				System.out.println(rs.getString("PHONE1"));
				System.out.println(reser.getG_PHONE1());

				reser.setG_PHONE2(rs.getString("PHONE2"));// �޴��� ��ȣ g
				System.out.println(rs.getString("PHONE2"));
				System.out.println(reser.getG_PHONE2());

				reser.setG_PHONE3(rs.getString("PHONE3"));// �޴��� ��ȣ g
				System.out.println(rs.getString("PHONE3"));
				System.out.println(reser.getG_PHONE3());

				reser.setG_ARRIVAL_TIME(rs.getString("ARRIVALTIME"));// ���������ð� g
				System.out.println(rs.getString("ARRIVALTIME"));
				System.out.println(reser.getG_ARRIVAL_TIME());

				reser.setG_MEMO(rs.getString("MEMO"));// ��Ÿ �޸� g
				System.out.println(rs.getString("MEMO"));
				System.out.println(reser.getG_MEMO());
				System.out.println("------------finalcheck Ȯ���غ��� ��----------------");
			}

			return reser;
		} catch (Exception ex) {
			System.out.println("����Ȯ�� ����: " + ex);
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

	// ���� ����Ȯ�� ���ִ� �κ�
	public ReserBean finalcheck1(int resernum) throws Exception {
		String rcheck = "select * from room where resernum = ? ";// �����ȣ�� �̿��Ͽ�
																	// room���̺�
																	// ���� �ҷ��´�
		ReserBean reser = null;

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(rcheck);
			pstmt.setInt(1, resernum);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				reser = new ReserBean();
				System.out.println("------------finalcheck1 Ȯ���غ���----------------");
				reser.setR_ARRIVAL(rs.getString("ARRIVAL"));// ������ r
				System.out.println(rs.getString("ARRIVAL"));
				System.out.println(reser.getR_ARRIVAL());

				reser.setR_ROOMNAME(rs.getString("ROOMNAME"));// ���ఴ�� r
				System.out.println(rs.getString("ROOMNAME"));
				System.out.println(reser.getR_ROOMNAME());

				reser.setR_OVERGUEST(rs.getString("OVERGUEST"));// �߰��ο� r
				System.out.println(rs.getString("OVERGUEST"));
				System.out.println(reser.getR_OVERGUEST());

				reser.setR_STAY(rs.getString("STAY"));// ���ڱⰣ r
				System.out.println(rs.getString("STAY"));
				System.out.println(reser.getR_STAY());
				
				reser.setResernum(resernum);
				
				System.out.println("------------finalcheck1 Ȯ���غ��� ��----------------");
			}

			return reser;
		} catch (Exception ex) {
			System.out.println("����Ȯ�� ����: " + ex);
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
	
	// ���� ����� �����ִ� �κ�
	public ReserBean reserlist(String G_GUESTNAME, String password, String G_PHONE1, String G_PHONE2, String G_PHONE3)
			throws Exception {
		System.out.println("DAO�� reserlist�޼��� ����");
		String frsql = "select resernum from guest where GUESTNAME=? and pw=? and phone1=? and phone2=? and phone3=?";
		// �̸� ��й�ȣ ����ó�� �����ȣ�� �˻����ִ� ������
		ReserBean reser = null;
		System.out.println("DAO�� reserlist�޼��� �ʵ� ��� & try�� �ٷ� ���ٱ��� ����");
		System.out.println(G_GUESTNAME+"\t"+password+"\t"+G_PHONE1+"\t"+G_PHONE2+"\t"+G_PHONE3);
		try {
			System.out.println("try�� ����");
			// �޾ƿ� ������ �����ȣ ��ȸ�ϴ� �κ�
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
			System.out.println("reser�� �� �����ȣ ���� :"+reser.getResernum());
			return reser;
			// �����ȣ ��ȸ ����
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("������ �����ֱ� ���� :" + ex);
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

	// ���� ����� �����ִ� �κ�
	public ReserBean reserlist1(ReserBean reserdata)
			throws Exception {
		System.out.println("DAO�� reserlist1�޼��� ����");
		String rsql = "select * from room where resernum=?";
		// frsql�� ���� ã�ƿ� �����ȣ�� ���� ������ ���̺��� ���� ã�ƿ��� ������
		System.out.println("DAO�� reserlist1�޼��� �ʵ� ��� & try�� �ٷ� ���ٱ��� ����");
		try {
			System.out.println("try�� ����");
			// �����ȣ�� �̿��Ͽ� �� ���� ��ȸ / ���Ǹ� - roomname / ���ڱⰣ - stay / �����ȣ -
			// resernum
			ReserBean reser1 = new ReserBean();
			System.out.println("pstmt = con.prepareStatement(rsql); <- �̰� �����ϱ�?");
			con = ds.getConnection();
			pstmt = con.prepareStatement(rsql);
			System.out.println("���� �̰� ��µǸ� pstmt�� ������ ���ٴ� ���ε� �Ƹ��� �̰� ����� �ȵɲ���.....");
			pstmt.setInt(1, reserdata.getResernum());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				reser1.setR_ROOMNAME(rs.getString("roomname"));
				System.out.println("reser1�� �� �� �̸� ���� :"+reser1.getR_ROOMNAME());
				reser1.setR_STAY(rs.getString("stay"));
				System.out.println("reser1�� �� �����ϼ� ����:"+reser1.getR_STAY());
				reser1.setResernum(rs.getInt("resernum"));
				System.out.println("reser1�� �� �����ȣ ����:"+reser1.getResernum());
			}
			// ���� ��ȣ�� �̿��Ͽ� �� ���� ��ȸ ����
			return reser1;

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("������ �����ֱ� ���� :" + ex);
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
	
	// ���� ����� �����ִ� �κ�
	public ReserBean reserlist2(ReserBean reser)
			throws Exception {
		String gsql = "select * from guest where resernum=?";
		// frsql�� ���� ã�ƿ� �����ȣ�� ���� �� ���̺��� ���� ã�ƿ��� ������
		System.out.println("DAO�� reserlist2�޼��� �ʵ� ��� & try�� �ٷ� ���ٱ��� ����");
		try {
			System.out.println("try�� ����");
			// ���� ��ȣ�� �̿��Ͽ� �� ���� ��ȸ / �̸� - guestname / �޸� - memo
			// ReserBean reser2 = new ReserBean();
			ReserBean reser1 = new ReserBean();
			con = ds.getConnection();
			pstmt = con.prepareStatement(gsql);
			pstmt.setInt(1, reser.getResernum());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				reser1.setG_GUESTNAME(rs.getString("guestname"));
				System.out.println("reser1�� �� �� �̸� ����:"+reser1.getG_GUESTNAME());
				reser1.setG_MEMO(rs.getString("memo"));
				System.out.println("reser1�� �� �޸� ����:"+reser1.getG_MEMO());
			}
			// ���� ��ȣ�� �̿��Ͽ� �� ���� ��ȸ ����
			return reser1;
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("������ �����ֱ� ���� :" + ex);
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