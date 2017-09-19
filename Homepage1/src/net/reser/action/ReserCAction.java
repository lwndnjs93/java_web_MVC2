package net.reser.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.reser.db.ReserBean;
import net.reser.db.ReserDAO;

public class ReserCAction implements Action{
	//예약 취소에는 예약번호, 비밀번호가 필요하다 세션으로 넘겨준 값을 받아서 취소하자

	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("예약 취소 클래스 진입  성공");
		HttpSession session=request.getSession();
		request.setCharacterEncoding("euc-kr");
		
        ActionForward forward = new ActionForward();
        ReserDAO reserdao = new ReserDAO();
        ReserBean reserdata = new ReserBean();
        
        reserdata.setPassword(request.getParameter("pass"));
        
        System.out.println("예약 취소 클래스에 넘어온 비밀번호는111 : "+request.getParameter("pass"));
        
        
        System.out.println("예약 취소 클래스에 넘어온 비밀번호는 : "+reserdata.getPassword());
        reserdao.rescancel1(reserdata.getPassword());
        System.out.println("rescancel1직후");
        reserdao.rescancel2(reserdata.getPassword());
        
        forward.setRedirect(false);
        forward.setPath("/main/main.jsp");      
        
		return forward;
	}

}
