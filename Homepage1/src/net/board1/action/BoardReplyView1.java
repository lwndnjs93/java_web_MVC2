package net.board1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board1.db.BoardDAO1;
import net.board1.db.BoardBean1;

public class BoardReplyView1 implements Action1 {
	 public ActionForward1 execute(HttpServletRequest request,HttpServletResponse response) 
	 	throws Exception{
		 	ActionForward1 forward = new ActionForward1();
		 	
			BoardDAO1 boardredao=new BoardDAO1();
	   		BoardBean1 boardredata=new BoardBean1();
	   		
	   		int num=Integer.parseInt(request.getParameter("num"));
	   		
	   		boardredata=boardredao.getDetail(num);
	   		
	   		if(boardredata==null){
	   			System.out.println("���� ������ �̵� ����");
	   			return null;
	   		}
	   		
	   		request.setAttribute("boarddata", boardredata);
	   		
	   		forward.setRedirect(false);
	   		forward.setPath("/community1/board02_view1.jsp");
	   		return forward;
	}
}