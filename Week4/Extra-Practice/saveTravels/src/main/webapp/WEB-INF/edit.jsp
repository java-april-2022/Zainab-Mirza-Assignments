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
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<div class ="container">
		<header>
			<h3 class="text-success">Edit Expense</h3>
			<a href="/expenses" class="btn btn-primary">Home</a>
		</header>
		<main>		
		<form:form action="/update/${expense.id}" method="put" modelAttribute="expense">
		<input type="hidden" name="_method" value="put">
		<p>
        <form:label path="expenseName">Name of Expense:</form:label>
        <form:errors class="text-danger" path="expenseName"/>
        <form:input path="expenseName"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors class="text-danger" path="vendor"/>
        <form:textarea path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount</form:label>
        <form:errors class="text-danger" path="amount"/>
        <form:input path="amount"/>
    </p>
    
    <input type="submit" class="btn btn-secondary" value="Update"/>
		</form:form>
		</main>
	</div>
</body>
</html>