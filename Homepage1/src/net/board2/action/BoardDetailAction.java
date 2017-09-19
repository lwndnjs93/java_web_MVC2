package net.board2.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board2.db.BoardBean;
import net.board2.db.BoardDAO;

 public class BoardDetailAction implements Action {
	 public ActionForward execute(HttpServletRequest request,HttpServletResponse response) 
			 throws Exception{ 
		request.setCharacterEncoding("UTF-8");
		int num=Integer.parseInt(request.getParameter("num"));
		
		System.out.println("?””?…Œ?¼ ?•¡?…˜?˜ ?„˜?? "+ num);
		
		BoardDAO boarddao=new BoardDAO();
	   	BoardBean boarddata=new BoardBean();
	   	
	    BoardDAO boarddao2=new BoardDAO();
	   	BoardBean boarddata2=new BoardBean();
	   	
		
		System.out.println("?””?…Œ?¼ ?•¡?…˜111!!!");
		boarddao.setReadCountUpdate(num);
		System.out.println("?””?…Œ?¼ ?•¡?…˜222!!!");
		boarddao2.setReadCountUpdate(num);
		System.out.println("?””?…Œ?¼ ?•¡?…˜333!!!");
		boarddata=boarddao.getDetail(num);
		System.out.println("?””?…Œ?¼ ?•¡?…˜444!!!");
	   	boarddata2=boarddao2.getDetailre(num);
	   	System.out.println("?””?…Œ?¼ ?•¡?…˜555!!!");
	   	if(boarddata==null){
	   		System.out.println("boarddata?? null?…?‹ˆ?‹¤.");
	   		return null;
	   	}
	   	if(boarddata2==null){
	   		System.out.println("boarddata2?? null?…?‹ˆ?‹¤.");
	   		return null;
	   	}
	   	System.out.println("?””?…Œ?¼ ?•¡?…˜666!!!");
	   	request.setAttribute("boarddata", boarddata);
	   	request.setAttribute("boarddata2", boarddata2);
	   	System.out.println("?””?…Œ?¼ ?•¡?…˜777!!!");
	   	ActionForward forward = new ActionForward();
	   	System.out.println("?””?…Œ?¼ ?•¡?…˜888!!!");
	   	forward.setRedirect(false);
	   	System.out.println("ë·°ë¡œ ê°??");
   		forward.setPath("/community/board02_view.jsp");
   		return forward;

	 }
}