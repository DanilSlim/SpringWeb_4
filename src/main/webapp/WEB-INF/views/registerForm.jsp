<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<style><%@include file="/WEB-INF/css/style.css"%></style>
<title>SpitterRegister</title>
</head>
<body>
	<h1>Spitter Register</h1>
	<sf:form method="POST" modelAttribute="spitter">
		<sf:label path="firstName" cssErrorClass="error">First Name</sf:label>
		<sf:input path="firstName" />
		<sf:errors path="firstName" cssClass="error"/><br/>
		Last Name: <sf:input path="lastName" />
		<sf:errors path="lastName" cssClass="error"/><br/>
		Email: <sf:input path="email" />
		<sf:errors path="email" cssClass="error"/><br/>
		Username: <sf:input path="userName" />
		<sf:errors path="userName" cssClass="error"/><br/>
		Password: <sf:password path="password" />
		<sf:errors path="password" cssClass="error"/><br/>
		<input type="submit" value="Register" />
</sf:form>
</body>
</html>