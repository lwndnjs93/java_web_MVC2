package net.board3.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board3.db.*;

public class BoardDeleteAction3 implements Action3 {
    public ActionForward3 execute(HttpServletRequest request,HttpServletResponse response) 
       throws Exception{
       
      ActionForward3 forward = new ActionForward3();
      request.setCharacterEncoding("euc-kr");
      
         boolean result=false;
         boolean usercheck=false;
      
         
         int num=Integer.parseInt(request.getParameter("num"));
         
         BoardDAO3 boarddao=new BoardDAO3();
         usercheck=boarddao.isBoardWriter(num, request.getParameter("BOARD3_PASS"));
         
         System.out.println("?‚­? œ ?Œ¨?Š¤?›Œ?“œ?Š”   " + request.getParameter("BOARD3_PASS"));
         
         if(usercheck==false){
            response.setContentType("text/html;charset=euc-kr");
            PrintWriter out=response.getWriter();
            out.println("<script>");
            out.println("alert('ë¹„ë?ë²ˆí˜¸ê°? ??ë¦½ë‹ˆ?‹¤.');");
            out.println("location.href='./BoardList3.bo3';");
            out.println("</script>");
            out.close();
            return null;
         }
         /*
         else if(usercheck==true){
             response.setContentType("text/html;charset=euc-kr");
             PrintWriter out=response.getWriter();
             out.println("<script>");
             out.println("alert('ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½Ç¾ï¿½ï¿½ï¿½ï¿½Ï´ï¿½.');");
             out.println("</script>");
             out.close();
             return null;
          }
          */
         result=boarddao.boardDelete(num);
         
         if(result==false){
            return null;
         }
         
         forward.setRedirect(true);
         forward.setPath("./BoardList3.bo3");
         return forward;
    }
}