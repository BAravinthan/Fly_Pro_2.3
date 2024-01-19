<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:yellow;">
<center>
<h1 style="color:black;">Passenger List</h1>
<table border=3px>
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Phone number</th>
<th>Email id</th>
<th>Password</th>
<th>Confirm Password</th>
</tr>
<c:forEach items="${first_redirect}" var="s_redirect">
<tr>
<th>${s_redirect.p_id}</th>
<th>${s_redirect.p_fname}</th>
<th>${s_redirect.p_lname}</th>
<th>${s_redirect.p_phone_number}</th>
<th>${s_redirect.p_email_id}</th>
<th>${s_redirect.p_password}</th>
<th>${s_redirect.p_c_password}</th>
</tr>
</c:forEach>
</table>
<a href="Registration">Click here to go back to home page</a>
</center>
</body>
</html>