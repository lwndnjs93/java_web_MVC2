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
<title> 관리자 Login_Check </title>
</head>
<body>
    <h1> 관리자 로그인 체크 페이지 </h1>
    <%
    try {
        // 드라이버 로딩
        String driverName = "oracle.jdbc.driver.OracleDriver";
        Class.forName(driverName);
        
        // 관리자 Login
        String url = "jdbc:oracle:thin:@localhost:1521:myoracle";
        String id = "ora_user";
        String pwd = "1234";
        
        // 연결
        Connection con = DriverManager.getConnection(url, id, pwd);
        
         // sql 구사
         // 전 페이지인 LOGIN.jsp input에 입력한 값들을 변수에 담는다
         String user_id= request.getParameter("ADMIN_ID");
         String user_pwd= request.getParameter("ADMIN_PW");
         
        Statement st = con.createStatement();
        // 내가 입려한 id와 pw 값이 DB안에 있는지 확인한다
        String sql = "SELECT * FROM ADMIN WHERE ADMIN_ID='" + user_id + "' AND ADMIN_PW='" + user_pwd + "'";
        ///////////////////////////////////////////////관리자 관련 테이블을 따로 만들어 줄 것
        st.executeUpdate(sql);
        ResultSet rs = st.executeQuery(sql);

        // isLogin 은 로그인 확인 유무를 위한 변수
        Boolean isLogin = false;
        while(rs.next()) {
            // rs.next가 true 라면 = 정보가 있다
            isLogin = true;
        }
        
        // DB에 내가 적은 정보가 있다면
        if(isLogin) {
        	%> <script> alert("관리자모드로 로그인합니다");</script> <%
            // 지금 로그인할 id와 pw를 session에 저장하고
            session.setAttribute("ADMIN_ID", user_id); 
            session.setAttribute("ADMIN_PW", user_pwd);
            //demo.html로 보냄
            response.sendRedirect("main.jsp");
            
        } else {
            // DB에 내가적은 정보가 없다면 경고창을 띄워준다
            %> <script> alert("로그인 실패"); history.go(-1); </script> <%            
        }   
        
    } catch (Exception e) {       
        out.println("DB 연동 실패");
    }
    %>
</body>
</html>