<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>View All</title>
<link rel="stylesheet" href="resources/main.css">
</head>
<style>
th, td {
  padding: 5px;
  text-align: center;
}
</style>
<body>
<div class="padre" >
<div class="centro">
	<h1>Hay <c:out value="${total}"/> libros en existencia de  <c:out value="${numAuto}"/> autores diferentes</h1>
	<button style="
  	font-size: 150%;" onclick="location.href='${pageContext.request.contextPath}'" value="Home">HOME</button>
		<table >
			<thead>
				<tr style="background-color: #cecece">
					<th>T&iacute;tulo</th>
					<th>Genero</th>
					<th>Autor</th>
					<th>ISBN</th>
					<th>Existencia</th>
				<tr>
			</thead>
			<tbody>
				<c:forEach var="b" items="${books}">
					<tr>
						<td>${b.titulo}</td>
						<td>${b.genero}</td>
						<td>${b.autor}</td>
						<td>${b.isbn}</td>
						<td>${b.existencia}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
</div>
</body>
</html>