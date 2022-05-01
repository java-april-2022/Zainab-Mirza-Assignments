<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${expense.expenseName}</title>
<link href="https://fonts.googleapis.com/css2?family=Fira+Sans&family=Fredoka:wght@500&family=Josefin+Sans&family=Old+Standard+TT:ital,wght@0,400;0,700;1,400&display=swap" rel="stylesheet">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="container">
	<header class="d-flex justify-content-between align-items-center">
	<h2>${expense.expenseName}</h2>
	<a class="btn btn-primary" href="/expenses">Home</a>
	</header>
	<main>
		<div class="card">
			<div class="card-body">
				<h6>Expense Name: ${expense.expenseName}</h6> 
				<h6>Expense Vendor: ${expense.vendor}</h6>
				<h6>Expense Amount: $${expense.amount}</h6> 
			</div>
		</div>
	</main>
</div>
</body>
</html>