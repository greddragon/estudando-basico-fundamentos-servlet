<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.alura.gerenciador.servlet.Empresa,
				java.util.List"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!--
<%
List<Empresa> listaEmpresa = (List<Empresa>) request.getAttribute("lista");

%>
-->  
<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	
	<body>
	
		<ul>
			<c:forEach items="${ lista }" var="empresa">
				<li>${ empresa.getNome()}</li>
			</c:forEach>
		</ul>
		
		<!--
		<ul>
			<% 
				for (Empresa lista : listaEmpresa){
				%>
					<li><%=lista.getNome() %></li>
					
				<%
				}
			%>
		</ul>
		-->
	</body>
	
</html>