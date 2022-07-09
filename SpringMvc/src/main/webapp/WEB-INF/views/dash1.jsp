<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>model and view jsp print</title>
</head>
<body>
<h1>Name : ${name}</h1>
<h1>Id : ${Id}</h1>
<c:forEach items="${friends}" var="i">
<h3>${i}</h3>
</c:forEach>
</body>
</html>