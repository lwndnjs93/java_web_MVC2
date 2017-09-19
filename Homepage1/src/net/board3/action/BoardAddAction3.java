package net.board3.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import net.board3.db.BoardDAO3;
import net.board3.db.BoardBean3;

public class BoardAddAction3 implements Action3 {
    public ActionForward3 execute(HttpServletRequest request,HttpServletResponse response) throws Exception{

    	 BoardDAO3 boarddao=new BoardDAO3();
         BoardBean3 boarddata=new BoardBean3();
         ActionForward3 forward=new ActionForward3();
         
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
            
         
   		 	boarddata.setBOARD3_NAME(multi.getParameter("BOARD3_NAME"));
   		 	boarddata.setBOARD3_PASS(multi.getParameter("BOARD3_PASS"));
   		 	boarddata.setBOARD3_SUBJECT(multi.getParameter("BOARD3_SUBJECT"));
   		 	boarddata.setBOARD3_CONTENT(multi.getParameter("BOARD3_CONTENT"));
            
            System.out.println("1? œëª©ì? "+multi.getParameter("BOARD3_SUBJECT"));
   		 	System.out.println("1?‚´?š©?? "+multi.getParameter("BOARD3_CONTENT"));
   		 
            boarddata.setBOARD3_FILE(
                  multi.getFilesystemName((String)multi.getFileNames().nextElement()));
            result=boarddao.boardInsert(boarddata);
            result2=boarddao.boardReInsert(boarddata);
            
            if(result==false){
               return null;
            }
         
            forward.setRedirect(true);
            forward.setPath("./BoardList3.bo3");
            return forward;
      
        }catch(Exception ex){
            ex.printStackTrace();
         }
        return null;
   }     
}