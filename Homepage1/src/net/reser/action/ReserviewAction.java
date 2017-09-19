package net.reser.action;

import java.io.PrintWriter;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
import net.reser.action.ActionForward;
import net.reser.db.ReserBean;
import net.reser.db.ReserDAO;

public class ReserviewAction implements Action{
    public ActionForward execute(HttpServletRequest request,HttpServletResponse response)
            throws Exception{
                ActionForward forward = new ActionForward();
                
                HttpSession session=request.getSession();
               ReserDAO reserdao=new ReserDAO();
               ReserBean reser=new ReserBean();
                
                System.out.println("예약리스트 액션 !!!!!");
                //String guestname=request.getParameter("guestname");
                reser.setG_GUESTNAME(request.getParameter("guestname"));
                
                
                reser= reserdao.getGuest(reser.getG_GUESTNAME());
                System.out.println("예약리스트 액션 !!!!!1111");
                if(reser==null){
                    System.out.println("회원 정보 보기 실패");
                    return null;
                }
                System.out.println("예약리스트 액션 !!!!!2222");
                request.setAttribute("reser", reser);
                System.out.println("어드민1 가기전  !!!!!3333");
                forward.setRedirect(false);
                forward.setPath("/main/admin1.jsp");
                return forward;
       }
   }