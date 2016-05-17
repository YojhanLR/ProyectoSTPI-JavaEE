
<%String rutaLetra = request.getParameter("rutaLetra");%>

 <div class="col-md-12">
            <div class="table-responsive">
                <table class="table table-striped table-condensed"
                       id="tabla-ruta-<%=rutaLetra%>"
                       data-search="true"
                       data-show-columns="true"
                       data-toggle="table">

                    <thead>
                    <th data-sortable="true">Id</th>
                    <th data-sortable="true">Bus Id</th>
                    <th data-sortable="true">Bus placa</th>
                    <th data-sortable="true">Conductor</th>
                    <th data-sortable="true">Cédula</th>
                    <th data-sortable="true">Fecha inicio</th>
                    <th data-sortable="true">Posición actual</th>
                    </thead>
                    <tbody>
                        
                    </tbody>
                </table>
            </div>
        </div>
