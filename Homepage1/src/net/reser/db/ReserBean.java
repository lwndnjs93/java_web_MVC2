package net.reser.db;

import java.sql.Date;

/*
 * 예상 도착 시간은 오후2시~11시까지 한시간 간격으로 있다.
 * 2시는 1 / 3시는 2 / 4시는 3 의 방식으로 int값으로 처리한다
 */

public class ReserBean {

	// 방 정보에 관한 값들
	private String R_ROOMNAME; // 방이름 
	private String R_OVERGUEST; // 추가인원 
	private String R_ARRIVAL; // 손님 도착일
	private String R_STAY; // 숙박기간 
	private String R_pay; // 숙박요금 


	// 손님 정보에 관한 값들
	private String G_GUESTNAME; // 손님 이름 
	private String G_PHONE1; // 손님 연락처 
	private String G_PHONE2;
	private String G_PHONE3;
	private String G_ARRIVAL_TIME; // 예상 도착시간 0
	private String G_MEMO; // 기타 메모 사항 0

	//두 테이블에 공통적으로 들어가는 값
	private String password;
	private int resernum; //예약 번호
	
	
	public String getR_ROOMNAME() {
		return R_ROOMNAME;
	}
	public void setR_ROOMNAME(String r_ROOMNAME) {
		R_ROOMNAME = r_ROOMNAME;
	}
	public String getR_OVERGUEST() {
		return R_OVERGUEST;
	}
	public void setR_OVERGUEST(String r_OVERGUEST) {
		R_OVERGUEST = r_OVERGUEST;
	}
	public String getR_ARRIVAL() {
		return R_ARRIVAL;
	}
	public void setR_ARRIVAL(String r_ARRIVAL) {
		R_ARRIVAL = r_ARRIVAL;
	}
	public String getR_STAY() {
		return R_STAY;
	}
	public void setR_STAY(String r_STAY) {
		R_STAY = r_STAY;
	}
	public String getR_pay() {
		return R_pay;
	}
	public void setR_pay(String r_pay) {
		R_pay = r_pay;
	}
	public String getG_GUESTNAME() {
		return G_GUESTNAME;
	}
	public void setG_GUESTNAME(String g_GUESTNAME) {
		G_GUESTNAME = g_GUESTNAME;
	}
	public String getG_PHONE1() {
		return G_PHONE1;
	}
	public void setG_PHONE1(String g_PHONE1) {
		G_PHONE1 = g_PHONE1;
	}
	public String getG_PHONE2() {
		return G_PHONE2;
	}
	public void setG_PHONE2(String g_PHONE2) {
		G_PHONE2 = g_PHONE2;
	}
	public String getG_PHONE3() {
		return G_PHONE3;
	}
	public void setG_PHONE3(String g_PHONE3) {
		G_PHONE3 = g_PHONE3;
	}
	public String getG_ARRIVAL_TIME() {
		return G_ARRIVAL_TIME;
	}
	public void setG_ARRIVAL_TIME(String g_ARRIVAL_TIME) {
		G_ARRIVAL_TIME = g_ARRIVAL_TIME;
	}
	public String getG_MEMO() {
		return G_MEMO;
	}
	public void setG_MEMO(String g_MEMO) {
		G_MEMO = g_MEMO;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getResernum() {
		return resernum;
	}
	public void setResernum(int resernum) {
		this.resernum = resernum;
	}

	
}