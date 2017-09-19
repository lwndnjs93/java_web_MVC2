package net.board1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import net.board1.db.BoardDAO1;
import net.board1.db.BoardBean1;

public class BoardAddAction1 implements Action1 {
    public ActionForward1 execute(HttpServletRequest request,HttpServletResponse response) throws Exception{

    	 BoardDAO1 boarddao=new BoardDAO1();
         BoardBean1 boarddata=new BoardBean1();
         ActionForward1 forward=new ActionForward1();
         String id = (String)request.getParameter("id");
         
         String realFolder="";
         String saveFolder="boardupload";

         int fileSize=5*1024*1024;
         
         realFolder=request.getRealPath(saveFolder);
         
         boolean result=false;
         boolean result2=false;
         try{
    		 MultipartRequest multi=null;
            multi=new MultipartRequest(request,
                  realFolder,
                  fileSize,
                  "euc-kr",
                  new DefaultFileRenamePolicy());
            
         
   		 	boarddata.setBOARD1_NAME(multi.getParameter("BOARD1_NAME"));
   		 	boarddata.setBOARD1_PASS(multi.getParameter("BOARD1_PASS"));
   		 	boarddata.setBOARD1_SUBJECT(multi.getParameter("BOARD1_SUBJECT"));
   		 	boarddata.setBOARD1_CONTENT(multi.getParameter("BOARD1_CONTENT"));
            
            System.out.println("1?†úÎ™©Ï? "+multi.getParameter("BOARD1_SUBJECT"));
   		 	System.out.println("1?Ç¥?ö©?? "+multi.getParameter("BOARD1_CONTENT"));
   		 
            boarddata.setBOARD1_FILE(
                  multi.getFilesystemName((String)multi.getFileNames().nextElement()));
            result=boarddao.boardInsert(boarddata);
            result2=boarddao.boardReInsert(boarddata);
            
            if(result==false){
               return null;
            }
            request.setAttribute("id", id);
            
         System.out.println("add?ï°?Öò?óê?Ñú id ?ÑòÍ≤? Ï§?" + id);
         
            forward.setRedirect(true);
            forward.setPath("./BoardList1.bo1");
            return forward;
      
        }catch(Exception ex){
            ex.printStackTrace();
         }
        return null;
   }     
}