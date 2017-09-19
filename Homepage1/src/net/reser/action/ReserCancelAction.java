package net.reser.action;
/*
 * ���� ����ϱ� ����� �ִ� Ŭ����
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.reser.action.Action;
import net.reser.db.ReserBean;
import net.reser.db.ReserDAO;

public class ReserCancelAction implements Action{
	//���� ��ҿ��� �����ȣ, ��й�ȣ�� �ʿ��ϴ� �������� �Ѱ��� ���� �޾Ƽ� �������

	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("���� ��� Ŭ���� ����  ����");
		HttpSession session=request.getSession();
		request.setCharacterEncoding("euc-kr");
        ActionForward forward = new ActionForward();
        ReserDAO reserdao = new ReserDAO();
        ReserBean reserdata = new ReserBean();
        
        reserdata.setPassword(request.getParameter("password"));
        
        System.out.println("������� Ŭ������ �Ѿ�� �����ȣ�� : " +request.getParameter("resernum"));
        System.out.println("���� ��� Ŭ������ �Ѿ�� ��й�ȣ�� : "+reserdata.getPassword());
        reserdao.rescancel1(reserdata.getPassword());
        reserdao.rescancel2(reserdata.getPassword());
        
        forward.setRedirect(false);
        forward.setPath("/menu01/menu01_2.jsp");      
        
		return forward;
	}

}
