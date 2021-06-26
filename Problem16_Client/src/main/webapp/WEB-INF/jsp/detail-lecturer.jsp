<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<h1 class="text-center">Detail Info Lecturer</h1>
	<h5>ID: ${lecturer.id }</h5>
	<h5>Full Name: ${lecturer.fullName }</h5>
	<h5>Research Area: ${lecturer.researchArea }</h5>
	<h5>Phone Number: ${lecturer.phoneNumber }</h5>
	<h5>Email: ${lecturer.email }</h5>
	<br>
	
	<a href="<c:url value="/lecturer/list"/>" class="btn btn-outline-success">Return back</a>
	<h1 class="text-center">List Subject</h1>
	<table class="table table-striped table-hover">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Publish Year</th>
				<th>Description</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lecturer.subjects }" var="subject">
				<tr>
					<td>${subject.id }</td>
					<td>${subject.name }</td>
					<td>${subject.publishYear }</td>
					<td>${subject.description }</td>
					<td><a href="#" class="btn btn-outline-danger">Delete</a>&nbsp;<a href="#" class="btn btn-outline-success">Update</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>