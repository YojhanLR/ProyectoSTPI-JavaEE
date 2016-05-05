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
        <title>Lista de Bicicletas</title>
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
                        <li><a href="<%=request.getContextPath()%>/Conductores">Conductores <span class="sr-only">(current)</span></a></li>


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
                        <li class="active"><a href="<%=request.getContextPath()%>/Bicis">Bici-Agil</a></li>
                        <li><a href="<%=request.getContextPath()%>/Clientes">Clientes</a></li>

                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="<%=request.getContextPath()%>/index.jsp">Salir</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="col-md-offset-1 col-md-10">
            <div class="table-responsive">
                <table class="table table-striped table-condensed" 
                       data-search="true"
                       data-show-columns="true"
                       data-toggle="table">

                    <thead>
                    <a href="<%=request.getContextPath()%>/Bicis/create" class="btn btn-success pull-left" style="margin: 20px 0;">Crear nuevo</a>  
                    <th data-sortable="true">Id</th>
                    <th data-align="center" data-sortable="true">Estado</th>
                    <th data-align="center" data-sortable="true">Estacion</th>
                    <th data-align="center">Opción</th>
                    </thead>
                    <tbody>
                        <c:forEach items="${bicis}" var="bici">
                            <tr>
                                <td>${bici.bicicletaId}</td>
                                <td>
                                    <c:choose>
                                        <c:when test="${bici.estado eq 'Libre'}">
                                            <span class="label label-success" alt="${bici.estado}">${bici.estado}</span>
                                        </c:when>
                                        <c:otherwise>
                                            <span class="label label-danger" alt="${bici.estado}">${bici.estado}</span>
                                        </c:otherwise>
                                    </c:choose>
                                </td>
                                <td>${bici.estacionBicicletaList.get(0).getEstacionId().getNombre()}</td>
                                <td>
                                    <a alt="Eliminar bicicleta" title="Eliminar" onClick="return confirm('¿Seguro desea eliminar este conductor?')" href="<%=request.getContextPath()%>/Bicis/destroy?id=${bici.bicicletaId}" class="btn btn-danger btn-xs">
                                        <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                        </body>
                </table>
            </div>
        </div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <script src="${pageContext.request.contextPath}/views/Administrador/js/bootstrap.min.js"></script>


        <script src="${pageContext.request.contextPath}/public/plugins/bootstrap-table/dist/bootstrap-table.js"></script>


    </body>
</html>
