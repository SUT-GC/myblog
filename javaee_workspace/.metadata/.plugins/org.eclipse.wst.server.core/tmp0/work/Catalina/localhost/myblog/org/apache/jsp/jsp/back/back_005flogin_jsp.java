/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-10-02 08:35:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.back;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import empty.User;

public final class back_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>登陆后台管理</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Admin Theme -->\r\n");
      out.write("        <link href=\"css/bootstrap-admin-theme.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles -->\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            .alert{\r\n");
      out.write("                margin: 0 auto 20px;\r\n");
      out.write("            }\r\n");
      out.write("            .sorrymsgy{\r\n");
      out.write("            \tcolor:#FF9900;\r\n");
      out.write("            }\r\n");
      out.write("            .sorrymsgr{\r\n");
      out.write("            \tcolor: red;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("           <script type=\"text/javascript\" src=\"js/html5shiv.js\"></script>\r\n");
      out.write("           <script type=\"text/javascript\" src=\"js/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bootstrap-admin-without-padding\">\r\n");
      out.write("<!-- java start -->\r\n");

	User user = null;
	int is_admin = 0;
	if(session.getAttribute("user")!= null){
		user = (User)session.getAttribute("user");
		if(user.getUser_isadmin() == 1){
			is_admin = 1;
		}
	}
	
	//验证登陆回来的信息
	String msg = "";
	if(request.getParameter("msg")!=null){
		msg = request.getParameter("msg");
	}

      out.write("\r\n");
      out.write("<!-- java end -->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"alert alert-info\">\r\n");
      out.write("                    <a class=\"close\" data-dismiss=\"alert\" href=\"#\">&times;</a>\r\n");
      out.write("                    请输入正确的管理员用户名和密码！\r\n");
      out.write("                </div>\r\n");
      out.write("                <form method=\"post\" action=\"/myblog/AdminSessionDo\" class=\"bootstrap-admin-login-form\">\r\n");
      out.write("                    <h1>登录</h1>\r\n");
      out.write("                    ");
if(user != null && user.getUser_isadmin() == 1) {
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"username\" placeholder=\"账号\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"password\" name=\"password\" placeholder=\"密码\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>\r\n");
      out.write("                            <input type=\"checkbox\" name=\"remember_me\">\r\n");
      out.write("                           记住密码\r\n");
      out.write("                        </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input class=\"btn btn-lg btn-primary\" type=\"submit\" value=\"提交\"/>\r\n");
      out.write("                    ");
}else{ 
      out.write("\r\n");
      out.write("                    <h2 class=\"sorrymsgy\">对不起，您不是我们的管理员</h2><h1  class=\"sorrymsgr\">您无权登陆</h1><hr/>\r\n");
      out.write("                    <a href=\"javascript:history.go(-1)\">请返回上一个页面~(^_^)~</a>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-2.0.3.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("        \t//判断是否是admin\t\r\n");
      out.write("        \tvar isadmin = '");
      out.print(is_admin);
      out.write("';\r\n");
      out.write("        \tif(isadmin == 0){\r\n");
      out.write("        \t\talert('对不起，您不是我们的管理员');\r\n");
      out.write("        \t}\r\n");
      out.write("        \t\r\n");
      out.write("        \tvar message = '");
      out.print(msg);
      out.write("';\r\n");
      out.write("        \tif(message != \"\"){\r\n");
      out.write("\t        \tif(message == 0){\r\n");
      out.write("\t        \t\talert('对不起，用户名错误');\r\n");
      out.write("\t        \t}else{\r\n");
      out.write("\t        \t\talert('对不起，密码错误');\r\n");
      out.write("\t        \t}\r\n");
      out.write("        \t}\r\n");
      out.write("        \t\r\n");
      out.write("            $(function() {\r\n");
      out.write("                // Setting focus\r\n");
      out.write("                $('input[name=\"email\"]').focus();\r\n");
      out.write("                // Setting width of the alert box\r\n");
      out.write("                var formWidth = $('.bootstrap-admin-login-form').innerWidth();\r\n");
      out.write("                var alertPadding = parseInt($('.alert').css('padding'));\r\n");
      out.write("                $('.alert').width(formWidth - 2 * alertPadding);\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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
