package org.apache.jsp.views.conductor;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista de conductores</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/plugins/bootstrap-table/dist/bootstrap-table.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"table-responsive\">\n");
      out.write("            <table class=\"table table-striped table-condensed\" \n");
      out.write("                   data-search=\"true\"\n");
      out.write("                   data-show-columns=\"true\"\n");
      out.write("                   data-toggle=\"table\">\n");
      out.write("\n");
      out.write("                <thead>\n");
      out.write("                <th data-sortable=\"true\">Id</th>\n");
      out.write("                <th data-sortable=\"true\">-</th>\n");
      out.write("                <th data-sortable=\"true\">Nombre</th>\n");
      out.write("                <th data-sortable=\"true\">Correo</th>\n");
      out.write("                <th data-sortable=\"true\">Nombre de usuario</th>\n");
      out.write("                <th data-sortable=\"true\">Fecha nacimiento</th>\n");
      out.write("                <th data-sortable=\"true\">Fecha registro</th>\n");
      out.write("                <th data-sortable=\"true\">Discapacidad</th>\n");
      out.write("                <th data-sortable=\"true\">País</th>\n");
      out.write("                <th data-align=\"center\" data-sortable=\"true\">Tipo</th>\n");
      out.write("                <th data-align=\"center\">Opción</th>\n");
      out.write("                </thead>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <a alt=\"Editar usuario\" title=\"Editar\" href=\"");
      out.print(request.getContextPath());
      out.write("/Conductor/Edit?id=1\" class=\"btn btn-warning btn-xs\">Editar conductor</a>\n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/plugins/bootstrap-table/dist/bootstrap-table.js\"></script>\n");
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
