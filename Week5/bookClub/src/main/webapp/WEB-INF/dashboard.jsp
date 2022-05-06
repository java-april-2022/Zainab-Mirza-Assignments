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
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
	<nav class="navbar">
		<div> 
		<h2>Welcome <c:out value="${loginUser.userName}"/>!</h2>
		<p>Books from everyone's shelves:</p>
		</div> 
		<div>
			<a class="btn btn-primary" href="/logout">Logout</a>
			<a class="btn btn-primary" href="/books/new">Add a book to your shelf</a>
			
		</div>
	</nav>
		
	<main id="main" class="container row row-cols-1 row-cols-sm-3 row-cols-sm-3 g-3">
		<c:forEach var="book" items="${allBooks}">
			<div class="card">
			  <div class="card-body">
			    <h5 class="card-title">${book.title}</h5>
			    <p class="card-text">This book was posted by ${book.user.userName}. <br> Author name: ${book.author}</p>
			    <a href="/books/${book.id}" class="btn btn-primary">Details</a>
			  </div>
			</div>
		</c:forEach>
	</main>
</div>
</body>
</html>