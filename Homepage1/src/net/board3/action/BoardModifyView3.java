package net.board3.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board3.db.BoardBean3;
import net.board3.db.BoardDAO3;

public class BoardModifyView3 implements Action3 {
	 public ActionForward3 execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
		 	ActionForward3 forward = new ActionForward3();
		 	request.setCharacterEncoding("euc-kr");
	   		
			BoardDAO3 boarddao=new BoardDAO3();
		   	BoardBean3 boarddata=new BoardBean3();
		   	
		   	int num=Integer.parseInt(request.getParameter("num"));
		   	
		   	boolean usercheck=false;
			 
	         usercheck=boarddao.isBoardWriter(num, request.getParameter("BOARD3_PASS"));
	         
	         System.out.println("?àò?†ï ?å®?ä§?õå?ìú?äî   " + request.getParameter("BOARD3_PASS"));
	         
			 if(usercheck==false){
			   		response.setContentType("text/html;charset=euc-kr");
			   		PrintWriter out=response.getWriter();
			   		out.println("<script>");
			   		out.println("alert('ÎπÑÎ?Î≤àÌò∏Í∞? ??Î¶ΩÎãà?ã§.');");
			   		out.println("location.href='./BoardList3.bo3';");
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
	   		forward.setPath("/community3/board_modify_view3.jsp");
	   		return forward;
	 }
}