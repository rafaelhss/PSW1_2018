<%-- 
    Document   : resultado
    Created on : 23/04/2018, 21:51:35
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
                color: red;
            }
            .verde{
                color: green;
            }
        </style>
            
    </head>
    <body>
        <h1>Verifica Aprovação</h1>
    
        <h2>
            Caro(a), ${requestScope.nome}
            <c:if test="${codDia == 'd'}"> 
                bom dia 
            </c:if>
            <c:if test="${codDia == 't'}"> 
                boa tarde
            </c:if>
            <c:if test="${codDia == 'n'}"> 
                boa noite   
            </c:if>                
            !
        </h2>
        <h2>
            Voce foi 
            <c:if test="${resultDisc1 == 'a'}"> 
                <span class="verde"> aprovado </span>  
            </c:if>
            <c:if test="${resultDisc1 != 'a'}"> 
                <span class="vermelho"> reprovado </span>  
            </c:if>
            na disciplina 1,     
            <c:if test="${resultDisc2 == 'a'}"> 
                <span class="verde"> aprovado </span>  
            </c:if>
            <c:if test="${resultDisc2 != 'a'}"> 
                <span class="vermelho"> reprovado </span>  
            </c:if>            
            na disciplina 2 e
            <c:if test="${resultDisc3 == 'a'}"> 
                <span class="verde"> aprovado </span>  
            </c:if>
            <c:if test="${resultDisc3 != 'a'}"> 
                <span class="vermelho"> reprovado </span>  
            </c:if>
            na disciplina 3.
            <br/>
            seu resultado final é: 
            <c:if test="${resultFinal == 'a'}"> 
                <span class="verde"> aprovado </span>  
                <br>
                <img src="https://i.ytimg.com/vi/kBRWfhoki-g/maxresdefault.jpg" height="300px">
            </c:if>
            <c:if test="${resultFinal != 'a'}"> 
                <span class="vermelho"> reprovado </span>  
                <br>
                <img src="https://static.significados.com.br/foto/okay_sm.jpg" height="300px">
            </c:if>
        
        </h2>
        
    </body>
</html>
