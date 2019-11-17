
<%@page import="Modelo.Entidad.UsuarioRegistro"%>
<%@page import="Modelo.Datos.datosPersona"%>
<%@page import="Modelo.Entidad.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.Datos.Conexion"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            String mensaje="<br><b>Prueba de Conexion a la Base de Datos</b>";
            out.print(mensaje);
            Connection con=Conexion.getConexion();
            out.print("<br>" + Conexion.getMensaje());
            
            UsuarioRegistro unUsuario= new UsuarioRegistro("1","Sara","Trujillo","123","s@.com","1");
            datosPersona dPersona= new datosPersona();
            boolean agregado = dPersona.agregarRegistro(unUsuario);
            out.print("Resultado agregar aprendiz " + dPersona.getMensaje());
         %>
    </body>
</html>
