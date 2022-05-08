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
<title>Dashboard</title>
<link href="https://fonts.googleapis.com/css2?family=Fira+Sans&family=Fredoka:wght@500&family=Josefin+Sans&family=Old+Standard+TT:ital,wght@0,400;0,700;1,400&display=swap" rel="stylesheet">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
	<nav class="navbar">
		<div> 
			<h2>Welcome <c:out value="${loginUser.userName}"/>!</h2>
		</div> 
		<div>
			<a class="btn btn-primary" href="/logout">Logout</a>
			<a class="btn btn-primary" href="/books/new">Add a book to your shelf</a>
		</div>
	</nav>
		
	<main>
		<h5 class="text-center">Books from everyone shelves</h5>
		<c:forEach var="book" items="${allBooks}">
			<div class="card">
			  <div class="card-body">
			    <h5 class="card-title">${book.title}</h5>
			    <c:if test="${book.user.id!=loginUser.id}"> 
			    	<p class="card-text">This book was read by ${book.user.userName}. <br> Author name: <em>${book.author}</em></p>
			    </c:if>
			    <c:if test="${book.user.id==loginUser.id}"> 
			     	<p class="card-text">This book was read by you :) <br> Author: <em>${book.author}</em></p>
			    </c:if>
			    <a href="/books/${book.id}" class="btn btn-success">Details</a>
			  </div>
			</div>
		</c:forEach>
	</main>
</div>
</body>
</html>