<%-- 
    Document   : index
    Created on : 30/04/2016, 06:51:41 PM
    Author     : YojhanLR
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Clientes</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/bootstrap.css">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/style.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/plugins/bootstrap-table/dist/bootstrap-table.css">
    </head>
    <body>
        <div class="col-md-12">
            <div class="table-responsive">
                <table class="table table-striped table-condensed" 
                       data-search="true"
                       data-show-columns="true"
                       data-toggle="table">

                    <thead>
                        <th data-sortable="true">Cedula</th>
                        <th data-sortable="true">Nombre</th>
                        <th data-sortable="true">Direccion</th>
                        <th data-sortable="true">Telefono</th>
                        <th data-sortable="true">Email</th>
                        <th data-align="center" data-sortable="true">Estado</th>
                       <th data-align="center" data-sortable="true">Ruta</th>
                    </thead>
                    <tbody>
                        <c:forEach items="${conductores}" var="conductor">
                            <tr>
                                <td>${conductor.conductorId}</td>
                                <td>${conductor.cedula}</td>
                            <td>${conductor
                                      .nombre}</td>
                                <td><fmt:formatDate pattern="dd/MM/yyyy" value="${conductor.fechaNac}" /></td>
                                <td>${conductor.telefono}</td>
                                <td>${conductor.direccion}</td>
                                <td>${conductor.estado}</td>
                                <td>
                            </tr>
                        </c:forEach>
                    </body>
                </table>
            </div>
        </div>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <script src="${pageContext.request.contextPath}/public/js/bootstrap.js"></script>
        <script src="${pageContext.request.contextPath}/public/plugins/bootstrap-table/dist/bootstrap-table.js"></script>
    </body>
</html>
