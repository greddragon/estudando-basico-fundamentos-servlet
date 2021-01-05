<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
 
<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	
	<body>
		
		<c:if test="${ not empty empresa }">
			Empresa ${ empresa } cadastrada com sucesso!</br>
		</c:if>
			
		lista de empresas </br>
		<ul>
			<c:forEach items="${ lista }" var="empresa">
				<li>
					${ empresa.getNome()}
					<a href="/gerenciador/mostraEmpresa?id=${ empresa.getId() }">Editar</a>
					<a href="/gerenciador/removeEmpresa?id=${ empresa.getId() }">Remover</a>
				</li>
				
			</c:forEach>
		</ul>
		
		
	</body>
	
</html>