<%@ page language="java" 
    contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"
    import="java.sql.*"%>
<%
    request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title> ������ Login_Check </title>
</head>
<body>
    <h1> ������ �α��� üũ ������ </h1>
    <%
    try {
        // ����̹� �ε�
        String driverName = "oracle.jdbc.driver.OracleDriver";
        Class.forName(driverName);
        
        // ������ Login
        String url = "jdbc:oracle:thin:@localhost:1521:myoracle";
        String id = "ora_user";
        String pwd = "1234";
        
        // ����
        Connection con = DriverManager.getConnection(url, id, pwd);
        
         // sql ����
         // �� �������� LOGIN.jsp input�� �Է��� ������ ������ ��´�
         String user_id= request.getParameter("ADMIN_ID");
         String user_pwd= request.getParameter("ADMIN_PW");
         
        Statement st = con.createStatement();
        // ���� �Է��� id�� pw ���� DB�ȿ� �ִ��� Ȯ���Ѵ�
        String sql = "SELECT * FROM ADMIN WHERE ADMIN_ID='" + user_id + "' AND ADMIN_PW='" + user_pwd + "'";
        ///////////////////////////////////////////////������ ���� ���̺��� ���� ����� �� ��
        st.executeUpdate(sql);
        ResultSet rs = st.executeQuery(sql);

        // isLogin �� �α��� Ȯ�� ������ ���� ����
        Boolean isLogin = false;
        while(rs.next()) {
            // rs.next�� true ��� = ������ �ִ�
            isLogin = true;
        }
        
        // DB�� ���� ���� ������ �ִٸ�
        if(isLogin) {
        	%> <script> alert("�����ڸ��� �α����մϴ�");</script> <%
            // ���� �α����� id�� pw�� session�� �����ϰ�
            session.setAttribute("ADMIN_ID", user_id); 
            session.setAttribute("ADMIN_PW", user_pwd);
            //demo.html�� ����
            response.sendRedirect("main.jsp");
            
        } else {
            // DB�� �������� ������ ���ٸ� ���â�� ����ش�
            %> <script> alert("�α��� ����"); history.go(-1); </script> <%            
        }   
        
    } catch (Exception e) {       
        out.println("DB ���� ����");
    }
    %>
</body>
</html>