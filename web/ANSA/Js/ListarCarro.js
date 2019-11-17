/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function ()
{
  
  listarMarca();
  listarCiudad();
  listarTipoVehiculo();
  
  //traerLinea();
  $("#cb_Marca").change(function(){
      $("#cb_Linea").empty();
    traerLinea($("#cb_Marca").val());
    });
});

function listarMarca()
{
    var parametros=
            {
                accion:"ListarMarcas"
            };
            $.ajax({
               url: '../../ControllerCarro' ,
               data: parametros,
               type: 'post',
               dataType: 'json',
               cache: false,
               success: function(resultado)
               {
                   console.log(resultado);
                   var marcas = resultado;
                   $.each(marcas,function(i,marca)
                   {
                       
                       $('#cb_Marca').append(
                         $('<option>',{
                            
                            value: marca.idMarca,
                            text: marca.nombre
                        })
                      );
                   });
            },
            error: function(ex)
            {
                console.log(ex.responseText);
            }
        });
}


function traerLinea(marca){
    var parametros={
        accion:"ListarLinea",
        idMarca:marca
    };
    $.ajax({
        url: '../../ControllerCarro',
        data:parametros,
        type: 'post',
        dataType: 'json',
        cache: false,
        success: function(resultado){
            console.log(resultado);
            var Lineas= resultado;
            $.each(Lineas, function(i, linea){
                $('#cb_Linea').append(
                        $('<option>',{
                            
                            value: linea.idLinea,
                            text: linea.nombre
                        })
                      );
             });
        },
        error: function(ex)
        {
            console.log(ex.responseText);
        }
    });
}
function listarCiudad()

{
    var parametros={
        accion:"ListarCiudad"
    };
    $.ajax({
        url: '../../ControllerCarro',
        data:parametros,
        type: 'post',
        dataType: 'json',
        cache: false,
        success: function(resultado){
            console.log(resultado);
            var ciudades= resultado;
            $.each(ciudades, function(i, ciudad){
                $('#cb_Ciudad').append(
                        $('<option>',{
                            
                            value: ciudad.idCiudad,
                            text: ciudad.Nombre
                        })
                      );
             });
        },
        error: function(ex)
        {
            console.log(ex.responseText);
        }
    });
}
function listarTipoVehiculo()
{
    var parametros={
        accion:"ListarTipoVehiculo"
    };
    $.ajax({
        url: '../../ControllerCarro',
        data:parametros,
        type: 'post',
        dataType: 'json',
        cache: false,
        success: function(resultado){
            console.log(resultado);
            var TipoVehiculos= resultado;
            $.each(TipoVehiculos, function(i, tipoVehiculo){
                $('#cb_TipoVehiculo').append(
                        $('<option>',{
                            
                            value: tipoVehiculo.idTipo,
                            text: tipoVehiculo.Nombre
                        })
                      );
             });
        },
        error: function(ex)
        {
            console.log(ex.responseText);
        }
    });
     
}



