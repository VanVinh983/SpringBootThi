<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1 class="text-center">Add Lecturer Form</h1>
	<form:form method="POST" modelAttribute="lecturer">
		<div class="form-group">
			<form:label path="fullName">Full name:</form:label>
			<form:input path="fullName" class="form-control" />
		</div>
		<div class="form-group">
			<form:label path="researchArea">Research Area:</form:label>
			<form:input path="researchArea" class="form-control" />
		</div>
		<div class="form-group">
			<form:label path="phoneNumber">Phone Number:</form:label>
			<form:input path="phoneNumber" class="form-control" />
		</div>
		<div class="form-group">
			<form:label path="email">Email:</form:label>
			<form:input path="email" class="form-control" />
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
	<br>
	<a href="<c:url value="list"/>" class="btn btn-outline-success">Return back</a>
	</div>
</body>
</html>