<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Form</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Fira+Sans&family=Fredoka:wght@500&family=Josefin+Sans&family=Old+Standard+TT:ital,wght@0,400;0,700;1,400&display=swap" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="container">
	<div class="card">
		<div class="card-body">
			<form action="/send" method="post">
			<h2 class="text-center">Send an Omikuji <3</h2>   
            <div class="row mb-3">
                <label for="number" class="col-sm-2 col-form-label">Pick any number from 5 to 25: </label>
                <div class="col-sm-10">
                    <input class="form-control" type="text" name='number'>
                </div>
            </div>
            <div class="row mb-3">
                <label for="city" class="col-sm-2 col-form-label">Enter the first city that comes to your mind:</label>
                <div class="col-sm-10">
                    <input type="text" name="city" class="form-control">
                </div>
            </div>
            <div class="row mb-3">
                <label for="person" class="col-sm-2 col-form-label">Name of any famous person:</label>
                <div class="col-sm-10">
                    <input type="text" name="person" class="form-control">
                </div>
            </div>
            <div class="row mb-3">
                <label for="hobby" class="col-sm-2 col-form-label">A hobby/talent:</label>
                <div class="col-sm-10">
                    <input type="text" name="hobby" class="form-control">
                </div>
            </div>
            <div class="row mb-3">
                <label for="species" class="col-sm-2 col-form-label">Any living thing(animal):</label>
                <div class="col-sm-10">
                    <input type="text" name="species" class="form-control">
                </div>
            </div>
            <div class="row mb-3">
                <label for="compliment" class="col-sm-2 col-form-label">The best compliment/advice you've ever recieved:</label>
                <div class="col-sm-10">
                    <textarea class="form-control" name="compliment"></textarea>
                </div>
            </div>
            <p>Send and show a friend :)</p>
            <button class="btn btn-primary">send</button>
        </form>
		</div>
	</div>
</div>
</body>
</html>