<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body style="text-align: center;">
	<h2>Edit Page</h2>
	
	<form action="update" >
		<pre>
	Employee ID: <input type="hidden" name="eid"> <br>
	Name: <input type="text" name="name"> <br>
	User name: <input type="text" name="username"> <br>
	Password: <input type="text" name="password"> <br>
	Salary: <input type="number" name="salary"> <br>
		<input type="submit" value="Edit">

	Not login? login here<a href="login">  Login</a>

</pre>
	</form>
</body>
</html>