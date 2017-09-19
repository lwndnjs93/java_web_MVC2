package net.board2.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board2.db.BoardDAO;

 public class BoardListAction implements Action {
	 public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
		BoardDAO boarddao=new BoardDAO();
		List boardlist=new ArrayList();

		String RequestURI=request.getRequestURI();
		String contextPath=request.getContextPath();
		String command=RequestURI.substring(contextPath.length());
		
		System.out.println("boardlist !!!" + boardlist);
		
	  	int page=1;
		int limit=10;
		
		if(request.getParameter("page")!=null){
			page=Integer.parseInt(request.getParameter("page"));
		}
		
		int listcount=boarddao.getListCount(); //�� ����Ʈ ���� �޾ƿ�.
		boardlist = boarddao.getBoardList(page,limit); //����Ʈ�� �޾ƿ�.
		
   		int maxpage=(int)((double)listcount/limit+0.95); //0.95�� ���ؼ� �ø� ó��.
   		
   		int startpage = (((int) ((double)page / 10 + 0.9)) - 1) * 10 + 1;
   		
   		int endpage = maxpage;
   		
   		if (endpage>startpage+10-1) endpage=startpage+10-1;
   		
   		request.setAttribute("page", page);		  //���� ������ ��.
   		request.setAttribute("maxpage", maxpage); //�ִ� ������ ��.
   		request.setAttribute("startpage", startpage); //���� �������� ǥ���� ù ������ ��.
   		request.setAttribute("endpage", endpage);     //���� �������� ǥ���� �� ������ ��.
		request.setAttribute("listcount",listcount); //�� ��.
		request.setAttribute("boardlist", boardlist);
		
		ActionForward forward= new ActionForward();
	   	forward.setRedirect(false);
	   	System.out.println("?���?�? 직전   " + command);
   		forward.setPath("/community/board02.jsp");
   		return forward;
	 }
 }