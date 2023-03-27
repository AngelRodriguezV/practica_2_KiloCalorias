<%-- 
    Document   : Resultado
    Created on : 23 mar 2023, 13:02:24
    Author     : veneg
--%>
<%@page import="com.angelrv.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
        <div class="row justify-content-center">
        <div class="card col-lg-6 col-md-8 col-8 m-5">
        <div class="card-body">
            <h1 class="card-title">Resultado del Método ${metodo}</h1>
            <p class="card-text">Necesitas Calórias Diarias: ${caloriasRequeridas}</p>
            <a class="btn btn-primary" href="Control">Terminar</a>
        </div>
        </div>
        </div>
        </div>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
