package net.board1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board1.db.BoardBean1;
import net.board1.db.BoardDAO1;

 public class BoardDetailAction1 implements Action1 {
	 public ActionForward1 execute(HttpServletRequest request,HttpServletResponse response) 
			 throws Exception{ 
		request.setCharacterEncoding("UTF-8");
		int num=Integer.parseInt(request.getParameter("num"));
		String id = (String)request.getParameter("id");
		
		System.out.println("?””?…Œ?¼ ?•¡?…˜?˜ id?Š” "+id);
		
		System.out.println("?””?…Œ?¼ ?•¡?…˜?˜ ?„˜?? "+ num);
		
		BoardDAO1 boarddao=new BoardDAO1();
	   	BoardBean1 boarddata=new BoardBean1();
	   	
	    BoardDAO1 boarddao2=new BoardDAO1();
	   	BoardBean1 boarddata2=new BoardBean1();
	   	
		
		boarddao.setReadCountUpdate(num);
		boarddao2.setReadCountUpdate(num);
		boarddata=boarddao.getDetail(num);
	   	boarddata2=boarddao2.getDetailre(num);
	   	
	   	if(boarddata==null){
	   		System.out.println("boarddata?? null?…?‹ˆ?‹¤.");
	   		return null;
	   	}
	   	if(boarddata2==null){
	   		System.out.println("boarddata2?? null?…?‹ˆ?‹¤.");
	   		return null;
	   	}
	   	
	   	request.setAttribute("id", id);
	   	request.setAttribute("boarddata", boarddata);
	   	request.setAttribute("boarddata2", boarddata2);
	   	
	   	ActionForward1 forward = new ActionForward1();
	   	
	   	forward.setRedirect(false);
	   	System.out.println("ë·°ë¡œ ê°??");
   		forward.setPath("/community1/board02_view1.jsp");
   		return forward;

	 }
}