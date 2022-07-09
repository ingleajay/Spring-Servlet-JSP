<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition</title>
</head>
<body bgcolor="cyan">
	<%
	int a = Integer.parseInt(request.getParameter("no1"));
	int b = Integer.parseInt(request.getParameter("no2"));	
	int add = a+b;
	
	// 2. show response on web browser
	out.println("Addition : " + add);
	
	%>
</body>
</html>