<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body style="text-align: center;">
	<h2>Registration Page</h2>
	
	<form action="save" >
		<pre>
	Employee ID: <input type="number" name="id"> <br>
	Name: <input type="text" name="name"> <br>
	User name: <input type="text" name="username"> <br>
	Password: <input type="text" name="password"> <br>
	Salary: <input type="number" name="salary"> <br>
		<input type="submit" value="Register">

	Not login? login here<a href="login">  Login</a>

</pre>
	</form>


</body>
</html>