<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo JSP</title>
</head>
<body>
	<h1>Hello World</h1>
	<h1>Here's My Info:</h1>
	<h2><c:out value="${first}"/></h2>
	<h2><c:out value="${last}"/></h2>
	<h2><c:out value="${email}"/></h2>
</body>
</html>