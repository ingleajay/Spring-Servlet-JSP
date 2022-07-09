<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Model and view </title>
</head>
<body>
<% 
String name = (String) request.getAttribute("name"); 
Integer id = (Integer)  request.getAttribute("Id");
List<String> f = (List<String>)  request.getAttribute("friends");
%>
<h1> Name : <%=name %></h1>
<h1> Id : <%=id %></h1>
<%
for(String i : f){
%>
<h1><%=i %></h1>
<%
}
%>
</body>
</html>