<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada?acao=AlterarEmpresa" var="linkServletEditarEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <form action="${linkServletEditarEmpresa}" method="post">

        Nome: <input type="text" name="nome" value="${ empresa.getNome()}"/>
        <input type="hidden" name="id" value="${ empresa.getId()}"/>

        <input type="submit" />
    </form>

</body>
</html>