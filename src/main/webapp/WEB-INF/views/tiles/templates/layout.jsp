<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!-- 
	Descripción:	Plantilla base para cierto número de páginas HTML.
	Autor:		Leonardo Daniel Ramirez Reyes.
	Fecha:		2 de Junio 2019	
 -->
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title><tiles:getAsString name="title" /></title>
<!-- Es un título dinámico -->
<meta name="viewport"
	content="with=device-width, initial-scale=1,shrink-to-fit=no">
<link href="<c:url value='/resources/css/bootstrap.min.css' />"
	rel="stylesheet">
<link href="<c:url value='/resources/css/estilo.css' />"
	rel="stylesheet">
</head>
<body background="<c:url value='/resources/imagen/pruebadefondo1.jpg' />">

	<div class="container">
		<!-- Inicio de Sección de header -->
		<div class="row">
			<div class="col-md-12">
				<tiles:insertAttribute name="header" />
			</div>
		</div>
		<!-- Fin de Sección de header -->

		<!-- Inicio de Sección de Menú -->
		<div class="row">
			<div class="col-md-12">
				<tiles:insertAttribute name="search" />
			</div>
		</div>
		<!-- Fin de Sección de Menú -->

		<!-- Inicio de Sección de body -->
		<div class="row">
			<div class="col-md-12">
				<div class="container">					
				</div>
				<tiles:insertAttribute name="body" />
			</div>
		</div>
		<!-- Fin de Sección de Body -->

		<!-- Inicio de Sección de Footer -->
		<div class="row">
			<div class="col-md-12">
				<tiles:insertAttribute name="footer" />
			</div>
		</div>
		<!-- Fin de Sección de Body -->
	</div>

	<!-- Script javaScript -->
	
	<script src="<c:url value='/resources/js/jquery-3.4.1.min.js' />"></script>
	<script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
	<script src="<c:url value='/resources/js/logincli.js' />"></script>
	<script src="<c:url value='/resources/js/regiscli.js' />"></script>
	
	
</body>
</html>