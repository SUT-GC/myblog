/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-10-01 15:26:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.registered;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Encryption.Base64;
import java.util.Arrays;

public final class registered_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>GC博客用户注册</title>\r\n");
      out.write("<script id=\"jquery_183\" type=\"text/javascript\" class=\"library\" src=\"js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- java start -->\r\n");

	request.setCharacterEncoding("utf-8");
	String errmsg = "";
	System.out.println("~"+request.getParameter("Rm")+"~");
	if(request.getParameter("Rm")!=null){
		errmsg = request.getParameter("Rm");
		String[] errmsga = errmsg.split(" ");
		errmsg ="";
		
		if(errmsga[0].equals("0")){
			errmsg += "该邮箱已经被注册,请重新填写 \\n";
		}else{
			if(errmsga[0].equals("-1"))
				errmsg += "邮箱格式不符，请重新填写 \\n";
			if(errmsga[0].equals("-2"))
				errmsg += "邮箱不能为空 \\n";
			if(errmsga[1].equals("-2"))
				errmsg += "昵称不能为空 \\n";
			if(errmsga[2].equals("-2"))
				errmsg += "密码需要6-16个字符 \\n";
			if(errmsga[2].equals("0"))
				errmsg += "密码不能为空 \\n";
			if(errmsga[3].equals("-2"))
				errmsg += "两次密码输入不一致 \\n";
		}
	}
	System.out.print(errmsg);

      out.write("\r\n");
      out.write("<!-- java end -->\r\n");
      out.write("<div class=\"back\">\r\n");
      out.write("<div id=\"top\"><h1>用户注册</h1></div>\r\n");
      out.write("<div class=\"form-bak\">\r\n");
      out.write("<form method=\"post\" action=\"/myblog/LoginDo\" >\r\n");
      out.write("<div class=\"left\">\r\n");
      out.write("<div class=\"line\" id=\"line_account\">\r\n");
      out.write("<div class=\"info\">\r\n");
      out.write("<strong>邮箱(Email)</strong>\r\n");
      out.write("<span class=\"tips\">邮箱就是账号</span>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"input\">\r\n");
      out.write("<input type=\"text\" name=\"email\" id=\"account\" onblur=\"v_account();\" onkeyup=\"v_account();\"/>\r\n");
      out.write("<div class=\"none\">\r\n");
      out.write("<span></span>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"line\" id=\"line_name\">\r\n");
      out.write("<div class=\"info\">\r\n");
      out.write("<strong>昵称(Nick)</strong>\r\n");
      out.write("<span class=\"tips\">只能由数字、文字或下划线组成<br />最多32个字符</span>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"input\">\r\n");
      out.write("<input type=\"text\" name=\"nick\" id=\"name\" onblur=\"v_name();\" onkeyup=\"v_name();\" />\r\n");
      out.write("<div class=\"none\">\r\n");
      out.write("<span></span>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"line\" id=\"line_password\">\r\n");
      out.write("<div class=\"info\">\r\n");
      out.write("<strong>密码(PassW)</strong>\r\n");
      out.write("<span class=\"tips\">6至16个字符</span>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"input\">\r\n");
      out.write("<input type=\"password\" name=\"password\" id=\"password\" onblur=\"v_password();\" onkeyup=\"v_password();\" />\r\n");
      out.write("<div class=\"none\">\r\n");
      out.write("<span></span>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"line\" id=\"line_repeat\">\r\n");
      out.write("<div class=\"info\">\r\n");
      out.write("<strong>确认密码</strong>\r\n");
      out.write("<span class=\"tips\">再次输入密码</span>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"input\">\r\n");
      out.write("<input type=\"password\" name=\"repeatpassword\" id=\"repeat\" onblur=\"v_repeat();\" onkeyup=\"v_repeat();\" />\r\n");
      out.write("<div class=\"none\">\r\n");
      out.write("<span></span>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"right\">\r\n");
      out.write("<input type=\"submit\" id=\"submit\" value=\"完成注册\" disabled=\"disabled\"/>\r\n");
      out.write("<div class=\"readagreement-wrap\" onclick=\"onReadAgreementClick();\">\r\n");
      out.write("<input type=\"checkbox\" name=\"agree\" id=\"agree\" onchange=\"v_submitbutton();\" />\r\n");
      out.write("同意《<a id=\"readagreement\" href=\"#agreement\" onclick=\"showAgreement();\" title=\"查看用户使用协议\">用户使用协议</a>》\r\n");
      out.write("</div>\r\n");
      out.write("<div>已有账号？<a href=\"../login/login.jsp\">直接登录</a></div>\r\n");
      out.write("<div>不想注册？<a href=\"../nav/index.jsp\">返回博客</a></div>\r\n");
      out.write("<div>忘记密码？<a href=\"#\">联系管理员</a></div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"agreement\" class=\"agreement\" style=\"display:none;\">\r\n");
      out.write("<h1>用户使用协议</h1>\r\n");
      out.write("<iframe src=\"\"></iframe>\r\n");
      out.write("<input type=\"button\" value=\"同意\" onclick=\"agree();\"/>\r\n");
      out.write("<a href=\"#\" class=\"backtotop\" >返回顶部</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<style>* { font-family:\"微软雅黑\",\"黑体\",\"宋体\"; color:#333;}\r\n");
      out.write("a {color:#069;}\r\n");
      out.write("body {margin:0; padding:0; background:#ddd;  background: url('img/registered_bg.jpg');\r\n");
      out.write("  background-size: 100%,auto;}\r\n");
      out.write(".form-bak {width:800px; height:400px; margin:40px auto; background:#eee; border-radius:10px; box-shadow:0 2px 8px #999;}\r\n");
      out.write(".left {float:left; width:500px; height:400px;}\r\n");
      out.write(".line {width:100%; height:80px; margin:16px 0 0 0;}\r\n");
      out.write(".info {float:left; height:100%; width:200px;}\r\n");
      out.write(".info strong, .info span {display:block; text-align:right;}\r\n");
      out.write(".info strong {font-size:24px; line-height:36px; margin-top:10px; color:#333; }\r\n");
      out.write(".info span {font-size:12px; line-height:24px; color:#666; font-family:\"微软雅黑\",\"宋体\"; }\r\n");
      out.write(".input input {background:none; border:none; outline:none; font-size:18px; line-height:40px; height:40px; width:240px; padding:9px 0 9px 9px; border-radius:10px;}\r\n");
      out.write(".input {float:right; width:278px; height:58px; background:#f6f6f6; border:1px solid #999; border-radius:10px; box-shadow:inset 0 2px 5px #999; margin:10px 0; position:relative; }\r\n");
      out.write(".error,.corect {height:20px; width:20px; position:absolute; top:19px; right:9px; background:url(\"js/ICON_20.svg\") no-repeat 0 -20px;}\r\n");
      out.write(".error span {display:block; position:absolute; top:30px; right:20px; background:#fcc; border:1px solid #f33; font-size:12px; line-height:16px; color:#600; padding:6px 10px 4px 10px; border-radius:5px; opacity:.8; white-space:nowrap; overflow:hidden;}\r\n");
      out.write(".corect {background-position:0 0;}\r\n");
      out.write(".corect span{display:none;}\r\n");
      out.write(".none {display:none;}\r\n");
      out.write("\r\n");
      out.write(".right {float:right; width:260px; height:360px; margin:20px 0 0 0; border-left:1px solid #ccc;}\r\n");
      out.write("input[type=submit] {background:none; border:none; outline:none; margin:0; padding:0; cursor:pointer;\r\n");
      out.write("font-size:40px; height:200px; width:200px; background:#369; margin:20px 30px 0 30px; color:#eee;}\r\n");
      out.write("input[type=submit]:disabled {background:#999; cursor:no-drop;}\r\n");
      out.write(".right div { margin:0 30px; width:200px; height:30px; line-height:30px; text-align:center;}\r\n");
      out.write(".readagreement-wrap {margin:20px 30px!important; outline:1px solid #f99;}\r\n");
      out.write("\r\n");
      out.write("#top h1 {font-size:30px; line-height:40px; padding:10px; text-align:center;}\r\n");
      out.write(".agreement,#top {width:800px; margin:20px auto; background:#eee; border-radius:10px; box-shadow:0 2px 8px #999; text-align:center;}\r\n");
      out.write(".agreement h1 {display:block; font-size:24px; line-height:30px; padding:20px 20px 10px 20px; margin:0; color:#333; text-align:center;}\r\n");
      out.write(".agreement iframe { width:760px; min-height:400px; margin:0 20px 20px 20px; border:none; outline:none;}\r\n");
      out.write(".agreement .backtotop {display:block; line-height:20px; padding:10px; text-align:center;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("$(document).ready(\r\n");
      out.write("\tfunction(){\r\n");
      out.write("\t\tvar err = '");
      out.print(errmsg );
      out.write("';\r\n");
      out.write("\t\tif(err != '')\r\n");
      out.write("\t\t\talert(err);\r\n");
      out.write("\t}\r\n");
      out.write(");\r\n");
      out.write("function enableSubmit(bool){\r\n");
      out.write("if(bool)$(\"#submit\").removeAttr(\"disabled\");\r\n");
      out.write("else $(\"#submit\").attr(\"disabled\",\"disabled\");\r\n");
      out.write("}\r\n");
      out.write("function v_submitbutton(){\r\n");
      out.write("if($(\"#agree\").attr(\"checked\")!=\"checked\") {\r\n");
      out.write("enableSubmit(false);\r\n");
      out.write("$(\".readagreement-wrap\").css(\"outline\",\"1px solid #f99\");\r\n");
      out.write("return;\r\n");
      out.write("}else{$(\".readagreement-wrap\").css(\"outline\",\"1px solid #9f9\");}\r\n");
      out.write("for(f in flags) if(!flags[f]) {enableSubmit(false); return;}\r\n");
      out.write("enableSubmit(true);\r\n");
      out.write("}\r\n");
      out.write("function showAgreement(){\r\n");
      out.write("$(\"#readagreement\").removeAttr(\"onclick\");\r\n");
      out.write("$(\"#agreement\").show();\r\n");
      out.write("$(\"#agreement iframe\").attr(\"src\",\"http://www.baidu.com\");//此处为链接地址\r\n");
      out.write("}\r\n");
      out.write("function agree(){\r\n");
      out.write("$(\"#agreement\").hide();\r\n");
      out.write("$(\"#readagreement\").attr(\"onclick\",\"showAgreement();\");\r\n");
      out.write("if($(\"#agree\").attr(\"checked\")!=\"checked\") $(\"#agree\").trigger(\"click\");\r\n");
      out.write("}\r\n");
      out.write("function onReadAgreementClick(){\r\n");
      out.write("return;\r\n");
      out.write("if($(\"#agree\").attr(\"checked\")){\r\n");
      out.write("$(\"#agree\").removeAttr(\"checked\");\r\n");
      out.write("}else{\r\n");
      out.write("$(\"#agree\").attr(\"checked\",\"checked\");\r\n");
      out.write("}\r\n");
      out.write("v_submitbutton();\r\n");
      out.write("}\r\n");
      out.write("var flags = [false,false,false,false];\r\n");
      out.write("//邮箱验证，网上找到的正则\r\n");
      out.write("var RegEmail = /^([a-zA-Z0-9]+[_|\\_|\\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\\_|\\.]?)*[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$/;\r\n");
      out.write("function lineState(name,state,msg){\r\n");
      out.write("if(state==\"none\"){$(\"#line_\"+name+\" .input div\").attr(\"class\",\"none\"); return;}\r\n");
      out.write("if(state==\"corect\"){$(\"#line_\"+name+\" .input div\").attr(\"class\",\"corect\");return;}\r\n");
      out.write("$(\"#line_\"+name+\" .input span\").text(msg);$(\"#line_\"+name+\" .input div\").attr(\"class\",\"error\");\r\n");
      out.write("}\r\n");
      out.write("function v_account(){\r\n");
      out.write("var account = $(\"#account\").val();\r\n");
      out.write("if(!RegEmail.test(account)) {lineState(\"account\",\"error\",\"邮箱格式不正确\"); flags[0]=false;enableSubmit(false);}\r\n");
      out.write("else{lineState(\"account\",\"corect\",\"\");flags[0] = true;}\r\n");
      out.write("v_submitbutton();\r\n");
      out.write("}\r\n");
      out.write("function v_name(){\r\n");
      out.write("var name = $(\"#name\").val();\r\n");
      out.write("if(name.length==0) {lineState(\"name\",\"error\",\"不得为空\"); flags[1]=false;}\r\n");
      out.write("else{\r\n");
      out.write("if(name.length>32) {lineState(\"name\",\"error\",\"必须少于32个字符\"); flags[1]=false;}\r\n");
      out.write("else{lineState(\"name\",\"corect\",\"\"); flags[1] = true;}\r\n");
      out.write("}\r\n");
      out.write("v_submitbutton();\r\n");
      out.write("}\r\n");
      out.write("function v_password(){\r\n");
      out.write("var password = $(\"#password\").val();\r\n");
      out.write("if(password.length<6) {lineState(\"password\",\"error\",\"必须多于或等于6个字符\"); flags[2]=false;}\r\n");
      out.write("else{\r\n");
      out.write("if(password.length>16){lineState(\"password\",\"error\",\"必须少于或等于16个字符\"); flags[2]=false;}\r\n");
      out.write("else{\r\n");
      out.write("lineState(\"password\",\"corect\",\"\");\r\n");
      out.write("flags[2] = true;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("v_repeat();\r\n");
      out.write("v_submitbutton();\r\n");
      out.write("}\r\n");
      out.write("function v_repeat(){\r\n");
      out.write("if(!flags[2]) {lineState(\"repeat\",\"none\",\"\"); return;}\r\n");
      out.write("if($(\"#password\").val()!=$(\"#repeat\").val()) {lineState(\"repeat\",\"error\",\"密码不一致\"); flags[3]=false;}\r\n");
      out.write("else{\r\n");
      out.write("lineState(\"repeat\",\"corect\",\"\");\r\n");
      out.write("flags[3] = true;\r\n");
      out.write("}\r\n");
      out.write("v_submitbutton();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function adaptValue(){\r\n");
      out.write("return true;\r\n");
      out.write("}</script>");
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
