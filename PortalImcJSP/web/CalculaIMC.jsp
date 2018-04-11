<%-- 
    Document   : CalculaIMC
    Created on : 11/04/2018, 20:33:27
    Author     : Rafael.Soares
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servlet CalculaIMC</title>            
    </head>
    <body>
        <%
            float peso = Float.parseFloat(request.getParameter("peso"));
            float altura = Float.parseFloat(request.getParameter("altura"));
            float imc = (peso / (altura * altura)) * 100;
        %>
        <h1>Seu IMC eh: <% out.print(imc); %> </h1>
        </body>
        </html>
    </body>
</html>
