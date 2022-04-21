<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruity Loops</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="/css/style.css">  
</head>
<body>
<div class="container">
	<div class="header">
		<h2> Fruit Store </h2>
	</div>
	<main>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="f" items="${allFruits}">
				<tr>
	        		<td><c:out value="${f.name}"></c:out></td>
	        		<td><c:out value="${f.price}"></c:out></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</main>
</div>
</body>
</html>