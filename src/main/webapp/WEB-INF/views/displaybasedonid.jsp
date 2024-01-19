<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:pink;">
<center>
<h1 style="color:black;">Display Passenger list based On Id</h1>
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
<c:if test="${first!=null}">
<tr><th>${first.p_id}</th>
<th>${first.p_fname}</th>
<th>${first.p_lname}</th>
<th>${first.p_phone_number}</th>
<th>${first.p_email_id}</th>
<th>${first.p_password}</th>
<th>${first.p_c_password}</th></tr>
</c:if>
</table>
<c:if test="${first==null}">
<p>Sorry!!! Id not found</p>
</c:if>
<a href="Registration">Click here to go back to home page</a>
</center>
</body>
</html>