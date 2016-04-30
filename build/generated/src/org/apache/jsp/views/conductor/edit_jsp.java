package org.apache.jsp.views.conductor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Editar conductor</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <h1>Editar conductor</h1>\n");
      out.write("                <form method=\"post\" action=\"");
      out.print( request.getContextPath());
      out.write("/Conductor/Update\">\n");
      out.write("                    <div class=\"col-md-12 form-group\">\n");
      out.write("                        <label for=\"cedula\">Número de cédula: </label>\n");
      out.write("                        <input id=\"cedula\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conductor.cedula}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"cedula\" type=\"text\" class=\"form-control\" required=\"\"></input>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 form-group\">\n");
      out.write("                        <label for=\"nombre\">Nombre completo: </label>\n");
      out.write("                        <input id=\"nombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conductor.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"nombre\" type=\"text\" class=\"form-control\" required=\"\"></input>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 form-group\">\n");
      out.write("                        <label for=\"fecha_nac\">Fecha nacimiento: </label>\n");
      out.write("                        <input id=\"fecha_nac\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conductor.fechaNac}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"fecha_nac\" class=\"form-control date\" required=\"\"></input>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 form-group\">\n");
      out.write("                        <label for=\"telefono\">Telefono: </label>\n");
      out.write("                        <input id=\"telefono\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conductor.telefono}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"telefono\" type=\"text\" class=\"form-control\" required=\"\"></input>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 form-group\">\n");
      out.write("                        <label for=\"direccion\">Direccion: </label>\n");
      out.write("                        <input id=\"direccion\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${conductor.direccion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"direccion\" type=\"text\" class=\"form-control\" required=\"\"></input>\n");
      out.write("                    </div>\n");
      out.write("                    <hr/>\n");
      out.write("                    <div class=\"col-md-12 form-group\">\n");
      out.write("                        <input type=\"submit\" value=\"Editar conductor\" class=\"btn btn-primary\"></input>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/js/bootstrap.js\"></script>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(\"input.date\").datepicker({dateFormat:\"dd/mm/yy\"});\n");
      out.write("        </script>\n");
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
