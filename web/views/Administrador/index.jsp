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
     <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        
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
      <a class="navbar-brand" href="#">STPI</a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
      <ul class="nav navbar-nav">
        <li class="active"><a href="<%=request.getContextPath()%>/Administrador/Conductores/index.jsp">Conductores <span class="sr-only">(current)</span></a></li>
           <li><a href="<%=request.getContextPath()%>/Administrador/Buses/index.jsp">Buses</a></li>
        <li><a href="<%=request.getContextPath()%>/Administrador/Transfer/index.jsp">Transfer</a></li>
        <li><a href="<%=request.getContextPath()%>/Administrador/Bicis/index.jsp">Bici-Agil</a></li>
        <li><a href="<%=request.getContextPath()%>/Administrador/Clientes/index.jsp">Clientes</a></li>
       
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Salir</a></li>
      </ul>
    </div>
  </div>
</nav>
        

    <header>
      <div class="alert alert-dismissible alert-success">
  <button type="button" class="close" data-dismiss="alert">&times;</button>
  <strong>Acceso correcto!</strong> Bienvenido <a href="#" class="alert-link">Sistema de transporte publico integrado</a>.
</div>
    </header>
           <script src="js/bootstrap.min.js"></script>
           <script src="js/jquery.js"></script>
    </body>
</html>
