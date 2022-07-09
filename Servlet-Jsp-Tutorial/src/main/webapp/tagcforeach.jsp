<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cforeach</title>
</head>
<body>
<c:forEach var="s" items="${stu}">  
   <c:out value="${s.rollno}"/> 
   <c:out value="${s.name}"/>  
</c:forEach>  
</body>
</html>