<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*" %>
<%@ page import="net.reser.db.*" %>
<%
    ReserBean guest=(ReserBean)request.getAttribute("reser");

%>
 
<html>
<head>
<title>������ ���� ����</title>
</head>
<body>
<%System.out.println("����� ������ ��� ������ ��������"); %>
<center>
<table border=1 width=300>

    <tr align=center>
        <td>�̸� : </td> 
        <td><%=guest.getG_GUESTNAME() %></td>
    </tr>
    
    <tr align=center>
        <td>��ȭ��ȣ : </td>
        <td><%=guest.getG_PHONE1() %>-<%=guest.getG_PHONE2() %>-<%=guest.getG_PHONE3() %></td>
    </tr>
    
    <tr align=center>
        <td>�����ð� : </td>
        <td><%=guest.getG_ARRIVAL_TIME() %></td>
    </tr>
    
     <tr align=center>
        <td>���޻��� : </td>
        <td><%=guest.getG_MEMO() %></td>
    </tr>
    
    <tr align=center>
        <td colspan=2>
            <a href="admin.jsp">����Ʈ�� ���ư���</a>
        </td>
    </tr>
    <tr>
        <td colspan=2>
            <a href="main.jsp">[home �̵�]</a>
        </td>
    </tr>
</table>
</center>
</body>
</html>