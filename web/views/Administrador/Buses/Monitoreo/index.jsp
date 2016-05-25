<%-- 
    Document   : index
    Created on : 16/05/2016, 06:47:46 PM
    Author     : YojhanLR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Monitoreo de Buses</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/bootstrap.css">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/style.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/plugins/bootstrap-table/dist/bootstrap-table.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/Administrador/css/bootstrap.min.css">
    </head>
    <body>

        <jsp:include page="/views/Administrador/Template/nav.jsp" /> 

        <div class="col-md-12">
            <div class="panel-body">
                <!-- Nav-tab -->
                <ul id="minav" class="nav nav-tabs nav-justified" style="margin-bottom: 10px">
                    <li class ="active"><a href="#RutaA" data-toggle="tab" aria-expanded="true">Ruta A</a></li>
                    <li class =""><a href="#RutaB" data-toggle="tab" aria-expanded="false">Ruta B</a></li>
                    <li class =""><a href="#RutaC" data-toggle="tab" aria-expanded="false">Ruta C</a></li>
                </ul>


                <div id="myTabContent" class="tab-content">
                    <div class="tab-pane fade active in" id="RutaA">
                        <div class="col-xs-10 col-xs-offset-1">
                            <img src="${pageContext.request.contextPath}/views/Administrador/img/Troncal_A.png" class="img-responsive center-block" alt="Cinque Terre">
                        </div>
                        <jsp:include page='/views/Administrador/Buses/Monitoreo/table.jsp'>
                            <jsp:param name="rutaLetra" value="A"/>
                        </jsp:include>
                    </div>
                    <div class="tab-pane fade" id="RutaB">
                        <div class="col-xs-10 col-xs-offset-1">
                            <img src="${pageContext.request.contextPath}/views/Administrador/img/Troncal_B.png" class="img-responsive center-block" alt="Cinque Terre">
                        </div>
                        <jsp:include page='/views/Administrador/Buses/Monitoreo/table.jsp'>
                            <jsp:param name="rutaLetra" value="B"/>
                        </jsp:include>
                    </div>
                    <div class="tab-pane fade" id="RutaC">
                        <div class="col-xs-10 col-xs-offset-1">
                            <img src="${pageContext.request.contextPath}/views/Administrador/img/Troncal_C.png" class="img-responsive center-block" alt="Cinque Terre">
                        </div>
                        <jsp:include page='/views/Administrador/Buses/Monitoreo/table.jsp'>
                            <jsp:param name="rutaLetra" value="C"/>
                        </jsp:include>
                    </div>

                </div>
            </div>

        </div>            

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>

        <script src="${pageContext.request.contextPath}/public/plugins/bootstrap-table/dist/bootstrap-table.js"></script>
        <script src="${pageContext.request.contextPath}/views/Administrador/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/views/Administrador/js/JSOG.js"></script>
        <script src="${pageContext.request.contextPath}/views/Administrador/js/scriptsimulacion.js"></script>

        <style>
            .table-hover>tbody>tr:hover>td, .table-hover>tbody>tr:hover>th {
                background-color: #9CFB9F;
                color:#000;
            }
        </style>
    </body>
</html>
