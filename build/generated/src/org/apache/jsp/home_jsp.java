package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("        }\n");
      out.write("        .banner{\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100vh;\n");
      out.write("            overflow: hidden;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .banner video{\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            object-fit: cover;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            pointer-events: none;\n");
      out.write("        }\n");
      out.write("        .banner .content{\n");
      out.write("            position: relative;\n");
      out.write("            z-index: 1;\n");
      out.write("            max-width: 1000px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .banner .content h1{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-size: 10.5em;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("            color: orange;\n");
      out.write("        }\n");
      out.write("        input{\n");
      out.write("            width: 650px;\n");
      out.write("            height: 200px;\n");
      out.write("            border-radius: 50px;\n");
      out.write("            padding: 20px;\n");
      out.write("            font-size: 50px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            color: orange;\n");
      out.write("        }\n");
      out.write("        input:hover{\n");
      out.write("            background-color: black;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"banner\">\n");
      out.write("            <video autoplay loop muted>\n");
      out.write("                <source type=\"video/mp4\" src=\"picture/Đại học FPT Hà Nội.mp4\">\n");
      out.write("            </video>\n");
      out.write("            <form action=\"\" method=\"post\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h1>Welcome to FPT University</h1>\n");
      out.write("                    <a href=\"list\"><input type=\"button\" class=\"student\" value=\"Student Profile\"/></a>\n");
      out.write("                    <a href=\"list2\"><input type=\"button\" class=\"lecture\" value=\"Feedback About Teaching\"/></a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </form>    \n");
      out.write("        </div>\n");
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
