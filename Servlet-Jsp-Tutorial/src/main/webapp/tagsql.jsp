<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sql</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/jdbc"  
     user="root"  password="Lufa@7917"/>  
 <sql:query var="rs" dataSource="${db}">select * from task1</sql:query>
 <c:forEach var="t" items="${rs.rows}">  
   Data : <c:out value="${t.data}"/> 
   <br>
   Status : <c:out value="${t.status}"/>  
   <br>
</c:forEach> 
</body>
</html>