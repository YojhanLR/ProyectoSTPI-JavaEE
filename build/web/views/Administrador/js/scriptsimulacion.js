/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Puerto de Glassfish
$PORT = 9090;


$(document).ready(function () {

    $conductores = "";
    getConductores();

    function getConductores() {
        
        var dataEnviar = {
            'ajaxEvent': 'ajaxGet'
        };

        $.ajax({
            dataType: 'json',
            data: dataEnviar,
            cache: false,
            url: 'http://localhost:' + $PORT + '/Proyecto_STPI/Conductores',
            type: 'get',
            success: function (response) {
                console.log('> > Conductores: ');
                $conductores = JSOG.decode(response);
                console.log($conductores);
            }
        });
    }


});


