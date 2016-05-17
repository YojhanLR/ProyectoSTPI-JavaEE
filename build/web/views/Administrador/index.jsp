<%-- 
    Document   : index
    Created on : 1/05/2016, 05:30:58 PM
    Author     : HECTOR
    --%>

    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Panel Administrador</title>
      <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/views/Administrador/css/bootstrap.min.css">
      
    </head>
    <body>
      
      <jsp:include page="/views/Administrador/Template/nav.jsp" /> 
      

      <header>
        <div class="alert alert-dismissible alert-success">
          <button type="button" class="close" data-dismiss="alert">&times;</button>
          <strong>Acceso correcto!</strong> Bienvenido <a href="#" class="alert-link">Sistema de transporte publico integrado</a>.
        </div>
      </header>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
      <script src="//code.jquery.com/jquery-1.10.2.js"></script>
      <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
      <script src="<%=request.getContextPath()%>/views/Administrador/js/bootstrap.min.js"></script>
      
    </body>
    </html>


