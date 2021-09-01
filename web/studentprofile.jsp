<%@page import="dal.student"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : studentprofile
    Created on : Jul 8, 2021, 10:08:48 AM
    Author     : Admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Profile</title>
    </head>
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
        table tr{
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
    <body>
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
        <br>

        <div >
            <span class="orange">
                <button style="border-radius: 20px " class="button">
                    <a href="home.jsp" style="text-decoration: none; font-family: sans-serif; font-size: 30px"><i>Back to home</i></a>
                </button>
            </span>
        </div>
        <div style="float: left">
            <b style="font-size: 50px">Student Information</b>
            <br>
            <img src="picture/male.jpg" style="width: 500px; height: auto">
            <br>
        </div>
        <br>
        <div style="float: right">
            <b style="font-size: 50px">Profile</b>
            <table border="1" width="90%" height="100px" text-align="center">
                <thead>
                    <tr>
                        <th>Full name</th>
                        <th>Date of birth</th>
                        <th>Gender</th>
                        <th>ID Card</th>
                        <th>Phone Number</th>
                        <th>Email</th>
                        <th>Do you want to update your profile?</th>
                    </tr>
                </thead>
                <tbody style="background-color:#444; color: orange">
                    <%
                        student s = (student) session.getAttribute("listE");

                    %> 
                    <tr>
                        <td><i><%= s.getFullName()%></i></td>
                        <td><i><%= s.getDateOfBirth()%></i></td>
                        <td><i><%= s.getGender()%></i></td>
                        <td><i><%= s.getIDCard()%></i></td>
                        <td><i><%= s.getPhoneNumber()%></i></td>
                        <td><i><%= s.getEmail()%></i></td>
                        <td>
                            <button class="button1"><a href="update?name=<%= s.getFullName()%>"><span>Update</span></a></button>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
        <footer style="text-align: center; clear: both">
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
