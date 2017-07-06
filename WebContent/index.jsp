<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
	<div class="header">
		<div class="header-left">
			<div class="logo">
				<a href="index.html"><img src="images/logo.png" alt=""></a>
			</div>
			<div class="top-nav">
				<ul >
					<li class="active" ><a href="index.html" >首页</a></li>
					<li><a href="show_user_info.jsp"  target="content" class="black1" >用户基本信息分析</a></li>
					<li><a href="show_browser_info.jsp"  target="content" class="black2" >浏览器信息分析</a></li>
					<li><a href="show_ip_info.jsp"  target="content" class="black3" >地域信息分析</a></li>
					<li><a href="show_depth_info.jsp"  target="content" class="black4" >用户深度分析</a></li>
					<li><a href="show_external_info.jsp"  target="content" class="black5" >外链数据分析</a></li>
					<li><a href="show_order_info.jsp"  target="content" class="black6" >订单分析</a></li>
				</ul>
			</div>
		</div>
		<script>
			$("span.menu").click(function(){
				$(".top-nav-in ul").slideToggle(500, function(){
				});
			});
		</script>
	</div>
	<div class="main">
		<h1>电商网站的大数据分析</h1>
		<iframe id="content" name="content" scrolling="no" src="show_user_info.jsp" style="display: true"></iframe>
	</div>
</body>
</html>