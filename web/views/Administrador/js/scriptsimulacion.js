/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/* global $tableA, $tableB, $tableC */

//Puerto de Glassfish
$PORT = 9090;
$URLBase = 'http://localhost:' + $PORT + '/Proyecto_STPI';


$(document).ready(function () {
    
    $tableA = $('#tabla-ruta-A');
    $tableB = $('#tabla-ruta-B');
    $tableC = $('#tabla-ruta-C');
    
    getRecorridos();
    var interval = setInterval(getRecorridos, 10000);
    
    function getRecorridos() {
        $recorridos = "";
        
        var dataEnviar = {
            'ajaxEvent': 'ajaxGet'
        };

        $.ajax({
            dataType: 'json',
            data: dataEnviar,
            cache: false,
            url: $URLBase+'/MonitoreoBuses',
            type: 'get',
            success: function (response) {
                console.log('> > Lista de recorridos (Buses): ');
                $recorridos = JSOG.decode(response);
                console.log($recorridos);
                printTable($recorridos);
            }
        });
    }
    
    function printTable($recorridos){
         $tableA.bootstrapTable('removeAll');
         $tableB.bootstrapTable('removeAll');
         $tableC.bootstrapTable('removeAll');
        
         indexA = 0;
         indexB = 0;
         indexC = 0;
         
         for(var i=0; i<$recorridos.length; i++){
             
             switch($recorridos[i].rutaId.rutaId){
                 case 1:
                     insertRow($tableA,indexA,i);
                     indexA++;
                     break;
                 case 2:
                     insertRow($tableB,indexB,i);
                     indexB++;
                     break;
                 case 3:
                     insertRow($tableC,indexC,i);
                     indexC++;
                     break;  
             }
         }
         
         function insertRow(tabla, index, i){
             var date = new Date($recorridos[i].fechaInicio);
             
              tabla.bootstrapTable('insertRow', {
                  index: index,
                  row: {
                      id: $recorridos[i].id,
                      busid: $recorridos[i].busId.busId,
                      busplaca: $recorridos[i].busId.matricula,
                      conductor: $recorridos[i].conductorId.nombre,
                      cedula: $recorridos[i].conductorId.cedula,
                      fechaini: date.toLocaleString('es'),
                      posicion: $recorridos[i].kilometrosRecorridos + " Km"
                  }
              });
         }
        
    }


});


