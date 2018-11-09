<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css">
<link rel="stylesheet" href="main.css">
</head>
<body>

	<h1>Registration Form</h1>

	<div class="formStyle">
		<form action="userSum" onsubmit="return validateInfo();">
			<p>First Name:  <input id="firstname" type="text" name="firstname"></p> <br>
			<p>Last Name:  <input id="lastname" type="text" name="lastname"></p> <br>
			<p>Email:  <input id="email" type="text" name="email"></p><br>
			<p>Phone Number:  <input id="phonenumber" type="text" name="phonenumber"></p><br>
			<p>Password:  <input id="password" type="text" name="password"></p><br>
			<div class="button">
			<input type="submit" value="Register">
			</div>
		</form>
	</div>
	
	
	<h3>
		<a href="/">Home</a>
		<a href="summary">Summary</a>
	</h3>
	<script src="script.js"></script>
</body>
</html>