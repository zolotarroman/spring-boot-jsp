<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<!-- 
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Spring Boot</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">

		<div class="starter-template">
			<h1>Spring Boot Web JSP Example</h1>
			<h2>Message: ${message}</h2>
		</div>

	</div>
	<div>
		<table
				class="table table-striped table table-hover table-bordered table-condensed text-center panel-body"
				id="applicationTable">
			<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Surname</th>
				<th>Password</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${user}" var="application">
				<tr>
					<td><c:out value="${user.id}"></c:out></td>
					<td><c:out value="${user.name}"></c:out></td>
					<td><c:out value="${user.surname}"></c:out></td>
					<td><c:out value="${user.password}"></c:out></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	<!-- /.container -->

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
