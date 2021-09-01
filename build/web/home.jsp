<%-- 
    Document   : home
    Created on : Jul 6, 2021, 10:02:26 AM
    Author     : Admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <style>
        body{
            margin: 0;
            padding: 0;
            font-family: 'Poppins', sans-serif;
        }
        .banner{
            width: 100%;
            height: 100vh;
            overflow: hidden;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .banner video{
            position: absolute;
            top: 0;
            left: 0;
            object-fit: cover;
            width: 100%;
            height: 100%;
            pointer-events: none;
        }
        .banner .content{
            position: relative;
            z-index: 1;
            max-width: 1000px;
            margin: 0 auto;
            text-align: center;
        }
        .banner .content h1{
            margin: 0;
            padding: 0;
            font-size: 10.5em;
            text-transform: uppercase;
            color: orange;
        }
        input{
            width: 650px;
            height: 200px;
            border-radius: 50px;
            padding: 20px;
            font-size: 50px;
            margin-bottom: 20px;
            color: orange;
        }
        input:hover{
            background-color: black;
        }
    </style>
    <body>
        <div class="banner">
            <video autoplay loop muted>
                <source type="video/mp4" src="picture/Đại học FPT Hà Nội.mp4">
            </video>
            <form action="" method="post">
                <div class="content">
                    <h1>Welcome to FPT University</h1>
                    <a href="list"><input type="button" class="student" value="Student Profile"/></a>
                    <a href="list2"><input type="button" class="lecture" value="Feedback About Teaching"/></a>
                </div>
            </form>    
        </div>
    </body>
</html>
