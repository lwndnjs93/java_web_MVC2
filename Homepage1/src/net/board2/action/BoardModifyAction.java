package net.board2.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import net.board2.db.*;

 public class BoardModifyAction implements Action {
	 public ActionForward execute(HttpServletRequest request,HttpServletResponse response) 
	 	throws Exception{
		 
		 request.setCharacterEncoding("euc-kr");
		 
		 boolean result = false;
		 
		 int num=Integer.parseInt(request.getParameter("num"));
		 
		 BoardDAO boarddao=new BoardDAO();
		 BoardBean boarddata=new BoardBean();
		 ActionForward forward = new ActionForward();
		 
		 String realFolder="";
         String saveFolder="boardupload";

         int fileSize=5*1024*1024;
         
         realFolder=request.getRealPath(saveFolder);
         
		 
         System.out.println("?„˜???„˜??222  "+num);
		 try{
			 MultipartRequest multi=null;
	multi=new MultipartRequest(request, realFolder, fileSize, "euc-kr", new DefaultFileRenamePolicy());
	
				boarddata.setBOARD_NUM(num);
	            boarddata.setBOARD_NAME(multi.getParameter("BOARD_NAME"));
	   		 	boarddata.setBOARD_PASS(multi.getParameter("BOARD_PASS"));
	   		 	boarddata.setBOARD_SUBJECT(multi.getParameter("BOARD_SUBJECT"));
	   		 	boarddata.setBOARD_CONTENT(multi.getParameter("BOARD_CONTENT"));
	   		 
	   		 	
	   		 	System.out.println("12?ˆ˜? • ?„˜ë²„ëŠ” "+multi.getParameter("BOARD_NUM"));
	   		 	System.out.println("12?ˆ˜? • ? œëª©ì? "+ multi.getParameter("BOARD_SUBJECT"));
	   		 	System.out.println("12?ˆ˜? • ?‚´?š©?? "+ multi.getParameter("BOARD_CONTENT"));
	   		 System.out.println("?„˜???„˜??666  "+num);
			 result = boarddao.boardModify(boarddata);
			 if(result==false){
		   		System.out.println("FALSE");
		   		return null;
		   	 }
		   	 
		   	 forward.setRedirect(true);
		   	 forward.setPath("./BoardList.bo2?num="+boarddata.getBOARD_NUM());
		   	 return forward;
	   	 }catch(Exception ex){
	   			ex.printStackTrace();	 
		 }
		 
		 return null;
	 }
}