package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentfeedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>List of feedback</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            .black{\n");
      out.write("                background-color: black;\n");
      out.write("            }\n");
      out.write("            .orange{\n");
      out.write("                color: orange;\n");
      out.write("            }\n");
      out.write("            .orange2{\n");
      out.write("                background-color: orange;\n");
      out.write("            }\n");
      out.write("            .fr{\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("            table thead tr{\n");
      out.write("                background-color: darkkhaki;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <header><div class=\"orange2\">\n");
      out.write("\n");
      out.write("                <div class=\"\" >\n");
      out.write("\n");
      out.write("                    <h1><span><img src=\"picture/frog.gif\" style=\"width: 30%\" alt=\"frog\"></span>\n");
      out.write("                    </h1>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\" >\n");
      out.write("                    <table>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"https://apps.apple.com/app/id1527723314\">\n");
      out.write("                                    <img src=\"https://fap.fpt.edu.vn/images/app-store.svg\" style=\"width: 150px; height: 100px; border-image: 20px\" alt=\"apple store\"></a></td>\n");
      out.write("                            <td><a href=\"https://play.google.com/store/apps/details?id=com.fuct\">\n");
      out.write("                                    <img src=\"https://fap.fpt.edu.vn/images/play-store.svg\" style=\"width: 150px; height: 100px; border-image: 20px\" alt=\"google store\"></a></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        </tbody></table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("         <div >\n");
      out.write("            <span class=\"orange\">\n");
      out.write("                <a href=\"home.jsp\" style=\"text-decoration: none; font-family: sans-serif; font-size: 30px\"><i>Back to home</i></a>\n");
      out.write("                <img src=\"picture/house.jpg\" style=\"width: 50px\" height=\"50px\" alt=\"house\">\n");
      out.write("            </span>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <b style=\"font-size: 50px\">List of Lecturers</b>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Name of Lecturer</th>\n");
      out.write("                    <th>Subject</th>\n");
      out.write("                    <th>Click below to take feedback</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
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
