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
<title>Book</title>
<link href="https://fonts.googleapis.com/css2?family=Fira+Sans&family=Fredoka:wght@500&family=Josefin+Sans&family=Old+Standard+TT:ital,wght@0,400;0,700;1,400&display=swap" rel="stylesheet">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
	<div class="row py-lg-5">
      <div class="col-lg-6 col-md-8 mx-auto text-center" id="view">
        <h1 class="fw-light">${book.title}</h1>
        <c:if test="${book.user.id==loginUser.id}"> 
         	<h3 class="fw-light">You read ${book.title} by ${book.author}.</h3>
        	<h5>Here are your thoughts:</h5>
        </c:if>
        <c:if test="${book.user.id!=loginUser.id}"> 
	        <h3 class="fw-light">${book.user.userName} read ${book.title} by ${book.author}.</h3>
	        <h5>Here are ${book.user.userName}'s thoughts:</h5>
	    </c:if>
        <p class="lead text-muted"><em>${book.opinion}</em></p>
        <c:if test="${book.user.id==loginUser.id}"> 
	       <div class="d-flex justify-content-between align-items-center">
	          <a href="/books/edit/${book.id}" class="btn btn-success">Edit</a>
	          <form:form action="/delete/${book.id}" method="delete">
				<button class="btn btn-success">Delete</button>
			  </form:form>
		   </div>
        </c:if>
        <p> 
        	<a class="btn btn-primary" href="/dashboard">Back to Dashboard</a>
      </div>
    </div>
</div>
</body>
</html>