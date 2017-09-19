package net.board1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board1.db.BoardDAO1;
import net.board1.db.BoardBean1;

public class BoardReplyAction1 implements Action1 {
	 public ActionForward1 execute(HttpServletRequest request,HttpServletResponse response) 
	 throws Exception{
		 	request.setCharacterEncoding("euc-kr");
		 	ActionForward1 forward = new ActionForward1();
		 	
		 	int num=Integer.parseInt(request.getParameter("num"));
		 	
		 	System.out.println("reply fail111!!!");
			
		 	BoardDAO1 boarddao=new BoardDAO1();
	   		BoardBean1 boarddata=new BoardBean1();
	   		boolean result=false;
	   		
	   		System.out.println("Î≤àÌò∏!!!" + num);
	   		System.out.println("?ù¥Î¶?!!!" + request.getParameter("BOARD1RE_NAME"));
	   		System.out.println("?Ç¥?ö©!!!" + request.getParameter("BOARD1RE_CONTENT"));
	   		
	   		boarddata.setBOARD1_NUM(num);
	   		boarddata.setBOARD1_NAME(request.getParameter("BOARD1RE_NAME"));
	   		boarddata.setBOARD1_CONTENT(request.getParameter("BOARD1RE_CONTENT"));
	   		
	   		System.out.println("reply fail333!!!");
	   		
	   		result=boarddao.boardReply(boarddata);
	   		
	   		if(result==false){
	   			System.out.println("reply fail!!!");
	   			return null;
	   		}
	   		forward.setRedirect(true);
	   		forward.setPath("./BoardList1.bo1");
	   		return forward;
	}  	
}