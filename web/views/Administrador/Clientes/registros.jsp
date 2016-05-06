<div class="modal fade" tabindex="-1" role="dialog" id="modalRegistros">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel"> - </h4>
            </div>
            <div class="modal-body">

                <ul class="nav nav-tabs" style="margin-bottom: 10px">
                    <li id="li-transfer" class="active"><a href="#div-transfer" data-toggle="tab" aria-expanded="true">Transfer</a></li>
                    <li id="li-biciagil" class=""><a href="#div-biciagil" data-toggle="tab" aria-expanded="false">Bici-agil</a></li>
                </ul>
                <div id="myTabContent" class="tab-content">
                    
                    <div class="tab-pane fade active in" id="div-transfer">
                        <div class="table-responsive" style="margin-bottom: 10px">
                            <div class="col-md-12">
                                <table id="tabla-transfer" 
                                       class="table table-striped table-condensed" 
                                       data-toggle="table"
                                       data-url = ""
                                       data-pagination="true"
                                       data-page-size="7"
                                       >
                                    <thead>
                                        <th data-field="id">#</th>
                                        <th data-field="idTransfer">Transfer id</th>
                                        <th data-field="matriculaTransfer">Matricula transfer</th>
                                        <th data-field="conductorId">Conductor id</th>
                                        <th data-field="nombreConductor">Nombre conductor</th>
                                        <th data-field="kilometros">Kilometros</th>
                                        <th data-field="fechainicio">Fecha inicio</th>
                                        <th data-field="fechafin">Fecha fin</th>
                                    </thead>
                                </table> 
                            </div>
                        </div>
                    </div>
                    
                    <div class="tab-pane fade" id="div-biciagil">
                        <div class="table-responsive" style="margin-bottom: 10px">
                            <div class="col-md-12">
                                <table class="table table-striped table-condensed" 
                                       id="tabla-biciagil"
                                       data-toggle="table"
                                       data-url = ""
                                       data-pagination="true"
                                       data-page-size="7"
                                       >
                                    <thead>
                                    <th data-field="id">#</th>
                                    <th data-field="idBici">Bici Id</th>
                                    <th data-field="fechainicio">Fecha inicio</th>
                                    <th data-field="fechafin">Fecha fin</th>
                                    </thead>

                                    <tbody>

                                    </tbody>
                                </table> 
                            </div>
                        </div>
                    </div>
                    
                </div>    
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->


