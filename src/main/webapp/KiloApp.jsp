<%-- 
    Document   : KiloApp
    Created on : 25 mar 2023, 12:55:07
    Author     : veneg
--%>
<%@page import="com.angelrv.modelo.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>KiloCalorias</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <%
            Usuario user = (Usuario)request.getAttribute("usuario");
            ArrayList<String[]> data = (ArrayList<String[]>)request.getAttribute("data");
        %>
        <div class="container">
        <div class="row justify-content-center">
            <div class="card col-lg-10 col-md-8 col-8 m-5">
            <div class="card-body">
                <h1 class="card-title">Usuario: <%=user.getNombre()%></h1>
                <h2 class="p-2 card-subtitle">Calcular Kilo Calorias</h2>
                <p>Selecciona el método a utilizar</p>
                <a class="btn btn-primary" href="formCS.jsp">Chris Shugart</a>
                <a class="btn btn-primary" href="formBH.jsp">Brian Haycock</a>
                <a class="btn btn-primary" href="formHB.jsp">Harris Benedict</a>
            </div>
            </div>
            <div class="card col-lg-10 col-md-8 col-8">
            <div class="card-body">
                <h1 class="card-title">Resultados</h1>
                <table class="table">
                    <thead>
                        <tr>
                            <th scope="col">Fecha</th>
                            <th scope="col">Peso</th>
                            <th scope="col">Estatura</th>
                            <th scope="col">Actividad</th>
                            <th scope="col">Metodo</th>
                            <th scope="col">KiloCalorias</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                        if (data != null) {
                            for (String[] v : data) {
                        %>
                            <tr>
                                <th><%=v[0]%></th>
                                <th><%=v[1]%></th>
                                <th><%=v[2]%></th>
                                <th><%=v[3]%></th>
                                <th><%=v[4]%></th>
                                <th><%=v[5]%></th>
                            </tr>
                        <%    
                            }
                        }
                        %>
                    </tbody>
                </table>
            </div>
            </div>
        </div>
        </div>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
