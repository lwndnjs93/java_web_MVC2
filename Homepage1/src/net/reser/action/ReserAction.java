package net.reser.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import net.reser.action.ActionForward;
import net.reser.db.ReserDAO;
import net.reser.db.ReserBean;

/*
 * 예약하기 페이지 관련 기능
 * 에약하기 페이지에서 받아온 값을 DB에 저장한다
 */
public class ReserAction implements Action {
	
	
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) 
	throws Exception {
		System.out.println("ReserAction 클래스 진입");
		request.setCharacterEncoding("EUC-KR");
        HttpSession session=request.getSession();
        ActionForward forward = new ActionForward();
        ReserDAO reserdao = new ReserDAO();
        ReserBean reserdata = new ReserBean();
        boolean result = false;
        
        try{        	
        
        System.out.println("ReserAction클래스의 try진입!!");
        reserdata.setR_ROOMNAME(request.getParameter("R_ROOMNAME"));//방이름 정보
        System.out.println("방 이름은 넘어갔나 : "+reserdata.getR_ROOMNAME() );
        
        reserdata.setR_OVERGUEST(request.getParameter("R_OVERGUEST"));//추가인원 값
        System.out.println("추가 인원은 넘어갔니 : "+reserdata.getR_OVERGUEST());
        
        reserdata.setR_ARRIVAL(request.getParameter("R_ARRIVAL"));//도착일 정보
        System.out.println("도착일 정보 : "+reserdata.getR_ARRIVAL());
        
        reserdata.setR_STAY(request.getParameter("R_STAY"));//숙박기간 정보
        System.out.println("숙박기간 정보 들어갔을까 : "+reserdata.getR_STAY());
        
        reserdata.setR_pay(request.getParameter("R_pay"));//숙박요금 정보
        System.out.println("숙박요금 정보는 들어갔을까 : "+reserdata.getR_pay());
        
        reserdata.setG_GUESTNAME(request.getParameter("G_GUESTNAME"));//손님 이름 정보
        String name = request.getParameter("G_GUESTNAME");
        System.out.println("손님 이름 정보는 들어갔을까 : "+reserdata.getG_GUESTNAME());
        
        reserdata.setG_PHONE1(request.getParameter("G_PHONE1")); //휴대폰 정보
        reserdata.setG_PHONE2(request.getParameter("G_PHONE2")); //휴대폰 정보
        reserdata.setG_PHONE3(request.getParameter("G_PHONE3")); //휴대폰 정보
        String ph1 = request.getParameter("G_PHONE1");
        String ph2 = request.getParameter("G_PHONE2");
        String ph3 = request.getParameter("G_PHONE3");
        System.out.println("휴대폰 정보는 들어갔을까 : "+reserdata.getG_PHONE1()+"-"+reserdata.getG_PHONE2()+"-"+reserdata.getG_PHONE3());
        
        reserdata.setPassword(request.getParameter("password"));//방 정보 테이블 측의 비밀번호 정보
        System.out.println("에약 비밀번호는 들어갔을까 : "+reserdata.getPassword());
        
        reserdata.setG_ARRIVAL_TIME(request.getParameter("G_ARRIVAL_TIME"));//도착예정시간 정보
        System.out.println("도착예정시간 정보는 들어갔니 : "+reserdata.getG_ARRIVAL_TIME());
        
        reserdata.setG_MEMO(request.getParameter("G_MEMO"));//기타 메모 정보
        System.out.println("기타 메모한거는 들어갔나 : "+reserdata.getG_MEMO());
        
        System.out.println("dao진입 직전");
        result = reserdao.reservation_RoomInfo(reserdata);
        
        System.out.println("과연 이렇게 하면 예약번호가 나올까?:"+reserdao.getNum());
        
        if(result == false){
        	System.out.println("예약 등록 실패");
        	return null;
        }
        System.out.println(reserdata.getResernum());
        System.out.println("예약 등록 완료");
        
        System.out.println(request.getParameter("G_GUESTNAME"));
        System.out.println("ReserAction으로 예약번호는 넘어왔니?????"+reserdao.getNum());        
        session.setAttribute("resernum", reserdao.getNum());

        forward.setRedirect(true);
        forward.setPath("./ReserFinalCheck.rs");
        return forward;
        
        }catch(Exception ex){
        	ex.printStackTrace();
        }
        return null;
	}
}
