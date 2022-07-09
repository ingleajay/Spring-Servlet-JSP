<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Print result :</title>
</head>
<body>
<%
String add=(String)pageContext.getAttribute("result",PageContext.SESSION_SCOPE);  
out.print("Addition : "+add);  
%>
</body>
</html>