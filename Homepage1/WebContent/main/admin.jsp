<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% String id = (String)request.getParameter("id"); %>
<%@ page import="java.util.*" %>
<%@ page import="net.reser.db.*" %>
<%
    List roomlist = (List)request.getAttribute("roomlist");
	List guestlist = (List)request.getAttribute("guestlist");
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title></title>
</head>
<body>

<% System.out.println(id); %>
<center>
<table border=1 width=300>
    <tr align=center>
        <td colspan=2>예약자 목록</td>
    </tr>
    
    
    
    <%
    for(int i=0;i<guestlist.size();i++){
    	ReserBean Reser=(ReserBean)guestlist.get(i);
    %>
    <tr align=center>
        <td>
            <a href="ReserviewAction.rs?guestname=<%=Reser.getG_GUESTNAME() %>">
                <%=Reser.getG_GUESTNAME() %>
            </a>
        </td>
        <td>
        <a href="ReserCAction.rs?pass=<%=Reser.getPassword()%>">삭제</a>
        </td>
    </tr>
    
    
    <% 
     System.out.println("어드민 jsp의 리절넘"+Reser.getResernum());
     System.out.println("어드민 jsp의 비번"+Reser.getPassword()); 
     %>
     
    <%} %>
    
    
    
    
    
    
    <tr align=center>
        <td colspan=2>
            <a href="main.jsp">[home 이동]</a>
        </td>
    </tr>
</table>
</center>
</body>
</html>