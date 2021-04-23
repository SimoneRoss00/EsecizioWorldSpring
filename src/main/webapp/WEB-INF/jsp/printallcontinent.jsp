<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prova</title>
</head>
<body>
	<h1> Benvenuto ${loginSession} Qui visualizzi i continenti</h1>
	<form action="/printContinent" method="POST">
	<input type="submit" value="visualizza i continenti"/>
	</form>
	<c:forEach items="${continentPrinted}" var="printedValue">
		<a href="/viewCountryByContinent?continentName=${printedValue.nomeContinente}">${printedValue.nomeContinente}</a><br>
	</c:forEach>
</body>
</html>