<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="com.mysql.cj.jdbc.Blob"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.model.Student"%>
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
<title>Profile</title>
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
					 Student u = (Student)session.getAttribute("login"); 
					 if(session.getAttribute("login") == null){
					 %>
					<jsp:forward page="login.jsp"></jsp:forward>
				     <%
					 }
					 else{
					 
					 %>
					 <%@include file="navbar.jsp" %>
					  <%@include file="histroy.jsp" %>
					<%
							if(session.getAttribute("edit") == null || session.getAttribute("eimg") == null ){
							}
							else{
								String msg = session.getAttribute("edit").toString();
								String lmsg = session.getAttribute("eimg").toString();
								if (msg.equals("update") || lmsg.equals("uimg")) {
									session.removeAttribute("edit");
									session.removeAttribute("eimg");
						    %>
						    <div class="alert alert-success alert-dismissible fade show mt-2"
							role="alert">
							<strong><p>Your profile is updated successfully!!</p></strong>
							<button type="button" class="close" data-dismiss="alert"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
						</div>
							<% }
							
							} %>
					<div class="row">
					 <div class="col-md-4 ">
					 
					 <img src="pics/<%= u.getSimg() %>" class="img-fluid" style="margin-top: 27px;">
					 <div class="card mt-2">
					 <form method="post" action="uimg" enctype="multipart/form-data">
					 <input type="hidden"
											class="form-control" name= "id" value="<%= u.getSid() %>"  required>
					 <input type="file" class="mt-2" name= "img" required>
					 
					 <button class="btn btn-secendory mt-3" style="width: 100%;">Change profile</button>

					 </form>
					 </div>
					 </div>
					 <div class="col-md-8">
					 	<% SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	                       Date date = new Date();
	                     %>
	
		<div class="row">
			
				
					
						<div class="col-12" style="margin-top: 19px;">
							<form method="post" action="update" >			
							    <div class="row p-2">

									<div class="col">
										<label>Student Id</label> <input type="text"
											class="form-control" name= "sid" value="<%= u.getSid() %>"  required>
									</div>
									<div class="col">
										<label>Register Date</label> <input type="text"
											class="form-control " disabled name="date"
											value="<%= formatter.format(date) %>">
									</div>
								</div>
								<div class="row p-2">
									<div class="col">
										<label>Name</label> <input type="text" class="form-control"
											placeholder="Your name" name="fname" value="<%= u.getSname() %>" required>
									</div>
									<div class="col">
										<label>Email</label> <input type="email" class="form-control"
											placeholder="Your email" name="email" value="<%= u.getSemail() %>" required>
									</div>
								</div>
								<div class="row p-2">
									<div class="col">
										<label>Phone Number</label> <input type="text"
											class="form-control" placeholder="Your phoneno" name="phone" value="<%= u.getSphone() %>" required>
									</div>
									<div class="col">
										<label>Branch</label> <select id="Select" class="form-control" name="branch"  required>
											<option><%= u.getSbranch() %></option>
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
											placeholder="Your city" name="city" value="<%= u.getScity() %>" required>
									</div>
									<div class="col">
										<label>Country</label> <input type="text" class="form-control"
											placeholder="Your country" name="country" value="<%= u.getScountry() %>" required>
									</div>
								</div>
								<div class="row p-2">
									<div class="col">
										<label>Zip Code</label> <input type="text"
											class="form-control" placeholder="Your zip" value="<%= u.getSzip() %>" name="zip" required>
									</div>
									<div class="col">
									<label>Password</label> <input type="password" id="pass" value="<%= u.getPassword() %>"
											placeholder="Create password" class="form-control " name="pass">
										
									</div>
								</div>
			
								<div class="text-center mt-2">
									<button class="btn btn-info">Update</button>
								</div>
							</form>
							
						</div>
					</div>
				</div>
			</div>
		

	
					 </div>
					 </div>
					</div>
					 <% 
					 }
					 %>
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