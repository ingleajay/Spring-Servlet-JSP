<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Credirect</title>
</head>
<body>
<c:set var="url" value="0" scope="request"/>  
  <c:if test="${url<1}">  
     <c:redirect url="https://codeouter.com"/>  
  </c:if>  
  <c:if test="${url>1}">  
     <c:redirect url="https://facebook.com"/>  
  </c:if>  
</body>
</html>