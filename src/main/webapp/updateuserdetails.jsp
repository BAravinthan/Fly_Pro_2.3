<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:lightpink;">
<center>
<h1 style="color:black;">Update Passenger Information</h1>
<form action="updateone" method="post">
<div>
<input type="number" placeholder="enter ur id" name="p_id"><br>
</div>
<div>
<input type="email" placeholder="enter ur email id" name="p_email_id"><br>
</div>
<div>
<input type="password" placeholder="enter ur password" name="p_password"><br>
</div>
<div>
<input type="password" placeholder="enter ur confirm password" name="p_c_password"><br>
</div>
<div>
<input type="submit" value="update">
</div>
</form>
</center>
</body>
</html>