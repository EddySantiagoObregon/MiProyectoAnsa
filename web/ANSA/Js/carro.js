/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(function ()
{
    
    
   $('#btnPublicar').click(function(){ 
        
        agregarCarro();
   }); 
});

function agregarCarro()
{
   
    $("#accion").val("Agregar");
    $("#mensaje").html("");
    
         $.ajax({
               url: '../../ControllerCarro' ,
               data: $("#frmAgregarCarro").serialize(),
               type: 'post',
               dataType: 'json',
               cache: false,
               success: function(resultado)
               {
                   console.log(resultado);
                   if(resultado)
                   {
                       $("#mensaje").html("Carro agregado a la base de datos");
                       alert("Su carro se ha publicado correctamente");
                       location.href="OpcionesDespuesDeRegistro.jsp"
                       limpiar();
                   }else
                   {
                       $("#mensaje").html("Problemas al agregar carro");
                   }
                   $("#msj").show();
            },
            error: function(ex)
            {
                console.log(ex.responseText);
            }
        });
        }
      
        function limpiar()
{
    $("#txt_Placa").val(" ");
    $("#cb_Marca").val("Seleccione");
    $("#txt_Linea").val(" ");
    $("#txt_Anio").val(" ");
    $("#txt_Kilometraje").val(" ");
    $("#txt_Cilindraje").val(" ");
    $("#txt_Precio").val(" ");
    $("#txt_Anio").val(" ");
    $("#txt_TipoCaja").val("Seleccione");
     $("#cb_Disponible").val(" ");
    $("#cb_TipoVehiculo").val("Seleccione");
    $("#txt_Descripcion").val("Seleccione");
    $("#cb_Ciudad").val(" ");
 
    
    
}
