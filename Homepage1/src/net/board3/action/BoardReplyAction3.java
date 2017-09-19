package net.board3.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board3.db.BoardDAO3;
import net.board3.db.BoardBean3;

public class BoardReplyAction3 implements Action3 {
	 public ActionForward3 execute(HttpServletRequest request,HttpServletResponse response) 
	 throws Exception{
		 	request.setCharacterEncoding("euc-kr");
		 	ActionForward3 forward = new ActionForward3();
		 	
		 	int num=Integer.parseInt(request.getParameter("num"));
		 	
		 	System.out.println("reply fail111!!!");
			
		 	BoardDAO3 boarddao=new BoardDAO3();
	   		BoardBean3 boarddata=new BoardBean3();
	   		boolean result=false;
	   		
	   		System.out.println("Î≤àÌò∏!!!" + num);
	   		System.out.println("?ù¥Î¶?!!!" + request.getParameter("BOARD3RE_NAME"));
	   		System.out.println("?Ç¥?ö©!!!" + request.getParameter("BOARD3RE_CONTENT"));
	   		
	   		boarddata.setBOARD3_NUM(num);
	   		boarddata.setBOARD3_NAME(request.getParameter("BOARD3RE_NAME"));
	   		boarddata.setBOARD3_CONTENT(request.getParameter("BOARD3RE_CONTENT"));
	   		
	   		System.out.println("reply fail333!!!");
	   		
	   		result=boarddao.boardReply(boarddata);
	   		
	   		if(result==false){
	   			System.out.println("reply fail!!!");
	   			return null;
	   		}
	   		forward.setRedirect(true);
	   		forward.setPath("./BoardList3.bo3");
	   		return forward;
	}  	
}