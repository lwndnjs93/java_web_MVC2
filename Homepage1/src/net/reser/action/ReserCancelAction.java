package net.reser.action;
/*
 * 예약 취소하기 기능이 있는 클래스
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.reser.action.Action;
import net.reser.db.ReserBean;
import net.reser.db.ReserDAO;

public class ReserCancelAction implements Action{
	//예약 취소에는 예약번호, 비밀번호가 필요하다 세션으로 넘겨준 값을 받아서 취소하자

	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("예약 취소 클래스 진입  성공");
		HttpSession session=request.getSession();
		request.setCharacterEncoding("euc-kr");
        ActionForward forward = new ActionForward();
        ReserDAO reserdao = new ReserDAO();
        ReserBean reserdata = new ReserBean();
        
        reserdata.setPassword(request.getParameter("password"));
        
        System.out.println("예약취소 클래스에 넘어온 예약번호는 : " +request.getParameter("resernum"));
        System.out.println("예약 취소 클래스에 넘어온 비밀번호는 : "+reserdata.getPassword());
        reserdao.rescancel1(reserdata.getPassword());
        reserdao.rescancel2(reserdata.getPassword());
        
        forward.setRedirect(false);
        forward.setPath("/menu01/menu01_2.jsp");      
        
		return forward;
	}

}
