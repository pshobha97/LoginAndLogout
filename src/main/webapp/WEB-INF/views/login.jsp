<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%
  
    
    String message=(String)session.getAttribute("message");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>Login</title>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-8 offset-md-2">
<div class="card mt-3 ">

<div class="card-header bg-dark  "><h3 style="color:white;">Login Here!</h3>
</div>
<div class="card-body">
<div class="alert alert-success alert-dismissible fade show" role="alert">
  <strong><%=message%></strong> 
  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
    <span aria-hidden="true">&times;</span>
  </button>
</div>



<form:form action="userLogin" method="post" modelAttribute="user">
<div class="form-group">
<label for="text">UserName:</label>
<form:input path="userName" id="text" type="text" cssClass="form-control" placeholder="enter userName"></form:input>

</div>
<div class="form-group">
<label for="password">Password:</label>
<form:input path="userPassword" id="password" type="password" cssClass="form-control" placeholder="enter password"></form:input>

</div>


<div class="container text-center mt-4">
<button type="submit" class="btn btn-outline-primary custom-bg">Login</button>
<button type="reset" class="btn btn-outline-warning">Reset</button></div>
</form:form>

</div>

</div>

</div>
</div>

</div>


</body>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</html>