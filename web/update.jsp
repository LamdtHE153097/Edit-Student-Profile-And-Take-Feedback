<%-- 
    Document   : update
    Created on : Jul 18, 2021, 4:54:33 PM
    Author     : Admin
--%>
<%@page import="dal.student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update information</title>
        <%
            student s = (student) session.getAttribute("listE");

        %> 
    </head>
    <body>
        <style>
            .black{
                background-color: black;
            }
            .orange{
                color: orange;
            }
            .orange2{
                background-color: orange;
            }
            .fr{
                float: right;
            }
            table thead tr{
                background-color: darkkhaki;
            }
            .hover{
                border-radius: 20px;
                width: 100px
            }
            .hover:hover{
                background-color: olive;
                position: relative;
                left: 50px;
            }
        </style>
    <body>
        <header><div class="orange2">
                <div>
                    <h1><span><img src="picture/frog.gif" style="width: 30%" alt="frog"></span>
                    </h1>
                </div>
                <div class="" >
                    <table>
                        <tr>
                            <td><a href="https://apps.apple.com/app/id1527723314">
                                    <img src="https://fap.fpt.edu.vn/images/app-store.svg" style="width: 150px; height: 100px; border-image: 20px" alt="apple store"></a></td>
                            <td><a href="https://play.google.com/store/apps/details?id=com.fuct">
                                    <img src="https://fap.fpt.edu.vn/images/play-store.svg" style="width: 150px; height: 100px; border-image: 20px" alt="google store"></a></td>

                        </tr>
                        </tbody></table>
                </div>
            </div>
        </header>
        <div class="panel-heading" style="text-align: center; background-color: graytext; padding: 3px">
            <h3 class="panel-title"><b>Update Profile</b></h3>
            <h4><em> Đây là những thông tin quan trọng, được nhà trường dùng để in bằng tốt nghiệp, bảng điểm tốt nghiệp và các chứng chỉ cấp cho sinh viên, ngoài ra còn để báo cáo các Bộ ngành liên quan nên sinh viên cần nhập thông tin đầy đủ, chính xác.</em></h4>
        </div>
        <form action="update" method="POST">
            <table border="1" style="margin: 0 auto; background-image: url('picture/bg.jpg'); width: 100%">
                <tbody>
                    <tr>
                        <td><i>Date of birth</i></td>
                        <td><i>
                                <input type="text" name="sdate" value="<%=s.getDateOfBirth()%>"/>
                            </i></td>
                    </tr>
                    <tr>
                        <td><i>Gender</i></td>
                        <td>
                            <input type="radio" name="sgender" value="<%=s.getGender() %> " ${s.gender==1?"checked":""} />Male
                            <input type="radio" name="sgender" value="<%=s.getGender() %> " ${s.gender==0?"checked":""} />FeMale
                            
                        </td>
                    </tr>
                    <tr>
                        <td><i>ID Card</i></td>
                        <td>
                            <input type="text" name="sid" value="<%=s.getIDCard()%>" />
                        </td>
                    </tr>
                    <tr>
                        <td><i>Phone number</i></td>
                        <td>
                            <input type="text" name="sphone" value="<%=s.getPhoneNumber()%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td><i>Email</i></td>
                        <td>
                            <input type="text" name="smail" value="<%=s.getEmail()%>"/>
                        </td>
                    </tr>
                    <tr>
                        <td><i>
                                <input type="submit" class="hover" value="Update" />
                            </i></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>
        </form>
        <footer style="text-align: center">
            <table width="100%" style="border: 1px solid transparent;" id="cssTable">
                <tbody><tr>
                        <td>
                            <div id="ctl00_divSupport">
                                <br>
                                <b>Mọi góp ý, thắc mắc xin liên hệ: </b><span style="color: rgb(34, 34, 34); font-family: arial, sans-serif; font-size: 13.333333969116211px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: normal; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: auto; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); display: inline !important; float: none;">Phòng dịch vụ sinh viên</span>: Email: <a href="mailto:dichvusinhvien@fe.edu.vn">dichvusinhvien@fe.edu.vn</a>.
                                Điện thoại: <span class="style1" style="color: rgb(34, 34, 34); font-family: arial, sans-serif; font-size: 13.333333969116211px; font-style: normal; font-variant: normal; letter-spacing: normal; line-height: normal; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: auto; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); display: inline !important; float: none;">(024)7308.13.13 </span>
                                <br>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <p style="text-align: center">
                                © Powered by <a href="http://fpt.edu.vn" target="_blank">FPT University</a>&nbsp;|&nbsp;
                                <a href="http://cms.fpt.edu.vn/" target="_blank">CMS</a>&nbsp;|&nbsp; <a href="http://library.fpt.edu.vn" target="_blank">library</a>&nbsp;|&nbsp; <a href="http://library.books24x7.com" target="_blank">books24x7</a>
                                <span id="ctl00_lblHelpdesk"></span>
                            </p>
                        </td>
                    </tr>
                </tbody></table>
        </footer>
    </body>
</html>
