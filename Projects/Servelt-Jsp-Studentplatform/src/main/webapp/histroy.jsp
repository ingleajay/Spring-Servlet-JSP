<%@page import="com.operations.ServicesImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.model.Search"%>
<%@page import="com.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div class="modal fade" id="exampleModal2" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">History of your
						search :</h5>
				</div>
				<div class="modal-body">
					<div class="row">
						<table class="table">
							<thead class="thead-dark">
								<tr>
									
									<th scope="col">Keywords</th>
									<th scope="col">Engine</th>
									<th scope="col">Actions</th>
								</tr>
							</thead>
							<tbody>
							<% 
							response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
							 
							 if(session.getAttribute("login") == null){
							 %>
							<jsp:forward page="login.jsp"></jsp:forward>
						     <%
							 }
							 else{
								 ArrayList<Search> search = new ServicesImpl().getsearch();
								 Student user = (Student)session.getAttribute("login");
								 for(int j=0;j<search.size();j++) {
										if( user.getSid() == search.get(j).getSid()) {
							%>
							<tr>
									<td><%= search.get(j).getSename()  %></td>
									<td><%= search.get(j).getSengine()%></td>
									<td>
									
									<a href="delete?search_id=<%= search.get(j).getSeid() %>"><button class="btn btn-danger">Delete</button></a>
									</td>
								</tr>
								<%
								}
								}
								 } %>	
							</tbody>
						</table>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
	</div>
    