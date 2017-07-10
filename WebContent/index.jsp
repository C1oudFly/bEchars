<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>bigData</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" href="css/demo.css">

    <style type="text/css">
        body {
            background: #8080C0;
        }

        div#my-content {
            height: 0;
        }

        #my-header h1 {
            font-size: 41px;
            font-weight: normal;
            line-height: 160px;
            background-color: #E8E8FF;
            color: black;
            font-family: SimHei;
            font-weight: 900;
        }

        .main {
            width: 80%;
            min-height: 878px;
            float: right;
        }

        iframe {
            width: 100%;
            min-height: 878px;
        }

        #content {
            background: #e2e1dd;
            width: 100%;
            height: 100%;
        }

        div img {
            margin-left: 3%;
            margin-right: 10%;
            margin-top: 5px;
            height: 150px;
            float: left;
        }

        .login {
            float: right;
            margin-right: 10%;
            margin-top: 3%;
            color: #fff;
        }

        .dropdown li > ul li a {
            color: #fff;
        }

        .dropdown li a {
            color: #fff;
            font-size: 20px;
            font-weight: 500;
        }

        .dropdown li.selected {
            background-color: #CCCCCC;
        }
        .dropdown li > ul li > ul li{
            padding: 0px 30px;
        }
    </style>
</head>
<body>
<div id="my-header">
    <div>
        <img src="images/logo.png">
        <div class="login"></div>
    </div>
    <div align="center"><h1>电商网站的大数据分析</h1></div>
</div>

<div id="my-content">
    <ul class="dropdown">
        <li>
            <a href="#">用户访问信息分析模块</a>
            <ul>
                <li class="l"><a href="show_user_info.jsp" target="content">用户分析</a></li>
                <li class="l"><a href="show_member_info.jsp" target="content">会员分析</a></li>
                <li class="l"><a href="show_session_info.jsp" target="content">会话分析</a></li>
            </ul>
        </li>
        <li>
            <a href="#">浏览器信息分析模块</a>
            <ul>
                <li class="l"><a href="show_browseruser_info.jsp" target="content">浏览器用户分析</a></li>
                <li class="l"><a href="show_browsermember_info.jsp" target="content">浏览器会员分析</a></li>
                <li class="l"><a href="show_browsersession_info.jsp" target="content">浏览器会话分析</a></li>
                <li class="l"><a href="show_browserpv_info.jsp" target="content">浏览器PV分析</a></li>
            </ul>
        </li>
        <li>
            <a href="#">地域信息分析模块</a>
            <ul>
                <li class="l"><a href="region.jsp" target="content">活跃访客地域分析</a></li>
                <li class="l"><a href="jump_rate.jsp" target="content">跳出率分析</a></li>
            </ul>
        </li>
        <li>
            <a href="#">用户访问深度分析模块</a>
            <ul>
                <li class="l"><a href="show_visitdepth_info.jsp" target="content">访问深度</a></li>
            </ul>
        </li>
        <li>
            <a href="#">外链数据分析模块</a>
            <ul>
                <li class="l"><a href="show_external_info.jsp" target="content">外链分析</a></li>
            </ul>
        </li>
        <li>
            <a href="#">订单数据分析模块</a>
            <ul>
                <li class="l"><a href="show_order_info.jsp" target="content">总览</a></li>
            </ul>
        </li>
    </ul>
</div>
<div class="main">
    <iframe id="content" name="content" scrolling="no" src="home_page.jsp"></iframe>
</div>
<script src="js/jquery-1.11.0.min.js"></script>
<script src="js/tendina.js"></script>
<script>
    $('.dropdown').tendina({
        animate: true,
        speed: 300,
        openCallback: function ($clickedEl) {
            console.log($clickedEl);
        },
        closeCallback: function ($clickedEl) {
            console.log($clickedEl);
        }
    })
</script>

</body>
</html>