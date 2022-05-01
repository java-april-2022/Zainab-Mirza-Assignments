<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>  
			
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Travels</title>
<link href="https://fonts.googleapis.com/css2?family=Fira+Sans&family=Fredoka:wght@500&family=Josefin+Sans&family=Old+Standard+TT:ital,wght@0,400;0,700;1,400&display=swap" rel="stylesheet">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class ="container">
		<header class="d-flex justify-content-between align-items-center">
			<h3 class="text-success">Edit Expense</h3>
			<a href="/expenses" class="btn btn-primary">Home</a>
		</header>
		<main>		
			<form:form action="/update/${expense.id}" method="put" modelAttribute="expense">
				<div class="row=mb-3">
			        <form:label class="col-sm-2 col-form-label" path="expenseName">Name of Expense:</form:label>
			        <form:errors class="text-danger" path="expenseName"/>
			        <div class="col-sm-10">
				        <form:input class="form-control" path="expenseName"/>
				    </div>
		   		</div>
		        <div class="row=mb-3">
			        <form:label class="col-sm-2 col-form-label" path="vendor">Vendor:</form:label>
			        <form:errors class="text-danger" path="vendor"/>
			        <div class="col-sm-10">
				        <form:input class="form-control" path="vendor"/>
				    </div>
		   		</div>
		        <div class="row=mb-3">
			        <form:label class="col-sm-2 col-form-label" path="amount">Amount:</form:label>
			        <form:errors class="text-danger" path="amount"/>
			        <div class="col-sm-10">
				        <form:input class="form-control" path="amount"/>
				    </div>
		   		</div>
		    	<input class="btn btn-success" type="submit" value="Update"/>
			</form:form>
		</main>
	</div>
</body>
</html>