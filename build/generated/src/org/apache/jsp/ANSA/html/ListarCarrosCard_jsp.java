package org.apache.jsp.ANSA.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ListarCarrosCard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Concesionaria ANSA</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"../Css/fontello.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../../Css/fontello.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <script src=\"../Js/llistarCarrosCard.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("     \n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            <h1 onclick=\"\" class=\"icon-cab\">ANSA</h1>\n");
      out.write("            <input type=\"checkbox\" id=\"menu-bar\">\n");
      out.write("            <label class=\"fontawesome-align-justify\" for=\"menu-bar\"></label>\n");
      out.write("                    <nav class=\"menu\">\n");
      out.write("                        <a></a>\n");
      out.write("                             <a href=\"AgregarVehiculo.jsp\">Publica tu usado</a>\n");
      out.write("                         <a href=\"listarCarro-Ingresado-.jsp\">Carros</a>\n");
      out.write("                        <a href=\"ListarCamioneta-ingresado-.jsp\">Camionetas</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <a href=\"Pagina.jsp\">Salir</a>\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <main>\n");
      out.write("            <section id=\"banner\">\n");
      out.write("                <img src=\"../imagenes/6.jpg\" alt=\"\"/>\n");
      out.write("                <div class=\"contenedor\">\n");
      out.write("                    <h2>Automoviles a tu gusto</h2>\n");
      out.write("                    <p>¿Cuál es tu mejor decisión?</p>\n");
      out.write("                    <a href=\"#\">Leer más</a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("            <section id=\"bienvenidos\">\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <h2>BIENVENIDOS A NUESTRO CLUB</h2>\n");
      out.write("                <p>Encontraras tu choche ideal , tenemos gamas bajas,medias y altas para que todo se acomode a tu bolsillo , encuentra tu auto favorito y vive una experiencia inolvidable</p>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("            <section id=\"blog\">\n");
      out.write("                <h3>Lo último traido a nuestro concesionario</h3>\n");
      out.write("                <!-- bootstrap -- \n");
      out.write("                <div class=\"contenedor\">\n");
      out.write("                    <article>\n");
      out.write("                        \n");
      out.write("                        <img src=\"../imagenes/a.jpg\" alt=\"\"/>\n");
      out.write("                        <h4>Lexus ex 2015</h4>\n");
      out.write("                    </article>\n");
      out.write("                    <article>\n");
      out.write("                        <img src=\"../imagenes/b.jpg\" alt=\"\"/>\n");
      out.write("                        <h4>volkswagen 2017</h4>\n");
      out.write("                    </article>\n");
      out.write("                    <article>\n");
      out.write("                        <img src=\"../imagenes/c.jpg\" alt=\"\"/>\n");
      out.write("                        \n");
      out.write("                        <h4>Lexus ex 2018</h4>\n");
      out.write("                    </article>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                -->\n");
      out.write("            </section>\n");
      out.write("           \n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("    <center>    \n");
      out.write("\n");
      out.write("       <table id=\"tblCarros\"  class=\"table table-bordered\">\n");
      out.write("            <thead>\n");
      out.write("                <tr class=\"thead-dark\">\n");
      out.write("                    <th>Placa</th>\n");
      out.write("                    <th>Linea</th>\n");
      out.write("                    <th>Año</th>\n");
      out.write("                    <th>Kilometraje</th>\n");
      out.write("                    <th>Cilindraje</th>\n");
      out.write("                    <th>Tipo de Caja</th>\n");
      out.write("                    <th>Disponible</th>\n");
      out.write("                    <th>Descripcion</th>\n");
      out.write("                    <th>Tipo de vehiculo</th>\n");
      out.write("                    <th>Marca</th>\n");
      out.write("                    <th>Ciudad</th>\n");
      out.write("                    <th>Accción</th>    \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr id=\"fila\" class=\"primeraFila\">\n");
      out.write("                    <td id=\"sLinea\"></td>\n");
      out.write("                    <td id=\"sAño\"></td>\n");
      out.write("                    <td id=\"sKilometraje\"></td>\n");
      out.write("                    <td id=\"sCilindraje\"></td>\n");
      out.write("                    <td id=\"sPrecio\"></td>\n");
      out.write("                    <td id=\"sTipoCaja\"></td>\n");
      out.write("                    <td id=\"sDisponible\"></td>\n");
      out.write("                    <td id=\"sDescripcion\"></td>\n");
      out.write("                    <td id=\"sTipo\"></td>\n");
      out.write("                    <td id=\"sMarca\"></td>\n");
      out.write("                    <td id=\"sCiudad\"></td>\n");
      out.write("                         <td id=\"sAccion\" align=\"center\">\n");
      out.write("                             <a href=\"#\" class=\"btn btn-dark\" id=\"sDetalle\">Contactar vendedor\n");
      out.write("                       \n");
      out.write("                             </a>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("    <div class=\"modal\" id=\"modalVendedor\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header bg-info text-white\">\n");
      out.write("                        <h4 class=\"modal-title\">Datos del vendedor</h4>\n");
      out.write("                        <button type=\"button\" class=\"text-white close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <table>\n");
      out.write("                            <thead>\n");
      out.write("                                <tr align=\"center\">\n");
      out.write("                                    <th>Datos ...</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                   <td id=\"sNombre\"></td>\n");
      out.write("                                    <td id=\"sApellido\"></td>\n");
      out.write("                                    <td id=\"sTelefono\"></td>\n");
      out.write("                                    <td id=\"sCorreo\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-success\" data-dismiss=\"modal\" id=\"btnRegistrarModal\">Enviar mensaje</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">No</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("    <footer>\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <p class=\"copy\"></p>\n");
      out.write("                <div class=\"sociales\">\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("            <main>\n");
      out.write("            <section id=\"info\">\n");
      out.write("                <h3>Gamas </h3>\n");
      out.write("                <div class=\"contenedor\">\n");
      out.write("                    <div class=\"info-pet\">\n");
      out.write("                        <img src=\"../imagenes/viejito.jpg\" alt=\"\"/>\n");
      out.write("                        <h4>Baja</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"info-pet\">\n");
      out.write("                        <img src=\"../imagenes/kia.png\" alt=\"\"/>\n");
      out.write("                        <h4>Media</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"info-pet\">\n");
      out.write("                       \n");
      out.write("                                 <img src=\"../imagenes/Toyotas.jpg\" alt=\"\">\n");
      out.write("                        <h4>Alta</h4>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("        <footer>\n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("                <p class=\"copy\">ANSA &copy; 2019</p>\n");
      out.write("                <div class=\"sociales\">\n");
      out.write("                    <a class=\"fontawesome-facebook-sign\" href=\"#\"></a>\n");
      out.write("                    <a class=\"fontawesome-twitter\" href=\"#\"></a>\n");
      out.write("                    <a class=\"fontawesome-camera-retro\" href=\"#\"></a>\n");
      out.write("                    <a class=\"fontawesome-google-plus-sign\" href=\"#\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
