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
                
                System.out.println("���ฮ��Ʈ �׼� !!!!!");
                //String guestname=request.getParameter("guestname");
                reser.setG_GUESTNAME(request.getParameter("guestname"));
                
                
                reser= reserdao.getGuest(reser.getG_GUESTNAME());
                System.out.println("���ฮ��Ʈ �׼� !!!!!1111");
                if(reser==null){
                    System.out.println("ȸ�� ���� ���� ����");
                    return null;
                }
                System.out.println("���ฮ��Ʈ �׼� !!!!!2222");
                request.setAttribute("reser", reser);
                System.out.println("����1 ������  !!!!!3333");
                forward.setRedirect(false);
                forward.setPath("/main/admin1.jsp");
                return forward;
       }
   }