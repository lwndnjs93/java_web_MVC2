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
 * �����ϱ� ������ ���� ���
 * �����ϱ� ���������� �޾ƿ� ���� DB�� �����Ѵ�
 */
public class ReserAction implements Action {
	
	
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) 
	throws Exception {
		System.out.println("ReserAction Ŭ���� ����");
		request.setCharacterEncoding("EUC-KR");
        HttpSession session=request.getSession();
        ActionForward forward = new ActionForward();
        ReserDAO reserdao = new ReserDAO();
        ReserBean reserdata = new ReserBean();
        boolean result = false;
        
        try{        	
        
        System.out.println("ReserActionŬ������ try����!!");
        reserdata.setR_ROOMNAME(request.getParameter("R_ROOMNAME"));//���̸� ����
        System.out.println("�� �̸��� �Ѿ�� : "+reserdata.getR_ROOMNAME() );
        
        reserdata.setR_OVERGUEST(request.getParameter("R_OVERGUEST"));//�߰��ο� ��
        System.out.println("�߰� �ο��� �Ѿ�� : "+reserdata.getR_OVERGUEST());
        
        reserdata.setR_ARRIVAL(request.getParameter("R_ARRIVAL"));//������ ����
        System.out.println("������ ���� : "+reserdata.getR_ARRIVAL());
        
        reserdata.setR_STAY(request.getParameter("R_STAY"));//���ڱⰣ ����
        System.out.println("���ڱⰣ ���� ������ : "+reserdata.getR_STAY());
        
        reserdata.setR_pay(request.getParameter("R_pay"));//���ڿ�� ����
        System.out.println("���ڿ�� ������ ������ : "+reserdata.getR_pay());
        
        reserdata.setG_GUESTNAME(request.getParameter("G_GUESTNAME"));//�մ� �̸� ����
        String name = request.getParameter("G_GUESTNAME");
        System.out.println("�մ� �̸� ������ ������ : "+reserdata.getG_GUESTNAME());
        
        reserdata.setG_PHONE1(request.getParameter("G_PHONE1")); //�޴��� ����
        reserdata.setG_PHONE2(request.getParameter("G_PHONE2")); //�޴��� ����
        reserdata.setG_PHONE3(request.getParameter("G_PHONE3")); //�޴��� ����
        String ph1 = request.getParameter("G_PHONE1");
        String ph2 = request.getParameter("G_PHONE2");
        String ph3 = request.getParameter("G_PHONE3");
        System.out.println("�޴��� ������ ������ : "+reserdata.getG_PHONE1()+"-"+reserdata.getG_PHONE2()+"-"+reserdata.getG_PHONE3());
        
        reserdata.setPassword(request.getParameter("password"));//�� ���� ���̺� ���� ��й�ȣ ����
        System.out.println("���� ��й�ȣ�� ������ : "+reserdata.getPassword());
        
        reserdata.setG_ARRIVAL_TIME(request.getParameter("G_ARRIVAL_TIME"));//���������ð� ����
        System.out.println("���������ð� ������ ���� : "+reserdata.getG_ARRIVAL_TIME());
        
        reserdata.setG_MEMO(request.getParameter("G_MEMO"));//��Ÿ �޸� ����
        System.out.println("��Ÿ �޸��ѰŴ� ���� : "+reserdata.getG_MEMO());
        
        System.out.println("dao���� ����");
        result = reserdao.reservation_RoomInfo(reserdata);
        
        System.out.println("���� �̷��� �ϸ� �����ȣ�� ���ñ�?:"+reserdao.getNum());
        
        if(result == false){
        	System.out.println("���� ��� ����");
        	return null;
        }
        System.out.println(reserdata.getResernum());
        System.out.println("���� ��� �Ϸ�");
        
        System.out.println(request.getParameter("G_GUESTNAME"));
        System.out.println("ReserAction���� �����ȣ�� �Ѿ�Դ�?????"+reserdao.getNum());        
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
