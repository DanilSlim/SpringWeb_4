<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Spittles</title>
</head>
<body>
 
<h1>Spittles</h1>

<c:forEach items="${spittleList}" var="spittle">
	<li id="spittle_<c:out value="spittle.id"/>">
		<div class="spittleMessage">
			<c:out value="${spittle.message}" />
		</div>
		<div>
			<span class="spittleTime"><c:out value="${spittle.time}" /></span>
			<span class="spittleLocation">
			(<c:out value="${spittle.latitude}" />,
			 <c:out value="${spittle.longitude}" />)</span>
	    </div>
	</li>
</c:forEach>
</body>
</html>