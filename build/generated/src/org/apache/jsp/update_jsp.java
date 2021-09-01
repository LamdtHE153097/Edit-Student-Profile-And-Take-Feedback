package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Update information</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("        .black{\n");
      out.write("            background-color: black;\n");
      out.write("        }\n");
      out.write("        .orange{\n");
      out.write("            color: orange;\n");
      out.write("        }\n");
      out.write("        .orange2{\n");
      out.write("            background-color: orange;\n");
      out.write("        }\n");
      out.write("        .fr{\n");
      out.write("            float: right;\n");
      out.write("        }\n");
      out.write("        table thead tr{\n");
      out.write("            background-color: darkkhaki;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
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
      out.write("        <form action=\"update\" method=\"POST\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Full Name</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"sname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.FullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Date of birth</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"sdate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.DateOfBirth}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Gender</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"radio\" name=\"sgender\" value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.gender==1?\"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" />Male\n");
      out.write("                            <input type=\"radio\" name=\"sgender\" value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.gender==0?\"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" />FeMale\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>ID Card</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"sid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.IDCard}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Phone number</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"sphone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.PhoneNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"smail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.Email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"submit\" value=\"Update\" />\n");
      out.write("                        </td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("                        <footer style=\"text-align: center\">\n");
      out.write("            <table width=\"100%\" style=\"border: 1px solid transparent;\" id=\"cssTable\">\n");
      out.write("\n");
      out.write("                <tbody><tr>\n");
      out.write("                        <td>\n");
      out.write("                            <div id=\"ctl00_divSupport\">\n");
      out.write("                                <br>\n");
      out.write("                                <b>Mọi góp ý, thắc mắc xin liên hệ: </b><span style=\"color: rgb(34, 34, 34); font-family: arial, sans-serif; font-size: 13.333333969116211px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: normal; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: auto; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); display: inline !important; float: none;\">Phòng dịch vụ sinh viên</span>: Email: <a href=\"mailto:dichvusinhvien@fe.edu.vn\">dichvusinhvien@fe.edu.vn</a>.\n");
      out.write("                                Điện thoại: <span class=\"style1\" style=\"color: rgb(34, 34, 34); font-family: arial, sans-serif; font-size: 13.333333969116211px; font-style: normal; font-variant: normal; letter-spacing: normal; line-height: normal; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: auto; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); display: inline !important; float: none;\">(024)7308.13.13 </span>\n");
      out.write("                                <br>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <p style=\"text-align: center\">\n");
      out.write("                                © Powered by <a href=\"http://fpt.edu.vn\" target=\"_blank\">FPT University</a>&nbsp;|&nbsp;\n");
      out.write("                                <a href=\"http://cms.fpt.edu.vn/\" target=\"_blank\">CMS</a>&nbsp;|&nbsp; <a href=\"http://library.fpt.edu.vn\" target=\"_blank\">library</a>&nbsp;|&nbsp; <a href=\"http://library.books24x7.com\" target=\"_blank\">books24x7</a>\n");
      out.write("                                <span id=\"ctl00_lblHelpdesk\"></span>\n");
      out.write("                            </p>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody></table>\n");
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
