/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var i = [];

$(function ()
{
    
    listarCarros();
});



 function listarCarros()
{
   
    var parametros=
            {
                accion: "ListarCarro"
                
            };
            $.ajax({
                url: '../../ControllerCarro',
                data:parametros,
                dataType: 'json',
                type: 'post',
                cache: false,
                success: function(resultado)
                {
                    console.log(resultado);
                    carros= resultado;
                    $.each(carros, function(i, carro){
                           $("#sPlaca").html(carro.placa);
                           $("#sLinea").html(carro.unaLinea.nombre);
                           $("#sAño").html(carro.fecha);
                           $("#sKilometraje").html(carro.kilometraje);
                           $("#sCilindraje").html(carro.cilindraje);
                           $("#sPrecio").html(carro.precio);
                           $("#sTipoCaja").html(carro.tipocaja);
                           $("#sDescripcion").html(carro.descripcion);
                           $("#sDisponible").html(carro.disponible);
                           $("#sDescripcion").html(carro.descripcion);
                           $("#sTipo").html(carro.unTipo.Nombre);
                           $("#sMarca").html(carro.unaMarca.nombre);
                           $("#sCiudad").html(carro.unaCiudad.Nombre);
                           $("#sDetalle").attr("onclik", "abrirModal(" + i + "," + j + ")");
                           $("#tblCarros tbody").append($("#fila").clone(true).attr("class", "otraFila"));
                       });
                       $("#tblCarros tbody tr").first().remove();
                   
                    $("#tblCarros").DataTable();
                },
                erro:function(ex)
                {
                    console.log(ex.responseText);
                }
            });
}
function abrirModal()
{
    $("#modalAtender"),modal();
      var parametros=
            {
                accion: "ListarCarro"
                
            };
            $.ajax({
                url: '../../ControllerCarro',
                data:parametros,
                dataType: 'json',
                type: 'post',
                cache: false,
                success: function(resultado)
                {
                    console.log(resultado);
                    usuarios= resultado;
                    $.each(usuarios, function(i,usuario ){
                           $("#sApellido").html(usuario.nombre);
                           $("#sNombre").html(usuario.apellido);
                           $("#sApellido").html(usuario.telefono);
                           $("#sCorreo").html(usuario.correo);
                         
                       });
                    
                },
                erro:function(ex)
                {
                    console.log(ex.responseText);
                }
            });
}

