package net.reser.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
import net.reser.action.ActionForward;
import net.reser.db.ReserDAO;

public class ReserlistAction implements Action{
    public ActionForward execute(HttpServletRequest request,HttpServletResponse response)
            throws Exception{
                ActionForward forward = new ActionForward();
                
                HttpSession session=request.getSession();
                ReserDAO reserdao=new ReserDAO();
                
                System.out.println("����Ʈ�׼� ���� ����");
                
                List guestlist=new ArrayList();
                System.out.println("�Խ�Ʈ ����Ʈ");
                List roomlist=new ArrayList();
                System.out.println("�Խ�Ʈ ����Ʈ111");
                
                
                guestlist=reserdao.getGuestList();
                System.out.println("�Խ�Ʈ ����Ʈ222");
                roomlist=reserdao.getRoomList();
                System.out.println("�Խ�Ʈ ����Ʈ333");
                
                
                if(guestlist==null || roomlist==null){
                    System.out.println("ȸ�� ��� �б� ����");
                    return null;
                }
                System.out.println("�Խ�Ʈ ����Ʈ444");
                
                request.setAttribute("guestlist", guestlist);
                request.setAttribute("roomlist", roomlist);
                
                System.out.println("���� jsp��");
                
                forward.setRedirect(false);
                forward.setPath("/main/admin.jsp");
                return forward;
       }
   }