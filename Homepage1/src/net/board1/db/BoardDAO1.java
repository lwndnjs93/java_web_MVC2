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
			System.out.println("DB ?ï¿½ï¿½?ï¿½ï¿½?ï¿½ï¿½?ï¿½ï¿½ê»“ì˜™ ?ï¿½ï¿½?ï¿½ï¿½ë¼„å ?ï¿½ï¿½?ï¿½ï¿½ : " + ex);
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
	
	//?ï¿½ï¿½?ï¿½ì˜™ ç­Œë¤´ë«–ä»¥ï¿?? ?ï¿½ï¿½ê·£ë–¯?ï¿½ï¿½ï¿??.	
	public List getBoardList(int page,int limit){
		
		System.out.println("?””ë¹„ì—?Š” ?“¤?–´ê°??•¼ ?•˜?Š”?°...");
		
		String board_list_sql="select * from "+
		"(select rownum rnum,BOARD1_NUM,BOARD1_NAME,BOARD1_SUBJECT,"+
		"BOARD1_CONTENT, BOARD1_FILE, BOARD1_RE_REF, BOARD1_RE_LEV,"+
		"BOARD1_RE_SEQ, BOARD1_READCOUNT, BOARD1_DATE from "+
		"(select * from board1 order by BOARD1_RE_REF desc,BOARD1_RE_SEQ asc)) "+
		"where rnum>=? and rnum<=?";
		
		List list = new ArrayList();
		
		System.out.println("ë¦¬ìŠ¤?Š¸11111111111 + " + list);
		
		int startrow=(page-1)*10+1; 
		System.out.println("ë¦¬ìŠ¤?Š¸22222222 + " + list);
		int endrow=startrow+limit-1; 
		
		System.out.println("ë¦¬ìŠ¤?Š¸33333333 + " + list);
		
		try{
			pstmt = con.prepareStatement(board_list_sql);
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			rs = pstmt.executeQuery();
			
			System.out.println("?””ë¹„ì—?Š” ?“¤?–´ê°??•¼ ?•˜?Š”?°...2222");
			
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
			
			System.out.println("ë¦¬ìŠ¤?Š¸1111 + " + list);
			
			return list;
		}catch(Exception ex){
			System.out.println("getBoardList ë³´ë“œë¦¬ìŠ¤?Š¸ ?—?Ÿ¬ : " + ex);
		}finally{
			if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
		}
		System.out.println("?””ë¹„ì—?Š” ?“¤?–´ê°??•¼ ?•˜?Š”?°...44444");
		return null;
	}
	
	//?ï¿½ï¿½?ï¿½ì˜™ ?ï¿½ï¿½?ï¿½ï¿½???ï¿½ï¿½?ï¿½ï¿½?ï¿½ï¿½ ?ï¿½ï¿½ê·£ë–¯?ï¿½ï¿½ï¿??.
	public BoardBean1 getDetail(int num) throws Exception{
		BoardBean1 board = null;
		try{
			
			pstmt = con.prepareStatement(
			"select * from board1 where BOARD1_NUM = ?");
		//"select * from board1, board2re where BOARD1_NUM = ? and BOARD1_NUM = BOARD1RE_NUM");
			
			pstmt.setInt(1, num);
			System.out.println("?„˜?? "+num);
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
			
			System.out.println(board + "ë³´ë“œ ë³´ë“œ ë³´ë“œ");
			System.out.println("ë³´ë“œ ?„¤?„ + " + rs.getString("BOARD1_NAME"));
			System.out.println("ë³´ë“œ ì½˜í…ì¸? + " + rs.getString("BOARD1_CONTENT"));
			
			return board;
		}catch(Exception ex){
			System.out.println("getDetail ?—?Ÿ¬ : " + ex);
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
			System.out.println("?„˜re?? "+num);
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
			System.out.println(board2 + "ë³´ë“œ ë³´ë“œ ë³´ë“œ");
			System.out.println("ë³´ë“œ1RE ?„¤?„ + " + rs.getString("BOARDRE1_NAME"));
			System.out.println("ë³´ë“œ1RE ì½˜í…ì¸? + " + rs.getString("BOARDRE1_CONTENT"));
			
			return board2;
		}catch(Exception ex){
			
			System.out.println("getDetailre ?—?Ÿ¬ : " + ex);
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
		
		System.out.println("ê¸??“°ê¸? ? œëª©ì? "+board.getBOARD1_SUBJECT());
		System.out.println("ê¸??“°ê¸? ?‚´?š©?? "+board.getBOARD1_CONTENT());
		
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
			System.out.println("ê¸??“°ê¸? ? œëª©ì? "+board.getBOARD1_SUBJECT());
			System.out.println("ê¸??“°ê¸? ?‚´?š©?? "+board.getBOARD1_CONTENT());
			
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
			
			System.out.println("?Œ“ê¸??˜ ?„˜?? "+num);
			System.out.println("11?Œ“ê¸??˜ ?„˜?? "+board.getBOARD1_NUM());
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, board.getBOARD1_NUM());
			pstmt.setString(2, board.getBOARD1_NAME());
			pstmt.setString(3, board.getBOARD1_CONTENT());
			
			pstmt.executeUpdate();
			return true;
		}catch(SQLException ex){
			System.out.println("boardReply ?—?Ÿ¬ : "+ex);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException ex){}
		}
		return false;
	}
	
	//?ï¿½ï¿½?ï¿½ì˜™ ?ï¿½ï¿½?ï¿½ï¿½?ï¿½ï¿½?ï¿½ï¿½?ï¿½ï¿½?ï¿½ï¿½.
	public boolean boardModify(BoardBean1 modifyboard) throws Exception{
		System.out.println("DAO ëª¨ë””?ŒŒ?´ë¡? ?“¤?—ˆ?™”?‹ˆ??");
		System.out.println("1?ˆ˜? • ?„˜ë²„ëŠ” "+modifyboard.getBOARD1_NUM());
		String sql="update board1 set BOARD1_SUBJECT=?,BOARD1_CONTENT=? where BOARD1_NUM=?";
		
		System.out.println("1?ˆ˜? • ? œëª©ì? "+modifyboard.getBOARD1_SUBJECT());
		System.out.println("1?ˆ˜? • ?‚´?š©?? "+modifyboard.getBOARD1_CONTENT());
		
		try{
			System.out.println("2?ˆ˜? • ? œëª©ì? "+modifyboard.getBOARD1_SUBJECT());
			System.out.println("2?ˆ˜? • ?‚´?š©?? "+modifyboard.getBOARD1_CONTENT());
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, modifyboard.getBOARD1_SUBJECT());
			pstmt.setString(2, modifyboard.getBOARD1_CONTENT());
			pstmt.setInt(3, modifyboard.getBOARD1_NUM());
			pstmt.executeUpdate();
			
			System.out.println("3?ˆ˜? • ? œëª©ì? "+modifyboard.getBOARD1_SUBJECT());
			System.out.println("3?ˆ˜? • ?‚´?š©?? "+modifyboard.getBOARD1_CONTENT());
			
			return true;
		}catch(Exception ex){
			System.out.println("boardModify ?—?Ÿ¬ : " + ex);
		}finally{
			if(rs!=null)try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null)try{pstmt.close();}catch(SQLException ex){}
			}
		return false;
	}
	
	//?ï¿½ï¿½?ï¿½ì˜™ ?ï¿½ï¿½?ï¿½ï¿½?ï¿½ï¿½?ï¿½ï¿½?ï¿½ï¿½?ï¿½ï¿½.
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
	         System.out.println("boardDelete ?—?Ÿ¬ : "+ex);
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
	         System.out.println("setReadCountUpdate ?—?Ÿ¬ : "+ex);
	      }
	   }
	   
	   
	   public boolean isBoardWriter(int num, String pass){
	      
	      System.out.println("?Œ¨?Š¤?›Œ?“œ?Š” + "+ pass);
	      String board_sql="select * from board1 where BOARD1_NUM=?";
	      
	      try{
	         pstmt=con.prepareStatement(board_sql);
	         pstmt.setInt(1, num);
	         rs=pstmt.executeQuery();
	         rs.next();
	         
	         System.out.println("?Œ¨?Š¤?›Œ?“œ ê²??‚¬ ?•œë²? ?•´ë³´ì222");
	         
	         if(pass.equals(rs.getString("BOARD1_PASS"))){
	           
	            return true;
	         }
	      }catch(SQLException ex){
	         System.out.println("isBoardWriter ?—?Ÿ¬ : "+ex);
	      }
	      return false;
	   }

}
	