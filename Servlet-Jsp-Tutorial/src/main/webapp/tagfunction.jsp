<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function</title>
</head>
<body>
<c:set var="data" value="I am ajay Ingle."/> 
Upper case :  ${fn:toUpperCase(data) }
<br>
Lower case : ${fn:toLowerCase(data) }
<br>


<c:if test="${fn:contains(data, 'ajay')}">  
   <p>Found ajay as name<p>  
</c:if> 


<c:set var="str1" value="Welcome-to-JSP-Programming."/>  
<c:set var="str2" value="${fn:split(str1, '-')}" /> 
<c:set var="str3" value="${fn:join(str2, ' ')}" />  
<p>String-3 : ${str3}</p>

Length of the String-2 is: ${fn:length(str3)}  
<br>
${fn:replace(str1, "-", "=")}     
</body>
</html>