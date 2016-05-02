<%-- 
    Document   : create.jsp
    Created on : 1/05/2016, 10:00:19 AM
    Author     : YojhanLR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear transfer</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/bootstrap.css">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/style.css">
    </head>
    <body>
        <div class="container">
            <div class="col-md-4">
                <h1>Crear Transfer</h1>
                <form method="post" action="<%= request.getContextPath()%>/Transfer/Store">
                    <div class="col-md-12 form-group">
                        <label for="Id">Id: </label>
                        <input id="id" name="id" type="text" class="form-control" required=""></input>
                    </div>
                    <div class="col-md-12 form-group">
                        <label for="matricula">Matricula </label>
                        <input id="matricula" name="matricula" type="text" class="form-control" required=""></input>
                    </div>
                   
                    <div class="col-md-12 form-group">
                        <label>Estado </label>
                        <p class="midsize no-margin"><span class="label label-success">Libre</span></p>
                    </div>

                    <div class="col-md-12 form-group">
                        <label for="ubicacion">Ubicacion </label>
                        <input id="ubicacion" name="ubicacion" type="text" class="form-control" required=""></input>
                    </div>
                    <hr/>
                    <div class="col-md-12 form-group">
                        <input type="submit" value="Crear Bus" class="btn btn-primary"></input>
                    </div>
                </form>
            </div>
        </div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <script src="${pageContext.request.contextPath}/public/js/bootstrap.js"></script>

        <script>
            $("input.date").datepicker({dateFormat: "dd/mm/yy"});
        </script>
    </body>
</html>