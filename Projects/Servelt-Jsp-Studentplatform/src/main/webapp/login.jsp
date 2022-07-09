<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Login</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-4 offset-md-4 mt-4">
				<div class="card"
					style="box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);">
					<div class="login-form bg-white mt-4 p-4">
						<div class="alert alert-warning text-center" role="alert">
							<strong><h5>Login for app</h5></strong>
						</div>
						
						<%
							if(session.getAttribute("logmsg") == "incorrect" ){
					     %>
					     <div class="alert alert-danger alert-dismissible fade show"
							role="alert">
							<strong><p>Incorrect credentials</p></strong>
							<button type="button" class="close" data-dismiss="alert"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
						<%} %>
					   <% if(session.getAttribute("success") == null){
							}
							else{
								String msg = session.getAttribute("success").toString();
								//String lmsg = session.getAttribute("lwrong").toString();
								if (msg.equals("true")) {
									session.removeAttribute("success");
						    %>
						    <div class="alert alert-success alert-dismissible fade show"
							role="alert">
							<strong><p>Your profile is created</p></strong>
							<button type="button" class="close" data-dismiss="alert"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
							<% }
							
							} %>
							
						
						<div class="col-12 " style="margin-top: 19px;">
							<form action="login" method="post">
								<div class="form-group">
									<label>Email address</label> <input type="email"
										class="form-control" name="email" placeholder="Enter email">
									<small id="emailHelp" class="form-text text-muted">We'll
										never share your email with anyone else.</small>
								</div>
								<div class="form-group">
									<label>Password</label> <input type="password" name="pass"
										class="form-control" id="exampleInputPassword1"
										placeholder="Password">
								</div>
								<div class="text-center mt-2">
									<button class="btn btn-success">Login</button>
								</div>
							</form>
							<p class="text-center mt-2">
								want account ? <a href="register.jsp">Register here</a>
							</p>
						</div>
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