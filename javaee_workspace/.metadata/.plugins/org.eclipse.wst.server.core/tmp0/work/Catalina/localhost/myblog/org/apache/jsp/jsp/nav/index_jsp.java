/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-10-02 05:26:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.nav;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import empty.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"../error.jsp", true, 8192, true);
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
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <link href=\"css/news.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/nav.css\" rel=\"stylesheet\">\r\n");
      out.write("  <title>GC的博客</title>\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("        body {\r\n");
      out.write("          background-color:#edecec;\r\n");
      out.write("          background-image: url('img/1.jpg');\r\n");
      out.write("          background-position: center;\r\n");
      out.write("          background-repeat:repeat;\r\n");
      out.write("          background-attachment: fixed;\r\n");
      out.write("          background-size: 100%,auto;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--导航开始-->\r\n");
      out.write("\t<!-- java start -->\r\n");
      out.write("\t");

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
	
      out.write("\r\n");
      out.write("\t<!-- java end -->\r\n");
      out.write("  <div id=\"nav\">\r\n");
      out.write("    <ul class=\"nav-menu clearfix unstyled\">\r\n");
      out.write("      <li><a href=\"#\" class=\"three-d active\">\r\n");
      out.write("        主页\r\n");
      out.write("        <span class=\"three-d-box\"><span class=\"front\">主页</span><span class=\"back\">主页</span></span>\r\n");
      out.write("      </a></li>\r\n");
      out.write("      <li><a href=\"../Journal/Journal.jsp\" class=\"three-d\">\r\n");
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
      out.write("<!--最新更新start--> \r\n");
      out.write("  <div class=\"center_show\">\r\n");
      out.write("    <div class=\"topnews\">\r\n");
      out.write("        <h1>^_^&nbsp&nbsp<b>文章</b>推荐&nbsp&nbsp^_^</h1>\r\n");
      out.write("        <div class=\"blogs\">\r\n");
      out.write("          <figure><img src=\"img/01.jpg\"></figure>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <h3><a href=\"/\">住在手机里的朋友</a></h3>\r\n");
      out.write("            <p>通信时代，无论是初次相见还是老友重逢，交换联系方式，常常是彼此交换名片，然后郑重或是出于礼貌用手机记下对方的电话号码。在快节奏的生活里，我们不知不觉中就成为住在别人手机里的朋友。又因某些意外，变成了别人手机里匆忙的过客，这种快餐式的友谊 ...</p>\r\n");
      out.write("            <p class=\"autor\"><span class=\"lm f_l\"><a href=\"/\">个人博客</a></span><span class=\"dtime f_l\">2014-02-19</span><span class=\"viewnum f_r\">浏览（<a href=\"/\">459</a>）</span><span class=\"pingl f_r\">评论（<a href=\"/\">30</a>）</span></p>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"blogs\">\r\n");
      out.write("          <figure><img src=\"img/02.jpg\"></figure>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <h3><a href=\"/\">教你怎样用欠费手机拨打电话</a></h3>\r\n");
      out.write("            <p>初次相识的喜悦，让你觉得似乎找到了知音。于是，对于投缘的人，开始了较频繁的交往。渐渐地，初识的喜悦退尽，接下来就是仅仅保持着联系，平淡到偶尔在节假曰发短信互致问候...</p>\r\n");
      out.write("            <p class=\"autor\"><span class=\"lm f_l\"><a href=\"/\">个人博客</a></span><span class=\"dtime f_l\">2014-02-19</span><span class=\"viewnum f_r\">浏览（<a href=\"/\">459</a>）</span><span class=\"pingl f_r\">评论（<a href=\"/\">30</a>）</span></p>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"blogs\">\r\n");
      out.write("          <figure><img src=\"img/03.jpg\"></figure>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <h3><a href=\"/\">原来以为，一个人的勇敢是，删掉他的手机号码...</a></h3>\r\n");
      out.write("            <p>原来以为，一个人的勇敢是，删掉他的手机号码、QQ号码等等一切，努力和他保持距离。等着有一天，习惯不想念他，习惯他不在身边,习惯时间把他在我记忆里的身影磨蚀干净... </p>\r\n");
      out.write("            <p class=\"autor\"><span class=\"lm f_l\"><a href=\"/\">个人博客</a></span><span class=\"dtime f_l\">2014-02-19</span><span class=\"viewnum f_r\">浏览（<a href=\"/\">459</a>）</span><span class=\"pingl f_r\">评论（<a href=\"/\">30</a>）</span></p>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"blogs\">\r\n");
      out.write("          <figure><img src=\"img/04.jpg\"></figure>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <h3><a href=\"/\">手机的16个惊人小秘密，据说99.999%的人都不知</a></h3>\r\n");
      out.write("            <p>引导语：知道么，手机有备用电池，手机拨号码12593+电话号码=陷阱……手机具有很多你不知道的小秘密，说出来一定很惊奇！不信的话就来看看吧！...</p>\r\n");
      out.write("            <p class=\"autor\"><span class=\"lm f_l\"><a href=\"/\">个人博客</a></span><span class=\"dtime f_l\">2014-02-19</span><span class=\"viewnum f_r\">浏览（<a href=\"/\">459</a>）</span><span class=\"pingl f_r\">评论（<a href=\"/\">30</a>）</span></p>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"blogs\">\r\n");
      out.write("          <figure><img src=\"img/05.jpg\"></figure>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <h3><a href=\"/\">你面对的是生活而不是手机</a></h3>\r\n");
      out.write("            <p>每一次与别人吃饭，总会有人会拿出手机。以为他们在打电话或者有紧急的短信，但用余光瞟了一眼之后发现无非就两件事：1、看小说，2、上人人或者QQ...</p>\r\n");
      out.write("            <p class=\"autor\"><span class=\"lm f_l\"><a href=\"/\">个人博客</a></span><span class=\"dtime f_l\">2014-02-19</span><span class=\"viewnum f_r\">浏览（<a href=\"/\">459</a>）</span><span class=\"pingl f_r\">评论（<a href=\"/\">30</a>）</span></p>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"blogs\">\r\n");
      out.write("          <figure><img src=\"img/06.jpg\"></figure>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <h3><a href=\"/\">豪雅手机正式发布! 在法国全手工打造的奢侈品</a></h3>\r\n");
      out.write("            <p>现在跨界联姻，时尚、汽车以及运动品牌联合手机制造商联合发布手机产品在行业里已经不再新鲜，上周我们给大家报道过著名手表制造商瑞士泰格·豪雅（Tag Heuer） 联合法国的手机制造商Modelabs发布的一款奢华手机的部分谍照，而近日该手机终于被正式发布了...</p>\r\n");
      out.write("            <p class=\"autor\"><span class=\"lm f_l\"><a href=\"/\">个人博客</a></span><span class=\"dtime f_l\">2014-02-19</span><span class=\"viewnum f_r\">浏览（<a href=\"/\">459</a>）</span><span class=\"pingl f_r\">评论（<a href=\"/\">30</a>）</span></p>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"blogs\">\r\n");
      out.write("          <figure><img src=\"img/04.jpg\"></figure>\r\n");
      out.write("          <ul>\r\n");
      out.write("            <h3><a href=\"/\">手机的16个惊人小秘密，据说99.999%的人都不知</a></h3>\r\n");
      out.write("            <p>引导语：知道么，手机有备用电池，手机拨号码12593+电话号码=陷阱……手机具有很多你不知道的小秘密，说出来一定很惊奇！不信的话就来看看吧！...</p>\r\n");
      out.write("            <p class=\"autor\"><span class=\"lm f_l\"><a href=\"/\">个人博客</a></span><span class=\"dtime f_l\">2014-02-19</span><span class=\"viewnum f_r\">浏览（<a href=\"/\">459</a>）</span><span class=\"pingl f_r\">评论（<a href=\"/\">30</a>）</span></p>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("<!--最新更新end-->\r\n");
      out.write("<!--留白start-->\r\n");
      out.write("  <div class=\"blank\">Designed and built with all the love in the world by <a href=\"#\">@GC</a></div>\r\n");
      out.write("  <div class=\"blank-bottom\">用爱创造世界</div>\r\n");
      out.write("<!--留白end-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("\tvar ds = \"\";\r\n");
      out.write("\tds = ");
      out.print(ds);
      out.write(";\r\n");
      out.write("\tif(ds == 1){\r\n");
      out.write("\t\talert(\"登出成功，跳转到微博主页\");\r\n");
      out.write("\t}\r\n");
      out.write("  </script>");
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
