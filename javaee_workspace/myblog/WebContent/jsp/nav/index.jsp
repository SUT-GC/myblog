<%@page import="empty.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="../error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="UTF-8">
  <link href="css/news.css" rel="stylesheet">
  <link href="css/nav.css" rel="stylesheet">
  <title>GC的博客</title>
  <style type="text/css">
        body {
          background-color:#edecec;
          background-image: url('img/1.jpg');
          background-position: center;
          background-repeat:repeat;
          background-attachment: fixed;
          background-size: 100%,auto;
        }
        
  </style>
</head>
<body>
<!--导航开始-->
	<!-- java start -->
	<%
		//获取Session user
		session = request.getSession();
		User user = null;
		if(session.getAttribute("user") != null){
			user = (User)session.getValue("user");
		}
		/*
		 *获取服务器返回的是否登出成功的信息ds
		 */
		 String ds = "";
		if(request.getParameter("ds")!=null){
			ds = request.getParameter("ds");
		}
	%>
	<!-- java end -->
  <div id="nav">
    <ul class="nav-menu clearfix unstyled">
      <li><a href="#" class="three-d active">
        主页
        <span class="three-d-box"><span class="front">主页</span><span class="back">主页</span></span>
      </a></li>
      <li><a href="../Journal/Journal.jsp" class="three-d">
        日志
        <span class="three-d-box"><span class="front">日志</span><span class="back">日志</span></span>
      </a></li>
      <li><a href="#" class="three-d">
        TA
        <span class="three-d-box"><span class="front">TA</span><span class="back">TA</span></span>
      </a></li>
      <li><a href="../information/information.jsp" class="three-d">
        博主
        <span class="three-d-box"><span class="front">博主</span><span class="back">博主</span></span>
      </a></li>
      <li><a href="#" class="three-d">
        空间
        <span class="three-d-box"><span class="front">空间</span><span class="back">空间</span></span>
      </a></li>
      <li><a href="../editor/messagebox.jsp" class="three-d">
        留言板
        <span class="three-d-box"><span class="front">留言板</span><span class="back">留言板</span></span>
      </a></li>
      <li><a href="../back/back_login.jsp" class="three-d">
        后台
        <span class="three-d-box"><span class="front">后台</span><span class="back">后台</span></span>
      </a></li>
      <%
      	if(user == null){
      %>
      <li><a href="#" class="three-d">
        登陆/注册
        <span class="three-d-box"><span class="front">登陆/注册</span><span class="back">登陆/注册</span></span></a>
        <ul class="clearfix unstyled drop-menu">
          <li><a href="../login/login.jsp" class="three-d">
              登陆
              <span class="three-d-box"><span class="front">登陆</span><span class="back">登陆</span></span>
          </a></li>
          <li><a href="../registered/registered.jsp" class="three-d">
            注册
            <span class="three-d-box"><span class="front">注册</span><span class="back">注册</span></span>
          </a></li>
        </ul>
      </li>
      <%}else{ %>
      <li><a href="#" class="three-d">
        登陆成功/登出
        <span class="three-d-box"><span class="front">登陆成功/登出</span><span class="back"><%=user.getUser_nick()%></span></span></a>
        <ul class="clearfix unstyled drop-menu">
          <li><a href="/myblog/SessionDo" class="three-d">
            登出
            <span class="three-d-box"><span class="front">登出</span><span class="back">登出</span></span>
          </a></li>
        </ul>
      </li>
      <%} %>
    </ul>
  </div>
