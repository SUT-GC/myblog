/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-10-02 05:34:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.information;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import empty.User;

public final class information_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>博主信息</title>\r\n");
      out.write("\r\n");
      out.write("<link type=\"text/css\" href=\"css/css.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.11.0.js\"></script>\r\n");
      out.write("  <style>\r\n");
      out.write("  /*导航的css&js开始*/\r\n");
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
      out.write("        body {\r\n");
      out.write("          background-color:#edecec;\r\n");
      out.write("          background-image: url('img/1.jpg');\r\n");
      out.write("          background-position: center;\r\n");
      out.write("          background-repeat:repeat;\r\n");
      out.write("          background-attachment: fixed;\r\n");
      out.write("          background-size: 100%,auto;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        /* basic menu styles */\r\n");
      out.write("        .nav-menu {\r\n");
      out.write("          display: block;\r\n");
      out.write("         /* background: #74adaa;*/\r\n");
      out.write("          width:950px;\r\n");
      out.write("          margin: 50px auto 150px;\r\n");
      out.write("          position: fixed;\r\n");
      out.write("          padding-left: 18%;\r\n");
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
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <!--导航开始-->\r\n");
      out.write("\t<!-- java start -->\r\n");
      out.write("\t");

		//获取Session user
		session = request.getSession();
		User user = null;
		if(session.getAttribute("user") != null){
			user = (User)session.getValue("user");
		}
	
      out.write("\r\n");
      out.write("\t<!-- java end -->\r\n");
      out.write("  <div id=\"nav\">\r\n");
      out.write("    <ul class=\"nav-menu clearfix unstyled\">\r\n");
      out.write("      <li><a href=\"../nav/index.jsp\" class=\"three-d \">\r\n");
      out.write("        主页\r\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">主页</span><span class=\"back\">主页</span></span>\r\n");
      out.write("      </a></li>\r\n");
      out.write("      <li><a href=\"../journal/journal.jsp\" class=\"three-d\">\r\n");
      out.write("        日志\r\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">日志</span><span class=\"back\">日志</span></span>\r\n");
      out.write("      </a></li>\r\n");
      out.write("      <li><a href=\"#\" class=\"three-d\">\r\n");
      out.write("        TA\r\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">TA</span><span class=\"back\">TA</span></span>\r\n");
      out.write("      </a></li>\r\n");
      out.write("      <li><a href=\"#\" class=\"three-d  active\">\r\n");
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
      out.write("      ");

      	if(user == null){
      
      out.write("\r\n");
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
      out.write("      ");
}else{ 
      out.write("\r\n");
      out.write("      <li><a href=\"#\" class=\"three-d\">\r\n");
      out.write("        登陆成功/登出\r\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">登陆成功/登出</span><span class=\"back\">");
      out.print(user.getUser_nick());
      out.write("</span></span></a>\r\n");
      out.write("        <ul class=\"clearfix unstyled drop-menu\">\r\n");
      out.write("          <li><a href=\"/myblog/SessionDo\" class=\"three-d\">\r\n");
      out.write("            登出\r\n");
      out.write("            <span class=\"three-d-box\"><span class=\"front\">登出</span><span class=\"back\">登出</span></span>\r\n");
      out.write("          </a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      ");
} 
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("<!--导航结束-->\r\n");
      out.write("<!--个人信息start-->\r\n");
      out.write("    <div class=\"history\">\r\n");
      out.write("        <div class=\"start-history\">\r\n");
      out.write("            <p class=\"cc_history\">博主信息</p>\r\n");
      out.write("            <p class=\"next_history\">INFORMATIONS</p>\r\n");
      out.write("            <div class=\"history_left\">\r\n");
      out.write("                <p class=\"history_L year2006\">\r\n");
      out.write("                    <span class=\"history_2006_span\">姓名</span>\r\n");
      out.write("                    <b class=\"history_2006_b\">\r\n");
      out.write("                        <span class=\"history_l_month\"><br/></span>\r\n");
      out.write("                        <span class=\"history_l_text\">勾&nbsp&nbsp&nbsp&nbsp超</span>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"history_L year2009\">\r\n");
      out.write("                    <span class=\"history_2006_span\">出生年</span>\r\n");
      out.write("                    <b class=\"history_2006_b\">\r\n");
      out.write("                        <span class=\"history_l_month\"><br/></span>\r\n");
      out.write("                        <span class=\"history_l_text\">1995&nbsp&nbsp年</span>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"history_L yearalmost\">\r\n");
      out.write("                    <span class=\"history_2006_span\">血型</span>\r\n");
      out.write("                    <b class=\"history_2006_b\">\r\n");
      out.write("                        <span class=\"history_l_month\"><br/></span>\r\n");
      out.write("                        <span class=\"history_l_text\">待鉴定</span>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"history_L yearalmost\">\r\n");
      out.write("                    <span class=\"history_2006_span blue\">职业</span>\r\n");
      out.write("                    <b class=\"history_2006_b blue\">\r\n");
      out.write("                        <span class=\"history_l_month\"><br/></span>\r\n");
      out.write("                        <span class=\"history_l_text\">学&nbsp&nbsp生</span>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"history_L yearalmost\">\r\n");
      out.write("                    <span class=\"history_2006_span blue\">婚姻</span>\r\n");
      out.write("                    <b class=\"history_2006_b blue\">\r\n");
      out.write("                        <span class=\"history_l_month\"><br/></span>\r\n");
      out.write("                        <span class=\"history_l_text\">未&nbsp&nbsp婚</span>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"history_L year2011\">\r\n");
      out.write("                    <span class=\"history_2006_span blue\">留白</span>\r\n");
      out.write("                    <b class=\"history_2006_b blue\">\r\n");
      out.write("                        <span class=\"history_l_month\"><br/></span>\r\n");
      out.write("                        <span class=\"history_l_text\">。。。</span>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </p>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"history-img\">\r\n");
      out.write("                <img class=\"history_img\" src=\"images/history.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"history_right\">\r\n");
      out.write("                <p class=\"history_R history_r_2005\">\r\n");
      out.write("                    <span class=\"history_2005_span\">英文名</span>\r\n");
      out.write("                    <b class=\"history_2005_b\">\r\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\r\n");
      out.write("                        <span class=\"history_r_text\">G&nbsp&nbsp&nbsp&nbspC</span>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"history_R yearalmostr\">\r\n");
      out.write("                    <span class=\"history_2005_span\">星座</span>\r\n");
      out.write("                    <b class=\"history_2005_b\">\r\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\r\n");
      out.write("                        <span class=\"history_r_text\">待&nbsp&nbsp查</span>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"history_R yearalmostr\">\r\n");
      out.write("                    <span class=\"history_2005_span\">爱好</span>\r\n");
      out.write("                    <b class=\"history_2005_b\">\r\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\r\n");
      out.write("                        <span class=\"history_r_text\">计算机,Run</span>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"history_R yearalmostr\">\r\n");
      out.write("                    <span class=\"history_2005_span\">出生地</span>\r\n");
      out.write("                    <b class=\"history_2005_b\">\r\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\r\n");
      out.write("                        <span class=\"history_r_text\">辽宁-朝阳</span>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"history_R yearalmostr\">\r\n");
      out.write("                    <span class=\"history_2005_span blue\">学校</span>\r\n");
      out.write("                    <b class=\"history_2005_b blue_R\">\r\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\r\n");
      out.write("                        <span class=\"history_r_text\">沈阳工业大学</span>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"history_R yearalmostr\">\r\n");
      out.write("                    <span class=\"history_2005_span blue\">留白</span>\r\n");
      out.write("                    <b class=\"history_2005_b blue_R\">\r\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\r\n");
      out.write("                        <span class=\"history_r_text\">。。。</span>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"history_R year211\">\r\n");
      out.write("                    <span class=\"history_2005_span blue\">留白</span>\r\n");
      out.write("                    <b class=\"history_2005_b blue_R\">\r\n");
      out.write("                        <span class=\"history_r_month\"><br/></span>\r\n");
      out.write("                        <span class=\"history_r_text\">。。。</span>\r\n");
      out.write("                    </b>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/new_file.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(window).scroll(function(){\r\n");
      out.write("\tvar msg = $(\".history-img\");\r\n");
      out.write("\tvar item = $(\".history_L\");\r\n");
      out.write("\tvar items = $(\".history_R\");\r\n");
      out.write("\tvar windowHeight = $(window).height();\r\n");
      out.write("\tvar Scroll = $(document).scrollTop();\r\n");
      out.write("\tif((msg.offset().top - Scroll -windowHeight)<=0){\r\n");
      out.write("\t\tmsg.fadeIn(1500);\r\n");
      out.write("\t}\r\n");
      out.write("\tfor(var i=0;i<item.length;i++){\r\n");
      out.write("\t\tif(($(item[i]).offset().top - Scroll - windowHeight)<= -100){\r\n");
      out.write("\t\t\t$(item[i]).animate({marginRight:'0px'},'50','swing');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfor(var i=0;i<items.length;i++){\r\n");
      out.write("\t\tif(($(items[i]).offset().top - Scroll - windowHeight)<= -100){\r\n");
      out.write("\t\t\t$(items[i]).animate({marginLeft:'0px'},'50','swing');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<!--个人信息end-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
