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
<title>Book Club</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container col-xl-10 col-xxl-8 px-4 py-5">
	<div class="row align-items-center g-lg-5 py-5">
		<div class="col-lg-7 text-center text-lg-start">
			<h1 class="display-4 fw-bold lh-1 mb-3">Add a Book to your Shelf!</h1>
			<p class="col-lg-10 fs-4"><a href="/dashboard" class="btn btn-primary">Back to shelves</a></p>
		</div>
		<div class="col-md-10 mx-auto col-lg-5">
        <form:form class="p-4 p-md-5 border rounded-3 bg-dark" action="/createBook" method="post" modelAttribute="book">
        	<form:input value="${loginUser.id}" path="user" type="hidden"/>
          <div class="form-floating mb-3">
            <form:input path="title" class="form-control" id="floatingInput" placeholder="Title"/>
            <form:label for="floatingInput" path="title">Title</form:label>
          </div>
          <div>
          	<form:errors class="text-danger" path="title"/>
          </div>
          <div class="form-floating mb-3">
            <form:input path="author" class="form-control" id="floatingInput" placeholder="Author"/>
            <form:label for="floatingInput" path="author">Author</form:label>
          </div>
          <div>
          	<form:errors class="text-danger" path="author"/>
          </div>
          <div class="form-floating mb-3">
            <form:textarea type="textarea" path="opinion" class="form-control" id="floatingTextarea2" style="height: 100px" placeholder="What are your thoughts?"/>
            <form:label for="floatingTextarea2" path="opinion">My Thoughts</form:label>
          </div>
          <div>
          	<form:errors class="text-danger" path="opinion"/>
          </div>
          <button class="w-100 btn btn-lg btn-primary" type="submit">Add Book</button>
        </form:form>
      </div>
	</div>
</div>
</body>
</html>