package net.board2.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board2.db.BoardDAO;
import net.board2.db.BoardBean;

public class BoardReplyAction implements Action {
	 public ActionForward execute(HttpServletRequest request,HttpServletResponse response) 
	 throws Exception{
		 	request.setCharacterEncoding("euc-kr");
		 	ActionForward forward = new ActionForward();
		 	
		 	int num=Integer.parseInt(request.getParameter("num"));
		 	
		 	System.out.println("reply fail111!!!");
			
		 	BoardDAO boarddao=new BoardDAO();
	   		BoardBean boarddata=new BoardBean();
	   		boolean result=false;
	   		
	   		System.out.println("Î≤àÌò∏!!!" + num);
	   		System.out.println("?ù¥Î¶?!!!" + request.getParameter("BOARD2RE_NAME"));
	   		System.out.println("?Ç¥?ö©!!!" + request.getParameter("BOARD2RE_CONTENT"));
	   		
	   		boarddata.setBOARD_NUM(num);
	   		boarddata.setBOARD_NAME(request.getParameter("BOARD2RE_NAME"));
	   		boarddata.setBOARD_CONTENT(request.getParameter("BOARD2RE_CONTENT"));
	   		
	   		System.out.println("reply fail333!!!");
	   		
	   		result=boarddao.boardReply(boarddata);
	   		
	   		if(result==false){
	   			System.out.println("reply fail!!!");
	   			return null;
	   		}
	   		forward.setRedirect(true);
	   		forward.setPath("./BoardList.bo2");
	   		return forward;
	}  	
}