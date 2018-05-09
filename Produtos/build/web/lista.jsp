<%-- 
    Document   : lista
    Created on : 07/05/2018, 21:59:22
    Author     : Rafael.Soares
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .vermelho{
                color:red;
            }
        </style>
    </head>
    <body>
        <h1>Produtos</h1>
        
        <table border="1px">
            <thead>
                <th>nome</th>
                <th>preco</th>
            </thead>
            <tbody>
                <c:forEach items="${requestScope.produtos}" var="prod">
                    <tr
                        <c:if test="${prod.promo == true}">
                           class="vermelho"
                        </c:if>                              
                        >
                        <td>${prod.nome}</td>
                        <td>R$${prod.preco}</td>
                    </tr>
                </c:forEach>
                
            </tbody>
        </table>
            
        
    </body>
</html>
