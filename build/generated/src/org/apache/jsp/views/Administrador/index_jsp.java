package org.apache.jsp.views.Administrador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Panel Administrador</title>\r\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath());
      out.write("/views/Administrador/css/bootstrap.min.css\">\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-2\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"");
      out.print(request.getContextPath());
      out.write("/views/Administrador/index.jsp\">STPI</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-2\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li class=\"active\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/Conductores\">Conductores <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("          <li class=\"dropdown\">\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Buses <span class=\"caret\"></span></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/views/Administrador/Buses/index.jsp\">Listar Buses</a></li>\r\n");
      out.write("            <li><a href=\"#\">Monitoreo de Rutas</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("          <li class=\"dropdown\">\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Transfer <span class=\"caret\"></span></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/views/Administrador/Transfer/index.jsp\">Listar Transfer</a></li>\r\n");
      out.write("            <li><a href=\"#\">Monitoreo de Rutas</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/views/Administrador/Bicis/index.jsp\">Bici-Agil</a></li>\r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/views/Administrador/Clientes/index.jsp\">Clientes</a></li>\r\n");
      out.write("       \r\n");
      out.write("      </ul>\r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\">Salir</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("      <div class=\"alert alert-dismissible alert-success\">\r\n");
      out.write("  <button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\r\n");
      out.write("  <strong>Acceso correcto!</strong> Bienvenido <a href=\"#\" class=\"alert-link\">Sistema de transporte publico integrado</a>.\r\n");
      out.write("</div>\r\n");
      out.write("    </header>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\r\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/views/Administrador/js/bootstrap.min.js\"></script>\r\n");
      out.write("           \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
