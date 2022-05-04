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
<title>Add New Song</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
	<div class="card">
		<div class="card-body">
			<h3 class="text-center">Add A Song</h3>
			<a class="btn btn-primary text-center" href="/dashboard">Dashboard</a>
			<form:form action="/add" method="post" modelAttribute="song">
				<div class="row=mb-3">
				        <form:label class="col-sm-2 col-form-label" path="title">Title:</form:label>
				        <form:errors class="text-danger" path="title"/>
				        <div class="col-sm-10">
					        <form:input class="form-control" path="title"/>
					    </div>
			   		</div>
			        <div class="row=mb-3">
				        <form:label class="col-sm-2 col-form-label" path="artist">Artist:</form:label>
				        <form:errors class="text-danger" path="artist"/>
				        <div class="col-sm-10">
					        <form:input class="form-control" path="artist"/>
					    </div>
			   		</div>
			        <div class="row=mb-3">
				        <form:label class="col-sm-2 col-form-label" path="rating">Rating:</form:label>
				        <form:errors class="text-danger" path="rating"/>
				        <div class="col-sm-10">
					        <form:input class="form-control" path="rating"/>
					    </div>
			   		</div>
			    	<input class="btn btn-success" type="submit" value="Add"/>
			</form:form>
		</div>
	</div>
</div>
</body>
</html>