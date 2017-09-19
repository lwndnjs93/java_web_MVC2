package net.board3.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board3.action.ActionForward3;
import net.board3.action.BoardAddAction3;
import net.board3.action.BoardDeleteAction3;
import net.board3.action.BoardDetailAction3;
import net.board3.action.BoardListAction3;
import net.board3.action.BoardModifyAction3;
import net.board3.action.BoardModifyView3;
import net.board3.action.BoardReplyAction3;
import net.board2.action.BoardListAction;

 public class Board3FrontController 
 	extends javax.servlet.http.HttpServlet 
 	implements javax.servlet.Servlet {
	
	 protected void doProcess(HttpServletRequest request, HttpServletResponse response) 
	 	throws ServletException, IOException {
		 
		 String RequestURI=request.getRequestURI();
		 String contextPath=request.getContextPath();
		 String command=RequestURI.substring(contextPath.length());
		 ActionForward3 forward=null;
		 Action3 action=null;
		   
		 System.out.println(command+"Ïª§Î©ò?ìú~~~~");
		 
		 
		 
		 if(command.equals("/main/BoardWrite3.bo3")){
			 forward=new ActionForward3();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community3/board_write3.jsp");
	         }
		 if(command.equals("/introduction/BoardWrite3.bo3")){
			 forward=new ActionForward3();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community3/board_write3.jsp");
	         }
		 if(command.equals("/menu01/BoardWrite3.bo3")){
			 forward=new ActionForward3();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community3/board_write3.jsp");
	         }
		 if(command.equals("/product/BoardWrite3.bo3")){
			 forward=new ActionForward3();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community3/board_write3.jsp");
	         }
		 if(command.equals("/album/BoardWrite3.bo3")){
			 forward=new ActionForward3();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community3/board_write3.jsp");
	         }
		 if(command.equals("/menu02/BoardWrite3.bo3")){
			 forward=new ActionForward3();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community3/board_write3.jsp");
	         }
		 if(command.equals("/community3/BoardWrite3.bo3")){
			 forward=new ActionForward3();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community3/board_write3.jsp");
	         }
		 
		 
		 
		 
		 
		 else if(command.equals("/main/BoardDelete3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_delete3.jsp");
		   }
		 else if(command.equals("/introduction/BoardDelete3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_delete3.jsp");
		   }
		 else if(command.equals("/menu01/BoardDelete3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_delete3.jsp");
		   }
		 else if(command.equals("/product/BoardDelete3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_delete3.jsp");
		   }
		 else if(command.equals("/album/BoardDelete3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_delete3.jsp");
		   }
		 else if(command.equals("/menu02/BoardDelete3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_delete3.jsp");
		   }
		 else if(command.equals("/community3/BoardDelete3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_delete3.jsp");
		   }


		 
		 
		 
		 
		 else if(command.equals("/main/BoardDeleteAction3.bo3")){
	           
	            action = new BoardDeleteAction3();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/introduction/BoardDeleteAction3.bo3")){
	           
	            action = new BoardDeleteAction3();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/menu01/BoardDeleteAction3.bo3")){
	           
	            action = new BoardDeleteAction3();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/product/BoardDeleteAction3.bo3")){
	           
	            action = new BoardDeleteAction3();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/album/BoardDeleteAction3.bo3")){
	           
	            action = new BoardDeleteAction3();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/menu02/BoardDeleteAction3.bo3")){
	           
	            action = new BoardDeleteAction3();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/community3/BoardDeleteAction3.bo3")){
	           
	            action = new BoardDeleteAction3();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		   
		 
		 
		 
		   else if(command.equals("/main/BoardModify3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_modify3.jsp");
		   }
		   else if(command.equals("/introduction/BoardModify3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_modify3.jsp");
		   }
		   else if(command.equals("/menu01/BoardModify3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_modify3.jsp");
		   }
		   else if(command.equals("/product/BoardModify3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_modify3.jsp");
		   }
		   else if(command.equals("/album/BoardModify3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_modify3.jsp");
		   }
		   else if(command.equals("/menu02/BoardModify3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_modify3.jsp");
		   }
		   else if(command.equals("/community3/BoardModify3.bo3")){
			   forward=new ActionForward3();
			   forward.setRedirect(false);
			   forward.setPath("/community3/board_modify3.jsp");
		   }
		 
		 
		 
		 
		 
		 
		   else if(command.equals("/main/BoardModifyView3.bo3")){
			   action = new BoardModifyView3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/introduction/BoardModifyView3.bo3")){
			   action = new BoardModifyView3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/menu01/BoardModifyView3.bo3")){
			   action = new BoardModifyView3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/product/BoardModifyView3.bo3")){
			   action = new BoardModifyView3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/album/BoardModifyView3.bo3")){
			   action = new BoardModifyView3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/menu02/BoardModifyView3.bo3")){
			   action = new BoardModifyView3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/community3/BoardModifyView3.bo3")){
			   action = new BoardModifyView3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		 
		 
		 
		 
		 
		   else if(command.equals("/main/BoardModifyAction3.bo3")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/introduction/BoardModifyAction3.bo3")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu01/BoardModifyAction3.bo3")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/product/BoardModifyAction3.bo3")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/album/BoardModifyAction3.bo3")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu02/BoardModifyAction3.bo3")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community3/BoardModifyAction3.bo3")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		 
		 
		 
		 
		 
		   else if(command.equals("/main/BoardAddAction3.bo3")){
			   System.out.println("?ó¨Í∏¥Í??????");
	            action  = new BoardAddAction3();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/introduction/BoardAddAction3.bo3")){
			   System.out.println("?ó¨Í∏¥Í??????");
	            action  = new BoardAddAction3();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/menu01/BoardAddAction3.bo3")){
			   System.out.println("?ó¨Í∏¥Í??????");
	            action  = new BoardAddAction3();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/product/BoardAddAction3.bo3")){
	            
	            action  = new BoardAddAction3();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/album/BoardAddAction3.bo3")){
	            
	            action  = new BoardAddAction3();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/menu02/BoardAddAction3.bo3")){
	            
	            action  = new BoardAddAction3();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/community3/BoardAddAction3.bo3")){
	            
	            action  = new BoardAddAction3();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }

		 
		 
		 
		 
		 
		 
		 
		 
		   else if(command.equals("/main/BoardList3.bo3")){
			   
			   action = new BoardListAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/introduction/BoardList3.bo3")){
			   
			   action = new BoardListAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu01/BoardList3.bo3")){
			   
			   action = new BoardListAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/product/BoardList3.bo3")){
			   
			   action = new BoardListAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/album/BoardList3.bo3")){
			   
			   action = new BoardListAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu02/BoardList3.bo3")){
			   
			   action = new BoardListAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community3/BoardList3.bo3")){
			   
			   action = new BoardListAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community/BoardList.bo2")){
			   
			   action = new BoardListAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community3/BoardList3.bo3")){
	   
			   action = new BoardListAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   
		 
		 
		 
		   
		   else if(command.equals("/main/BoardDetailAction3.bo3")){
			   System.out.println("BoardDetailAction.bo3!!!!");
			   action = new BoardDetailAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/introduction/BoardDetailAction3.bo3")){
			   System.out.println("BoardDetailAction.bo3!!!!");
			   action = new BoardDetailAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu01/BoardDetailAction3.bo3")){
			   System.out.println("BoardDetailAction.bo3!!!!");
			   action = new BoardDetailAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/product/BoardDetailAction3.bo3")){
			   System.out.println("BoardDetailAction.bo3!!!!");
			   action = new BoardDetailAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/album/BoardDetailAction3.bo3")){
			   System.out.println("BoardDetailAction.bo3!!!!");
			   action = new BoardDetailAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu02/BoardDetailAction3.bo3")){
			   System.out.println("BoardDetailAction.bo3!!!!");
			   action = new BoardDetailAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community3/BoardDetailAction3.bo3")){
			   System.out.println("BoardDetailAction.bo3!!!!");
			   action = new BoardDetailAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		 
		 
		 
		 
		   
		   else if(command.equals("/main/BoardReplyAction3.bo3")){
			   
			   action = new BoardReplyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/introduction/BoardReplyAction3.bo3")){
			   
			   action = new BoardReplyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu01/BoardReplyAction3.bo3")){
			   
			   action = new BoardReplyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/product/BoardReplyAction3.bo3")){
			   
			   action = new BoardReplyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/album/BoardReplyAction3.bo3")){
			   
			   action = new BoardReplyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu02/BoardReplyAction3.bo3")){
			   
			   action = new BoardReplyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community3/BoardReplyAction3.bo3")){
			   
			   action = new BoardReplyAction3();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   
		  
		   
		   if(forward.isRedirect()){
			   response.sendRedirect(forward.getPath());
		   } else {
			   RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			   dispatcher.forward(request, response);
		   }
		   
	 }
	 
	 
	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		doProcess(request,response);
	}  	
	
	 public void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		doProcess(request,response);
	}   	  	    
}