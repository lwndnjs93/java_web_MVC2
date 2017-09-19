package net.board3.action;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board3.db.BoardDAO3;

 public class BoardListAction3 implements Action3 {
	 public ActionForward3 execute(HttpServletRequest request,HttpServletResponse response) throws Exception{
		BoardDAO3 boarddao=new BoardDAO3();
		List boardlist=new ArrayList();
		
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
		
		ActionForward3 forward= new ActionForward3();
	   	forward.setRedirect(false);
	   	
   		forward.setPath("/community3/board023.jsp");
   		return forward;
	 }
 }