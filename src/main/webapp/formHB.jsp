<%-- 
    Document   : formHB
    Created on : 25 mar 2023, 13:10:18
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
            <h2 class="card-title">Método Harris Benedict</h2>
            <br>
            <form action="ControlCalcularHB" method="post">
                <div class="mb-3 input-group">
                    <label class="input-group-text">Peso</label>
                    <input class="form-control" type="number" step="any" name="peso" required>
                </div>
                <div class="mb-3 input-group">
                    <label class="input-group-text">Altura</label>
                    <input class="form-control" type="number" step="any" name="altura" required>
                </div>
                <div class="mb-3 input-group">
                    <label class="input-group-text">Actividad</label>
                    <select class="form-select" name="actividad">
                        <option value="3">Haces deporte de 6 a 7 veces por semana</option>
                        <option value="2">Haces deporte de 3 a 5 veces por semana</option>
                        <option value="1">Haces deporte de 1 a 3 veces por cemana</option>
                        <option value="0">Eres una persona sedentaria</option>
                    </select>
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
