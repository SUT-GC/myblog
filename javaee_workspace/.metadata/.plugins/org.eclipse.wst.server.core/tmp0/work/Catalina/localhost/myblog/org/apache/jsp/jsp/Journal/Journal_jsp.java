/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-09-20 11:45:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.Journal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Journal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\" />\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \r\n");
      out.write("\t\t<title>博主日志</title>\r\n");
      out.write("\t\t<meta name=\"description\" content=\"Grid Loading and Hover Effect: Recreating Samsung's grid loading effect\" />\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"grid loading, swipe, effect, slide, masonry, web design, tutorial\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://dreamsky.github.io/main/blog/common/init.css\">\r\n");
      out.write("\t\t<!-- Bootstrap -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"//cdn.bootcss.com/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t/*分类按钮css开始*/\r\n");
      out.write("\t\t.classification{\r\n");
      out.write("\t\t\tmargin-top: 50px;\r\n");
      out.write("\t\t\tpadding-left:15%;\r\n");
      out.write("\t\t\tpadding: 15px 10px;\r\n");
      out.write("\t\t\tborder: solid 2px  #db6d4c;\r\n");
      out.write("\t\t\twidth: 74%;\r\n");
      out.write("\t\t\tmargin-left: 13%;\r\n");
      out.write("\t\t\tborder-radius: 15px;\r\n");
      out.write("\t\t\tfloat: left;\r\n");
      out.write("\t\t\tmargin-bottom: 20px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.cif{\r\n");
      out.write("\t\t\tmargin-left: 10px;\r\n");
      out.write("\t\t\tfloat: left;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/*分类按钮css结束*/\r\n");
      out.write("\r\n");
      out.write("\t\tbody {\r\n");
      out.write("\t\t\tbackground: #9AE7E2;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/*#9AE7E2*/\r\n");
      out.write("\t\t.codrops-demos a.current-demo {\r\n");
      out.write("\t\t\tcolor: #999;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.codrops-header h1 {\r\n");
      out.write("\t\t\tmargin-top: 50px;\r\n");
      out.write("\t\t\tfont-family: 'Microsoft Yahei';\r\n");
      out.write("\t\t\tcolor: black;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/*导航的css&js开始*/\r\n");
      out.write("        @import url(\"http://www.w3cplus.com/demo/css3/base.css\");\r\n");
      out.write("        /*任务一：引入本地字体文件*/\r\n");
      out.write("        @font-face {\r\n");
      out.write("    font-family: 'sansationregular';\r\n");
      out.write("    src: url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.eot');\r\n");
      out.write("    src: url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.eot?#iefix') format('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/embedded-opentype'),\r\n");
      out.write("         url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.woff') format('woff'),\r\n");
      out.write("         url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.ttf') format('truetype'),\r\n");
      out.write("         url('http://www.w3cplus.com/demo/css3/3DAnimationDropdownMenu/sansation_regular-webfont.svg#sansationregular') format('svg');\r\n");
      out.write("    font-weight: normal;\r\n");
      out.write("    font-style: normal;\r\n");
      out.write("}\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        /* basic menu styles */\r\n");
      out.write("        .nav-menu {\r\n");
      out.write("          display: block;\r\n");
      out.write("         /* background: #74adaa;*/\r\n");
      out.write("          width:1000px;\r\n");
      out.write("          margin: 15px auto 0px;\r\n");
      out.write("          padding-left: 5%;\r\n");
      out.write("\t\t  padding-top:3%;\r\n");
      out.write("          z-index: 2;\r\n");
      out.write("        }\r\n");
      out.write("        .nav-menu > li {\r\n");
      out.write("          display: inline;\r\n");
      out.write("          float:left;     \r\n");
      out.write("          border-right:1px solid #94c0be;\r\n");
      out.write("        }\r\n");
      out.write("        .nav-menu > li:last-child {\r\n");
      out.write("          border-right: none;\r\n");
      out.write("        }\r\n");
      out.write("        .nav-menu li a {\r\n");
      out.write("          color: #fff;\r\n");
      out.write("          display: block;\r\n");
      out.write("          text-decoration: none;\r\n");
      out.write("          /*调用本地字体*/\r\n");
      out.write("          font-family:sansationregular;\r\n");
      out.write("          -webkit-font-smoothing: antialiased;\r\n");
      out.write("          -moz-font-smoothing: antialiased;\r\n");
      out.write("          font-smoothing: antialiased;\r\n");
      out.write("          text-transform: capitalize;\r\n");
      out.write("          overflow: visible;\r\n");
      out.write("          line-height: 20px;\r\n");
      out.write("          font-size: 20px;\r\n");
      out.write("          padding: 15px 30px 15px 31px;     \r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        .three-d {\r\n");
      out.write("          /* 任务三、设置3D舞台布景 */\r\n");
      out.write("          -webkit-perspective: 200px;\r\n");
      out.write("          -moz-perspective: 200px;\r\n");
      out.write("          -ms-perspective: 200px;\r\n");
      out.write("          -o-perspective: 200px;\r\n");
      out.write("          perspective: 200px;\r\n");
      out.write("          /*任务四、设置3D舞台布景过渡效果*/\r\n");
      out.write("          -webkit-transition: all .07s linear;\r\n");
      out.write("          -moz-transition: all .07s linear;\r\n");
      out.write("          -ms-transition: all .07s linear;\r\n");
      out.write("          -o-transition: all .07s linear;\r\n");
      out.write("          transition:all .7s linear;\r\n");
      out.write("          position: relative;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .three-d:not(.active):hover {\r\n");
      out.write("          cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        /*任务五、给不是当前状态的3D舞台的悬浮与聚焦状态设置变形效果*/\r\n");
      out.write("        .three-d:not(.active):hover .three-d-box, \r\n");
      out.write("        .three-d:not(.active):focus .three-d-box {\r\n");
      out.write("        -wekbit-transform: translateZ(-25px) rotateX(90deg);\r\n");
      out.write("        -moz-transform: translateZ(-25px) rotateX(90deg);\r\n");
      out.write("        -o-transform: translateZ(-25px) rotateX(90deg);\r\n");
      out.write("        -ms-transform: translateZ(-25px) rotateX(90deg);\r\n");
      out.write("        transform: translateZ(-25px) rotateX(90deg);\r\n");
      out.write("    /*    -webkit-transform:rotateX(90deg) translatez(-25px);*/\r\n");
      out.write("       /*   -webkit-transform:rotatex(90deg);*/\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .three-d-box {\r\n");
      out.write("          /*任务六、给3D舞台中“.three-d-box”设置过渡与变形效果*/\r\n");
      out.write("          -webkit-transition: all .3s ease-out;\r\n");
      out.write("          -moz-transition: all .3s ease-out;\r\n");
      out.write("          -ms-transition: all .3s ease-out;\r\n");
      out.write("          -o-transition: all .3s ease-out;  \r\n");
      out.write("          transition: all .3s ease-out;\r\n");
      out.write("          -webkit-transform: translatez(-25px);\r\n");
      out.write("          -moz-transform: translatez(-25px);\r\n");
      out.write("          -ms-transform: translatez(-25px);\r\n");
      out.write("          -o-transform: translatez(-25px);\r\n");
      out.write("          transform: translatez(-25px);\r\n");
      out.write("          -webkit-transform-style: preserve-3d;\r\n");
      out.write("          -moz-transform-style: preserve-3d;\r\n");
      out.write("          -ms-transform-style: preserve-3d;\r\n");
      out.write("          -o-transform-style: preserve-3d;\r\n");
      out.write("          transform-style: preserve-3d;\r\n");
      out.write("          -webkit-pointer-events: none;\r\n");
      out.write("          -moz-pointer-events: none;\r\n");
      out.write("          -ms-pointer-events: none;\r\n");
      out.write("          -o-pointer-events: none;\r\n");
      out.write("          pointer-events: none;\r\n");
      out.write("          position: absolute;\r\n");
      out.write("          top: 0;\r\n");
      out.write("          left: 0;\r\n");
      out.write("          display: block;\r\n");
      out.write("          width: 100%;\r\n");
      out.write("          height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        /*任务七、给导航设置3D前，与3D后变形效果*/\r\n");
      out.write("        .front {\r\n");
      out.write("            -webkit-transform: rotatex(0deg) translatez(25px);\r\n");
      out.write("            -moz-transform: rotatex(0deg) translatez(25px);\r\n");
      out.write("            -ms-transform: rotatex(0deg) translatez(25px);\r\n");
      out.write("            -o-transform: rotatex(0deg) translatez(25px);\r\n");
      out.write("            transform: rotatex(0deg) translatez(25px);\r\n");
      out.write("         }\r\n");
      out.write("        \r\n");
      out.write("        .back {\r\n");
      out.write("          -webkit-transform: rotatex(-90deg) translatez(25px);\r\n");
      out.write("          -moz-transform: rotatex(-90deg) translatez(25px);\r\n");
      out.write("          -ms-transform: rotatex(-90deg) translatez(25px);\r\n");
      out.write("          -o-transform: rotatex(-90deg) translatez(25px);\r\n");
      out.write("          transform: rotatex(-90deg) translatez(25px);\r\n");
      out.write("          color: #FFE7C4; \r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .front, .back {\r\n");
      out.write("/*          border:1px solid red;*/\r\n");
      out.write("          display: block;\r\n");
      out.write("          width: 100%;\r\n");
      out.write("          height: 100%;\r\n");
      out.write("          position: absolute;\r\n");
      out.write("          top: 0;\r\n");
      out.write("          left: 0;\r\n");
      out.write("          background: #74adaa;\r\n");
      out.write("          padding: 15px 30px 15px 31px; \r\n");
      out.write("          color: white;\r\n");
      out.write("          -webkit-pointer-events: none;\r\n");
      out.write("          -moz-pointer-events: none;\r\n");
      out.write("          -ms-pointer-events: none;\r\n");
      out.write("          -o-pointer-events: none;\r\n");
      out.write("          pointer-events: none;\r\n");
      out.write("          -webkit-box-sizing: border-box;\r\n");
      out.write("          box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("        /*任务八、设置导航当前状态与悬浮状态下的背景效果*/\r\n");
      out.write("        .nav-menu li .active .front,\r\n");
      out.write("        .nav-menu li .active .back,\r\n");
      out.write("        .nav-menu li a:hover .front,\r\n");
      out.write("        .nav-menu li a:hover .back {\r\n");
      out.write("             background-color: #51938f;\r\n");
      out.write("             -webkit-background-size: 5px 5px;\r\n");
      out.write("             background-size: 5px 5px;\r\n");
      out.write("             background-position: 0 0, 30px 30px;\r\n");
      out.write("             background-image: -webit-linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);\r\n");
      out.write("             background-image: -moz-linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);\r\n");
      out.write("             background-image: -ms-linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);\r\n");
      out.write("             background-image: -o-linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);\r\n");
      out.write("             background-image: linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480), linear-gradient(45deg, #478480 25%, transparent 25%, transparent 75%, #478480 75%, #478480);\r\n");
      out.write("        }\r\n");
      out.write("        .nav-menu ul {\r\n");
      out.write("          position: absolute;\r\n");
      out.write("          text-align: left;\r\n");
      out.write("          line-height: 40px;\r\n");
      out.write("          font-size: 14px;\r\n");
      out.write("          width: 200px;\r\n");
      out.write("          -webkit-transition: all 0.3s ease-in;\r\n");
      out.write("          -moz-transition: all 0.3s ease-in;\r\n");
      out.write("          -ms-transition: all 0.3s ease-in;\r\n");
      out.write("          -o-transition: all 0.3s ease-in;\r\n");
      out.write("          transition: all 0.3s ease-in;\r\n");
      out.write("          -webkit-transform-origin: 0px 0px;\r\n");
      out.write("          -moz-transform-origin: 0px 0px;\r\n");
      out.write("          -ms-transform-origin: 0px 0px;\r\n");
      out.write("          -o-transform-origin: 0px 0px;\r\n");
      out.write("          transform-origin: 0px 0px;\r\n");
      out.write("          -webkit-transform: rotateX(-90deg);\r\n");
      out.write("          -moz-transform: rotateX(-90deg);\r\n");
      out.write("          -ms-transform: rotateX(-90deg);\r\n");
      out.write("          -o-transform: rotateX(-90deg);\r\n");
      out.write("          transform: rotateX(-90deg);\r\n");
      out.write("          -webkit-backface-visibility: hidden;\r\n");
      out.write("          -moz-backface-visibility: hidden;\r\n");
      out.write("          -ms-backface-visibility: hidden;\r\n");
      out.write("          -o-backface-visibility: hidden;\r\n");
      out.write("          backface-visibility: hidden;\r\n");
      out.write("        }\r\n");
      out.write("        /*任务九、显示下拉导航菜单，并其设置一个变形效果*/\r\n");
      out.write("        .nav-menu > li:hover ul {\r\n");
      out.write("/*          display: block;*/\r\n");
      out.write("           -webkit-transform: rotateX(0deg);\r\n");
      out.write("           -moz-transform: rotateX(0deg);\r\n");
      out.write("           -ms-transform: rotateX(0deg);\r\n");
      out.write("           -o-transform: rotateX(0deg);\r\n");
      out.write("           transform: rotateX(0deg);\r\n");
      out.write("         }\r\n");
      out.write(" /*导航的css&js结束*/\r\n");
      out.write(" /*搜寻框start*/\r\n");
      out.write(" \t.form{\r\n");
      out.write(" \t\tfloat: right;\r\n");
      out.write(" \t}\r\n");
      out.write(" \t.form-submit{\r\n");
      out.write(" \t\tfloat: right;\r\n");
      out.write(" \t}\r\n");
      out.write(" \t.form-control{\r\n");
      out.write(" \t\twidth: 70%;\r\n");
      out.write(" \t\tfloat: left;\r\n");
      out.write(" \t}\r\n");
      out.write(" \t\r\n");
      out.write(" /*搜寻框end*/\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<script src=\"js/modernizr.custom.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<!--导航开始-->\r\n");
      out.write("  <div id=\"nav\">\r\n");
      out.write("    <ul class=\"nav-menu clearfix unstyled\">\r\n");
      out.write("      <li><a href=\"../nav/index.jsp\" class=\"three-d \">\r\n");
      out.write("        主页\r\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">主页</span><span class=\"back\">主页</span></span>\r\n");
      out.write("      </a></li>\r\n");
      out.write("      <li><a href=\"#\" class=\"three-d active\">\r\n");
      out.write("        日志\r\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">日志</span><span class=\"back\">日志</span></span>\r\n");
      out.write("      </a></li>\r\n");
      out.write("      <li><a href=\"#\" class=\"three-d\">\r\n");
      out.write("        TA\r\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">TA</span><span class=\"back\">TA</span></span>\r\n");
      out.write("      </a></li>\r\n");
      out.write("      <li><a href=\"../information/information.jsp\" class=\"three-d\">\r\n");
      out.write("        博主\r\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">博主</span><span class=\"back\">博主</span></span>\r\n");
      out.write("      </a></li>\r\n");
      out.write("      <li><a href=\"#\" class=\"three-d\">\r\n");
      out.write("        空间\r\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">空间</span><span class=\"back\">空间</span></span>\r\n");
      out.write("      </a></li>\r\n");
      out.write("      <li><a href=\"../editor/messagebox.jsp\" class=\"three-d\">\r\n");
      out.write("        留言板\r\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">留言板</span><span class=\"back\">留言板</span></span>\r\n");
      out.write("      </a></li>\r\n");
      out.write("      <li><a href=\"../back/back_login.jsp\" class=\"three-d\">\r\n");
      out.write("        后台\r\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">后台</span><span class=\"back\">后台</span></span>\r\n");
      out.write("      </a></li>\r\n");
      out.write("      <li><a href=\"#\" class=\"three-d\">\r\n");
      out.write("        登陆/注册\r\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">登陆/注册</span><span class=\"back\">登陆/注册</span></span></a>\r\n");
      out.write("        <ul class=\"clearfix unstyled drop-menu\">\r\n");
      out.write("          <li><a href=\"../login/login.jsp\" class=\"three-d\">\r\n");
      out.write("              登陆\r\n");
      out.write("              <span class=\"three-d-box\"><span class=\"front\">登陆</span><span class=\"back\">登陆</span></span>\r\n");
      out.write("          </a></li>\r\n");
      out.write("          <li><a href=\"../registered/registered.jsp\" class=\"three-d\">\r\n");
      out.write("            注册\r\n");
      out.write("            <span class=\"three-d-box\"><span class=\"front\">注册</span><span class=\"back\">注册</span></span>\r\n");
      out.write("          </a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("<!--导航结束-->\r\n");
      out.write("<!--分类按钮start-->\r\n");
      out.write("\t<div class=\"classification\">\r\n");
      out.write("\t\t<button class=\"btn btn-primary cif\" id=\"java\" type=\"button\">\r\n");
      out.write("\t  \t\tJava\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<button class=\"btn btn-success cif\" id=\"algo\" type=\"button\">\r\n");
      out.write("\t  \t\t算法\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<button class=\"btn btn-info cif\" id=\"hcj\" type=\"button\">\r\n");
      out.write("\t  \t\tHtml/css/js\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<button class=\"btn btn-warning cif\" id=\"life\" type=\"button\">\r\n");
      out.write("\t  \t\t生活随笔\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<button class=\"btn btn-danger cif\" id=\"other\" type=\"button\">\r\n");
      out.write("\t  \t\t读书笔记\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<button class=\"btn btn-primary cif\" id=\"rese1\" type=\"button\">\r\n");
      out.write("\t  \t\t其他\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<button class=\"btn btn-success cif\" type=\"rese2\">\r\n");
      out.write("\t  \t\t预留\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<button class=\"btn btn-info cif\" type=\"rese3\">\r\n");
      out.write("\t  \t\t预留\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<form class=\"form\">\r\n");
      out.write("\t\t   \t<input type=\"text\" class=\"form-control\" placeholder=\"输入可能存在的标题\">\r\n");
      out.write("\t\t\t<inpute type=\"submit\" class=\"btn btn-default form-submit\">Select!</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<!--\r\n");
      out.write("\t\t<form class=\"navbar-form navbar-right\" role=\"search\">\r\n");
      out.write("\t        <div class=\"form-group\">\r\n");
      out.write("\t          <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("\t        </div>\r\n");
      out.write("        \t<button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("      \t</form>\r\n");
      out.write("      \t-->\r\n");
      out.write("\t</div>\r\n");
      out.write("<!--分类按钮end-->\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<section class=\"grid-wrap\">\r\n");
      out.write("\t\t\t\t<ul class=\"grid swipe-down\" id=\"grid\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"journal_each.jsp\"><img src=\"img/1.jpg\" alt=\"img01\"><h3>我的未来不是梦歌词</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/15758125/SQUET-April-2014-issue\"><img src=\"img/2.jpg\" alt=\"img02\"><h3>这是文章的名字</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/15586227/MONOCLE-issue-72\"><img src=\"img/3.jpg\" alt=\"img03\"><h3>MONOCLE issue 72</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/11880495/TOWN-Winter-2013\"><img src=\"img/4.jpg\" alt=\"img04\"><h3>TOWN Winter 2013</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/11455333/Quarterly-Musashino-autumn-of-2013-issue\"><img src=\"img/5.jpg\" alt=\"img05\"><h3>Quarterly Musashino autumn of 2013 issue</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/12866129/MONOCLE-issue-69\"><img src=\"img/6.jpg\" alt=\"img06\"><h3>MONOCLE issue 69</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/16631085/Real-Simple-May-2014\"><img src=\"img/7.jpg\" alt=\"img07\"><h3>Real Simple May 2014</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/11727343/The-65th-Book-Week\"><img src=\"img/8.jpg\" alt=\"img08\"><h3>The 65th Book Week</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/16631085/Real-Simple-May-2014\"><img src=\"img/9.jpg\" alt=\"img09\"><h3>Real Simple May 2014</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/15566747/Quarterly-Musashino-spring-of-2014-issue\"><img src=\"img/10.jpg\" alt=\"img10\"><h3>Quarterly Musashino spring of 2014 issue</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/11134427/MAJESTY-express-vol-01\"><img src=\"img/11.jpg\" alt=\"img11\"><h3>MAJESTY express vol. 01</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/13329103/Shitamachi-Rocket\"><img src=\"img/12.jpg\" alt=\"img12\"><h3>Shitamachi Rocket</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/13285315/Quarterly-Musashino-winter-of-2013-issue\"><img src=\"img/13.jpg\" alt=\"img13\"><h3>Quarterly Musashino winter of 2013 issue</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/16541811/MAINICHI-CHUUGOKUGO-May-2014\"><img src=\"img/14.jpg\" alt=\"img14\"><h3>MAINICHI CHUUGOKUGO April 2014</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/15944679/Kenpo-News-April-2014-issue\"><img src=\"img/1.jpg\" alt=\"img01\"><h3>Kenpo News April 2014 issue</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/15758125/SQUET-April-2014-issue\"><img src=\"img/2.jpg\" alt=\"img02\"><h3>SQUET April 2014 issue</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/15586227/MONOCLE-issue-72\"><img src=\"img/3.jpg\" alt=\"img03\"><h3>MONOCLE issue 72</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/11880495/TOWN-Winter-2013\"><img src=\"img/4.jpg\" alt=\"img04\"><h3>TOWN Winter 2013</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/11455333/Quarterly-Musashino-autumn-of-2013-issue\"><img src=\"img/5.jpg\" alt=\"img05\"><h3>Quarterly Musashino autumn of 2013 issue</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/12866129/MONOCLE-issue-69\"><img src=\"img/6.jpg\" alt=\"img06\"><h3>MONOCLE issue 69</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/16631085/Real-Simple-May-2014\"><img src=\"img/7.jpg\" alt=\"img07\"><h3>Real Simple May 2014</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/11727343/The-65th-Book-Week\"><img src=\"img/8.jpg\" alt=\"img08\"><h3>The 65th Book Week</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/16631085/Real-Simple-May-2014\"><img src=\"img/9.jpg\" alt=\"img09\"><h3>Real Simple May 2014</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/15566747/Quarterly-Musashino-spring-of-2014-issue\"><img src=\"img/10.jpg\" alt=\"img10\"><h3>Quarterly Musashino spring of 2014 issue</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/11134427/MAJESTY-express-vol-01\"><img src=\"img/11.jpg\" alt=\"img11\"><h3>MAJESTY express vol. 01</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/13329103/Shitamachi-Rocket\"><img src=\"img/12.jpg\" alt=\"img12\"><h3>Shitamachi Rocket</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/13285315/Quarterly-Musashino-winter-of-2013-issue\"><img src=\"img/13.jpg\" alt=\"img13\"><h3>Quarterly Musashino winter of 2013 issue</h3></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#/16541811/MAINICHI-CHUUGOKUGO-May-2014\"><img src=\"img/14.jpg\" alt=\"img14\"><h3>MAINICHI CHUUGOKUGO April 2014</h3></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</div><!-- /container -->\r\n");
      out.write("\t\t<div class=\"footer-banner\" style=\"width:728px; margin:160px auto 100px\"></div>\r\n");
      out.write("\t\t<script src=\"js/masonry.pkgd.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/imagesloaded.pkgd.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/classie.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/colorfinder-1.1.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/gridScrollFx.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tnew GridScrollFx( document.getElementById( 'grid' ), {\r\n");
      out.write("\t\t\t\tviewportFactor : 0.4\r\n");
      out.write("\t\t\t} );\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script src=\"http://libs.baidu.com/jquery/1.7.2/jquery.min.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}