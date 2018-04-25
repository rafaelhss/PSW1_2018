<%-- 
    Document   : resultado
    Created on : 25/04/2018, 20:15:36
    Author     : Rafael.Soares
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de vegetais</h1>
        ${requestScope.listavegetais}
        <br>
        <ul>
            <c:forEach items="${requestScope.listavegetais}" var="elemento">
                <li>vegetal: <b>${elemento}</b></li>    
            </c:forEach>
            
        </ul>
    </body>
</html>
