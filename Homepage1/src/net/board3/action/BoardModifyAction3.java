package net.board3.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import net.board3.db.*;

 public class BoardModifyAction3 implements Action3 {
	 public ActionForward3 execute(HttpServletRequest request,HttpServletResponse response) 
	 	throws Exception{
		 
		 request.setCharacterEncoding("euc-kr");
		 
		 boolean result = false;
		 
		 int num=Integer.parseInt(request.getParameter("num"));
		 
		 BoardDAO3 boarddao=new BoardDAO3();
		 BoardBean3 boarddata=new BoardBean3();
		 ActionForward3 forward = new ActionForward3();
		 
		 String realFolder="";
         String saveFolder="boardupload";

         int fileSize=5*1024*1024;
         
         realFolder=request.getRealPath(saveFolder);
         
		 
         System.out.println("?„˜???„˜??222  "+num);
		 try{
			 MultipartRequest multi=null;
	multi=new MultipartRequest(request, realFolder, fileSize, "euc-kr", new DefaultFileRenamePolicy());
	
				boarddata.setBOARD3_NUM(num);
	            boarddata.setBOARD3_NAME(multi.getParameter("BOARD3_NAME"));
	   		 	boarddata.setBOARD3_PASS(multi.getParameter("BOARD3_PASS"));
	   		 	boarddata.setBOARD3_SUBJECT(multi.getParameter("BOARD3_SUBJECT"));
	   		 	boarddata.setBOARD3_CONTENT(multi.getParameter("BOARD3_CONTENT"));
	   		 
	   		 	
	   		 	System.out.println("12?ˆ˜? • ?„˜ë²„ëŠ” "+multi.getParameter("BOARD3_NUM"));
	   		 	System.out.println("12?ˆ˜? • ? œëª©ì? "+ multi.getParameter("BOARD3_SUBJECT"));
	   		 	System.out.println("12?ˆ˜? • ?‚´?š©?? "+ multi.getParameter("BOARD3_CONTENT"));
	   		 System.out.println("?„˜???„˜??666  "+num);
			 result = boarddao.boardModify(boarddata);
			 if(result==false){
		   		System.out.println("FALSE");
		   		return null;
		   	 }
		   	 
		   	 forward.setRedirect(true);
		   	 forward.setPath("./BoardList3.bo3?num="+boarddata.getBOARD3_NUM());
		   	 return forward;
	   	 }catch(Exception ex){
	   			ex.printStackTrace();	 
		 }
		 
		 return null;
	 }
}