package net.board1.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board1.db.BoardBean1;
import net.board1.db.BoardDAO1;

public class BoardModifyView1 implements Action1 {
	 public ActionForward1 execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
		 	ActionForward1 forward = new ActionForward1();
		 	request.setCharacterEncoding("euc-kr");
	   		
		 	System.out.println(request.getParameter("BOARD1_PASS"));
			
		 	BoardDAO1 boarddao=new BoardDAO1();
		   	BoardBean1 boarddata=new BoardBean1();
		   	
		   	int num=Integer.parseInt(request.getParameter("num"));
		   	
		   	boolean usercheck=false;
			 
	         usercheck=boarddao.isBoardWriter(num, request.getParameter("BOARD1_PASS"));
	         
	         System.out.println("?àò?†ï ?å®?ä§?õå?ìú?äî   " + request.getParameter("BOARD1_PASS"));
	         
			 if(usercheck==false){
			   		response.setContentType("text/html;charset=euc-kr");
			   		PrintWriter out=response.getWriter();
			   		out.println("<script>");
			   		out.println("alert('ÎπÑÎ?Î≤àÌò∏Í∞? ??Î¶ΩÎãà?ã§.');");
			   		out.println("location.href='./BoardList.bo2';");
			   		out.println("</script>");
			   		out.close();
			   		return null;
			 }
		   	
			
			
		   	boarddata=boarddao.getDetail(num);
		   	
		   	if(boarddata==null){
		   		return null;
		   	}
		   	
		   	request.setAttribute("boarddata", boarddata);
		   	forward.setRedirect(false);
		   	System.out.println("BoardBodifyView?ùò ?Ñò??  "+num);
	   		forward.setPath("/community1/board_modify_view1.jsp");
	   		return forward;
	 }
}