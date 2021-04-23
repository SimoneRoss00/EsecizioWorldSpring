<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CityInfo</title>
</head>
<body>
	<h1>Qui visualizzi le info della città</h1>
	<form action="/cityInfo" method="POST">
	<input type="text" name="cityName"/>
	<input type="submit" value="info"/>
	</form>
	<p>info:${printedCity}</p>
</body>
</html>