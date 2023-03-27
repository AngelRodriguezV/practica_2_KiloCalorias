<%-- 
    Document   : Index
    Created on : 23 mar 2023, 13:01:28
    Author     : veneg
--%>
<%@page import="java.time.LocalDate"%>
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
            <h2 class="card-title">Crear Usuario</h2>
            <form action="Control" method="post">
                <div class="mb-3 input-group">
                    <label class="input-group-text">Nombre</label>
                    <input class="form-control" type="text" name="nombre" required>
                </div>
                <div class="mb-3 input-group">
                    <label class="input-group-text">Usuario</label>
                    <input class="form-control" type="text" name="usuario" required>
                </div>
                <div class="mb-3 input-group">
                    <label class="input-group-text">Password</label>
                    <input class="form-control" type="text" name="password" required>
                </div>
                <div class="mb-3 input-group">
                    <label class="input-group-text">Sexo</label>
                    <select class="form-select" name="sexo">
                        <option value="H">Hombre</option>
                        <option value="M">Mujer</option>
                    </select>
                </div>
                <div class="mb-3 input-group">
                    <label class="input-group-text">Fecha Nacimiento</label>
                    <input class="form-control" type="date" min="1940-01-01" max="<%=LocalDate.now()%>" name="nacimiento" required>
                </div>                  
                <input class="btn btn-primary" type="submit" value="Ingresar">
            </form>
        </div>
        </div>
        </div>
        </div>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
