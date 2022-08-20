<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
</head>
<body >
<br>
<a href=Homepage.jsp style="font-size:35px;font-weight:bold;">FlyAway Air ticket booking</a>
<br><br>

<h1 align="center"> Add a new Flight</h1>

<div align="center">
<form action=Insertflight method=post>
	<label for=name>Name </label> <input type="text" name=name id=name /><br><br>
	<label for=from>From </label> <input type="text" name=from id=from /><br><br>
	<label for=to>To </label> <input type="text" name=to id=to /><br><br>
	<label for=departure>Departure </label> <input type="date" name=departure id=departure /><br><br>
	<label for=time>Time </label> <input type="time" name=time id=time /><br><br>
	<label for=price>Price </label> <input type="text" name=price id=price /><br><br>
	<input type=submit value=Submit /> <input type=reset>
</form>
</div>

<%
	String message=(String)session.getAttribute("message");
	if(message!=null){
%>
<p style="color:silver;"><%=message %></p>
<%
		session.setAttribute("message", null);
	}
%>
</body>
</html>