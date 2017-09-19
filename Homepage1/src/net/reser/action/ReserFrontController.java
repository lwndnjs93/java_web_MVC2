package net.reser.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.reser.action.Action;
import net.reser.action.ActionForward;

/*
 * 넘어온 페이지를 기능에 맞게 클래스로 넘겨주는 예약 컨트롤러
 */
public class ReserFrontController 
	extends javax.servlet.http.HttpServlet 
	implements javax.servlet.Servlet{
		protected void doProcess(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
			String RequestURI=request.getRequestURI();
	         String contextPath=request.getContextPath();//길이 만큼 준다 
	         String command=RequestURI.substring(contextPath.length());
	         ActionForward forward=null;
	         Action action=null;
	         
	         System.out.println("컨트롤러 넘어옴");
	         System.out.println(command);
	         
	         if(command.equals("/main/ReserviewAction.rs")){
	        	 System.out.println("리스트뷰 진입");
	        	 //예약하기 페이지 관련 기능
	        	 action = new ReserviewAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         if(command.equals("/menu01/ReserviewAction.rs")){
	        	 System.out.println("리스트뷰 진입");
	        	 //예약하기 페이지 관련 기능
	        	 action = new ReserviewAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         
	         
	         if(command.equals("/main/ReserlistAction.rs")){
	        	 System.out.println("리스트액션 진입");
	        	 //예약하기 페이지 관련 기능
	        	 action = new ReserlistAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         if(command.equals("/menu01/ReserlistAction.rs")){
	        	 System.out.println("리스트액션 진입");
	        	 //예약하기 페이지 관련 기능
	        	 action = new ReserlistAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         else if(command.equals("/menu01/ReserAction.rs")){
	        	 System.out.println("if문 진입");
	        	 //예약하기 페이지 관련 기능
	        	 action = new ReserAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         else if(command.equals("/menu01/ReserCancelAction.rs")){
	        	 // 예약하기 취소 관련 기능
	        	 System.out.println("예약취소 if문으로 넘어옴");
	        	 action = new ReserCancelAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         
	         
	         
	         
	         else if(command.equals("/main/ReserCAction.rs")){
	        	 // 예약하기 취소 관련 기능
	        	 System.out.println("예약취소 if문으로 넘어옴");
	        	 action = new ReserCAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         else if(command.equals("/menu01/ReserCAction.rs")){
	        	 // 예약하기 취소 관련 기능
	        	 System.out.println("예약취소 if문으로 넘어옴");
	        	 action = new ReserCAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         
	         
	         
	         
	         else if(command.equals("/menu01/ReserList.rs")){
	        	 System.out.println("리스트 보여주는 if문 진입 성공!!");
	        	 // 예약목록 관련 기능
	        	 action = new ReserList();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         else if(command.equals("/menu01/ReserFinalCheck.rs")){
	        	 System.out.println("예약확인으로 넘어가는 if문 진입 성공!");
	        	 // 예약최종 확인 기능
	        	 action = new ReserFinalCheck();
	        	 System.out.println("예약확인하는 객체는 만들어졌네");
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         if(forward != null){  
	             if(forward.isRedirect()){
	                 response.sendRedirect(forward.getPath());
	             }else{
	                 RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
	                 dispatcher.forward(request, response);
	             }
	             }//forward 방식으로 보내거나 isRedirect으로 보내겠다.
			
		}
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
		        throws ServletException, IOException {
		        System.out.println("board");
		        doProcess(request,response);
		    }     
		    
		    protected void doPost(HttpServletRequest request, HttpServletResponse response)
		        throws ServletException, IOException {
		        doProcess(request,response);
		    }          
	}
