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
	<h1>Benvenuto</h1>
	<form action="/viewCountry" method="POST">
		<input type="text" name="countrytName" placeholder="NomeNazione" /> <input
			type="text" name="continentName" placeholder="NomeContinente" /> <input
			type="submit" value="cliccami" />
	</form>
	<c:forEach items="${contryPrinted}" var="valoreDesiderato">
		<p>codice:${valoreDesiderato.codiceNazione}-----
		nomeNazione:${valoreDesiderato.nomeNazione}-----
		NomeContinente:${valoreDesiderato.nomeContinente}-----
		Popolazione:${valoreDesiderato.popolazione}-----
		Superfice:${valoreDesiderato.superfice}</p>
	</c:forEach>

</body>
</html>