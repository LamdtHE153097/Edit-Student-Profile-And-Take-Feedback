<%@page import="dal.DAO"%>
<%@page import="java.util.List"%>
<%@page import="dal.lecturer"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : studentfeedback
    Created on : Jul 8, 2021, 10:09:26 AM
    Author     : Admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List of feedback</title>
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
            table tr td{
                text-align: center;
            }
            .button {
                background-color: Crimson;
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
                background-color: #e7e7e7; 
                color: coral;
            }
            .button:hover {
                background-color: #4CAF50; /* Green */
                color: white;
            }
            .button1 {
                display: inline-block;
                border-radius: 4px;
                /*background-color: #f4511e;*/
                border: none;
                color: #FFFFFF;
                text-align: center;
                font-size: 15px;
                padding: 0px;
                width: 150px;
                transition: all 0.5s;
                cursor: pointer;
                margin: 5px;
            }
            .button1 span {
                cursor: pointer;
                display: inline-block;
                position: relative;
                transition: 0.5s;
            }
            .button1 span:after {
                content: '\00bb';
                position: absolute;
                opacity: 0;
                top: 0;
                right: -20px;
                transition: 0.5s;
            }
            .button1:hover span {
                padding-right: 25px;
            }
            .button1:hover span:after {
                opacity: 1;
                right: 0;
            }
        </style>
        <header><div class="orange2">
                <div class="" >
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
        <div style="line-height: 50px">
            <button style="border-radius: 20px " class="button">
                <a href="home.jsp" style="text-decoration: none; font-family: sans-serif; font-size: 30px"><i>Back to home</i></a>
            </button>
        </div>
        <b style="font-size: 50px">List of Lecturers</b>
        <br>
        <br>
        <table border="1" width="100%" height="auto" text-align="center">
            <thead>
                <tr>
                    <th>Name of Lecturer</th>
                    <th>Subject</th>
                    <th>Sự đúng giờ của giảng viên</th>
                    <th>Đảm bảo khối lượng môn học</th>
                    <th>Trả lời những thắc mắc của học viên</th>
                    <th>Kỹ năng sư phạm</th>
                    <th>Hỗ trợ trong và ngoài giờ học</th>
                    <th>Click below to take feedback</th>
                </tr>
            </thead>
            <tbody style="background-color: #444; color: orange">
                <%
                    List<lecturer> listL = (List<lecturer>) request.getAttribute("listL");
                    lecturer l = (lecturer) session.getAttribute("listL");
                %>
                <% for (lecturer o : listL) {%>
                <tr>
                    <td><i>
                            <%= o.getLecName()%>
                        </i></td>
                    <td><i>
                            <%= o.getSubject()%>
                        </i></td>
                    <td><i>
                            <%= o.getTime()%>
                        </i></td>
                    <td><i>
                            <%= o.getCover()%>
                        </i></td>
                    <td><i>
                            <%= o.getResponse()%>
                        </i></td>
                    <td><i>
                            <%= o.getSkill()%>
                        </i></td>
                    <td><i>
                            <%= o.getSupport()%>
                        </i></td>
                    <td><i>
                            <button class="button1"><a href="take?name=<%= o.getLecName()%>"><span>Take feedback<span></a></button>
                                            </i></td>
                                            </tr>
                                            <%}%>
                                            </tbody>
                                            </table>
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
