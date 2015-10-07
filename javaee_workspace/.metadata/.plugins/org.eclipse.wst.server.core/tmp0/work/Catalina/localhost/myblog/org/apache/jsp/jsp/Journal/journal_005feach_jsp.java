/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-10-07 09:06:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.Journal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.JournalDao;
import empty.Journal;

public final class journal_005feach_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>日志浏览</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"Gc\">\r\n");
      out.write("    <!-- CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/journal_each.css\">\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <!--引入 fontawesom-4.2.0-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fontawesome-4.2.0/css/font-awesome.min.css\">\r\n");
      out.write("    <!--引入wangEditor.css-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/wangEditor-1.1.0-min.css\">\r\n");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        body{\r\n");
      out.write("            padding: 0px 10px 0px 10px;\r\n");
      out.write("            background-color: #F5F5F5;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<!-- java start -->\r\n");

	int id = -1;
	String classifyS = "";
	Journal journal = null;
	if(request.getParameter("id")!= null){
		id = Integer.parseInt(request.getParameter("id"));
		journal = JournalDao.selectByID(id);
		switch (journal.getClassify()){
		case 1: classifyS = "java"; break;
		case 2: classifyS = "算法"; break;
		case 3: classifyS = "Html/css/js"; break;
		case 4: classifyS = "生活随笔"; break;
		case 5: classifyS = "读书笔记"; break;
		case 6: classifyS = "其他"; break;
		}
	}

      out.write("\r\n");
      out.write("<!-- java end -->\r\n");
      out.write("    <div class=\"all\">\r\n");
      out.write("    <div class=\"journal_each_all\">\r\n");
      out.write("    \t");

    		if(id != -1 && journal != null && !classifyS.equals("")){
    	
      out.write("\r\n");
      out.write("        <div class=\"journal_nav\">\r\n");
      out.write("            <a href=\"Journal.jsp\">日志页</a>\r\n");
      out.write("            <span class=\"journal_nav_1\">>></span>\r\n");
      out.write("            <a href=\"Journal.jsp?cfy=");
      out.print(journal.getClassify());
      out.write('"');
      out.write('>');
      out.print(classifyS);
      out.write("</a>\r\n");
      out.write("            <span class=\"journal_nav_2\">>></span>\r\n");
      out.write("            <a href=\"#\">");
      out.print(journal.getTitle());
      out.write("</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"journal_each_article\">\r\n");
      out.write("            <div class=\"title\">");
      out.print(journal.getTitle());
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"author_data\">\r\n");
      out.write("                <span  class=\"author\">\r\n");
      out.write("                    <span class=\"author_label\">作者:</span>\r\n");
      out.write("                    <span class=\"author_content\">");
      out.print(journal.getAuthor());
      out.write("</span>\r\n");
      out.write("                </span>\r\n");
      out.write("                <span class=\"date_label\">创建时间:</span>\r\n");
      out.write("                <span class=\"date_data\">");
      out.print(journal.getDatetime());
      out.write("</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"content\" readonly>\r\n");
      out.write("                <pre class=\"content_text\" >");
      out.print(journal.getContent());
      out.write("</pre>\r\n");
      out.write("                <div class=\"reply\">\r\n");
      out.write("                    <!--文本编写框start-->\r\n");
      out.write("                    <div class=\"reply-editor\">\r\n");
      out.write("                        <h1>填写评论</h1>\r\n");
      out.write("\r\n");
      out.write("                        <div id='txtDiv' style='border:1px solid #cccccc; height:240px;'>\r\n");
      out.write("                            <p>请输入内容...</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div style='margin-top:10px;'>\r\n");
      out.write("                            <textarea id='textarea' style='width:100%; height:100px; margin-top:10px;'></textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--文本编写框end-->\r\n");
      out.write("                    <div class=\"btn-group\">\r\n");
      out.write("                        <button class=\"btn btn-primary\">对文章进行评论</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--回复start-->\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                    <div class=\"reply_top\">\r\n");
      out.write("                        <img src=\"img/01.png\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"reply_bottom\">\r\n");
      out.write("                        <a href=\"#\" class=\"reply_user_name\">Gc</a>\r\n");
      out.write("                        <span class=\"reply_date\">2015-09-09 8:29</span>\r\n");
      out.write("                        <pre class=\"reply_content\">if(sum%4 == 0){\r\n");
      out.write("                cout&lt&ltsum/4&lt&ltendl;\r\n");
      out.write("}else{\r\n");
      out.write("cout&lt&lt(sum/4)+1&lt&ltendl;\r\n");
      out.write("}\r\n");
      out.write("这是什么意思？\r\n");
      out.write("            </pre>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--回复end-->\r\n");
      out.write("                    <!--回复start-->\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                    <div class=\"reply_top\">\r\n");
      out.write("                        <img src=\"img/01.png\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"reply_bottom\">\r\n");
      out.write("                        <a href=\"#\" class=\"reply_user_name\">Gc</a>\r\n");
      out.write("                        <span class=\"reply_date\">2015-09-09 8:29</span>\r\n");
      out.write("                        <pre class=\"reply_content\">这个文章很好</pre>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--回复end-->\r\n");
      out.write("                    <!--回复start-->\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                    <div class=\"reply_top\">\r\n");
      out.write("                        <img src=\"img/02.png\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"reply_bottom\">\r\n");
      out.write("                        <a href=\"#\" class=\"reply_user_name\">Gc</a>\r\n");
      out.write("                        <span class=\"reply_date\">2015-09-09 8:29</span>\r\n");
      out.write("                        <pre class=\"reply_content\">这个文章很好</pre>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--回复end-->\r\n");
      out.write("                    <!--回复start-->\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                    <div class=\"reply_top\">\r\n");
      out.write("                        <img src=\"img/01.png\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"reply_bottom\">\r\n");
      out.write("                        <a href=\"#\" class=\"reply_user_name\">Gc</a>\r\n");
      out.write("                        <span class=\"reply_date\">2015-09-09 8:29</span>\r\n");
      out.write("                        <pre class=\"reply_content\">这个文章很好</pre>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--回复end-->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");

    		}else{
    
      out.write("\r\n");
      out.write("    <h1 style='color:red'>对不起 ,  没有搜到日志 ......</h1>\r\n");
      out.write("    ");

    		}
    
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--引入 jquery.js-->\r\n");
      out.write("            <script src=\"js/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("            <!--引入 wangEditor.js-->\r\n");
      out.write("            <script type=\"text/javascript\" src='js/wangEditor-1.1.0-min.js'></script>\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                $(function(){\r\n");
      out.write("                    $('#spanTime').text((new Date()).toString());\r\n");
      out.write("\r\n");
      out.write("                    //一句话，即可把一个div 变为一个富文本框！o(∩_∩)o \r\n");
      out.write("                    var $editor = $('#txtDiv').wangEditor();\r\n");
      out.write("\r\n");
      out.write("                    //显示 html / text\r\n");
      out.write("                    var $textarea = $('#textarea'),\r\n");
      out.write("                        $btnHtml = $('#btnHtml'),\r\n");
      out.write("                        $btnText = $('#btnText'),\r\n");
      out.write("                        $btnHide = $('#btnHide');\r\n");
      out.write("                    $textarea.hide();\r\n");
      out.write("                    $btnHtml.click(function(){\r\n");
      out.write("                        $textarea.show();\r\n");
      out.write("                        $textarea.val( $editor.jsp() );\r\n");
      out.write("                    });\r\n");
      out.write("                    $btnText.click(function(){\r\n");
      out.write("                        $textarea.show();\r\n");
      out.write("                        $textarea.val( $editor.text() );\r\n");
      out.write("                    });\r\n");
      out.write("                    $btnHide.click(function(){\r\n");
      out.write("                        $textarea.hide();\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            </script>\r\n");
      out.write("</body>\r\n");
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
