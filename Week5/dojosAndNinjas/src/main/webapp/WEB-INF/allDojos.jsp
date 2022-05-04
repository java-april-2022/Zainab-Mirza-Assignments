<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Details</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
	<div class="card">
		<div class="card-body">
			<header>
				<h2 class="text-center">${dojo.name} Ninjas</h2>
			</header>
			<main>
				<table class="table table-danger">
					<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Age</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="ninja" items="${dojo.ninjas}">
					<tr>
						<td>${ninja.firstName }</td>
						<td>${ninja.lastName }</td>
						<td>${ninja.age }</td>
					</tr>
					</c:forEach>
				</tbody>
				</table>
			</main>
		</div>
	</div>
</div>
</body>
</html>