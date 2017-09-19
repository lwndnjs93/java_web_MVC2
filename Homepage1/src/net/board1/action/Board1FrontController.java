package net.board1.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board2.action.BoardListAction;

 public class Board1FrontController 
 	extends javax.servlet.http.HttpServlet 
 	implements javax.servlet.Servlet {
	
	 protected void doProcess(HttpServletRequest request, HttpServletResponse response) 
	 	throws ServletException, IOException {
		 
		 String RequestURI=request.getRequestURI();
		 String contextPath=request.getContextPath();
		 String command=RequestURI.substring(contextPath.length());
		 ActionForward1 forward=null;
		 Action1 action=null;
		   
		 System.out.println(command+"Ïª§Î©ò?ìú~~~~");
		 String id = (String)request.getParameter("id");
			System.out.println("Ïª®Ìä∏Î°§Îü¨ id?äî "+id);
		 
		 
		 if(command.equals("/main/BoardWrite1.bo1")){
			 forward=new ActionForward1();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community1/board_write1.jsp");
	         }
		 if(command.equals("/introduction/BoardWrite1.bo1")){
			 forward=new ActionForward1();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community1/board_write1.jsp");
	         }
		 if(command.equals("/menu01/BoardWrite1.bo1")){
			 forward=new ActionForward1();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community1/board_write1.jsp");
	         }
		 if(command.equals("/product/BoardWrite1.bo1")){
			 forward=new ActionForward1();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community1/board_write1.jsp");
	         }
		 if(command.equals("/album/BoardWrite1.bo1")){
			 forward=new ActionForward1();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community1/board_write1.jsp");
	         }
		 if(command.equals("/menu02/BoardWrite1.bo1")){
			 forward=new ActionForward1();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community1/board_write1.jsp");
	         }
		 if(command.equals("/community1/BoardWrite1.bo1")){
			 forward=new ActionForward1();
	         forward.setRedirect(false);
	         System.out.println(command+"999");
	         forward.setPath("/community1/board_write1.jsp");
	         }
		 
		 
		 
		 
		 
		 else if(command.equals("/main/BoardDelete1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_delete1.jsp");
		   }
		 else if(command.equals("/introduction/BoardDelete1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_delete1.jsp");
		   }
		 else if(command.equals("/menu01/BoardDelete1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_delete1.jsp");
		   }
		 else if(command.equals("/product/BoardDelete1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_delete1.jsp");
		   }
		 else if(command.equals("/album/BoardDelete1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_delete1.jsp");
		   }
		 else if(command.equals("/menu02/BoardDelete1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_delete1.jsp");
		   }
		 else if(command.equals("/community1/BoardDelete1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_delete1.jsp");
		   }


		 
		 
		 
		 
		 else if(command.equals("/main/BoardDeleteAction1.bo1")){
	           
	            action = new BoardDeleteAction1();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/introduction/BoardDeleteAction1.bo1")){
	           
	            action = new BoardDeleteAction1();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/menu01/BoardDeleteAction1.bo1")){
	           
	            action = new BoardDeleteAction1();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/product/BoardDeleteAction1.bo1")){
	           
	            action = new BoardDeleteAction1();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/album/BoardDeleteAction1.bo1")){
	           
	            action = new BoardDeleteAction1();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/menu02/BoardDeleteAction1.bo1")){
	           
	            action = new BoardDeleteAction1();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		 else if(command.equals("/community1/BoardDeleteAction1.bo1")){
	           
	            action = new BoardDeleteAction1();
	            try{
	               forward=action.execute(request, response);
	            }catch(Exception e){
	               e.printStackTrace();
	            }
	         }
		   
		 
		 
		 
		   else if(command.equals("/main/BoardModify1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_modify1.jsp");
		   }
		   else if(command.equals("/introduction/BoardModify1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_modify1.jsp");
		   }
		   else if(command.equals("/menu01/BoardModify1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_modify1.jsp");
		   }
		   else if(command.equals("/product/BoardModify1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_modify1.jsp");
		   }
		   else if(command.equals("/album/BoardModify1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_modify1.jsp");
		   }
		   else if(command.equals("/menu02/BoardModify1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_modify1.jsp");
		   }
		   else if(command.equals("/community1/BoardModify1.bo1")){
			   forward=new ActionForward1();
			   forward.setRedirect(false);
			   forward.setPath("/community1/board_modify1.jsp");
		   }
		 
		 
		 
		 
		 
		 
		   else if(command.equals("/main/BoardModifyView1.bo1")){
			   action = new BoardModifyView1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/introduction/BoardModifyView1.bo1")){
			   action = new BoardModifyView1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/menu01/BoardModifyView1.bo1")){
			   action = new BoardModifyView1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/product/BoardModifyView1.bo1")){
			   action = new BoardModifyView1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/album/BoardModifyView1.bo1")){
			   action = new BoardModifyView1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/menu02/BoardModifyView1.bo1")){
			   action = new BoardModifyView1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		   else if(command.equals("/community1/BoardModifyView1.bo1")){
			   action = new BoardModifyView1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
	 	   }
		 
		 
		 
		 
		 
		   else if(command.equals("/main/BoardModifyAction1.bo1")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/introduction/BoardModifyAction1.bo1")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu01/BoardModifyAction1.bo1")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/product/BoardModifyAction1.bo1")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/album/BoardModifyAction1.bo1")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu02/BoardModifyAction1.bo1")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community1/BoardModifyAction1.bo1")){
			   System.out.println("Î≥¥Îìú Î™®Îîî?åå?ù¥ ?ï°?Öò!!!?ì§?ñ¥ Í∞îÎãà???");
			   action = new BoardModifyAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		 
		 
		 
		 
		 
		   else if(command.equals("/main/BoardAddAction1.bo1")){
			   System.out.println("?ó¨Í∏¥Í??????");
	            action  = new BoardAddAction1();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/introduction/BoardAddAction1.bo1")){
			   System.out.println("?ó¨Í∏¥Í??????");
	            action  = new BoardAddAction1();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/menu01/BoardAddAction1.bo1")){
			   System.out.println("?ó¨Í∏¥Í??????");
	            action  = new BoardAddAction1();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/product/BoardAddAction1.bo1")){
	            
	            action  = new BoardAddAction1();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/album/BoardAddAction1.bo1")){
	            
	            action  = new BoardAddAction1();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/menu02/BoardAddAction1.bo1")){
	            
	            action  = new BoardAddAction1();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
		   else if(command.equals("/community1/BoardAddAction1.bo1")){
	            
	            action  = new BoardAddAction1();
	            try {
	               forward=action.execute(request, response );
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }

		 
		 
		 
		 
		 
		 
		 
		 
		   else if(command.equals("/main/BoardList1.bo1")){
			   
			   action = new BoardListAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/introduction/BoardList1.bo1")){
			   
			   action = new BoardListAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu01/BoardList1.bo1")){
			   
			   action = new BoardListAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/product/BoardList1.bo1")){
			   
			   action = new BoardListAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/album/BoardList1.bo1")){
			   
			   action = new BoardListAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu02/BoardList1.bo1")){
			   
			   action = new BoardListAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community1/BoardList1.bo1")){
			   
			   action = new BoardListAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community/BoardList.bo2")){
			   
			   action = new BoardListAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community3/BoardList3.bo3")){
	   
			   action = new BoardListAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   
		 
		 
		 
		   
		   else if(command.equals("/main/BoardDetailAction1.bo1")){
			   System.out.println("BoardDetailAction.bo1!!!!");
			   action = new BoardDetailAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		 
		   else if(command.equals("/introduction/BoardDetailAction1.bo1")){
			   System.out.println("BoardDetailAction.bo1!!!!");
			   action = new BoardDetailAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu01/BoardDetailAction1.bo1")){
			   System.out.println("BoardDetailAction.bo1!!!!");
			   action = new BoardDetailAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/product/BoardDetailAction1.bo1")){
			   System.out.println("BoardDetailAction.bo1!!!!");
			   action = new BoardDetailAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/album/BoardDetailAction1.bo1")){
			   System.out.println("BoardDetailAction.bo1!!!!");
			   action = new BoardDetailAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu02/BoardDetailAction1.bo1")){
			   System.out.println("BoardDetailAction.bo1!!!!");
			   action = new BoardDetailAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community1/BoardDetailAction1.bo1")){
			   System.out.println("BoardDetailAction.bo1!!!!");
			   action = new BoardDetailAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		 
		 
		 
		 
		   
		   else if(command.equals("/main/BoardReplyAction1.bo1")){
			   
			   action = new BoardReplyAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/introduction/BoardReplyAction1.bo1")){
			   
			   action = new BoardReplyAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu01/BoardReplyAction1.bo1")){
			   
			   action = new BoardReplyAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/product/BoardReplyAction1.bo1")){
			   
			   action = new BoardReplyAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/album/BoardReplyAction1.bo1")){
			   
			   action = new BoardReplyAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/menu02/BoardReplyAction1.bo1")){
			   
			   action = new BoardReplyAction1();
			   try{
				   forward=action.execute(request, response);
			   }catch(Exception e){
				   e.printStackTrace();
			   }
		   }
		   else if(command.equals("/community1/BoardReplyAction1.bo1")){
			   
			   action = new BoardReplyAction1();
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