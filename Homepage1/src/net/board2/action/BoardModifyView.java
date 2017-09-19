package net.board2.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board2.db.BoardBean;
import net.board2.db.BoardDAO;

public class BoardModifyView implements Action {
	 public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
		 	ActionForward forward = new ActionForward();
		 	request.setCharacterEncoding("euc-kr");
	   		
			BoardDAO boarddao=new BoardDAO();
		   	BoardBean boarddata=new BoardBean();
		   	
		   	int num=Integer.parseInt(request.getParameter("num"));
		   	
		   	boolean usercheck=false;
			 
	         usercheck=boarddao.isBoardWriter(num, request.getParameter("BOARD_PASS"));
	         
	         System.out.println("?àò?†ï ?å®?ä§?õå?ìú?äî   " + request.getParameter("BOARD_PASS"));
	         
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
	   		forward.setPath("/community/board_modify_view.jsp");
	   		return forward;
	 }
}