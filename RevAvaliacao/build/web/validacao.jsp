<%-- 
    Document   : validacao
    Created on : 07/05/2018, 21:20:17
    Author     : Rafael.Soares
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            .vermelho{
                color: red;
            }
            .verde{
                color: green;
            } 
            .amarelo{
                color: yellow;
            }
            .azul{
                color: blue;
            } 
        </style>
    </head>
    <body>
        <h1>validador de senhas</h1>
        Sua senha eh: 
        <c:if test="${requestScope.res == 'FORTE'}">
            <span class="verde">
        </c:if>
        <c:if test="${requestScope.res == 'MEDIA'}">
            <span class="azul">
        </c:if>
        <c:if test="${requestScope.res == 'FRACA'}">
            <span class="amarelo">
        </c:if>
        <c:if test="${requestScope.res == 'INVALIDA'}">
            <span class="vermelho">
        </c:if>                
            
            
            ${requestScope.res}
        </span>
              
            
    </body>
</html>
