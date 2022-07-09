<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>implicit obejct</title>
</head>
<body>

<%
int a = Integer.parseInt(request.getParameter("no1"));
int b = Integer.parseInt(request.getParameter("no2"));
int add = a+b;
pageContext.setAttribute("result",String.valueOf(add),PageContext.SESSION_SCOPE);  
%>
<a href="implicitObject1.jsp">Click to next</a>
</body>
</html>