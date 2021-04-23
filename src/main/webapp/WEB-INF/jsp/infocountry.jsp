<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InfoCountry</title>
</head>
<body>
	<h1>Benvenuto ${loginSession} qui puoi vedere le nazioni di un continente</h1>
	<c:forEach items="${countryInfo}" var="printedValue">
		<a href="/viewCityByCountry?countryCode=${printedValue.codiceNazione}">${printedValue.nomeNazione}</a>--------${printedValue.popolazione}<br>
	</c:forEach>
</body>
</html>