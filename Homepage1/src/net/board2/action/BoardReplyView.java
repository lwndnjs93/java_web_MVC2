package net.board2.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board2.db.BoardDAO;
import net.board2.db.BoardBean;

public class BoardReplyView implements Action {
	 public ActionForward execute(HttpServletRequest request,HttpServletResponse response) 
	 	throws Exception{
		 	ActionForward forward = new ActionForward();
		 	
			BoardDAO boardredao=new BoardDAO();
	   		BoardBean boardredata=new BoardBean();
	   		
	   		int num=Integer.parseInt(request.getParameter("num"));
	   		
	   		boardredata=boardredao.getDetail(num);
	   		
	   		if(boardredata==null){
	   			System.out.println("���� ������ �̵� ����");
	   			return null;
	   		}
	   		System.out.println("���� ������ �̵� �Ϸ�");
	   		
	   		request.setAttribute("boarddata", boardredata);
	   		
	   		forward.setRedirect(false);
	   		forward.setPath("/community/board02_view.jsp");
	   		return forward;
	}
}