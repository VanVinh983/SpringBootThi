<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<li class="nav-item"><a class="nav-link" href="#"> Danh Sach
					| </a></li>
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/tp/showform"> Them tac
					pham moi | </a></li>
			<li class="nav-item"><a class="nav-link"
				href="${pageContext.request.contextPath}/tp/manager"> Chuc nang
					quan ly </a></li>
			<li class="nav-item"> <a class="btn btn-info" href="<c:url value="/logout" />">Logout</a></li>
		</ul>
	</nav>
	<div class="container-fluid">
		<div class="row">
			<div class="col-12">
				<c:forEach items="${tacgias }" var="tg">
					<div class="col-12" style="overflow: auto;">
						<hr>
						<h4 class="text-info">${tg.hoTen }</h4>
						<hr>
						<c:forEach items="${tacphams }" var="tp">
							<c:if test="${tg.id==tp.tacGia.id }">
								<div class="card col-3 float-left">
									<div class="card-body col-12">
										<img alt="" class="col-12" src="/image/${tp.hinh}">
									</div>
								</div>
							</c:if>
						</c:forEach>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>