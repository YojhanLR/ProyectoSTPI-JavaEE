/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Puerto de Glassfish
$PORT = 9090;
$URLBase = 'http://localhost:' + $PORT + '/Proyecto_STPI';


$(document).ready(function () {
    
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
            }
        });
    }


});


