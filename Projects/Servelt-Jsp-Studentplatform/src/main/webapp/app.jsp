<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<div class="row">
	<div class="col-md-12  mt-4">
		<div class="card p-2"
			style="box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);">
			<div class="alert alert-danger text-center" role="alert">
				<strong>Search keyword on different browser</strong>
			</div>
			<div class="p-4">
			<form action="search" method="post">
			<% Student p = (Student)session.getAttribute("login"); %>
			<input type="hidden" class="form-control" name="sid" value="<%= p.getSid() %>">
				<div class="form-group">
					<label >Write keyword</label>
					 <input
						type="text" class="form-control" id="write" name="keyword"
						placeholder="Please write keyword">
				</div>
				<div class="form-group">
					<label>Search Engine</label> <select id="Select" class="form-control" name="engine"  required>
											<option>Choose Option</option>
											<option>google</option>
											<option>youtube</option>
											<option>bing</option>
											
					</select>
				</div>
				<button class="btn btn-danger">Search</button>
			</form>
			</div>
		</div>
	</div>