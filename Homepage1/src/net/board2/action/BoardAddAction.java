package net.board2.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import net.board2.db.BoardDAO;
import net.board2.db.BoardBean;

public class BoardAddAction implements Action {
    public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception{

    	 BoardDAO boarddao=new BoardDAO();
         BoardBean boarddata=new BoardBean();
         ActionForward forward=new ActionForward();
         
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
            
         
   		 	boarddata.setBOARD_NAME(multi.getParameter("BOARD_NAME"));
   		 	boarddata.setBOARD_PASS(multi.getParameter("BOARD_PASS"));
   		 	boarddata.setBOARD_SUBJECT(multi.getParameter("BOARD_SUBJECT"));
   		 	boarddata.setBOARD_CONTENT(multi.getParameter("BOARD_CONTENT"));
            
            System.out.println("1? œëª©ì? "+multi.getParameter("BOARD_SUBJECT"));
   		 	System.out.println("1?‚´?š©?? "+multi.getParameter("BOARD_CONTENT"));
   		 
            boarddata.setBOARD_FILE(
                  multi.getFilesystemName((String)multi.getFileNames().nextElement()));
            result=boarddao.boardInsert(boarddata);
            result2=boarddao.boardReInsert(boarddata);
            
            if(result==false){
               return null;
            }
         
            forward.setRedirect(true);
            forward.setPath("./BoardList.bo2");
            return forward;
      
        }catch(Exception ex){
            ex.printStackTrace();
         }
        return null;
   }     
}