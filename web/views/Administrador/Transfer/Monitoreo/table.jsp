
<%String rutaLetra = request.getParameter("rutaLetra");%>

 <div class="col-md-12">
            <div class="table-responsive">
                <table class="table table-striped table-condensed"
                       id="tabla-ruta-<%=rutaLetra%>"
                       data-search="true"
                       data-show-columns="true"
                       data-toggle="table">

                    <thead>
                    <th data-sortable="true" data-field="id">Id</th>
                    <th data-sortable="true" data-field="transferid">Transfer Id</th>
                    <th data-sortable="true" data-field="transferplaca">Transfer placa</th>
                    <th data-sortable="true" data-field="conductor">Conductor</th>
                    <th data-sortable="true" data-field="cedula">Cédula conductor</th>
                    <th data-sortable="true" data-field="usuarionombre">Nombre usuario</th>
                    <th data-sortable="true" data-field="usuariocedula">Cédula usuario</th>
                    <th data-sortable="true" data-field="fechaini">Fecha inicio</th>
                    <th data-sortable="true" data-field="posicion">Posición actual</th>
                    </thead>
                    <tbody>
                        
                    </tbody>
                </table>
            </div>
        </div>
