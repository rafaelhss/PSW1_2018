<%-- 
    Document   : resultado
    Created on : 16/04/2018, 22:09:02
    Author     : Rafael.Soares
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Portal IMC</h1>
        <h2>Seu imc eh: ${requestScope.indice}</h2>
        <h3>Peso: ${requestScope.peso}</h3>
        <h3>Altura: ${requestScope.altura}</h3>
        <h1>${requestScope.classificacao}</h1>
    </body>
</html>
