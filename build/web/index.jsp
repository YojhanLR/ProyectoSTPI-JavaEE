<%-- 
    Document   : index
    Created on : 29/04/2016, 11:01:06 PM
    Author     : HECTOR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>STPI</title>

        <!--  SCSS login -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/views/Cliente/css/loginstyle.css">
        <!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->
        <link href="${pageContext.request.contextPath}/views/Cliente/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="${pageContext.request.contextPath}/views/Cliente/css/freelancer.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="${pageContext.request.contextPath}/views/Cliente/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">



        <link href="${pageContext.request.contextPath}/public/css/bootstrap-datetimepicker.min.css" rel="stylesheet">  
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
            <![endif]-->


    </head>

    <body id="page-top" class="index">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header page-scroll">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#page-top">BIENVENIDO AL STPI</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="hidden">
                            <a href="#page-top"></a>
                        </li>
                        <li class="page-scroll">
                            <a href="#transfer">Transfer</a>
                        </li>
                        <li class="page-scroll">
                            <a href="#biciagil">Bici-Agil</a>
                        </li>

                        <li class="page-scroll ">
                            <a href="#" id="loginform">Login</a>
                        </li>
                        <li>
                            <div id="regbar">
                                <div class="login ">
                                    <div class="arrow-left"></div>
                                    <div class="formholder">
                                        <div class="randompad">
                                            <form method="POST" action="j_security_check">
                                                <fieldset>
                                                    <label for="j_username">Nombre de usuario</label>
                                                    <input type="text" name="j_username" placeholder="Usuario" />
                                                    <label for="j_password">Password</label>
                                                    <input type="password" name="j_password" placeholder="***********"/>
                                                    <input type="submit" value="Login" />
                                                </fieldset>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </li>
                    </ul>

                </div>


                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container-fluid -->

        </nav>



        <!-- Header -->
        <header>
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <img class="img-responsive" src="${pageContext.request.contextPath}/views/Cliente/img/logo.png" alt="">
                        <div class="intro-text">
                            <span class="name">Sistema de Transporte Público Integrado</span>
                            <hr class="star-light">
                            <span class="skills">Bienvenido - Disfrute una nueva experiencia de transporte</span>
                        </div>
                    </div>
                </div>
            </div>
        </header>

        <!-- Transfer Grid Section -->
        <section id="transfer">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h2>Reserva tu Transfer</h2>
                        <hr class="star-primary">
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
                        <!-- The form should work on most web servers, but if the form is not working you may need to configure your web server differently. -->
                        <form  method="post" action="<%= request.getContextPath()%>/Usuario_TransferStore" name="sentMessage" id="ReservarTransfer" novalidate>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <label>Cédula</label>
                                    <input name="CedulaTransfer" type="text" class="form-control" placeholder="Cedula" id="CedulaTransfer" required data-validation-required-message="Por favor ingrese su Cedula">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <label>Nombre</label>
                                    <input name="NombreTransfer" type="text" class="form-control" placeholder="Nombre" id="NombreTransfer" required data-validation-required-message="Por favor ingrese su Nombre">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <label>Direccion</label>
                                    <input name="DireccionTransfer" type="text" class="form-control" placeholder="Direccion" id="DireccionTransfer" required data-validation-required-message="Por favor ingrese su Direccion">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <label>Telefono</label>
                                    <input name="TelefonoTransfer" type="tel" class="form-control" placeholder="Telefono" id="TelefonoTransfer" required data-validation-required-message="Por favor ingrese su Telefono">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <label>Email</label>
                                    <input name="EmailTransfer" type="email" class="form-control" placeholder="Email" id="EmailTransfer" required data-validation-required-message="Por favor ingrese su E-mail">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>




                            <div class="row control-group" style="padding-top:1.5em;padding-bottom:1.5em; border-bottom:1px solid #eeeeee">
                                <label for="Ruta" class="col-xs-3 label-custom">Ruta</label>
                                <div class="col-xs-9">
                                    <select class="form-control" id="Ruta" name="Ruta">
                                        <option value="1">A</option>
                                        <option value="2">B</option>
                                        <option value="3">C</option>
                                    </select>
                                </div>
                                <p class="help-block text-danger"></p>
                            </div>


                            <div class="row control-group" style="padding-top:1.5em;padding-bottom:1.5em; border-bottom:1px solid #eeeeee">
                                <label for="Fecha" class="col-xs-3 label-custom">Fecha y Hora</label>
                                    <div class='col-xs-9'>
                                        <div class="form-group">
                                            <div class='input-group date' id='divMiCalendario'>
                                                <input type='text' name="FechaReservaTranfer" id="FechaReservaTransfer" class="form-control" />
                                                <span class="input-group-addon">
                                                    <span class="glyphicon glyphicon-calendar"></span>
                                                </span>
                                            </div>
                                        </div>
                                    </div>   
                            </div>


                            <br>
                            <br>
                            <div id="success"></div>
                            <div class="row">
                                <div class="form-group col-xs-12">
                                    <button type="submit" class="btn btn-success btn-lg">Reservar</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>


        <!-- About Section -->
        <section id="biciagil">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h2>Reserva tu Bici</h2>
                        <hr class="star-primary">
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
                        <!-- The form should work on most web servers, but if the form is not working you may need to configure your web server differently. -->
                        <form method="post" action="<%= request.getContextPath()%>/Bicicleta_UsuarioStore"  name="sentMessage" id="ReservarBici" novalidate>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <label>Cédula</label>
                                    <input type="text" class="form-control" placeholder="Cedula" id="CedulaBici" required data-validation-required-message="Por favor ingrese su Cedula">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <label>Nombre</label>
                                    <input type="text" class="form-control" placeholder="Nombre" id="NombreBici" required data-validation-required-message="Por favor ingrese su Nombre">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <label>Direccion</label>
                                    <input type="text" class="form-control" placeholder="Direccion" id="DireccionBici" required data-validation-required-message="Por favor ingrese su Direccion">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <label>Telefono</label>
                                    <input type="tel" class="form-control" placeholder="Telefono" id="TelefonoBici" required data-validation-required-message="Por favor ingrese su Telefono">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <label>Email</label>
                                    <input type="email" class="form-control" placeholder="Email" id="EmailBici" required data-validation-required-message="Por favor ingrese su E-mail">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group" style="padding-top:1.5em;padding-bottom:1.5em; border-bottom:1px solid #eeeeee">
                                <label for="Estacion" class="col-xs-3 label-custom">Estación</label>
                                <div class="col-xs-9">
                                    <select class="form-control" id="Estacion">
                                        <option>Bici-A</option>
                                        <option>Bici-B</option>
                                        <option>Bici-C</option>
                                    </select>
                                </div>
                                <p class="help-block text-danger"></p>
                            </div>

                            <div class="row control-group" style="padding-top:1.5em;padding-bottom:1.5em; border-bottom:1px solid #eeeeee">
                                <label for="Fecha" class="col-xs-3 label-custom">Fecha y Hora</label>
                                <div class="col-xs-9">
                                    <div class="form-group">
                                        <div class='input-group date' id='divMiCalendario2'>
                                            <input type='text' name="FechaReservaBici" id="FechaReservaBici" class="form-control" />
                                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                            </div>



                            <br>
                            <br>
                            <div id="success"></div>
                            <div class="row">
                                <div class="form-group col-xs-12">
                                    <button type="submit" class="btn btn-success btn-lg">Reservar</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
                            
         

        <!-- Contact Section -->
                        <form method="post" action="<%= request.getContextPath()%>/MonitoreoBuses"  name="sentMessage" id="Buses" novalidate>
                            <br>
                            <br>
                            <div id="success"></div>
                            <div class="row">
                                <div class="form-group col-xs-12">
                                    <button type="submit" class="btn btn-success btn-lg">Buses</button>
                                </div>
                            </div>
                        </form>



        <!-- Footer -->
        <footer class="text-center">
            <div class="footer-above">
                <div class="container">
                    <div class="row">
                        <div class="footer-col col-md-4">
                            <h3>Dirección</h3>
                            <p>Cll 26 #78-90<br>Bogotá, Colombia</p>
                        </div>
                        <div class="footer-col col-md-4">
                            <h3>Contenido de la Web</h3>
                            <ul class="list-inline">
                                <li>
                                    <a href="#" class="btn-social btn-outline"><i class=" "></i></a>
                                </li>
                                <li>
                                    <a href="#transfer" class="btn-social btn-outline"><i class=" "></i></a>
                                </li>
                                <li>
                                    <a href="#biciagil" class="btn-social btn-outline"><i class=" "></i></a>
                                </li>

                            </ul>
                        </div>
                        <div class="footer-col col-md-4">
                            <h3>Creadores</h3>
                            <p>Yojhan Rodriguez</p>
                            <p>Hector Hurtado</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="footer-below">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            Copyright &copy;2016
                        </div>
                    </div>
                </div>
            </div>
        </footer>

        <!-- jQuery -->
        <script src="${pageContext.request.contextPath}/views/Cliente/js/jquery.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="${pageContext.request.contextPath}/views/Cliente/js/bootstrap.min.js"></script>

        <!-- Plugin JavaScript -->
        <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
        <script src="${pageContext.request.contextPath}/views/Cliente/js/classie.js"></script>
        <script src="${pageContext.request.contextPath}/views/Cliente/js/cbpAnimatedHeader.js"></script>

        <!-- Contact Form JavaScript -->
        <script src="${pageContext.request.contextPath}/views/Cliente/js/jqBootstrapValidation.js"></script>
        <script src="${pageContext.request.contextPath}/views/Cliente/js/contact_me.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="${pageContext.request.contextPath}/views/Cliente/js/freelancer.js"></script>


        <!-- Scripts del login -->
        <!--<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script> -->
        <script src="${pageContext.request.contextPath}/views/Cliente/js/login.js"></script>  



        <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> -->
        <script src="${pageContext.request.contextPath}/public/js/moment.min.js"></script>
        <script src="${pageContext.request.contextPath}/public/js/bootstrap-datetimepicker.min.js"></script>
        <script src="${pageContext.request.contextPath}/public/js/bootstrap-datetimepicker.es.js"></script>


        <script type="text/javascript">
            $('#divMiCalendario').datetimepicker({
                format: 'YYYY-MM-DD HH:mm'
            });
            //$('#divMiCalendario').data("DateTimePicker").show();
        </script>  

        <script type="text/javascript">
            $('#divMiCalendario2').datetimepicker({
                format: 'YYYY-MM-DD HH:mm'
            });
            //$('#divMiCalendario2').data("DateTimePicker").show();
        </script>  

    </body>
</html>
