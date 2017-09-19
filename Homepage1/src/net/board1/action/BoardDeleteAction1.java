package net.board1.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board1.db.*;

public class BoardDeleteAction1 implements Action1 {
    public ActionForward1 execute(HttpServletRequest request,HttpServletResponse response) 
       throws Exception{
       
      ActionForward1 forward = new ActionForward1();
      request.setCharacterEncoding("euc-kr");
      
         boolean result=false;
         boolean usercheck=false;
      
         
         int num=Integer.parseInt(request.getParameter("num"));
         String id = (String)request.getParameter("id");
         
         
         BoardDAO1 boarddao=new BoardDAO1();
         usercheck=boarddao.isBoardWriter(num, request.getParameter("BOARD1_PASS"));
         
         System.out.println("?‚­? œ ?Œ¨?Š¤?›Œ?“œ?Š”   " + request.getParameter("BOARD1_PASS"));
         
         if(usercheck==false){
            response.setContentType("text/html;charset=euc-kr");
            PrintWriter out=response.getWriter();
            out.println("<script>");
            out.println("alert('ë¹„ë?ë²ˆí˜¸ê°? ??ë¦½ë‹ˆ?‹¤.');");
            out.println("location.href='./BoardList1.bo1';");
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
         
         request.setAttribute("id", id);
         
         forward.setRedirect(true);
         forward.setPath("./BoardList1.bo1");
         return forward;
    }
}