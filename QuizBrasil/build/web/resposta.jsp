<%-- 
    Document   : resposta
    Created on : 30/04/2018, 21:51:17
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
        <h1>Brasiiil</h1>
        <h2>Voce
            
            <c:if>
                
            </c:if>
            
            <c:if test="${requestScope.venceu == true}">
                Acertou
                <h3>Parabens!</h3>
            </c:if>    
            <c:if test="${requestScope.venceu != true}">
                Errou
                <h3>A diferenca foi : ${requestScope.differenca}</h3>
            </c:if>    
        </h2>
        
        
    </body>
</html>
