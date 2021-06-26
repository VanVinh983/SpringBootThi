<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron jumbotron-fluid mb-0">
		<div class="container-fluid">
			<div class="row">
				<div class="col-12">
					<img alt="logo" src="/image/logonhasachphuongnam.png">
				</div>
			</div>
		</div>
	</div>
	<nav class="navbar navbar-expand-sm justify-content-end mt-0">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/tp/list"> Danh Sach | </a></li>
			<li class="nav-item"><a class="nav-link" href="#"> Them tac
					pham moi | </a></li>
			<li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/tp/manager"> Chuc nang
					quan ly </a></li>
		</ul>
	</nav>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<form:form action="${pageContext.request.contextPath}/tp/save" modelAttribute="tacpham" method="post" enctype="multipart/form-data">
					<div class="form-group">
						<form:label path="tenTP">
							tenTP: 
						</form:label>
						<form:input path="tenTP" cssClass="form-control"/>
						<form:errors path="tenTP" cssClass="text-danger"/>
					</div>
					<div class="form-group">
						<form:label path="loaiTP">
							loaiTP: 
						</form:label>
						<form:input path="loaiTP" cssClass="form-control"/>
						<form:errors path="loaiTP" cssClass="text-danger"/>
					</div>
					<div class="form-group">
						<form:label path="soTrang">
							soTrang: 
						</form:label>
						<form:input path="soTrang" cssClass="form-control"/>
						<form:errors path="soTrang" cssClass="text-danger"/>
					</div>
					<div class="form-group">
						<form:label path="gia">
							gia: 
						</form:label>
						<form:input path="gia" cssClass="form-control"/>
						<form:errors path="gia" cssClass="text-danger"/>
					</div>
					<div class="form-group">
						<form:label path="tomTat">
							tomTat: 
						</form:label>
						<form:input path="tomTat" cssClass="form-control"/>
						<form:errors path="tomTat" cssClass="text-danger"/>
					</div>
					<div class="form-group">
						<label for="hinhanh">Hinh: </label>
						<input type="file" name="hinhanh" id="hinhupload" class="form-control">
					</div>
					<div class="form-group">
						<form:label path="tacGia.id">
							Tac gia: 
						</form:label>
						<form:select path="tacGia.id" cssClass="form-control">
							<c:forEach items="${tacgias }" var="tg">
								<form:option value="${tg.id }"> ${tg.hoTen}</form:option>
							</c:forEach>
						</form:select>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-success">
					</div>
				</form:form>
			</div>
			<div class="col-3">
				 <a href="<c:url value="/logout" />">Logout</a>
			</div>
		</div>
	</div>
</body>
</html>