/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$( document ).ready(function() {
    var dataEnviar = {
          '_token': 'hola'
        };
        
    $.ajax({
    dataType: 'json',
    data: dataEnviar,
    cache: false,
    url: 'http://localhost:9090/Proyecto_STPI/ajaxRequest',
    type: 'get',
    success: function (response) {
        console.log('> > Respuesta: ');
        console.log(response);
    }
});

});


