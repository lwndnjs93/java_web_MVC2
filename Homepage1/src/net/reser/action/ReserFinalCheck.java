package net.reser.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.reser.db.ReserBean;
import net.reser.db.ReserDAO;

/*
 * ���� ���� Ȯ�� �������� �����ִ� Ŭ����
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
        
        System.out.println("����Ȯ�� �������� �Ѿ�� �����ȣ Ȯ�� : "+resernum);

        reserdata = reserdao.finalcheck(resernum); //�̸�, �޴�����ȣ1,2,3 ���������ð�, ��Ÿ �޸�
        reserdata1 = reserdao.finalcheck1(resernum); //������, ���ఴ��, �߰��ο�, ���ڱⰣ, �����ȣ
        
        if(reserdata == null || reserdata1 == null){
        	System.out.println("����Ȯ�� ���� ����");
        	return null;
        }
        System.out.println("����Ȯ�� ���� ����");
        
        
        request.setAttribute("reserdata1", reserdata1); //������, ���ఴ��, �߰��ο�, ���ڱⰣ, �����ȣ
        request.setAttribute("reserdata", reserdata); //�̸�, �޴�����ȣ1,2,3 ���������ð�, ��Ÿ �޸�
        ActionForward forward = new ActionForward();
        forward.setRedirect(false);
        forward.setPath("/menu01/reserv.jsp");      
        return forward;
	}
}
