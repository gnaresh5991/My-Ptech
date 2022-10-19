<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String u=request.getParameter("un");
String p=request.getParameter("pwd");
String a=request.getParameter("ad");
Integer z= Integer.parseInt(request.getParameter("zp"));


try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students1111","root","root");
	Statement stm=con.createStatement();
	int k=stm.executeUpdate("INSERT INTO `students1111`.`emp2` (`name`, `password`, `add`, `zip`) VALUES ('"+u+"', '"+p+"', '"+a+"', '"+z+"');"); 
	out.println("hi");
	if(k!=0)
	{
		response.sendRedirect("login.html");
	}
	else 
	{
		response.sendRedirect("register.html");
	}
}
catch (Exception e)
{
	System.out.println(e);
}

%>

</body>
</html>