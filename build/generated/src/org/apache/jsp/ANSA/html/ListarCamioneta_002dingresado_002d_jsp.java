package org.apache.jsp.ANSA.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class ListarCamioneta_002dingresado_002d_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
    String nombre= (String)session.getAttribute("nombre");
    
    
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
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("     \n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("    <div class=\"contenedor\">\n");
      out.write("        <h1 onclick=\"window.location='ComprarVehiculo-ingresado-.jsp'\" class=\"icon-cab\">ANSA</h1>\n");
      out.write("        <input type=\"checkbox\" id=\"menu-bar\">\n");
      out.write("        <label class=\"fontawesome-align-justify\" for=\"menu-bar\"></label>\n");
      out.write("                <nav class=\"menu\">\n");
      out.write("                    <a>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                         <a href=\"AgregarVehiculo.jsp\">Publica tu usado</a>\n");
      out.write("                     <a href=\"listarCarro-Ingresado-.jsp\">Carros</a>\n");
      out.write("                    <a href=\"ListarCamioneta-ingresado-.jsp\">Camionetas</a>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <a href=\"Pagina.jsp\">Salir</a>\n");
      out.write("                    </a>\n");
      out.write("                    \n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("</header>\n");
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
      out.write("        ");
 
  Connection conexion;
  String driver="com.mysql.jdbc.Driver";
  String usuario="root";
  String password="";
  String url="jdbc:mysql://localhost:3306/ansa";
  
Class.forName(driver);
conexion=DriverManager.getConnection(url,usuario,password);


PreparedStatement ps;
ResultSet rs;
ps=conexion.prepareStatement("select carro.*,lineamarca.*, tipovehiculo.*, carromarca.*, ciudad.* "
               + " from carro inner join tipovehiculo on carro.carTipoVehiculo=tipovehiculo.idTipoVehiculo "
                + " inner join carromarca on carro.carMarca = carromarca.idCarroMarca "
                + " inner join lineamarca on  carro.carLinea = lineamarca.idLinea "
               + " inner join ciudad on carro.carCiudad=ciudad.idCiudad "
                + " where carro.carTipoVehiculo = 2 ");
rs=ps.executeQuery();

      out.write("\n");
      out.write("    <center>    \n");
      out.write("<table border=\"1\">\n");
      out.write("    \n");
      out.write("        <tr>\n");
      out.write("           <th>Placa</th>\n");
      out.write("                    <th>Linea</th>\n");
      out.write("                    <th>Año</th>\n");
      out.write("                    <th>Kilometraje</th>\n");
      out.write("                    <th>Cilindraje</th>\n");
      out.write("                    <th>Precio</th>\n");
      out.write("                    <th>Tipo de Caja</th>\n");
      out.write("                    <th>Descripción</th>\n");
      out.write("                    <th>Disponible</th>\n");
      out.write("                    <th>Tipo Vehiculo</th>\n");
      out.write("                    <th>Marca</th>\n");
      out.write("                    <th>Ubicación</th>\n");
      out.write("                    <th>Contactar con el vendedor</th>\n");
      out.write("        </tr>\n");
      out.write("        ");
 
        while(rs.next()){
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( rs.getString("carPlaca") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("linNombre") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("carAnio") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("carKilometraje") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("carCilindraje") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("carPrecio") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("carTipoCaja") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("carDescripcion") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("carDispoible") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("TipoVehiculo") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("Marca") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("nombreCiudad") );
      out.write("</td>\n");
      out.write("            <td> <button type=\"button\" class=\"btn btn-dark\">Contactar vendedor</button></td>\n");
      out.write("           \n");
      out.write("        </tr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("</table>\n");
      out.write("    </center>\n");
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
      out.write("                        <img src=\"data:image/jpeg;base64,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\" alt=\"\">\n");
      out.write("                        <h4>Baja</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"info-pet\">\n");
      out.write("                        <img src=\"https://www.cstatic-images.com/car-pictures/xl/usc60kic031c021001.png\" alt=\"\">\n");
      out.write("                        <h4>Media</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"info-pet\">\n");
      out.write("                       \n");
      out.write("                                 <img src=\"https://i.ytimg.com/vi/qRDiTl7nWCs/maxresdefault.jpg\" alt=\"\">\n");
      out.write("                        <h4>Alta</h4>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        \n");
      out.write("        <footer>\n");
      out.write("            <div  class=\"contenedor\">\n");
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
