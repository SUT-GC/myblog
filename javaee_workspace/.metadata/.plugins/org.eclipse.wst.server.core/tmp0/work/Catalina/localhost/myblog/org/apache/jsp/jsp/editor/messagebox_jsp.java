/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-10-05 16:08:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.editor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.UserDao;
import empty.Message;
import java.util.ArrayList;
import dao.MessDao;
import empty.User;

public final class messagebox_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>留言板</title>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <!--引入导航栏nav.css-->\r\n");
      out.write("    <link href=\"css/nav.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--引入 fontawesom-4.2.0-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fontawesome-4.2.0/css/font-awesome.min.css\">\r\n");
      out.write("    <!--[if IE]>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fontawesome-4.2.0/css/font-awesome-ie7.min.css\">\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <!--引入massagebox.css-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/messagebox.css\">\r\n");
      out.write("    <!--引入wangEditor.css-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/wangEditor-1.1.0-min.css\">\r\n");
      out.write("    <!--引入bootstrap.min.css-->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"//cdn.bootcss.com/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <!--引入 jquery.js-->\r\n");
      out.write("    <script src=\"js/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--引入 wangEditor.js-->\r\n");
      out.write("    <script type=\"text/javascript\" src='js/wangEditor-1.1.0-min.js'></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function(){\r\n");
      out.write("            $('#spanTime').text((new Date()).toString());\r\n");
      out.write("\r\n");
      out.write("            //一句话，即可把一个div 变为一个富文本框！o(∩_∩)o \r\n");
      out.write("            var $editor = $('#txtDiv').wangEditor();\r\n");
      out.write("\r\n");
      out.write("            ");
for(int i = 1; i <= 10; i++){
      out.write("\r\n");
      out.write("            //显示 html / text\r\n");
      out.write("            var $replybutton");
      out.print(i);
      out.write(" = $('.reply-button");
      out.print(i);
      out.write("');\r\n");
      out.write("            var $replytextarea");
      out.print(i);
      out.write(" = $('#replytextarea");
      out.print(i);
      out.write("');\r\n");
      out.write("            var $teplytexthide");
      out.print(i);
      out.write(" = $('#btnhide");
      out.print(i);
      out.write("');\r\n");
      out.write("            \r\n");
      out.write("            $replytextarea");
      out.print(i);
      out.write(".hide();\r\n");
      out.write("            $replybutton");
      out.print(i);
      out.write(".click(function(){\r\n");
      out.write("         \t \t$replytextarea");
      out.print(i);
      out.write(".show();\r\n");
      out.write("         \t });\r\n");
      out.write("         \t$teplytexthide");
      out.print(i);
      out.write(".click(function(){\r\n");
      out.write("         \t\t$replytextarea");
      out.print(i);
      out.write(".hide();\r\n");
      out.write("         \t});\r\n");
      out.write("         \t");
}
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"b\">\r\n");
      out.write("<div class=\"all\">\r\n");
      out.write("<!--导航开始-->\r\n");
      out.write("\t<!-- java start -->\r\n");
      out.write("\t");

		//获取Session user
		session = request.getSession();
		User user = null;
		int userid = -1;
		if(session.getAttribute("user") != null){
			user = (User)session.getValue("user");
			userid = user.getUser_id();
		}
		
		String errmsg = "";
		if(request.getParameter("errmsg")!=null){
			errmsg = request.getParameter("errmsg");
		}
	
      out.write("\r\n");
      out.write("<!-- java end -->\r\n");
      out.write("  <div id=\"nav\">\r\n");
      out.write("    <ul class=\"nav-menu clearfix unstyled\">\r\n");
      out.write("      <li><a href=\"../nav/index.jsp\" class=\"three-d \">\r\n");
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
      out.write("      <li><a href=\"#\" class=\"three-d active\">\r\n");
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

    int pagec = 1;
   	if(request.getParameter("page")!=null){
		pagec = Integer.parseInt(request.getParameter("page"));
	}

      out.write("\r\n");
      out.write("<!--留言板start-->\r\n");
      out.write("    <div class=\"messagebox\">\r\n");
      out.write("        <h2 class=\"messgebox-zh\">留言板:</h2>\r\n");
      out.write("        <div class=\"messagebox-sendword\">\r\n");
      out.write("            <h3 class=\"messagebox-sendword-title\" style='margin-left:10px;color:#0000CC'>主人寄语</h3>\r\n");
      out.write("            <p class=\"messagebox-sendword-content\" style='margin-left:10px; color:#0000CC;font-size:17px'>这是主人寄语的内容（阿迪几啊考虑到加拉看的叫卡拉胶打卡机打卡机都卡死了加大了肯定就爱看劳动局阿卡拉）</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--文本编写框start-->\r\n");
      out.write("        <div class=\"writeword\">\r\n");
      out.write("            <div class=\"send-words-prompt\" style='font-size:19px; color:#FF9900'>请填写并发表您的留言</div>\r\n");
      out.write("            <form action=\"/myblog/MessageRelease?userid=");
      out.print(userid);
      out.write("\" method=\"post\">\r\n");
      out.write("\t            <div style='margin-top:5px;'>\r\n");
      out.write("\t                <textarea name = \"firstmessage\"id='textarea' style='width:98%; height:130px; margin:10px; font-size:17px; padding:10px;' placeholder='请填写您要留言的内容~(^_^)~'></textarea>\r\n");
      out.write("\t                <button type=\"submit\" id='btnHtml' style='margin-top:5px;'  >发表留言</button>\r\n");
      out.write("\t                <button type=\"reset\" id='btnText' style='margin-top:5px;' >清除内容</button>\r\n");
      out.write("\t            </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--文本编写框end-->\r\n");
      out.write("        <div class=\"messagebox-message\">\r\n");
      out.write("            <div class=\"messagebox-message-num\">\r\n");
      out.write("                留言(<a href=\"#\">");
      out.print(MessDao.countFirstMess());
      out.write("</a>)\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--留言列表start-->\r\n");
      out.write("            <div class=\"messagebox-message-content\">\r\n");
      out.write("            \t<div style='text-align: center'><h2>第 <a href=\"#\">");
      out.print(pagec);
      out.write(" </a>页</h2></div>\r\n");
      out.write("                <!--每个人的留言楼层start-->\r\n");
      out.write("                <!-- java start -->\r\n");
      out.write("                ");

                	ArrayList <Message> firstlist = null;
                	int pages = 1;
                	if(request.getParameter("page")== null || request.getParameter("page").equals("1")){
                		pages = 1;
                	}else{
                		pages = Integer.parseInt(request.getParameter("page"));
                	}
                	firstlist = MessDao.selectMessByLimit((pages-1)*10, 10);
                
      out.write("\r\n");
      out.write("                <!-- java end -->\r\n");
      out.write("                <div class=\"messagebox-message-content-floor\">\r\n");
      out.write("                ");

                	int i = 0;
                	for(Message message: firstlist){
                		i++;
                
      out.write("\r\n");
      out.write("                    <div class=\"floor-left\">\r\n");
      out.write("                        <img src=\"img/01.png\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"floor-right\">\r\n");
      out.write("                        <div class=\"floor-username_floor-num\">\r\n");
      out.write("                            <a class=\"username\">");
      out.print(UserDao.selectUserByID(message.getUser_id()).getUser_nick());
      out.write("</a>\r\n");
      out.write("                            <span class=\"floornum\">第<a>");
      out.print(message.getFloor_id());
      out.write("</a>楼</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"floor-content\">\r\n");
      out.write("                            <pre class=\"content\">");
      out.print(message.getMessbox_reply());
      out.write("</pre>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"floor-right-bottom\">\r\n");
      out.write("                            <span class=\"msgtime\">");
      out.print(message.getMessbox_date());
      out.write("</span>\r\n");
      out.write("                            <button class=\"reply-button");
      out.print(i);
      out.write("\">回复</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t            <div id=\"replytextarea");
      out.print(i);
      out.write("\" style='margin-top:5px;'>\r\n");
      out.write("\t\t\t\t                <textarea id='textarea' style='width:98%; height:100px; margin:10px; font-size:15px; padding:10px;' placeholder='请填写您要回复的内容~(^_^)~'></textarea>\r\n");
      out.write("\t\t\t\t                <button type=\"submit\" id='btnHtml' style='margin-top:5px;' >回复</button>\r\n");
      out.write("\t\t\t\t                <button type=\"reset\" id='btnText' style='margin-top:5px;' >重置</button>\r\n");
      out.write("\t\t\t\t                <button type=\"button\" id='btnhide");
      out.print(i);
      out.write("' style='margin-top:5px;'>隐藏</button>\r\n");
      out.write("\t\t\t\t            </div>\r\n");
      out.write("            \t\t\t</form>\r\n");
      out.write("                        <hr/>\r\n");
      out.write("                        <!--回复列表start-->\r\n");
      out.write("                        <div class=\"reply\">\r\n");
      out.write("                        ");

                        	ArrayList <Message> secoundlist = null;
                        	secoundlist = MessDao.selectSecoundMessByFloor(message.getFloor_id());
                        	
                        	for(Message secoundmessage:secoundlist){
                        
      out.write("\r\n");
      out.write("                            <div class=\"reply-left\">\r\n");
      out.write("                                <img src=\"/myblog/image/user/head/02.png\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"reply-right\">\r\n");
      out.write("                                <div class=\"reply-right-top\">\r\n");
      out.write("                                    <a class=\"reply-username\">");
      out.print(UserDao.selectUserByID(message.getTouser_id()).getUser_nick());
      out.write("</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"reply-content\">\r\n");
      out.write("                                    <pre class=\"reply-content-text\">");
      out.print(secoundmessage.getMessbox_reply());
      out.write("</pre>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"reply-time\">");
      out.print(secoundmessage.getMessbox_date());
      out.write("</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
} 
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--回复列表end-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <hr/>\r\n");
      out.write("                <!--每个人的留言楼层end-->\r\n");
      out.write("                <!--分页start-->\r\n");
      out.write("                <div class=\"messagebox-nav\">\r\n");
      out.write("                    <nav>\r\n");
      out.write("                      <ul class=\"pagination\">\r\n");
      out.write("                        ");

                        	//计算需要多少页面按钮
                        	int sum = MessDao.countFirstMess();
                        	int pagecount = (sum / 10)+1;
                        	if(pagecount <= 10){
                        		for(i = 1; i <= pagecount; i++){
                        
      out.write("\r\n");
      out.write("                        <li ");
if(pagec == i){ 
      out.write("class=\"active\"");
} 
      out.write("><a href=\"?page=");
      out.print(i);
      out.write('"');
      out.write(' ');
      out.write('>');
      out.print(i);
      out.write("</a></li>\r\n");
      out.write("                        ");

                        		}
                        	}else{
						
      out.write("  \r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("                          <a href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("                            <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("                          </a>\r\n");
      out.write("                        </li>                      \r\n");
      out.write("                        ");
		for(i = 1; i <= 10; i++){
                        
      out.write("\r\n");
      out.write("                        <li><a href=\"#\">");
      out.print(i);
      out.write("</a></li>\r\n");
      out.write("                        ");
		}
                        
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                          <a href=\"#\" aria-label=\"Next\">\r\n");
      out.write("                            <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("                          </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        ");
	
                        	}
                        
      out.write("\r\n");
      out.write("                      </ul>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </div>\r\n");
      out.write("            <!--分页end-->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--留言列表end-->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("<!--留言板end-->\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("//  变量err返回发布留言的后台验证信息\r\n");
      out.write("//  0:用户未登录，不能进行留言\r\n");
      out.write("//  1:request中的留言内容参数未找到\r\n");
      out.write("//  2:留言内容不能为空\r\n");
      out.write("//  3:用户留言成功\r\n");
      out.write(" \r\n");
      out.write("\tvar err = '");
      out.print(errmsg);
      out.write("';\r\n");
      out.write("\tvar errmsg = \"\";\r\n");
      out.write("\tif(err != \"\"){\r\n");
      out.write("\t\tif(err == \"0\"){\r\n");
      out.write("\t\t\terrmsg += \"只有登陆之后才能发表留言，请您先进行登陆~(^_^)~\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(err == \"2\"){\r\n");
      out.write("\t\t\terrmsg += \"对不起，留言内容不能为空 !\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(err == \"3\"){\r\n");
      out.write("\t\t\terrmsg +=\"恭喜您， 留言成功 ！ \";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\talert(errmsg);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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
