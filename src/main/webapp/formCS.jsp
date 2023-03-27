<%-- 
    Document   : formCS
    Created on : 25 mar 2023, 13:09:41
    Author     : veneg
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>KiloApp</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
        <div class="row justify-content-center">
        <div class="card col-lg-6 col-md-8 col-8 m-5">
        <div class="card-body">
            <h2 class="card-title">Método Chris Shugart</h2>
            <br>
            <form action="ControlCalcularKC" method="post">
                <div class="mb-3 input-group">
                    <label class="input-group-text">Peso</label>
                    <input class="form-control" type="number" step="any" name="peso" required>
                </div>
                <input class="btn btn-primary" type="submit" value="Calcular">
            </form>
        </div>
        </div>
        </div>
        </div>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
