<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/main.css">
<title>Search</title>
</head>
<body>
<div class="divMayor">
<div class="padre">
	<p style="font-family: courier;
  	font-size: 200%;">Bienvenido a la Biblioteca</p><br>
	<form action="${pageContext.request.contextPath}/vertodos" method="post">
  	<div class="padre2">
  	<p style="font-family: courier;
  	font-size: 150%; display:inline-block;">Buscar por:</p>
  	<select id="select" name="select" style="font-family: courier;
  	font-size: 100%;">
  	<option value="autor">Autor</option>
  	<option value="isbn">ISBN</option>
  	<option value="genero">G&eacute;nero</option>
	</select><br>
	</div>
	<div class="centro">
  	<input type="text" name="param" style="font-family: courier;
  	font-size: 100%;">
  	<input type="submit" value="Buscar" name="buscar" style="font-family: courier;
  	font-size: 100%;">
  	<input type="submit" value="Ver todos" style="font-family: courier;
  	font-size: 100%;">
  	</div>
  	</form>
  	</div>
  	</div>
</body>
</html>