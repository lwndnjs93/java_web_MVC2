package net.reser.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.reser.action.Action;
import net.reser.action.ActionForward;

/*
 * �Ѿ�� �������� ��ɿ� �°� Ŭ������ �Ѱ��ִ� ���� ��Ʈ�ѷ�
 */
public class ReserFrontController 
	extends javax.servlet.http.HttpServlet 
	implements javax.servlet.Servlet{
		protected void doProcess(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
			String RequestURI=request.getRequestURI();
	         String contextPath=request.getContextPath();//���� ��ŭ �ش� 
	         String command=RequestURI.substring(contextPath.length());
	         ActionForward forward=null;
	         Action action=null;
	         
	         System.out.println("��Ʈ�ѷ� �Ѿ��");
	         System.out.println(command);
	         
	         if(command.equals("/main/ReserviewAction.rs")){
	        	 System.out.println("����Ʈ�� ����");
	        	 //�����ϱ� ������ ���� ���
	        	 action = new ReserviewAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         if(command.equals("/menu01/ReserviewAction.rs")){
	        	 System.out.println("����Ʈ�� ����");
	        	 //�����ϱ� ������ ���� ���
	        	 action = new ReserviewAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         
	         
	         if(command.equals("/main/ReserlistAction.rs")){
	        	 System.out.println("����Ʈ�׼� ����");
	        	 //�����ϱ� ������ ���� ���
	        	 action = new ReserlistAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         if(command.equals("/menu01/ReserlistAction.rs")){
	        	 System.out.println("����Ʈ�׼� ����");
	        	 //�����ϱ� ������ ���� ���
	        	 action = new ReserlistAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         else if(command.equals("/menu01/ReserAction.rs")){
	        	 System.out.println("if�� ����");
	        	 //�����ϱ� ������ ���� ���
	        	 action = new ReserAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         else if(command.equals("/menu01/ReserCancelAction.rs")){
	        	 // �����ϱ� ��� ���� ���
	        	 System.out.println("������� if������ �Ѿ��");
	        	 action = new ReserCancelAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         
	         
	         
	         
	         else if(command.equals("/main/ReserCAction.rs")){
	        	 // �����ϱ� ��� ���� ���
	        	 System.out.println("������� if������ �Ѿ��");
	        	 action = new ReserCAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         else if(command.equals("/menu01/ReserCAction.rs")){
	        	 // �����ϱ� ��� ���� ���
	        	 System.out.println("������� if������ �Ѿ��");
	        	 action = new ReserCAction();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         
	         
	         
	         
	         else if(command.equals("/menu01/ReserList.rs")){
	        	 System.out.println("����Ʈ �����ִ� if�� ���� ����!!");
	        	 // ������ ���� ���
	        	 action = new ReserList();
	        	 try{
	                 forward=action.execute(request, response);
	             }catch(Exception e){
	                 e.printStackTrace();
	             }
	         }
	         
	         else if(command.equals("/menu01/ReserFinalCheck.rs")){
	        	 System.out.println("����Ȯ������ �Ѿ�� if�� ���� ����!");
	        	 // �������� Ȯ�� ���
	        	 action = new ReserFinalCheck();
	        	 System.out.println("����Ȯ���ϴ� ��ü�� ���������");
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
	             }//forward ������� �����ų� isRedirect���� �����ڴ�.
			
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
