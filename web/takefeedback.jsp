<%-- 
    Document   : takefeedback
    Created on : Jul 8, 2021, 10:10:29 AM
    Author     : Admin
--%>
<%@page import="dal.lecturer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EDIT FEEDBACK</title>
        <%
            lecturer l = (lecturer) session.getAttribute("listL");

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
                    </table>
                </div>
            </div>
        </header>
        <div style="background-image: url('picture/bg.jpg')">
            <h1>EDIT FEEDBACK</h1>
            <form action="take" method="post">

                <p><b>Sự đúng giờ của giảng viên trong giờ học:</b></p>
                <input type="radio" name="stime" value="4" ${st.gender==4?"checked":""} /><i>Luôn đúng giờ</i>
                <input type="radio" name="stime" value="3" ${st.gender==3?"checked":""} /><i>Phần lớn đúng giờ</i>
                <input type="radio" name="stime" value="2" ${st.gender==2?"checked":""} /><i>Ít khi đúng giờ</i>
                <input type="radio" name="stime" value="1" ${st.gender==1?"checked":""} /><i>Không bao giờ đúng giờ</i>

                <p><b>Đảm bảo khối lượng môn học theo chương trình:</b></p>

                <input type="radio" name="scover" value="4" ${st.gender==4?"checked":""} /><i>Đảm bảo hoàn toàn</i>
                <input type="radio" name="scover" value="3" ${st.gender==3?"checked":""} /><i>Phần lớn đảm bảo</i> 
                <input type="radio" name="scover" value="2" ${st.gender==2?"checked":""} /><i>Chỉ đảm bảo một phần</i>
                <input type="radio" name="scover" value="1" ${st.gender==1?"checked":""} /><i>Không đảm bảo</i>

                <p><b>Đáp ứng của giảng viên về những thắc mắc của học viên trong giờ học:</b></p>

                <input type="radio" name="sresponse" value="4" ${st.gender==4?"checked":""} /><i>Trả lời ngay hoặc cuối các buổi học</i>
                <input type="radio" name="sresponse" value="3" ${st.gender==3?"checked":""} /><i>Trả lời vào buổi học sau</i>
                <input type="radio" name="sresponse" value="2" ${st.gender==2?"checked":""} /><i>Một số câu hỏi không được trả lời</i>
                <input type="radio" name="sresponse" value="1" ${st.gender==1?"checked":""} /><i>Phần lớn câu hỏi không được trả lời</i>


                <p><b>Kỹ năng sư phạm của giảng viên:</b></p>

                <input type="radio" name="sskill" value="4" ${st.gender==4?"checked":""} /><i>Tốt</i>
                <input type="radio" name="sskill" value="3" ${st.gender==3?"checked":""} /><i>Khá</i> 
                <input type="radio" name="sskill" value="2" ${st.gender==2?"checked":""} /><i>Trung bình</i>
                <input type="radio" name="sskill" value="1" ${st.gender==1?"checked":""} /><i>Kém</i>

                <p><b>Hỗ trợ của giảng viên trong và ngoài giờ - trả lời Email, hướng dẫn thực hành, giải đáp thắc mắc…:</b></p>

                <input type="radio" name="ssupport" value="4" ${st.gender==4?"checked":""} /><i>Tốt</i>
                <input type="radio" name="ssupport" value="3" ${st.gender==3?"checked":""} /><i>Khá</i> 
                <input type="radio" name="ssupport" value="2" ${st.gender==2?"checked":""} /><i>Trung bình</i>
                <input type="radio" name="ssupport" value="1" ${st.gender==1?"checked":""} /><i>Kém</i>
                <br>
                <br>
                <input type="submit" value="Edit" class="hover"/>
            </form>
        </div>
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
