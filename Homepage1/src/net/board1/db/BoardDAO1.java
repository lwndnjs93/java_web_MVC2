package net.board1.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO1 {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public BoardDAO1() {
		try{
			Context init = new InitialContext();
	  		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
	  		con = ds.getConnection();
		}catch(Exception ex){
			System.out.println("DB ?��?��?��?��껓옙 ?��?��뼄占?��?�� : " + ex);
			return;
		}
	}
	
	
	public int getListCount() {
		int x= 0;
		
		try{
			pstmt=con.prepareStatement("select count(*) from board1");
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				x=rs.getInt(1);
			}
		}catch(Exception ex){
			System.out.println("getListCount error: " + ex);			
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
		}
		return x;
	}
	
	//?��?�옙 筌뤴뫖以�?? ?��귣떯?���??.	
	public List getBoardList(int page,int limit){
		
		System.out.println("?��비에?�� ?��?���??�� ?��?��?��...");
		
		String board_list_sql="select * from "+
		"(select rownum rnum,BOARD1_NUM,BOARD1_NAME,BOARD1_SUBJECT,"+
		"BOARD1_CONTENT, BOARD1_FILE, BOARD1_RE_REF, BOARD1_RE_LEV,"+
		"BOARD1_RE_SEQ, BOARD1_READCOUNT, BOARD1_DATE from "+
		"(select * from board1 order by BOARD1_RE_REF desc,BOARD1_RE_SEQ asc)) "+
		"where rnum>=? and rnum<=?";
		
		List list = new ArrayList();
		
		System.out.println("리스?��11111111111 + " + list);
		
		int startrow=(page-1)*10+1; 
		System.out.println("리스?��22222222 + " + list);
		int endrow=startrow+limit-1; 
		
		System.out.println("리스?��33333333 + " + list);
		
		try{
			pstmt = con.prepareStatement(board_list_sql);
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			rs = pstmt.executeQuery();
			
			System.out.println("?��비에?�� ?��?���??�� ?��?��?��...2222");
			
			while(rs.next()){
				BoardBean1 board = new BoardBean1();
				board.setBOARD1_NUM(rs.getInt("BOARD1_NUM"));
				board.setBOARD1_NAME(rs.getString("BOARD1_NAME"));
				board.setBOARD1_SUBJECT(rs.getString("BOARD1_SUBJECT"));
				board.setBOARD1_CONTENT(rs.getString("BOARD1_CONTENT"));
				board.setBOARD1_FILE(rs.getString("BOARD1_FILE"));
				board.setBOARD1_RE_REF(rs.getInt("BOARD1_RE_REF"));
				board.setBOARD1_RE_LEV(rs.getInt("BOARD1_RE_LEV"));
				board.setBOARD1_RE_SEQ(rs.getInt("BOARD1_RE_SEQ"));
				board.setBOARD1_READCOUNT(rs.getInt("BOARD1_READCOUNT"));
				board.setBOARD1_DATE(rs.getDate("BOARD1_DATE"));
				list.add(board);
			}
			
			System.out.println("리스?��1111 + " + list);
			
			return list;
		}catch(Exception ex){
			System.out.println("getBoardList 보드리스?�� ?��?�� : " + ex);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
		}
		System.out.println("?��비에?�� ?��?���??�� ?��?��?��...44444");
		return null;
	}
	
	//?��?�옙 ?��?��???��?��?�� ?��귣떯?���??.
	public BoardBean1 getDetail(int num) throws Exception{
		BoardBean1 board = null;
		try{
			
			pstmt = con.prepareStatement(
			"select * from board1 where BOARD1_NUM = ?");
		//"select * from board1, board2re where BOARD1_NUM = ? and BOARD1_NUM = BOARD1RE_NUM");
			
			pstmt.setInt(1, num);
			System.out.println("?��?? "+num);
			rs= pstmt.executeQuery();
			
			if(rs.next()){
				
				board = new BoardBean1();
				board.setBOARD1_NUM(rs.getInt("BOARD1_NUM"));
				board.setBOARD1_NAME(rs.getString("BOARD1_NAME"));
				board.setBOARD1_SUBJECT(rs.getString("BOARD1_SUBJECT"));
				board.setBOARD1_CONTENT(rs.getString("BOARD1_CONTENT"));
				board.setBOARD1_FILE(rs.getString("BOARD1_FILE"));
				board.setBOARD1_RE_REF(rs.getInt("BOARD1_RE_REF"));
				board.setBOARD1_RE_LEV(rs.getInt("BOARD1_RE_LEV"));
				board.setBOARD1_RE_SEQ(rs.getInt("BOARD1_RE_SEQ"));
				board.setBOARD1_READCOUNT(rs.getInt("BOARD1_READCOUNT"));
				board.setBOARD1_DATE(rs.getDate("BOARD1_DATE"));
				/*
				board.setBOARD2RE_NUM(rs.getInt("BOARD2RE_NUM"));
				board.setBOARD2RE_NAME(rs.getString("BOARD2RE_NAME"));
				board.setBOARD2RE_CONTENT(rs.getString("BOARD2RE_CONTENT"));
				board.setBOARD2RE_DATE(rs.getDate("BOARD2RE_DATE"));
				*/
			}
			
			System.out.println(board + "보드 보드 보드");
			System.out.println("보드 ?��?�� + " + rs.getString("BOARD1_NAME"));
			System.out.println("보드 콘텐�? + " + rs.getString("BOARD1_CONTENT"));
			
			return board;
		}catch(Exception ex){
			System.out.println("getDetail ?��?�� : " + ex);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException ex){}
			if(pstmt !=null)try{pstmt.close();}catch(SQLException ex){}
		}
		return null;
	}
	
	
	
	public BoardBean1 getDetailre(int num) throws Exception{
		BoardBean1 board2 = null;
		try{
			pstmt = con.prepareStatement(
"select BOARDRE1_NUM, BOARDRE1_NAME, BOARDRE1_CONTENT, BOARDRE1_DATE from board1re, board1 where BOARD1_NUM = ? and BOARDRE1_NUM = BOARD1_NUM");
			//, BOARD2RE_DATE
			pstmt.setInt(1, num);
			System.out.println("?��re?? "+num);
			rs= pstmt.executeQuery();
			
			if(rs.next()){
				board2 = new BoardBean1();
				board2.setBOARD1RE_NUM(rs.getInt("BOARDRE1_NUM"));
				board2.setBOARD1RE_NAME(rs.getString("BOARDRE1_NAME"));
				board2.setBOARD1RE_CONTENT(rs.getString("BOARDRE1_CONTENT"));
				board2.setBOARD1RE_DATE(rs.getDate("BOARDRE1_DATE"));
			}
			/*
			else if(rs.next() == false){
				
				board2.setBOARD2RE_NUM(0);
				board2.setBOARD2RE_NAME("0");
				board2.setBOARD2RE_CONTENT("0");
				board2.setBOARD2RE_DATE(2015-02-21);
			}
			*/
			System.out.println(board2 + "보드 보드 보드");
			System.out.println("보드1RE ?��?�� + " + rs.getString("BOARDRE1_NAME"));
			System.out.println("보드1RE 콘텐�? + " + rs.getString("BOARDRE1_CONTENT"));
			
			return board2;
		}catch(Exception ex){
			
			System.out.println("getDetailre ?��?�� : " + ex);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException ex){}
			if(pstmt !=null)try{pstmt.close();}catch(SQLException ex){}
		}
		return null;
	}
	
	
	public boolean boardInsert(BoardBean1 board){
		int num =0;
		String sql="";
		
		int result=0;
		
		System.out.println("�??���? ?��목�? "+board.getBOARD1_SUBJECT());
		System.out.println("�??���? ?��?��?? "+board.getBOARD1_CONTENT());
		
		try{
			pstmt=con.prepareStatement("select max(board1_num) from board1");
			rs = pstmt.executeQuery();
			
			if(rs.next())
				num =rs.getInt(1)+1;
			else
				num=1;
			
			
			sql ="insert into board1 (BOARD1_NUM, BOARD1_NAME, BOARD1_PASS, BOARD1_SUBJECT,";
			sql+="BOARD1_CONTENT, BOARD1_FILE, BOARD1_RE_REF,"+
				 "BOARD1_RE_LEV, BOARD1_RE_SEQ, BOARD1_READCOUNT,"+
				 "BOARD1_DATE) values(?,?,?,?,?,?,?,?,?,?,sysdate)";
			System.out.println("�??���? ?��목�? "+board.getBOARD1_SUBJECT());
			System.out.println("�??���? ?��?��?? "+board.getBOARD1_CONTENT());
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, board.getBOARD1_NAME());
			pstmt.setString(3, board.getBOARD1_PASS());
			pstmt.setString(4, board.getBOARD1_SUBJECT());
			pstmt.setString(5, board.getBOARD1_CONTENT());
			pstmt.setString(6, board.getBOARD1_FILE());
			pstmt.setInt(7, num);
			pstmt.setInt(8, 0);
			pstmt.setInt(9, 0);
			pstmt.setInt(10, 0);
			
			
			result=pstmt.executeUpdate();
			if(result==0)return false;
			
			return true;
		}catch(Exception ex){
			System.out.println("boardInsert : "+ex);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
		}
		return false;
	}
	
	public boolean boardReInsert(BoardBean1 board){
		int num =0;
		String sql="";
		
		int result2=0;
		
		try{
			pstmt=con.prepareStatement("select max(board1_num) from board1");
			rs = pstmt.executeQuery();
			
			if(rs.next())
				num =rs.getInt(1)+1;
			else
				num=1;
			
			sql ="insert into board1re (BOARDRE1_NUM,";
			sql+="BOARDRE1_NAME,"+
				 "BOARDRE1_PASS,"+
				 "BOARDRE1_CONTENT, BOARDRE1_DATE) values(?,?,?,?,sysdate)";
			
			/*
			sql ="insert into board2 (BOARD_NUM,BOARD_NAME,BOARD_PASS,BOARD_SUBJECT,";
			sql+="BOARD_CONTENT, BOARD_FILE, BOARD_RE_REF,"+
				 "BOARD_RE_LEV, BOARD_RE_SEQ, BOARD_READCOUNT,"+
				 "BOARD_DATE) values(?,?,?,?,?,?,?,?,?,?,sysdate)";
			*/
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, " ");
			pstmt.setString(3, " ");
			pstmt.setString(4, " ");
			
			result2=pstmt.executeUpdate();
			if(result2==0)return false;
			
			return true;
		}catch(Exception ex){
			System.out.println("boardInsert : "+ex);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
		}
		return false;
	}
	
	
	public boolean boardReply(BoardBean1 board){
		
		int num=0;
		String sql="";
		int result=0;
		
		try{
			sql="insert into board1re (BOARDRE1_NUM, BOARDRE1_NAME, ";
			sql+="BOARDRE1_CONTENT,";
			sql+="BOARDRE1_DATE) values(?,?,?,sysdate)";
			
			System.out.println("?���??�� ?��?? "+num);
			System.out.println("11?���??�� ?��?? "+board.getBOARD1_NUM());
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, board.getBOARD1_NUM());
			pstmt.setString(2, board.getBOARD1_NAME());
			pstmt.setString(3, board.getBOARD1_CONTENT());
			
			pstmt.executeUpdate();
			return true;
		}catch(SQLException ex){
			System.out.println("boardReply ?��?�� : "+ex);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException ex){}
		}
		return false;
	}
	
	//?��?�옙 ?��?��?��?��?��?��.
	public boolean boardModify(BoardBean1 modifyboard) throws Exception{
		System.out.println("DAO 모디?��?���? ?��?��?��?��??");
		System.out.println("1?��?�� ?��버는 "+modifyboard.getBOARD1_NUM());
		String sql="update board1 set BOARD1_SUBJECT=?,BOARD1_CONTENT=? where BOARD1_NUM=?";
		
		System.out.println("1?��?�� ?��목�? "+modifyboard.getBOARD1_SUBJECT());
		System.out.println("1?��?�� ?��?��?? "+modifyboard.getBOARD1_CONTENT());
		
		try{
			System.out.println("2?��?�� ?��목�? "+modifyboard.getBOARD1_SUBJECT());
			System.out.println("2?��?�� ?��?��?? "+modifyboard.getBOARD1_CONTENT());
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, modifyboard.getBOARD1_SUBJECT());
			pstmt.setString(2, modifyboard.getBOARD1_CONTENT());
			pstmt.setInt(3, modifyboard.getBOARD1_NUM());
			pstmt.executeUpdate();
			
			System.out.println("3?��?�� ?��목�? "+modifyboard.getBOARD1_SUBJECT());
			System.out.println("3?��?�� ?��?��?? "+modifyboard.getBOARD1_CONTENT());
			
			return true;
		}catch(Exception ex){
			System.out.println("boardModify ?��?�� : " + ex);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException ex){}
			}
		return false;
	}
	
	//?��?�옙 ?��?��?��?��?��?��.
	public boolean boardDelete(int num){
	      String board_delete_sql="delete from board1 where BOARD1_num=?";
	      
	      int result=0;
	      
	      try{
	         pstmt=con.prepareStatement(board_delete_sql);
	         pstmt.setInt(1, num);
	         result=pstmt.executeUpdate();
	         if(result==0)return false;
	         
	         return true;
	      }catch(Exception ex){
	         System.out.println("boardDelete ?��?�� : "+ex);
	      }finally{
	         try{
	            if(pstmt!=null)pstmt.close();
	         }catch(Exception ex) {}
	      }
	      
	      return false;
	   }
	   
	   
	   public void setReadCountUpdate(int num) throws Exception{
	      String sql="update board1 set BOARD1_READCOUNT = "+
	         "BOARD1_READCOUNT+1 where BOARD1_NUM = "+num;
	      
	      try{
	         pstmt=con.prepareStatement(sql);
	         pstmt.executeUpdate();
	      }catch(SQLException ex){
	         System.out.println("setReadCountUpdate ?��?�� : "+ex);
	      }
	   }
	   
	   
	   public boolean isBoardWriter(int num, String pass){
	      
	      System.out.println("?��?��?��?��?�� + "+ pass);
	      String board_sql="select * from board1 where BOARD1_NUM=?";
	      
	      try{
	         pstmt=con.prepareStatement(board_sql);
	         pstmt.setInt(1, num);
	         rs=pstmt.executeQuery();
	         rs.next();
	         
	         System.out.println("?��?��?��?�� �??�� ?���? ?��보자222");
	         
	         if(pass.equals(rs.getString("BOARD1_PASS"))){
	           
	            return true;
	         }
	      }catch(SQLException ex){
	         System.out.println("isBoardWriter ?��?�� : "+ex);
	      }
	      return false;
	   }

}
	