<%-- 
    Document   : edit
    Created on : 30/04/2016, 02:48:13 PM
    Author     : YojhanLR
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Bus</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/bootstrap.css">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/style.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/Administrador/css/bootstrap.min.css">

    </head>
    <body>
        
        <jsp:include page="/views/Administrador/Template/nav.jsp" /> 
        
        <div class="container">
            <div class="col-md-4">
                <h1>Editar bus</h1>
                <form method="post" action="<%= request.getContextPath()%>/Buses/update?id=${bus.busId}">
                   
                   <div class="col-md-12 form-group">
                        <label for="matricula">Matricula: </label>
                        <input id="matricula" value="${bus.matricula}" name="matricula" type="text" class="form-control" required=""></input>
                    </div>
                    
                    <div class="col-md-12 form-group">
                        <label>Estado: </label>
                        <c:choose>
                            <c:when test="${bus.estado eq 'Libre'}">
                                <p class="midsize no-margin"><span class="label label-success" alt="${bus.estado}">${bus.estado}</span></p>
                            </c:when>
                            <c:otherwise>
                                <p class="midsize no-margin"><span class="label label-danger" alt="${bus.estado}">${bus.estado}</span></p>
                            </c:otherwise>
                        </c:choose>
                    </div>

                    <div class="col-md-12 form-group">
                        <label for="ubicacion">Parqueadero: </label>
                        <input id="ubicacion" value="${bus.ubicacion}" name="ubicacion" type="text" class="form-control" required=""></input>
                    </div>

                    <hr/>

                    <div class="col-md-12 form-group">
                        <input type="submit" value="Editar bus" class="btn btn-primary"></input>
                    </div>
                </form>
            </div>
        </div>




        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
      

      
     <script src="${pageContext.request.contextPath}/views/Administrador/js/bootstrap.min.js"></script>
       

        
    </body>
</html>
