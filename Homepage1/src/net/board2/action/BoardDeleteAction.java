package net.board2.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.board2.db.*;

public class BoardDeleteAction implements Action {
    public ActionForward execute(HttpServletRequest request,HttpServletResponse response) 
       throws Exception{
       
      ActionForward forward = new ActionForward();
      request.setCharacterEncoding("euc-kr");
      
         boolean result=false;
         boolean usercheck=false;
      
         
         int num=Integer.parseInt(request.getParameter("num"));
         
         BoardDAO boarddao=new BoardDAO();
         usercheck=boarddao.isBoardWriter(num, request.getParameter("BOARD_PASS"));
         
         System.out.println("?��?�� ?��?��?��?��?��   " + request.getParameter("BOARD_PASS"));
         
         if(usercheck==false){
            response.setContentType("text/html;charset=euc-kr");
            PrintWriter out=response.getWriter();
            out.println("<script>");
            out.println("alert('비�?번호�? ??립니?��.');");
            out.println("location.href='./BoardList.bo2';");
            out.println("</script>");
            out.close();
            return null;
         }
         /*
         else if(usercheck==true){
             response.setContentType("text/html;charset=euc-kr");
             PrintWriter out=response.getWriter();
             out.println("<script>");
             out.println("alert('���� ���� �Ǿ����ϴ�.');");
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
         forward.setPath("./BoardList.bo2");
         return forward;
    }
}