<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login or Register</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
	<main class="d-flex justify-content-evenly">
        <form:form action="/register" method="POST" modelAttribute="user" class="register">
            <h2>Login</h2>
            <div class="row=mb-3">
				<form:label class="col-sm-2 col-form-label" path="userName">Username:</form:label>
				
			   		<form:errors class="text-danger" path="userName"/>
			   	
			    <div class="col-sm-10">
					<form:input class="form-control" path="userName"/>
				</div>
		   	</div>
		   <div class="row=mb-3">
				<form:label class="col-sm-2 col-form-label" path="email">Email:</form:label>
			  
			   		<form:errors class="text-danger" path="email"/>
			  
			    <div class="col-sm-10">
					<form:input class="form-control" path="email"/>
				</div>
		   	</div>
		   	<div class="row=mb-3">
				<form:label class="col-sm-2 col-form-label" path="password">Password:</form:label>
			   
			   		<form:errors class="text-danger" path="password"/>
			    <div class="col-sm-10">
					<form:password class="form-control" path="password"/>
				</div>
		   	</div>
		   	<div class="row=mb-3">
				<form:label class="col-sm-2 col-form-label" path="confirm">Confirm Password:</form:label>
			   	
			   		<form:errors class="text-danger" path="confirm"/>
			   	
			    <div class="col-sm-10">
					<form:password class="form-control" path="confirm"/>
				</div>
		   	</div>
		   	<button class="btn btn-primary">Login & Register</button>
        </form:form>
           <form:form action="/login" method="POST" modelAttribute="loginUser" class="login">
            <h2>Login</h2>
		   	<div class="row=mb-3">
				<form:label class="col-sm-2 col-form-label" path="email">Email:</form:label>
			  
			   		<form:errors class="text-danger" path="email"/>
			   
			    <div class="col-sm-10">
					<form:input class="form-control" path="email"/>
				</div>
		   	</div>
		   	<div class="row=mb-3">
				<form:label class="col-sm-2 col-form-label" path="password">Password:</form:label>
			
			   		<form:errors class="text-danger" path="password"/>
			  
			    <div class="col-sm-10">
					<form:password class="form-control" path="password"/>
				</div>
		   	</div>
		   	<button class="btn btn-primary">Login</button>
        </form:form>
    </main>
</div>
</body>
</html>