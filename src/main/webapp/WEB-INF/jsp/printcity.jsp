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
	<h1>${loginSession} Qui puoi vedere le citta</h1>
	<c:forEach items="${printcities}" var="cityValues">
		<p>${cityValues.cityName}--------${cityValues.cityPopulation}</p><br>
	</c:forEach>
</body>
</html>