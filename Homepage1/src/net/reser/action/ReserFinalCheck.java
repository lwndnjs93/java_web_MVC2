package net.reser.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.reser.db.ReserBean;
import net.reser.db.ReserDAO;

/*
 * 예약 최종 확인 페이지를 보여주는 클래스
 */
public class ReserFinalCheck implements Action{

	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("euc-kr");
		HttpSession session=request.getSession();
        ReserDAO reserdao = new ReserDAO();
        ReserBean reserdata = new ReserBean();
        ReserBean reserdata1 = new ReserBean();

        int resernum = 0;
        
        resernum = (Integer) session.getAttribute("resernum");
        
        System.out.println("최종확인 페이지에 넘어온 예약번호 확인 : "+resernum);

        reserdata = reserdao.finalcheck(resernum); //이름, 휴대폰번호1,2,3 도착예정시간, 기타 메모
        reserdata1 = reserdao.finalcheck1(resernum); //예약일, 예약객실, 추가인원, 숙박기간, 예약번호
        
        if(reserdata == null || reserdata1 == null){
        	System.out.println("최종확인 보기 실패");
        	return null;
        }
        System.out.println("최종확인 보기 성공");
        
        
        request.setAttribute("reserdata1", reserdata1); //예약일, 예약객실, 추가인원, 숙박기간, 예약번호
        request.setAttribute("reserdata", reserdata); //이름, 휴대폰번호1,2,3 도착예정시간, 기타 메모
        ActionForward forward = new ActionForward();
        forward.setRedirect(false);
        forward.setPath("/menu01/reserv.jsp");      
        return forward;
	}
}
