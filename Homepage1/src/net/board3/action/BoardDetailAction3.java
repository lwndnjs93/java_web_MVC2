package net.board3.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board3.db.BoardBean3;
import net.board3.db.BoardDAO3;

 public class BoardDetailAction3 implements Action3 {
	 public ActionForward3 execute(HttpServletRequest request,HttpServletResponse response) 
			 throws Exception{ 
		request.setCharacterEncoding("UTF-8");
		int num=Integer.parseInt(request.getParameter("num"));
		
		System.out.println("?””?…Œ?¼ ?•¡?…˜?˜ ?„˜?? "+ num);
		
		BoardDAO3 boarddao=new BoardDAO3();
	   	BoardBean3 boarddata=new BoardBean3();
	   	
	    BoardDAO3 boarddao2=new BoardDAO3();
	   	BoardBean3 boarddata2=new BoardBean3();
	   	
		
		
		boarddao.setReadCountUpdate(num);
		
		boarddao2.setReadCountUpdate(num);
		
		boarddata=boarddao.getDetail(num);
		System.out.println("?””?…Œ?¼ ?•¡?…˜444!!!");
	   	boarddata2=boarddao2.getDetailre(num);
	   	
	   	if(boarddata==null){
	   		System.out.println("boarddata?? null?…?‹ˆ?‹¤.");
	   		return null;
	   	}
	   	if(boarddata2==null){
	   		System.out.println("boarddata2?? null?…?‹ˆ?‹¤.");
	   		return null;
	   	}
	   	
	   	request.setAttribute("boarddata", boarddata);
	   	request.setAttribute("boarddata2", boarddata2);
	   	System.out.println("?””?…Œ?¼ ?•¡?…˜777!!!");
	   	ActionForward3 forward = new ActionForward3();
	   	System.out.println("?””?…Œ?¼ ?•¡?…˜888!!!");
	   	forward.setRedirect(false);
	   	System.out.println("ë·°ë¡œ ê°??");
   		forward.setPath("/community3/board02_view3.jsp");
   		return forward;

	 }
}