<%-- 
    Document   : edit
    Created on : 30/04/2016, 02:48:13 PM
    Author     : YojhanLR
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar conductor</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/bootstrap.css">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/style.css">

    </head>
    <body>
        <div class="container">
            <div class="col-md-4">
                <h1>Editar conductor</h1>
                <form method="post" action="<%= request.getContextPath()%>/Conductor/Update?id=${conductor.conductorId}">
                    <div class="col-md-12 form-group">
                        <label for="cedula">Número de cédula: </label>
                        <input id="cedula" value="${conductor.cedula}" name="cedula" type="text" class="form-control" required=""></input>
                    </div>
                    <div class="col-md-12 form-group">
                        <label for="nombre">Nombre completo: </label>
                        <input id="nombre" value="${conductor.nombre}" name="nombre" type="text" class="form-control" required=""></input>
                    </div>
                    <div class="col-md-12 form-group">
                        <label for="fecha_nac">Fecha nacimiento: </label>
                        <input id="fecha_nac" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${conductor.fechaNac}" />" name="fecha_nac" class="form-control date" required=""></input>
                    </div>

                    <div class="col-md-12 form-group">
                        <label>Estado: </label>
                        <c:choose>
                            <c:when test="${conductor.estado eq 'Libre'}">
                                <p class="midsize no-margin"><span class="label label-success" alt="${conductor.estado}">${conductor.estado}</span></p>
                            </c:when>
                            <c:otherwise>
                                <p class="midsize no-margin"><span class="label label-danger" alt="${conductor.estado}">${conductor.estado}</span></p>
                            </c:otherwise>
                        </c:choose>
                    </div>

                    <div class="col-md-12 form-group">
                        <label for="telefono">Telefono: </label>
                        <input id="telefono" value="${conductor.telefono}" name="telefono" type="text" class="form-control" required=""></input>
                    </div>
                    <div class="col-md-12 form-group ">
                        <label for="direccion">Direccion: </label>
                        <input id="direccion" value="${conductor.direccion}" name="direccion" type="text" class="form-control" required=""></input>
                    </div>

                    <hr/>

                    <div class="col-md-12 form-group">
                        <input type="submit" value="Editar conductor" class="btn btn-primary"></input>
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
