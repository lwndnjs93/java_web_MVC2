package net.board2.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board2.action.ActionForward;
import net.board2.action.BoardAddAction;
import net.board2.action.BoardDeleteAction;
import net.board2.action.BoardDetailAction;
import net.board2.action.BoardListAction;
import net.board2.action.BoardModifyAction;
import net.board2.action.BoardModifyView;
import net.board2.action.BoardReplyAction;

 public class Board2FrontController 
 	extends javax.servlet.http.HttpServlet 
 	implements javax.servlet.Servlet {
	
	 protected void doProcess(HttpServletRequest request, HttpServletResponse response) 
	 	throws ServletException, IOException {
		 
		 String RequestURI=request.getRequestURI();
		 String contextPath=request.getContextPath();
		 String command=RequestURI.substring(contextPath.length());
		 ActionForward forward=null;
		 Action action=null;
		   
		 System.out.println(command+"Ïª§Î©ò?ìú~~~~");
		 
		 
		 
		 if(command.equals("/main/BoardWrite.bo2")){
			 forward=new ActionForward();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community/board_write.jsp");
	         }
		 if(command.equals("/introduction/BoardWrite.bo2")){
			 forward=new ActionForward();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community/board_write.jsp");
	         }
		 if(command.equals("/menu01/BoardWrite.bo2")){
			 forward=new ActionForward();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community/board_write.jsp");
	         }
		 if(command.equals("/product/BoardWrite.bo2")){
			 forward=new ActionForward();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community/board_write.jsp");
	         }
		 if(command.equals("/album/BoardWrite.bo2")){
			 forward=new ActionForward();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community/board_write.jsp");
	         }
		 if(command.equals("/menu02/BoardWrite.bo2")){
			 forward=new ActionForward();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community/board_write.jsp");
	         }
		 if(command.equals("/community/BoardWrite.bo2")){
			 forward=new ActionForward();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community/board_write.jsp");
	         }
		 
		 
		 
		 
		 
		 else if(command.equals("/main/BoardDelete.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_delete.jsp");
		   }
		 else if(command.equals("/introduction/BoardDelete.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_delete.jsp");
		   }
		 else if(command.equals("/menu01/BoardDelete.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_delete.jsp");
		   }
		 else if(command.equals("/product/BoardDelete.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_delete.jsp");
		   }
		 else if(command.equals("/album/BoardDelete.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_delete.jsp");
		   }
		 else if(command.equals("/menu02/BoardDelete.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_delete.jsp");
		   }
		 else if(command.equals("/community/BoardDelete.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_delete.jsp");
		   }


		 
		 
		 
		 
		 else if(command.equals("/main/BoardDeleteAction.bo2")){
	           
	            action = new BoardDeleteAction();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/introduction/BoardDeleteAction.bo2")){
	           
	            action = new BoardDeleteAction();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/menu01/BoardDeleteAction.bo2")){
	           
	            action = new BoardDeleteAction();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/product/BoardDeleteAction.bo2")){
	           
	            action = new BoardDeleteAction();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/album/BoardDeleteAction.bo2")){
	           
	            action = new BoardDeleteAction();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/menu02/BoardDeleteAction.bo2")){
	           
	            action = new BoardDeleteAction();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/community/BoardDeleteAction.bo2")){
	           
	            action = new BoardDeleteAction();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		   
		 
		 
		 
		   else if(command.equals("/main/BoardModify.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_modify.jsp");
		   }
		   else if(command.equals("/introduction/BoardModify.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_modify.jsp");
		   }
		   else if(command.equals("/menu01/BoardModify.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_modify.jsp");
		   }
		   else if(command.equals("/product/BoardModify.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_modify.jsp");
		   }
		   else if(command.equals("/album/BoardModify.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_modify.jsp");
		   }
		   else if(command.equals("/menu02/BoardModify.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_modify.jsp");
		   }
		   else if(command.equals("/community/BoardModify.bo2")){
			   forward=new ActionForward();
			   forward.setRedirect(false);
			   forward.setPath("/community/board_modify.jsp");
		   }
		 
		 
		 
		 
		 
		 
		   else if(command.equals("/main/BoardModifyView.bo2")){
			   action = new BoardModifyView();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/introduction/BoardModifyView.bo2")){
			   action = new BoardModifyView();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/menu01/BoardModifyView.bo2")){
			   action = new BoardModifyView();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/product/BoardModifyView.bo2")){
			   action = new BoardModifyView();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/album/BoardModifyView.bo2")){
			   action = new BoardModifyView();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/menu02/BoardModifyView.bo2")){
			   action = new BoardModifyView();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/community/BoardModifyView.bo2")){
			   action = new BoardModifyView();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		 
		 
		 
		 
		 
		   else if(command.equals("/main/BoardModifyAction.bo2")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/introduction/BoardModifyAction.bo2")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu01/BoardModifyAction.bo2")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/product/BoardModifyAction.bo2")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/album/BoardModifyAction.bo2")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu02/BoardModifyAction.bo2")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community/BoardModifyAction.bo2")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		 
		 
		 
		 
		 
		   else if(command.equals("/main/BoardAddAction.bo2")){
			   System.out.println("?ó¨Í∏¥Í??????");
	            action  = new BoardAddAction();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/introduction/BoardAddAction.bo2")){
			   System.out.println("?ó¨Í∏¥Í??????");
	            action  = new BoardAddAction();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/menu01/BoardAddAction.bo2")){
			   System.out.println("?ó¨Í∏¥Í??????");
	            action  = new BoardAddAction();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/product/BoardAddAction.bo2")){
	            
	            action  = new BoardAddAction();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/album/BoardAddAction.bo2")){
	            
	            action  = new BoardAddAction();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/menu02/BoardAddAction.bo2")){
	            
	            action  = new BoardAddAction();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/community/BoardAddAction.bo2")){
	            
	            action  = new BoardAddAction();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }

		 
		 
		 
		 
		 
		 
		 
		 
		   else if(command.equals("/main/BoardList.bo2")){
			   
			   action = new BoardListAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/introduction/BoardList.bo2")){
			   
			   action = new BoardListAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu01/BoardList.bo2")){
			   
			   action = new BoardListAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/product/BoardList.bo2")){
			   
			   action = new BoardListAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/album/BoardList.bo2")){
			   
			   action = new BoardListAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu02/BoardList.bo2")){
			   
			   action = new BoardListAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community/BoardList.bo2")){
			   
			   action = new BoardListAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community/BoardList.bo22")){
			   
			   action = new BoardListAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community3/BoardList3.bo23")){
	   
			   action = new BoardListAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   
		 
		 
		 
		   
		   else if(command.equals("/main/BoardDetailAction.bo2")){
			   System.out.println("BoardDetailAction.bo2!!!!");
			   action = new BoardDetailAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/introduction/BoardDetailAction.bo2")){
			   System.out.println("BoardDetailAction.bo2!!!!");
			   action = new BoardDetailAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu01/BoardDetailAction.bo2")){
			   System.out.println("BoardDetailAction.bo2!!!!");
			   action = new BoardDetailAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/product/BoardDetailAction.bo2")){
			   System.out.println("BoardDetailAction.bo2!!!!");
			   action = new BoardDetailAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/album/BoardDetailAction.bo2")){
			   System.out.println("BoardDetailAction.bo2!!!!");
			   action = new BoardDetailAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu02/BoardDetailAction.bo2")){
			   System.out.println("BoardDetailAction.bo2!!!!");
			   action = new BoardDetailAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community/BoardDetailAction.bo2")){
			   System.out.println("BoardDetailAction.bo2!!!!");
			   action = new BoardDetailAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		 
		 
		 
		 
		   
		   else if(command.equals("/main/BoardReplyAction.bo2")){
			   
			   action = new BoardReplyAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/introduction/BoardReplyAction.bo2")){
			   
			   action = new BoardReplyAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu01/BoardReplyAction.bo2")){
			   
			   action = new BoardReplyAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/product/BoardReplyAction.bo2")){
			   
			   action = new BoardReplyAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/album/BoardReplyAction.bo2")){
			   
			   action = new BoardReplyAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu02/BoardReplyAction.bo2")){
			   
			   action = new BoardReplyAction();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community/BoardReplyAction.bo2")){
			   
			   action = new BoardReplyAction();
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