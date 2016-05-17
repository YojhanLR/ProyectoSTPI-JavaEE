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
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-2">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="<%=request.getContextPath()%>/Home">STPI</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="<%=request.getContextPath()%>/Conductores">Conductores <span class="sr-only">(current)</span></a></li>


                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Buses <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="<%=request.getContextPath()%>/Buses">Listar Buses</a></li>
                                <li><a href="#">Monitoreo de Rutas</a></li>
                            </ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Transfer <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="<%=request.getContextPath()%>/Transfer">Listar Transfer</a></li>
                                <li><a href="#">Monitoreo de Rutas</a></li>
                            </ul>
                        </li>
                        <li><a href="<%=request.getContextPath()%>/Bicis">Bici-Agil</a></li>
                        <li><a href="<%=request.getContextPath()%>/Clientes">Clientes</a></li>

                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="<%=request.getContextPath()%>/LogoutServlet">Salir</a></li>
                    </ul>
                </div>
            </div>
        </nav>

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
                        <jsp:include page='/views/Administrador/Monitoreo/table.jsp'>
                            <jsp:param name="rutaLetra" value="A"/>
                        </jsp:include>
                    </div>
                    <div class="tab-pane fade" id="RutaB">
                        <div class="col-xs-10 col-xs-offset-1">
                            <img src="${pageContext.request.contextPath}/views/Administrador/img/Troncal_B.png" class="img-responsive center-block" alt="Cinque Terre">
                        </div>
                        <jsp:include page='/views/Administrador/Monitoreo/table.jsp'>
                            <jsp:param name="rutaLetra" value="B"/>
                        </jsp:include>
                    </div>
                    <div class="tab-pane fade" id="RutaC">
                        <div class="col-xs-10 col-xs-offset-1">
                            <img src="${pageContext.request.contextPath}/views/Administrador/img/Troncal_C.png" class="img-responsive center-block" alt="Cinque Terre">
                        </div>
                        <jsp:include page='/views/Administrador/Monitoreo/table.jsp'>
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
    </body>
</html>
