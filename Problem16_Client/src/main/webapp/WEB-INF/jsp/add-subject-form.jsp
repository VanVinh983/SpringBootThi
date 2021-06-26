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
		<h1 class="text-center">Add Subject Form</h1>
	<form:form method="POST" modelAttribute="subject">
		<div class="form-group">
			<form:label path="name">Name:</form:label>
			<form:input path="name" class="form-control" />
		</div>
		<div class="form-group">
			<form:label path="publishYear">Publish Year:</form:label>
			<form:input path="publishYear" class="form-control" />
		</div>
		<div class="form-group">
			<form:label path="description">Description:</form:label>
			<form:input path="description" class="form-control" />
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form:form>
	<br>
	<a href="<c:url value="/lecturer/list"/>" class="btn btn-outline-success">Return back</a>
	</div>
</body>
</html>