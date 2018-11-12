<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Summary</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css">
<link rel="stylesheet" href="Main.css">
</head>
<body>

<h1>Account Summary</h1><br>

<h2 class="regButton">User Info</h2>
<br>
<br>

	<div class="sum">
		<h3>You Entered <br> <!-- ${userData} -->
		<br>
		First Name: <c:forEach items="${peeplist}" var="p">
						${p.firstName} <br>
					</c:forEach>
		Last Name: <c:forEach items="${peeplist}" var="p">
						${p.lastName} <br>
					</c:forEach>
		Age: <c:forEach items="${peeplist}" var="p">
						${p.age} <br>
					</c:forEach>
		Address: <c:forEach items="${peeplist}" var="p">
						${p.address} <br>
					</c:forEach>			
		Email: <c:forEach items="${peeplist}" var="p">
						${p.email} <br>
					</c:forEach>
		Phone Number: <c:forEach items="${peeplist}" var="p">
						${p.phoneNum} <br>
					</c:forEach>
		Password: <c:forEach items="${peeplist}" var="p">
						${p.password} <br>
					</c:forEach>			
		</h3>
	</div>
	<br>
	<br>

<p class="button">Would you like to receive promotions and updates via email?</p><br>
	
	<div class="radio">
			<form action="radioButton" onsubmit="confirmChoice();">
				<input type="radio" name="choice" value="yes" checked> Yes<br>
  				<input type="radio" name="choice" value="no" checked> No<br>
  				<input type="submit" value="Submit">
			</form>
	</div>

<br>
<br>


<h3>
	<a href="/">Home</a>
</h3>
</body>
</html>