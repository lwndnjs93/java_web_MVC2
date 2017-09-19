package net.board1.action;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board1.db.BoardDAO1;

 public class BoardListAction1 implements Action1 {
	 public ActionForward1 execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
		BoardDAO1 boarddao=new BoardDAO1();
		List boardlist=new ArrayList();
		
		System.out.println("boardlist !!!" + boardlist);
		
	  	int page=1;
		int limit=10;
		
		String id = (String)request.getParameter("id");
		System.out.println("id?�� "+id);
		
		
		if(request.getParameter("page")!=null){
			page=Integer.parseInt(request.getParameter("page"));
		}
		System.out.println("page?�� "+page);
		
		int listcount=boarddao.getListCount(); //�� ����Ʈ ���� �޾ƿ�.
		boardlist = boarddao.getBoardList(page,limit); //����Ʈ�� �޾ƿ�.
		
   		int maxpage=(int)((double)listcount/limit+0.95); //0.95�� ���ؼ� �ø� ó��.
   		
   		int startpage = (((int) ((double)page / 10 + 0.9)) - 1) * 10 + 1;
   		
   		int endpage = maxpage;
   		
   		if (endpage>startpage+10-1) endpage=startpage+10-1;
   		
   		request.setAttribute("id", id);
   		request.setAttribute("page", page);		  //���� ������ ��.
   		request.setAttribute("maxpage", maxpage); //�ִ� ������ ��.
   		request.setAttribute("startpage", startpage); //���� �������� ǥ���� ù ������ ��.
   		request.setAttribute("endpage", endpage);     //���� �������� ǥ���� �� ������ ��.
		request.setAttribute("listcount",listcount); //�� ��.
		request.setAttribute("boardlist", boardlist);
		
		ActionForward1 forward= new ActionForward1();
	   	forward.setRedirect(false);
	   	
   		forward.setPath("/community1/board021.jsp");
   		return forward;
	 }
 }