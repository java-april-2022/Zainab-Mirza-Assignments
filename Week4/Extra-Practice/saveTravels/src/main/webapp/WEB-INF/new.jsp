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
		<h2>Expenses</h2>
	</header>
	<table class="table">
		<thead>
		
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
			</tr>
	
		</thead>
		<tbody>
		<c:forEach var= "expense" items="${expenses}">
			<tr>
				<td>${expense.expenseName }</td>
				<td>${expense.vendor }</td>
				<td>$${expense.amount }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div>
		<header>
			<h3>Add an Expense</h3>
		</header>
		<main>		
		<form:form action="/expenses" method="post" modelAttribute="expense">
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
    
    <input type="submit" value="Add"/>
		</form:form>
		</main>
	</div>
</div>
</body>
</html>