<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>DashBoard</title>
</head>
<body>
<div class="container">
		<div class="row">
			<div class="col-md-8 offset-md-2 mt-4">
				<div class="card"
					style="box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);">
					<div class="login-form bg-white mt-4 p-4">
					 <% 
					 response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
					 if(session.getAttribute("login") == null){
					 %>
					<jsp:forward page="login.jsp"></jsp:forward>
				     <%
					 }
					 else{
					     
					 %>
					 <%@include file="navbar.jsp" %>
					 <%@include file="histroy.jsp" %>
					 <%@include file="app.jsp" %>
					 <% 
					 }
					 %>
					</div>
				</div>
			</div>
		</div>
</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<script type="text/javascript" src="login.js"></script>
</body>
</html>