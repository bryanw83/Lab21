<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css">
<link rel="stylesheet" href="Main.css">
</head>
<body>

	<h1>Registration Form</h1>

	<div class="formStyle">
		<form action="userSum" onsubmit="return validateInfo();">
			<p>First Name:  <input id="firstName" type="text" name="firstName"></p> <br>
			<p>Last Name:  <input id="lastName" type="text" name="lastName"></p> <br>
			<p>Age:  <input id="age" type="text" name="age"></p> <br>
			<p>Address:  <input id="address" type="text" name="address"></p> <br>
			<p>E-mail: <input id="email" type="text" name="email"></p><br>
			<p>Phone Number:  <input id="phoneNum" type="text" name="phoneNum"></p><br>
			<p>Password: <input id="password" type="text" name="password"></p><br>
			
			<input type="submit" value="Register">
			
		</form>
	</div>
	
		
	
	
	<h3>
		<a href="/">Home</a>
		<a href="summary">Summary</a>
	</h3>
	<script src="script.js"></script>
</body>
</html>