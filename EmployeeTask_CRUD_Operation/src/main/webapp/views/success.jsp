<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<h2>Success Page</h2>
	<h3>${msg}</h3>
	<table border="2">
		<tr>
			<th>Employee ID</th>
			<th>Name</th>
			<th>User name</th>
			<th>Password</th>
			<th>Salary</th>
			<th>Action</th>
		</tr>
		<c:forEach  items="${data}" var="s">
			<tr>

				<th>${s.id}</th>
				<th>${s.name}</th>
				<th>${s.username}</th>
				<th>${s.password}</th>
				<th>${s.salary}</th>
				
				<th><a href="delete?id=${s.id}">Delete</a> || <a
					href="edit?id=${s.id}">Edit</a></th>

			</tr>
		</c:forEach>

	</table>

	Not login? login here
	<a href="login"> Login</a>

</body>
</html>