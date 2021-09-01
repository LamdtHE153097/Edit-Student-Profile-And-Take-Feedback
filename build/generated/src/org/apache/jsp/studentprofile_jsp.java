package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dal.student;

public final class studentprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
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
      out.write("        table tr{\n");
      out.write("            text-align: center;\n");
      out.write("        }  \n");
      out.write("        .button {\n");
      out.write("  background-color: Crimson;\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 15px 32px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
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
      out.write("        <br>\n");
      out.write("       \n");
      out.write("        <div >\n");
      out.write("            <span class=\"orange\">\n");
      out.write("                <button style=\"border-radius: 20px \" class=\"button\">  \n");
      out.write("                    \n");
      out.write("                    <a href=\"home.jsp\" style=\"text-decoration: none; font-family: sans-serif; font-size: 30px\"><i>Back to home</i></a>\n");
      out.write("                    \n");
      out.write("                </button>\n");
      out.write("            </span>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("<!--        <div class=\"panel-heading\" style=\"text-align: center; background-color: graytext; padding: 3px\">\n");
      out.write("            <h3 class=\"panel-title\"><b>Update Profile</b></h3>\n");
      out.write("            <h4><em> Đây là những thông tin quan trọng, được nhà trường dùng để in bằng tốt nghiệp, bảng điểm tốt nghiệp và các chứng chỉ cấp cho sinh viên, ngoài ra còn để báo cáo các Bộ ngành liên quan nên sinh viên cần nhập thông tin đầy đủ, chính xác.</em></h4>\n");
      out.write("        </div>-->\n");
      out.write("<div style=\"float: left\">\n");
      out.write("        <b style=\"font-size: 50px\">Student Information</b>\n");
      out.write("        <br>\n");
      out.write("        <img src=\"picture/male.jpg\" style=\"width: 200px; height: 200px\">\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("        <br>\n");
      out.write("        <div style=\"float: right\">\n");
      out.write("            <b style=\"font-size: 50px\">Profile</b>\n");
      out.write("            <table border=\"1\" width=\"90%\" height=\"auto\" text-align=\"center\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Full name</th>\n");
      out.write("                    <th>Date of birth</th>\n");
      out.write("                    <th>Gender</th>\n");
      out.write("                    <th>ID Card</th>\n");
      out.write("                    <th>Phone Number</th>\n");
      out.write("                    <th>Email</th>\n");
      out.write("                    <th>Do you want to update your profile?</th>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    student s=(student)session.getAttribute("listE");
                    
                
      out.write(" \n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( s.getFullName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( s.getDateOfBirth() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( s.getGender() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( s.getIDCard() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( s.getPhoneNumber() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( s.getEmail() );
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"update?name=");
      out.print( s.getFullName() );
      out.write("\">Update</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("        <footer style=\"text-align: center\">\n");
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
