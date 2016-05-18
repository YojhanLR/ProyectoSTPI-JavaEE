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
        <title>Lista de Buses</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/bootstrap.css">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/style.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/plugins/bootstrap-table/dist/bootstrap-table.css">
    
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/Administrador/css/bootstrap.min.css">

    </head>
    <body>
        
        <jsp:include page="/views/Administrador/Template/nav.jsp" /> 
        
        <div class="col-md-12">
            <div class="table-responsive">
                <table class="table table-striped table-condensed" 
                       data-search="true"
                       data-show-columns="true"
                       data-toggle="table">

                    <thead>
                        <a href="<%=request.getContextPath()%>/Buses/create" class="btn btn-success pull-left" style="margin: 20px 0;">Crear nuevo</a> 
                        <th data-sortable="true">Id</th>
                        <th data-sortable="true">Matricula</th>
                        <th data-align="center" data-sortable="true">Estado</th>
                        <th data-sortable="true">Parqueadero</th> 
                        <th data-align="center">Opción</th>
                    </thead>
                    <tbody>
                        <c:forEach items="${buses}" var="bus">
                            <tr>
                                <td>${bus.busId}</td>
                                <td>${bus.matricula}</td>
                                <td>
                                    <c:choose>
                                        <c:when test="${bus.estado eq 'Libre'}">
                                            <span class="label label-success" alt="${bus.estado}">${bus.estado}</span>
                                        </c:when>
                                        <c:otherwise>
                                            <span class="label label-danger" alt="${bus.estado}">${bus.estado}</span>
                                        </c:otherwise>
                                    </c:choose>
                                </td>
                                <td>${bus.ubicacion}</td> 
                                <td>
                                    <a alt="Editar bus" title="Editar" href="<%=request.getContextPath()%>/Buses/edit?id=${bus.busId}" class="btn btn-warning btn-xs">
                                        <span class="glyphicon glyphicon-wrench" aria-hidden="true"></span>
                                    </a>
                                        <a alt="Eliminar bus " title="Eliminar" onClick="return confirm ('¿Seguro desea eliminar este bus?')" href="<%=request.getContextPath()%>/Buses/destroy?id=${bus.busId}" class="btn btn-danger btn-xs">
                                        <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        
       
           
        

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        
        <script src="${pageContext.request.contextPath}/public/plugins/bootstrap-table/dist/bootstrap-table.js"></script>
         <script src="${pageContext.request.contextPath}/views/Administrador/js/bootstrap.min.js"></script>
     

    </body>
</html>
