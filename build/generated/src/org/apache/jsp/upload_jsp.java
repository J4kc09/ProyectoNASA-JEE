package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>File Upload to Database Demo</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <center>\n");
      out.write("        <h1>File Upload to Database Demo</h1>\n");
      out.write("        <form method=\"post\" action=\"uploadServlet\" enctype=\"multipart/form-data\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>ID: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"id\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>SISTEMA ID: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"sistema_id\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>IMAGEN: </td>\n");
      out.write("                    <td><input type=\"file\" name=\"imagen\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                    <td>NOMBRE: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"nombre\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                    <td>DIAMETRO: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"diametro\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                    <td>DISTACIA ESTRELLA: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"dist_estrella\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                    <td>SATELITES: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"satelites\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                    <td>TIPO: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"tipo\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                    <td>MASA: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"masa\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                    <td>ENANO: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"enano\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                    <td>VERIFICADO: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"verificado\" size=\"50\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" value=\"Guardar\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>");
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
