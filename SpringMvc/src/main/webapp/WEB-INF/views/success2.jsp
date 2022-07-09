<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Demo-success</title>
  </head>
  <body>
  <div class="container mt-5">
  <h3 class="text-center ">Success</h3>
  <h3>Student Data : </h3>
<div class="card" style="width: 40rem;">
  <div class="card-body">
    <h5>Email : </h5>${us.email}
    <h5>Password : </h5>${us.password}
    <h5>Address : </h5>${us.address}
    <h5>City : </h5>${us.city}
    <h5>State : </h5>${us.state}
    <h5>Zip : </h5>${us.zip}
    <h5>Check : </h5>${us.check}
  </div>
</div>
<h5>This is status from post handler :</h5>${suc}
</div>
</body>
</html>