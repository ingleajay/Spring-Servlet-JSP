<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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

<title>Register</title>

</head>
<body>
	<% SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date(); %>
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3 mt-4">
				<div class="card"
					style="box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);">
					<div class="login-form bg-white mt-4 p-4">
						<div class="alert alert-warning text-center" role="alert">
							<strong><h4>Register for access app</h4></strong>
						</div>
						<div class="col-12" style="margin-top: 19px;">
							<form method="post" action="reg" enctype="multipart/form-data">
								<div class="row p-2">
									<div class="col">
										<label>Name</label> <input type="text" class="form-control"
											placeholder="Your name" name="fname" required>
									</div>
									<div class="col">
										<label>Email</label> <input type="email" class="form-control"
											placeholder="Your email" name="email" required>
									</div>
								</div>
								<div class="row p-2">
									<div class="col">
										<label>Phone Number</label> <input type="text"
											class="form-control" placeholder="Your phoneno" name="phone" required>
									</div>
									<div class="col">
										<label>Branch</label> <select id="Select" class="form-control" name="branch"
											required>
											<option>Choose branch</option>
											<option>Cs</option>
											<option>Extc</option>
											<option>Bio</option>
											<option>Mec</option>
											<option>It</option>
										</select>
									</div>
								</div>
								<div class="row p-2">
									<div class="col">
										<label>City</label> <input type="text" class="form-control"
											placeholder="Your city" name="city" required>
									</div>
									<div class="col">
										<label>Country</label> <input type="text" class="form-control"
											placeholder="Your country" name="country" required>
									</div>
								</div>
								<div class="row p-2">
									<div class="col">
										<label>Zip Code</label> <input type="text"
											class="form-control" placeholder="Your zip" name="zip" required>
									</div>
									<div class="col">
										<label>Profile</label> <input type="file"
											class="form-control-file" name= "img" required>
									</div>
								</div>
								<div class="row p-2">

									<div class="col">
										<label>Password</label> <input type="password" id="pass"
											placeholder="Create password" class="form-control " name="pass">
									</div>
									<div class="col">
										<label>Current Date and Time</label> <input type="text"
											class="form-control " disabled name="date"
											value="<%= formatter.format(date) %>">
									</div>
								</div>
								<div class="text-center mt-2">
									<button class="btn btn-success">Register</button>
								</div>
							</form>
							<p class="text-center mt-2">
								have account ? <a href="login.jsp">Login here</a>
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