<!--导航结束-->
<!--最新更新start--> 
  <div class="center_show">
    <div class="topnews">
        <h1>^_^&nbsp&nbsp<b>文章</b>推荐&nbsp&nbsp^_^</h1>
        <div class="blogs">
          <figure><img src="img/01.jpg"></figure>
          <ul>
            <h3><a href="/">住在手机里的朋友</a></h3>
            <p>通信时代，无论是初次相见还是老友重逢，交换联系方式，常常是彼此交换名片，然后郑重或是出于礼貌用手机记下对方的电话号码。在快节奏的生活里，我们不知不觉中就成为住在别人手机里的朋友。又因某些意外，变成了别人手机里匆忙的过客，这种快餐式的友谊 ...</p>
            <p class="autor"><span class="lm f_l"><a href="/">个人博客</a></span><span class="dtime f_l">2014-02-19</span><span class="viewnum f_r">浏览（<a href="/">459</a>）</span><span class="pingl f_r">评论（<a href="/">30</a>）</span></p>
          </ul>
        </div>
        <div class="blogs">
          <figure><img src="img/02.jpg"></figure>
          <ul>
            <h3><a href="/">教你怎样用欠费手机拨打电话</a></h3>
            <p>初次相识的喜悦，让你觉得似乎找到了知音。于是，对于投缘的人，开始了较频繁的交往。渐渐地，初识的喜悦退尽，接下来就是仅仅保持着联系，平淡到偶尔在节假曰发短信互致问候...</p>
            <p class="autor"><span class="lm f_l"><a href="/">个人博客</a></span><span class="dtime f_l">2014-02-19</span><span class="viewnum f_r">浏览（<a href="/">459</a>）</span><span class="pingl f_r">评论（<a href="/">30</a>）</span></p>
          </ul>
        </div>
        <div class="blogs">
          <figure><img src="img/03.jpg"></figure>
          <ul>
            <h3><a href="/">原来以为，一个人的勇敢是，删掉他的手机号码...</a></h3>
            <p>原来以为，一个人的勇敢是，删掉他的手机号码、QQ号码等等一切，努力和他保持距离。等着有一天，习惯不想念他，习惯他不在身边,习惯时间把他在我记忆里的身影磨蚀干净... </p>
            <p class="autor"><span class="lm f_l"><a href="/">个人博客</a></span><span class="dtime f_l">2014-02-19</span><span class="viewnum f_r">浏览（<a href="/">459</a>）</span><span class="pingl f_r">评论（<a href="/">30</a>）</span></p>
          </ul>
        </div>
        <div class="blogs">
          <figure><img src="img/04.jpg"></figure>
          <ul>
            <h3><a href="/">手机的16个惊人小秘密，据说99.999%的人都不知</a></h3>
            <p>引导语：知道么，手机有备用电池，手机拨号码12593+电话号码=陷阱……手机具有很多你不知道的小秘密，说出来一定很惊奇！不信的话就来看看吧！...</p>
            <p class="autor"><span class="lm f_l"><a href="/">个人博客</a></span><span class="dtime f_l">2014-02-19</span><span class="viewnum f_r">浏览（<a href="/">459</a>）</span><span class="pingl f_r">评论（<a href="/">30</a>）</span></p>
          </ul>
        </div>
        <div class="blogs">
          <figure><img src="img/05.jpg"></figure>
          <ul>
            <h3><a href="/">你面对的是生活而不是手机</a></h3>
            <p>每一次与别人吃饭，总会有人会拿出手机。以为他们在打电话或者有紧急的短信，但用余光瞟了一眼之后发现无非就两件事：1、看小说，2、上人人或者QQ...</p>
            <p class="autor"><span class="lm f_l"><a href="/">个人博客</a></span><span class="dtime f_l">2014-02-19</span><span class="viewnum f_r">浏览（<a href="/">459</a>）</span><span class="pingl f_r">评论（<a href="/">30</a>）</span></p>
          </ul>
        </div>
        <div class="blogs">
          <figure><img src="img/06.jpg"></figure>
          <ul>
            <h3><a href="/">豪雅手机正式发布! 在法国全手工打造的奢侈品</a></h3>
            <p>现在跨界联姻，时尚、汽车以及运动品牌联合手机制造商联合发布手机产品在行业里已经不再新鲜，上周我们给大家报道过著名手表制造商瑞士泰格·豪雅（Tag Heuer） 联合法国的手机制造商Modelabs发布的一款奢华手机的部分谍照，而近日该手机终于被正式发布了...</p>
            <p class="autor"><span class="lm f_l"><a href="/">个人博客</a></span><span class="dtime f_l">2014-02-19</span><span class="viewnum f_r">浏览（<a href="/">459</a>）</span><span class="pingl f_r">评论（<a href="/">30</a>）</span></p>
          </ul>
        </div>
        <div class="blogs">
          <figure><img src="img/04.jpg"></figure>
          <ul>
            <h3><a href="/">手机的16个惊人小秘密，据说99.999%的人都不知</a></h3>
            <p>引导语：知道么，手机有备用电池，手机拨号码12593+电话号码=陷阱……手机具有很多你不知道的小秘密，说出来一定很惊奇！不信的话就来看看吧！...</p>
            <p class="autor"><span class="lm f_l"><a href="/">个人博客</a></span><span class="dtime f_l">2014-02-19</span><span class="viewnum f_r">浏览（<a href="/">459</a>）</span><span class="pingl f_r">评论（<a href="/">30</a>）</span></p>
          </ul>
        </div>
      </div>
    </div>
  </div>
<!--最新更新end-->
<!--留白start-->
  <div class="blank">Designed and built with all the love in the world by <a href="#">@GC</a></div>
  <div class="blank-bottom">用爱创造世界</div>
<!--留白end-->
</body>
</html>
  <script type="text/javascript">
	var ds = "";
	ds = <%=ds%>;
	if(ds == 1){
		alert("登出成功，跳转到微博主页");
	}
  </script>