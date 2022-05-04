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
<title>${song.title}</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
	<a href="/dashboard">Dashboard</a>
	<div class="card">
		<div class="card-body">
			<h2>${song.title}</h2>
			<h6> Artist: ${song.artist}</h6>
			<h6> Rating: ${song.rating}</h6>
			
			<form:form action="/delete/${song.id}" method="delete">
				<button class="btn btn-danger">Delete</button>
			</form:form>
		</div>
	</div>
</div>
</body>
</html>