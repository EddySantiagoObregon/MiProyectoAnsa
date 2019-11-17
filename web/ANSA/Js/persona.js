/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function ()
{
   $('#btnAgregar').click(function(){ 
       
        agregarEmpleado();
   }); 
});

function agregarEmpleado()
{
   
    $("#accion").val("Agregar");
    $("#mensaje").html("");
    
         $.ajax({
               url: '../../ControllerPersona' ,
               data: $("#frmAgregarEmpleado").serialize(),
               type: 'post',
               dataType: 'json',
               cache: false,
               success: function(resultado)
               {
                   console.log(resultado);
                   if(resultado)
                   {
                       $("#mensaje").html("Persona registrada");
                       location.href="OpcionesDespuesDeRegistro.jsp"
                       limpiar();
                   }else
                   {
                       $("#mensaje").html("Problemas al agregar");
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
    $("#txtIdentificacion").val();
    $("#txtNombre").val();
    $("#txtApellido").val();
    $("#txtCorreo").val();
    $("#txtTelefono").val();
    
}
