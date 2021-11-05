<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Spittr</title>
</head>
<body>

<h1>Register</h1>
<form method="post">
		First Name: <input type="text" name="firstName" /><br/>
		Last Name: <input type="text" name="lastName" /><br/>
		Username: <input type="text" name="userName" /><br/>
		Password: <input type="password" name="password" /><br/>
		<input type="submit" value="Register" />
</form>
	
</body>
</html>