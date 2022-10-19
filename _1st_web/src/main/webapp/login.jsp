<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String u = request.getParameter("un");
	String p = request.getParameter("pwd");

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students1111", "root", "root");
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("select * from emp2");
		int f = 0;
		while (rs.next())
		{
			if (u.equals(rs.getString(1)) && p.equals(rs.getString(2)))
		f = 1;
		}

		if (f == 1) 
		{
			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("login.html");
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	%>
</body>
</html>