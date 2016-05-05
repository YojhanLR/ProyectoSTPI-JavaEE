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
              <li><a href="<%=request.getContextPath()%>/index.jsp">Salir</a></li>
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
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
      <script src="//code.jquery.com/jquery-1.10.2.js"></script>
      <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
      <script src="<%=request.getContextPath()%>/views/Administrador/js/bootstrap.min.js"></script>
      
    </body>
    </html>


