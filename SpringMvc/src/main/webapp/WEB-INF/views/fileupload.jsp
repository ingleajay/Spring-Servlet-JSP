<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<div class="container-fluid">
<h1>Upload your picture : </h1>
<form class="form-inline mt-7" action="uploadimg" method="post" enctype="multipart/form-data">
  
  <label class="sr-only" for="inlineFormInputGroupUsername2">Upload</label>
  <div class="input-group mb-2 mr-sm-2">
    <div class="input-group-prepend">
      <div class="input-group-text">@</div>
    </div>
    <input type="file" class="form-control" name="profile">
  </div>
  <button type="submit" class="btn btn-primary mb-2">Submit</button>
</form>
</div>
</body>
</html>