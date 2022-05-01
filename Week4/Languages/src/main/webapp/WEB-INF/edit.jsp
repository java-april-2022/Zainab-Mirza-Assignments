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
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
	<div class="card">
		<div class="card-body">
			<header class="d-flex justify-content-between align-items-center">
				<h3 class="text-center">Edit</h3>
				<div>
					<form:form action="/languages/delete/${lang.id}" method="delete">
						<button class="btn btn-danger">Delete</button>
					</form:form>
					<a href="/languages">Dashboard</a>
				</div>
			</header>
			<form:form action="/languages/update/${lang.id}" method="put" modelAttribute="lang">
					<div class="row=mb-3">
					        <form:label class="col-sm-2 col-form-label" path="name">Name:</form:label>
					        <form:errors class="text-danger" path="name"/>
					        <div class="col-sm-10">
						        <form:input class="form-control" path="name"/>
						    </div>
				   		</div>
				        <div class="row=mb-3">
					        <form:label class="col-sm-2 col-form-label" path="creator">creator:</form:label>
					        <form:errors class="text-danger" path="creator"/>
					        <div class="col-sm-10">
						        <form:input class="form-control" path="creator"/>
						    </div>
				   		</div>
				        <div class="row=mb-3">
					        <form:label class="col-sm-2 col-form-label" path="version">version:</form:label>
					        <form:errors class="text-danger" path="version"/>
					        <div class="col-sm-10">
						        <form:input class="form-control" path="version"/>
						    </div>
				   		</div>
				    	<input class="btn btn-success" type="submit" value="Update"/>
			</form:form>
		</div>
	</div>
</div>
</body>
</html>