<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
<style>
body {
	background-color: #f2f2f2;
	font-family: Arial, sans-serif;
	text-align: center;
}

h1 {
	color: #333;
}

table {
	border-collapse: collapse;
	width: 350px;
	height: 100px;
	border: 2px solid #001;
	margin: 20px auto;
	
}

th, td {
	border: 1px solid #ddd;
	padding: 8px;
	text-align: left;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

tr:nth-child(odd) {
	background-color: #ffffff;
}

.signup {
	margin-top: 20px;
}

.signup a {
	color: #007bff;
	text-decoration: none;
}

.signup a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<h1>${msg}</h1>

	<table >
		<tr>
			<th>Student ID</th>
			<th>Name</th>
			<th>User name</th>
			<th>Password</th>
			<th colspan="3">Action</th>
		</tr>

		<c:forEach items="${data}" var="s">
			<tr>
				<th><input type="radio" name="id" value="${s.id}"> ${s.id}</th>
				<th>${s.name}</th>
				<th>${s.username}</th>
				<th>${s.password}</th>
				<th><a href="editdata?id=${s.id}">Edit</a></th>
				<th><a href="deletedata?id=${s.id}">Delete</a></th>
			</tr>
		</c:forEach>

	</table>

	<div class="signup">
		<p>
			Want to go to the login page? <a href="login">Login</a>
		</p>
	</div>
</body>
</html>
