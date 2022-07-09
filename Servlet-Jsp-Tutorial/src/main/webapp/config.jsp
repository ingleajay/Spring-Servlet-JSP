<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>config - use configObject.html and web.xml like jsp-file in servlet tag</title>
</head>
<body>
<%
out.println("Welcome "+request.getParameter("uname"));  
String course=config.getInitParameter("dname");  
out.println("Buy course : "+course);  
%>
</body>
</html>