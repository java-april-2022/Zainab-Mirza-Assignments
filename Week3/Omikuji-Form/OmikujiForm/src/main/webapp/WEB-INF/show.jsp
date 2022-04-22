<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="container">
	<div class="card">
		<div class="card-body text-center">
			<h2>Omikuji Prediction...</h2>
			<h5> In <c:out value="${number}"></c:out> years you will live in <c:out value="${city}"></c:out> with <c:out value="${person}"></c:out> as your roomate, <c:out value="${hobby}"></c:out> for a living. The next time you see a <c:out value="${species}"></c:out>, you will have good luck. Also, <c:out value="${compliment}"></c:out>.
			</h5>
			<a class="btn btn-primary" href="/omikuji">go back</a>
		</div>
	</div>
</div>
</body>
</html>