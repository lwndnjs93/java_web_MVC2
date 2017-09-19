package net.board3.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board3.db.BoardDAO3;
import net.board3.db.BoardBean3;

public class BoardReplyView3 implements Action3 {
	 public ActionForward3 execute(HttpServletRequest request,HttpServletResponse response) 
	 	throws Exception{
		 	ActionForward3 forward = new ActionForward3();
		 	
			BoardDAO3 boardredao=new BoardDAO3();
	   		BoardBean3 boardredata=new BoardBean3();
	   		
	   		int num=Integer.parseInt(request.getParameter("num"));
	   		
	   		boardredata=boardredao.getDetail(num);
	   		
	   		if(boardredata==null){
	   			System.out.println("���� ������ �̵� ����");
	   			return null;
	   		}
	   		System.out.println("���� ������ �̵� �Ϸ�");
	   		
	   		request.setAttribute("boarddata", boardredata);
	   		
	   		forward.setRedirect(false);
	   		forward.setPath("/community3/board02_view3.jsp");
	   		return forward;
	}
}