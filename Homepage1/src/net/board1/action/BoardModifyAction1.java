package net.board1.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import net.board1.db.*;

 public class BoardModifyAction1 implements Action1 {
	 public ActionForward1 execute(HttpServletRequest request,HttpServletResponse response) 
	 	throws Exception{
		 
		 request.setCharacterEncoding("euc-kr");
		 
		 boolean result = false;
		 
		 int num=Integer.parseInt(request.getParameter("num"));
		 
		 BoardDAO1 boarddao=new BoardDAO1();
		 BoardBean1 boarddata=new BoardBean1();
		 ActionForward1 forward = new ActionForward1();
		 
		 String realFolder="";
         String saveFolder="boardupload";

         int fileSize=5*1024*1024;
         
         realFolder=request.getRealPath(saveFolder);
         
		 
         System.out.println("?„˜???„˜??222  "+num);
		 try{
			 MultipartRequest multi=null;
	multi=new MultipartRequest(request, realFolder, fileSize, "euc-kr", new DefaultFileRenamePolicy());
	
				boarddata.setBOARD1_NUM(num);
	            boarddata.setBOARD1_NAME(multi.getParameter("BOARD1_NAME"));
	   		 	boarddata.setBOARD1_PASS(multi.getParameter("BOARD1_PASS"));
	   		 	boarddata.setBOARD1_SUBJECT(multi.getParameter("BOARD1_SUBJECT"));
	   		 	boarddata.setBOARD1_CONTENT(multi.getParameter("BOARD1_CONTENT"));
	   		 
	   		 	
	   		 	System.out.println("12?ˆ˜? • ?„˜ë²„ëŠ” "+multi.getParameter("BOARD1_NUM"));
	   		 	System.out.println("12?ˆ˜? • ? œëª©ì? "+ multi.getParameter("BOARD1_SUBJECT"));
	   		 	System.out.println("12?ˆ˜? • ?‚´?š©?? "+ multi.getParameter("BOARD1_CONTENT"));
	   		 System.out.println("?„˜???„˜??666  "+num);
			 result = boarddao.boardModify(boarddata);
			 if(result==false){
		   		System.out.println("FALSE");
		   		return null;
		   	 }
		   	 
		   	 forward.setRedirect(true);
		   	 forward.setPath("./BoardList1.bo1?num="+boarddata.getBOARD1_NUM());
		   	 return forward;
	   	 }catch(Exception ex){
	   			ex.printStackTrace();	 
		 }
		 
		 return null;
	 }
}