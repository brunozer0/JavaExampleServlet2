<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listar Animais</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
    <h1>Lista de gatos</h1>

    <ul>
        <c:forEach var="gato" items="${gatos}">
            <li>
                ${gato.nome}
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>