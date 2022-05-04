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
<title>Dojo Add</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
<div class="card">
		<div class= "card-body">
		<header>
			<h3>Add a Dojo</h3>
		</header>
		<main>	
			<form:form action="/addDojo" method="post" modelAttribute="dojo">
				<div class="row=mb-3">
			        <form:label class="col-sm-2 col-form-label" path="name">Name:</form:label>
			        <form:errors class="text-danger" path="name"/>
			        <div class="col-sm-10 d-flex justify-content-between align-items-center">
				        <form:input class="form-control" path="name"/>
				        <input class="btn btn-success" type="submit" value="Add"/>
				    </div>
		   		</div>
			</form:form>
		</main>
		</div>
	</div>
</div>
</body>
</html>