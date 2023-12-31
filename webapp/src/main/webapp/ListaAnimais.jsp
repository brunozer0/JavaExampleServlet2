<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exemplo de Lista com jstl</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
<h1>Lista de items</h1>
<ul>
    <c:forEach var="animais" items="${animais}">
        <li>
          <p>${animais.nome} (${animais.especie})</p>
        </li>
    </c:forEach>
</ul>
</div>
</body>
</html>