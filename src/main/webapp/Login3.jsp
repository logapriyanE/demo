<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("name");
String pass=request.getParameter("password");
if(name.equals("loga")&&pass.equals("1234")) {
	response.sendRedirect("Home.jsp");
}
else {
	response.sendRedirect("Login3.jsp");
}
%>
</body>
</html>