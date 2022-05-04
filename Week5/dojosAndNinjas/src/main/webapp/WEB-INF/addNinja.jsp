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
<title>Ninja</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
<div class="card">
		<div class= "card-body">
		<header>
			<h3>Add a Ninja</h3>
		</header>
		<main>	
			<form:form action="/addNinja" method="post" modelAttribute="ninja">
				<div class="row=mb-3">
			        <form:label class="col-sm-2 col-form-label" path="firstName">First Name:</form:label>
			        <form:errors class="text-danger" path="firstName"/>
			        <div class="col-sm-10">
				        <form:input class="form-control" path="firstName"/>
				    </div>
		   		</div>
		   		<div class="row=mb-3">
			        <form:label class="col-sm-2 col-form-label" path="lastName">Last Name:</form:label>
			        <form:errors class="text-danger" path="lastName"/>
			        <div class="col-sm-10">
				        <form:input class="form-control" path="lastName"/>
				    </div>
		   		</div>
		   		<div class="row=mb-3">
			        <form:label class="col-sm-2 col-form-label" path="age">Age:</form:label>
			        <form:errors class="text-danger" path="age"/>
			        <div class="col-sm-10">
				        <form:input class="form-control" path="age"/>
				    </div>
		   		</div>
		   		<div class="row=mb-3">
			        <form:label class="col-sm-2 col-form-label" path="dojo">Dojo Location:</form:label>
			        <form:errors class="text-danger" path="dojo"/>
			        <div class="col-sm-10 d-flex justify-content-evenly align-items-center">
				        <form:select class="form-control" path="dojo">
					        <c:forEach var="dojo" items="${dojos}">
					            <option value="${dojo.id}">${dojo.name}</option>
					        </c:forEach>
					    </form:select> 
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