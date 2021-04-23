<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Benvenuto</h1>
	<form action="/login" method="POST">
		<div>
			<label>Inserisci il tuo nome utente</label> <input type="text"
				name="sessionName" />
		</div>
		<input type="submit" value="Entra"/><br> <br>
	</form>


</body>
</html>