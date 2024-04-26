<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Page</title>
    <style type="text/css">
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }

        .container {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin-top: 100px;
        }

        input[type="text"],
        input[type="password"],
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Edit Data</h2>
        
        <form action="/update">
        
            <input type="hidden" name="id" value="${stu.id}">
           
            <label for="name">Name:</label><input type="text" id="name" name="name" value="${stu.name}"><br>

            <label for="username">Username:</label><input type="text" id="username" name="username" value="${stu.username}"><br>

            <label for="password">Password:</label> <input type="password" id="password" name="password" value="${stu.password}"><br>

            <input type="submit" value="Update">
            
            <div class="signup" style="text-align: center;">
                <p>Not login? <a href="login">Login</a></p>
            </div>
        </form>
    </div>
</body>
</html>
