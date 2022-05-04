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
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <div class="container-fluid">
	    <div class="collapse navbar-collapse" id="navbarSupportedContent">
	      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		        <li class="nav-item">
		          <a class="nav-link active" aria-current="page" href="#">Songs By ${artist}</a>
		        </li>
				<li class="nav-item">
		          <a class="nav-link active" aria-current="page" href="/dashboard">Dashboard</a>
		        </li>
		   </ul>
	      <form action="/dashboard" method="post" class="d-flex align-items-center">
	        <input class="form-control me-2" id="artist" name="artist" type="search" placeholder="New Search" aria-label="Search">
	        <button class="btn btn-primary" type="submit">Search</button>
	      </form>
	    </div>
	  </div>
	</nav>
	<div class="card">
			<div class="card-body">
			<table class="table table-secondary">
				<thead>
					<tr>
						<th>Name</th>
						<th>Rating</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="song" items="${songs}">
					<tr>
						<td><a href="/songs/${song.id}">${song.title}</a></td>
						<td>${song.rating}</td>
						<td>
						<form:form action="/delete/${song.id}" method="delete">
							<button class="btn btn-danger">Delete</button>
						</form:form>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
</body>
</html>