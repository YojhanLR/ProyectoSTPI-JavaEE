<%-- 
    Document   : index
    Created on : 30/04/2016, 12:40:07 PM
    Author     : YojhanLR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="public/css/bootstrap.css">
    </head>
    <body>
        <h1>Home</h1>

        <a alt="Editar usuario" title="Editar" href="<%=request.getContextPath()%>/Conductor" class="btn btn-warning btn-xs">Ver lista de conductores</a>


        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="public/js/bootstrap.js"></script>
    </body>
</html>
