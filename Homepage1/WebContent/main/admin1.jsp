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
<title>예약자 정보 보기</title>
</head>
<body>
<%System.out.println("여기는 관리자 모드 예약자 정보보기"); %>
<center>
<table border=1 width=300>

    <tr align=center>
        <td>이름 : </td> 
        <td><%=guest.getG_GUESTNAME() %></td>
    </tr>
    
    <tr align=center>
        <td>전화번호 : </td>
        <td><%=guest.getG_PHONE1() %>-<%=guest.getG_PHONE2() %>-<%=guest.getG_PHONE3() %></td>
    </tr>
    
    <tr align=center>
        <td>도착시간 : </td>
        <td><%=guest.getG_ARRIVAL_TIME() %></td>
    </tr>
    
     <tr align=center>
        <td>전달사항 : </td>
        <td><%=guest.getG_MEMO() %></td>
    </tr>
    
    <tr align=center>
        <td colspan=2>
            <a href="admin.jsp">리스트로 돌아가기</a>
        </td>
    </tr>
    <tr>
        <td colspan=2>
            <a href="main.jsp">[home 이동]</a>
        </td>
    </tr>
</table>
</center>
</body>
</html>