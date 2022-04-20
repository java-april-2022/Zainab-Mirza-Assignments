<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="js/scipt.js"></script>
<title>Date/Time</title>
</head>
<body>
<div class="container">
	<div class="card">
		<div class="card-body text-center d-flex justify-content-evenly">
		<h3><c:out value="${dateString}"></c:out></h3>
		</div>
	</div>
</div>
</body>
</html>