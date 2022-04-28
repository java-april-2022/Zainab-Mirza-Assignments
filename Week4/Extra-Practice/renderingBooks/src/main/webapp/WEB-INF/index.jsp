<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
				
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">

</head>
<body>
	<h1>${book.title}</h1>
	<p>Description: ${book.description}</p>
	<p> Language: ${book.language}</p>
	<p> Num of Pages: ${book.numOfPages} </p>
</body>
</html>