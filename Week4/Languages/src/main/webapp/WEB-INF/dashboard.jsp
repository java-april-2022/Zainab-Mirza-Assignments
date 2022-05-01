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
<title>Languages Dashboard</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container d-flex justify-content-evenly align-items-center">
	<div class="card">
		<div class="card-body">
			<table class="table table-secondary">
				<h2 class="text-center">All Languages</h2>
				<thead>
					<tr>
						<th>Name</th>
						<th>Creator</th>
						<th>Version</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="lang" items="${languages}">
					<tr>
						<td><a href="/languages/${lang.id}">${lang.name}</a></td>
						<td>${lang.creator}</td>
						<td>${lang.version}</td>
						<td><a href="languages/edit/${lang.id}" class="btn btn-secondary">Edit</a>
						<form:form action="languages/delete/${lang.id}" method="delete">
							<button class="btn btn-danger">Delete</button>
						</form:form>
						</td>
			
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<div class="card">
		<div class="card-body">
			<h3 class="text-center">Add A Language</h3>
			<form:form action="/languages" method="post" modelAttribute="lang">
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
			    	<input class="btn btn-success" type="submit" value="Add"/>
			</form:form>
		</div>
	</div>
</div>
</body>
</html>