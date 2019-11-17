<%-- 
    Document   : ComprarVehiculo-ingresado-
    Created on : 26/10/2019, 04:21:44 PM
    Author     : Usuario
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Concesionaria ANSA</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="../Css/fontello.css" rel="stylesheet" type="text/css"/>
        <link href="../css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="../../Css/fontello.css" rel="stylesheet" type="text/css"/>
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        
        <script src="../Js/llistarCarrosCard.js" type="text/javascript"></script>
    </head>
     
    <body>
        <header>
        <div class="contenedor">
            <h1 onclick="" class="icon-cab">ANSA</h1>
            <input type="checkbox" id="menu-bar">
            <label class="fontawesome-align-justify" for="menu-bar"></label>
                    <nav class="menu">
                        <a></a>
                             <a href="AgregarVehiculo.jsp">Publica tu usado</a>
                         <a href="listarCarro-Ingresado-.jsp">Carros</a>
                        <a href="ListarCamioneta-ingresado-.jsp">Camionetas</a>


                        <a href="Pagina.jsp">Salir</a>
                        </a>

                    </nav>
                </div>
        </header>
        
        <main>
            <section id="banner">
                <img src="../imagenes/6.jpg" alt=""/>
                <div class="contenedor">
                    <h2>Automoviles a tu gusto</h2>
                    <p>¿Cuál es tu mejor decisión?</p>
                    <a href="#">Leer más</a>
                    
                </div>
            </section>
            
            <section id="bienvenidos">
            <div class="contenedor">
                <h2>BIENVENIDOS A NUESTRO CLUB</h2>
                <p>Encontraras tu choche ideal , tenemos gamas bajas,medias y altas para que todo se acomode a tu bolsillo , encuentra tu auto favorito y vive una experiencia inolvidable</p>
                </div>
            </section>
            
            <section id="blog">
                <h3>Lo último traido a nuestro concesionario</h3>
                <!-- bootstrap -- 
                <div class="contenedor">
                    <article>
                        
                        <img src="../imagenes/a.jpg" alt=""/>
                        <h4>Lexus ex 2015</h4>
                    </article>
                    <article>
                        <img src="../imagenes/b.jpg" alt=""/>
                        <h4>volkswagen 2017</h4>
                    </article>
                    <article>
                        <img src="../imagenes/c.jpg" alt=""/>
                        
                        <h4>Lexus ex 2018</h4>
                    </article>
                    
                    

                   
                </div>
                -->
            </section>
           
        </main>

    <center>    

       <table id="tblCarros"  class="table table-bordered">
            <thead>
                <tr class="thead-dark">
                    <th>Placa</th>
                    <th>Linea</th>
                    <th>Año</th>
                    <th>Kilometraje</th>
                    <th>Cilindraje</th>
                    <th>Tipo de Caja</th>
                    <th>Disponible</th>
                    <th>Descripcion</th>
                    <th>Tipo de vehiculo</th>
                    <th>Marca</th>
                    <th>Ciudad</th>
                    <th>Accción</th>    
                </tr>
            </thead>
            <tbody>
                <tr id="fila" class="primeraFila">
                    <td id="sLinea"></td>
                    <td id="sAño"></td>
                    <td id="sKilometraje"></td>
                    <td id="sCilindraje"></td>
                    <td id="sPrecio"></td>
                    <td id="sTipoCaja"></td>
                    <td id="sDisponible"></td>
                    <td id="sDescripcion"></td>
                    <td id="sTipo"></td>
                    <td id="sMarca"></td>
                    <td id="sCiudad"></td>
                         <td id="sAccion" align="center">
                             <a href="#" class="btn btn-dark" id="sDetalle">Contactar vendedor
                       
                             </a>
                </tr>
            </tbody>
        </table>
        
    </center>
    <div class="modal" id="modalVendedor">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header bg-info text-white">
                        <h4 class="modal-title">Datos del vendedor</h4>
                        <button type="button" class="text-white close" data-dismiss="modal">&times;</button>
                    </div>
                    <div class="modal-body">
                        <table>
                            <thead>
                                <tr align="center">
                                    <th>Datos ...</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                   <td id="sNombre"></td>
                                    <td id="sApellido"></td>
                                    <td id="sTelefono"></td>
                                    <td id="sCorreo"></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-success" data-dismiss="modal" id="btnRegistrarModal">Enviar mensaje</button>
                        <button type="button" class="btn btn-danger" data-dismiss="modal">No</button>
                    </div>
                </div>
            </div>
         
        </div>
    <footer>
            <div class="contenedor">
                <p class="copy"></p>
                <div class="sociales">
                    </div>
            </div>
        </footer>

            <main>
            <section id="info">
                <h3>Gamas </h3>
                <div class="contenedor">
                    <div class="info-pet">
                        <img src="../imagenes/viejito.jpg" alt=""/>
                        <h4>Baja</h4>
                    </div>
                    <div class="info-pet">
                        <img src="../imagenes/kia.png" alt=""/>
                        <h4>Media</h4>
                    </div>
                    <div class="info-pet">
                       
                                 <img src="../imagenes/Toyotas.jpg" alt="">
                        <h4>Alta</h4>
                    </div>
                    
                </div>
            </section>
        </main>
        
        <footer>
            <div class="contenedor">
                <p class="copy">ANSA &copy; 2019</p>
                <div class="sociales">
                    <a class="fontawesome-facebook-sign" href="#"></a>
                    <a class="fontawesome-twitter" href="#"></a>
                    <a class="fontawesome-camera-retro" href="#"></a>
                    <a class="fontawesome-google-plus-sign" href="#"></a>
                </div>
            </div>
        </footer>
    </body>
</html>
