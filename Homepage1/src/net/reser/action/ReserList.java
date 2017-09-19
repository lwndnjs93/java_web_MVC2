package net.reser.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.reser.db.ReserBean;
import net.reser.db.ReserDAO;

/*
 * 예약 목록을 보여주는 클래스
 * 미완
 */
public class ReserList implements Action {

	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("euc-kr");
		ActionForward forward = new ActionForward();
		ReserDAO reserdao = new ReserDAO();
		ReserBean reserdata = new ReserBean();
		ReserBean reserdata1 = new ReserBean();
		ReserBean reserdata2 = new ReserBean();
		HttpSession session = request.getSession();
		String G_GUESTNAME = null;
		String password = null;
		String G_PHONE1 = null;
		String G_PHONE2 = null;
		String G_PHONE3 = null;
		boolean result = false;

		G_GUESTNAME = request.getParameter("G_GUESTNAME");
		password = request.getParameter("password");
		G_PHONE1 = request.getParameter("G_PHONE1");
		G_PHONE2 = request.getParameter("G_PHONE2");
		G_PHONE3 = request.getParameter("G_PHONE3");
		System.out.println("ReserLiat클래스에서 리퀘스트 값으로 받아온 값들을 출력한다");
		System.out.println(request.getParameter("G_GUESTNAME")+"\t"+request.getParameter("password")+"\t"+request.getParameter("G_PHONE1")+"\t"+request.getParameter("G_PHONE2")+"\t"+request.getParameter("G_PHONE3"));

		reserdata = reserdao.reserlist(G_GUESTNAME, password, G_PHONE1, G_PHONE2, G_PHONE3);
		reserdata1 = reserdao.reserlist1(reserdata); //방이름, 숙박일수, 예약번호
		reserdata2 = reserdao.reserlist2(reserdata); //고객이름, 메모값
		
		System.out.println("ReserList클래스에서 찍어본 값들");
		System.out.println(reserdata1.getR_ROOMNAME()+"\t"+reserdata1.getR_STAY()+"\t"+reserdata1.getResernum());
		System.out.println(reserdata2.getG_GUESTNAME()+"\t"+reserdata2.getG_MEMO());
		System.out.println("ReserList에서 찍어본 값들 출력 끝");

		if (reserdata == null) {
			System.out.println("예약목록 불러오기 실패");
			return null;
		}
		System.out.println("예약목록 불러오기 성공");
		
		request.setAttribute("reserdata1", reserdata1); //방이름, 숙박일수, 예약번호
		request.setAttribute("reserdata2", reserdata2); //고객이름, 메모값
		forward.setRedirect(false);
		forward.setPath("/menu01/reservCheck.jsp");
		return forward;
	}
}