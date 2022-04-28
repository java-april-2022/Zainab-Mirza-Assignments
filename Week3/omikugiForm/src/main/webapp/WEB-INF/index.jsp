<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Form</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="container">
 	<div class="card">
 		<div class="card-body"><h3>Send an Omikuji <3</h3>
    		<form class="form-control"action='/send' method='POST'>
			<label>Pick any # from 5 to 25:</label>
    		<select class="form-control" id="number" name="number">
			  <option value="5">5</option>
			  <option value="6">6</option>
			  <option value="7">7</option>
			  <option value="8">8</option>
			  <option value="9">9</option>
			  <option value="10">10</option>
			  <option value="11">11</option>
			  <option value="12">12</option>
			  <option value="13">13</option>
			  <option value="14">14</option>
			  <option value="15">15</option>
			  <option value="16">16</option>
			  <option value="17">17</option>
			  <option value="18">18</option>
			  <option value="19">19</option>
			  <option value="20">20</option>
			  <option value="21">21</option>
			  <option value="22">22</option>
			  <option value="23">23</option>
			  <option value="24">24</option>
			  <option value="25">25</option>
			</select>
			<label>City:</label>
    		<input class="form-control" type='text' name='city'>
			<label>Name of a celebrity:</label>
    		<input class="form-control" type='text' name='idol'>
    		<label>A talent/hobby you wish you had:</label>
    		<input class="form-control" type='text' name='hobby'>	
    		<label>Any type of living thing:</label>
    		<input class="form-control" type='text' name='species'> 
    		<label>Say something nice to someone:</label>
    		<textarea class="form-control" name="compliment"></textarea>  	
    		<p>Send and show a friend :)</p>
    		<input class="btn btn-primary" type='submit' value='Send'>
    		</form>
    	</div>
    </div>
</div>
</body>
</html>