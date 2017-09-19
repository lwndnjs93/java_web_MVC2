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
                
                System.out.println("리스트액션 진입 성공");
                
                List guestlist=new ArrayList();
                System.out.println("게스트 리스트");
                List roomlist=new ArrayList();
                System.out.println("게스트 리스트111");
                
                
                guestlist=reserdao.getGuestList();
                System.out.println("게스트 리스트222");
                roomlist=reserdao.getRoomList();
                System.out.println("게스트 리스트333");
                
                
                if(guestlist==null || roomlist==null){
                    System.out.println("회원 목록 읽기 실패");
                    return null;
                }
                System.out.println("게스트 리스트444");
                
                request.setAttribute("guestlist", guestlist);
                request.setAttribute("roomlist", roomlist);
                
                System.out.println("어드민 jsp로");
                
                forward.setRedirect(false);
                forward.setPath("/main/admin.jsp");
                return forward;
       }
   }