/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-10-02 03:12:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>用户登陆</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <!-- CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/supersized.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("            <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body oncontextmenu=\"return false\">\r\n");
      out.write("\t\t<!-- java start -->\r\n");
      out.write("\t\t");

			String rs = "";
			if(request.getParameter("Rm")!=null){
				rs = request.getParameter("Rm");
			}
			String ls = "";
			if(request.getParameter("Lm")!=null){
				ls = request.getParameter("Lm");
			}
			System.out.println("rs = "+rs+"/ls = "+ls);
		
      out.write("\r\n");
      out.write("\t\t<!-- java end -->\r\n");
      out.write("        \t<div class=\"page-container\">\r\n");
      out.write("            <h1>Login</h1>\r\n");
      out.write("            <form action=\"/myblog/LoginDo\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"username\" class=\"username\" placeholder=\"账号\"  autocomplete=\"off\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("                <div>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\" class=\"password\" placeholder=\"密码\"     oncontextmenu=\"return false\" onpaste=\"return false\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--  \r\n");
      out.write("                <button id=\"submit\" type=\"button\">登陆</button>\r\n");
      out.write("                -->\r\n");
      out.write("                <input type = \"submit\" id=\"submit\" type=\"button\" value=\"登陆\" />\r\n");
      out.write("           \t</form>\r\n");
      out.write("\t        <form >\r\n");
      out.write("\t          \t<button id=\"register\" type=\"button\" onclick=\"toRegister()\">注册</button>\r\n");
      out.write("\t        </form>\r\n");
      out.write("            <div class=\"connect\">\r\n");
      out.write("                <p>You cannot improve your past, but you can improve your future. </p>\r\n");
      out.write("\t\t\t\t<p style=\"margin-top:20px;\">你不能改变你的过去，但你可以让你的未来变得更美好。</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t<div class=\"alert\" style=\"display:none\">\r\n");
      out.write("\t\t\t<h2>消息</h2>\r\n");
      out.write("\t\t\t<div class=\"alert_con\">\r\n");
      out.write("\t\t\t\t<p id=\"ts\"></p>\r\n");
      out.write("\t\t\t\t<p style=\"line-height:70px\"><a class=\"btn\">确定</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Javascript -->\r\n");
      out.write("\t\t<script src=\"http://apps.bdimg.com/libs/jquery/1.6.4/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js/supersized.3.2.7.min.js\"></script>\r\n");
      out.write("        <script src=\"js/supersized-init.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\tvar rs = '");
      out.print(rs);
      out.write("';\r\n");
      out.write("\t\t\tvar ls = '");
      out.print(ls);
      out.write("';\r\n");
      out.write("\t\t\tif(rs != \"\" && rs == '1'){\r\n");
      out.write("\t\t\t\t$(\"#ts\").html('恭喜您，注册成功，请登录 ! ');\r\n");
      out.write("\t\t\t\tis_show();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar lmsg = \"\";\r\n");
      out.write("\t\t\tif(ls != \"\"){\r\n");
      out.write("\t\t\t\tif(ls == 0){\r\n");
      out.write("\t\t\t\t\tlmsg += \"对不起, 账号或密码不能为空 ! \";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(ls == 1){\r\n");
      out.write("\t\t\t\t\tlmsg += \"恭喜您，登陆成功 ! \";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(ls == 2){\r\n");
      out.write("\t\t\t\t\tlmsg += \"对不起, 账号不存在 ! \";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(ls == 3){\r\n");
      out.write("\t\t\t\t\tlmsg += \"对不起, 密码错误 ! \";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(lmsg != \"\"){\r\n");
      out.write("\t\t\t\t\t$(\"#ts\").html(lmsg);\r\n");
      out.write("\t\t\t\t\tis_show();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\".btn\").click(function(){\r\n");
      out.write("\t\t\tis_hide();\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\tvar u = $(\"input[name=username]\");\r\n");
      out.write("\t\tvar p = $(\"input[name=password]\");\r\n");
      out.write("\t\t$(\"#submit\").live('click',function(){\r\n");
      out.write("\t\t\tif(u.val() == '' || p.val() =='')\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\t$(\"#ts\").html(\"用户名或密码不能为空~\");\r\n");
      out.write("\t\t\t\tis_show();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\tvar reg = /^([a-zA-Z0-9]+[_|\\_|\\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\\_|\\.]?)*[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$/;\r\n");
      out.write("\t\t\t\tif(!reg.exec(u.val()))\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t$(\"#ts\").html(\"用户名错误格式\");\r\n");
      out.write("\t\t\t\t\tis_show();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tfunction toRegister(){\r\n");
      out.write("\t\t\t window.location.href='../registered/registered.jsp';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\twindow.onload = function()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t$(\".connect p\").eq(0).animate({\"left\":\"0%\"}, 600);\r\n");
      out.write("\t\t\t$(\".connect p\").eq(1).animate({\"left\":\"0%\"}, 400);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction is_hide(){ $(\".alert\").animate({\"top\":\"-40%\"}, 300) }\r\n");
      out.write("\t\tfunction is_show(){ $(\".alert\").show().animate({\"top\":\"45%\"}, 300) }\r\n");
      out.write("\t\t</script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
