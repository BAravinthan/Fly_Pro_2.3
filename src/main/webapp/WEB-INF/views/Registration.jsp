<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function validate()
{
var p_fname           =document.regName.p_fname.value;
var p_lname           =document.regName.p_lname.value;
var p_phone_number    =document.regName.p_phone_number.value;
var p_email_id        =document.regName.p_email_id.value;
var p_password        =document.regName.p_password.value;
var p_c_password      =document.regName.p_c_password.value;

if(p_fname==null || p_fname=="")
	{
alert("first name can't be blank");
return false;
	}
if(p_lname==null || p_lname=="")
{
alert("last name can't be blank");
return false;
}
else if(p_phone_number==null || p_phone_number=="")
	{
alert("phone number can't be blank");
return false;
	}
else if(p_email_id==null || p_email_id=="")
{
alert("email id can't be blank");
return false;
}
else if(p_password.length<6)
	{
alert("password must be atleast 6 character");
return false;
	}
else if(p_password!=p_c_password)
{
alert("password and confirm password must be same");
return false;
}
	}
</script>
</head>
<body style= "background-color:grey;">
<center>
<pre>
<h1 style="color:black;"> Registration Form</h1>
<form name="regName" action="Regconnection" method="post" onsubmit="return validate()"
 style= "padding:5px; width:300px; box-shadow: 0px 0px 60px black;border-radius:60px;background-color:white;">
<div>
<input type="text" placeholder="enter ur first name" name="p_fname">
</div>
<div>
<input type="text" placeholder="enter ur last name" name="p_lname">
</div>
<div>
<input type="number" placeholder="enter ur phone number" name="p_phone_number">
</div>
<div>
<input type="email" placeholder="enter ur email id" name="p_email_id">
</div>
<div>
<input type="password" placeholder="enter ur password" name="p_password">
</div>
<div>
<input type="password" placeholder="enter ur confirm password" name="p_c_password">
</div>
<div>
<input type="submit" value="Register">
</div>
</form>
<div><a href="pl_redirect">All Passenger List</a></div>
<div>
<a href="getId.jsp">click here to display Passenger details based on id</a>
</div>
<div>
<a href="deleteuserdetails.jsp">click here to delete Passenger information based ion id </a>
</div>
<div>
<a href="updateuserdetails.jsp">click here to update the Passenger information</a>
</div>
</pre>
</center>
</body>
</html>