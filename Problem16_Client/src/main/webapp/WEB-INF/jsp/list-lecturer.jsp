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
	<h1 class="text-center">List Lecturer</h1>
	<a href="<c:url value="create"/>">Add Lecturer</a>
	<br>
	<table class="table table-hover table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Full Name</th>
				<th>Research Area</th>
				<th>Phone Number</th>
				<th>Email</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lecturers }" var="lecturer">
				<tr>
					<td>${lecturer.id }</td>
					<td>${lecturer.fullName }</td>
					<td>${lecturer.researchArea }</td>
					<td>${lecturer.phoneNumber }</td>
					<td>${lecturer.email }</td>
					<td>
					<a href="<c:url value="delete/${lecturer.id }"/>" class="btn btn-outline-danger" onclick="return confirm('are you sure you want to delete?')">Delete</a>
					&nbsp;
					<a href="<c:url value="update/${lecturer.id }"/>" class="btn btn-outline-primary">Update</a>
					&nbsp;
					<a href="<c:url value="detail/${lecturer.id }"/>" class="btn btn-outline-success">Detail</a>
					&nbsp;
					<a href="<c:url value="/subject/create/${lecturer.id }"/>" class="btn btn-outline-warning">Add Subject</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>