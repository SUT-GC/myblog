/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-09-28 13:09:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.back;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.JournalDao;
import empty.Journal;
import java.util.ArrayList;

public final class back_005fjournal_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>日志管理界面</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Admin Theme -->\r\n");
      out.write("        <link href=\"css/bootstrap-admin-theme.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/back_journal_admin.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles -->\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            .buttons-title{\r\n");
      out.write("                margin-top: 20px\r\n");
      out.write("            }\r\n");
      out.write("            .buttons-group{\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            .the-icons{\r\n");
      out.write("                margin-left: 0;\r\n");
      out.write("                list-style: none;\r\n");
      out.write("            }\r\n");
      out.write("            .the-icons li {\r\n");
      out.write("                float: left;\r\n");
      out.write("                width: 25%;\r\n");
      out.write("                line-height: 25px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("           <script type=\"text/javascript\" src=\"js/html5shiv.js\"></script>\r\n");
      out.write("           <script type=\"text/javascript\" src=\"js/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bootstrap-admin-with-small-navbar\">\r\n");
      out.write("      <nav class=\"navbar navbar-default navbar-inverse navbar-fixed-top \" role=\"navigation\">\r\n");
      out.write("     <div class=\"container\">\r\n");
      out.write("       <div class=\"row\">\r\n");
      out.write("          <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("          <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("              <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Gc微博后台</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("              <li class=\"active\"><a href=\"#\">首页</a></li>\r\n");
      out.write("              <li ><a href=\"back_help.jsp\">使用介绍</a></li>             \r\n");
      out.write("            </ul>\r\n");
      out.write("            <form class=\"navbar-form navbar-left\" role=\"search\">\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"请输入内容\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-default\">搜索</button>\r\n");
      out.write("            </form>\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("              <li class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">管理员<b class=\"caret\"></b></a>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                  <li><a href=\"../nav/index.jsp\">退出登录</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div><!-- /.navbar-collapse -->\r\n");
      out.write("          </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <!-- left, vertical navbar & content -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <!-- left, vertical navbar -->\r\n");
      out.write("                <div class=\"col-md-2 bootstrap-admin-col-left\">\r\n");
      out.write("                     <ul class=\"nav navbar-collapse collapse bootstrap-admin-navbar-side\">\r\n");
      out.write("                         <li >\r\n");
      out.write("                            <a href=\"back_index.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 首页</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li >\r\n");
      out.write("                            <a href=\"back_about.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 关于我们</a>\r\n");
      out.write("                        </li>                       \r\n");
      out.write("                        <li class=\"disabled\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 日历</a><!-- calendar.html -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"disabled\">\r\n");
      out.write("                            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 统计图表</a><!-- stats.html -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"back_journal_release.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 日志发布</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"active\">\r\n");
      out.write("                            <a href=\"back_journal_admin.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 日志管理</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"back_users.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 用户管理</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"back_message.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 留言管理</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"back_image.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 图片管理</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"back_admin_information.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 账户中心</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 留白1</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 留白2</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 留白3</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 留白4</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t\t\t");

					ArrayList<Journal> list = JournalDao.journalSelect();
				
      out.write("\r\n");
      out.write("                <!-- content start -->\r\n");
      out.write("                <div class=\"col-md-10\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"text-muted bootstrap-admin-box-title\"><a href=\"#\">日志管理</a></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"bootstrap-admin-panel-content\">\r\n");
      out.write("                                <table class=\"table table-striped table-bordered\" id=\"example\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr class=\"table_head\">\r\n");
      out.write("                                            <th class=\"table_id_label\">article_id</th>\r\n");
      out.write("                                            <th>article_title</th>\r\n");
      out.write("                                            <th>article_create_date</th>\r\n");
      out.write("                                            <th>classify</th>\r\n");
      out.write("                                            <th>private</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>pass</th>\r\n");
      out.write("                                            <th>edit/delete_buttons</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody class=\"table_content\">\r\n");
      out.write("\t                                    ");
for(Journal journal:list) {
      out.write("\r\n");
      out.write("\t                                        <tr class=\"gradeA\">\r\n");
      out.write("\t\t                                    <td>");
      out.print(journal.getJournal_id());
      out.write("</td>\r\n");
      out.write("\t\t                                    <td>");
      out.print(journal.getTitle() );
      out.write("</td>\r\n");
      out.write("\t\t                                    <td>");
      out.print(journal.getDatetime() );
      out.write("</td>\r\n");
      out.write("\t\t                                    <td>\r\n");
      out.write("\t\t                                    ");
 
		                                    	switch(journal.getClassify()){
		                                    	case 1:out.print("java"); break;
		                                    	case 2:out.print("算法");break;
		                                    	case 3:out.print("html/css/js");break;
		                                    	case 4:out.print("生活随笔");break;
		                                    	case 5:out.print("读书笔记");break;
		                                    	case 6:out.print("其他");break;
		                                    	}
		                                    
      out.write("\r\n");
      out.write("\t\t                                    <td class=\"center\">\r\n");
      out.write("\t\t                                        \t");
 if(journal.getPrivate_is() == 1){
		                                          				out.print("true");
		                                           			}else{
		                                           				out.print("false");
		                                           			}
		                                           	
      out.write("\r\n");
      out.write("\t\t                           \t        </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(journal.getPrivate_pass());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t                                    <td class=\"center\">\r\n");
      out.write("\t\t                                    <!-- \r\n");
      out.write("\t\t                                    <button class=\"btn btn-primary button_edit\"  ><i class=\"glyphicon glyphicon-pencil glyphicon-white\"></i>Edit</button></a>\r\n");
      out.write("\t\t                                    <button class=\"btn btn-danger button_delete\" ><i class=\"glyphicon glyphicon-remove glyphicon-white\"></i> Delete</button></td>\r\n");
      out.write("\t\t                                     -->\r\n");
      out.write("\t\t                                     <a href=\"/myblog/JournalEditOrDelete?id=");
      out.print(journal.getJournal_id());
      out.write("&do=edit\"><input type=\"submit\"  name =\"button\" value=\"edit\" class=\"btn btn-primary button_edit\"/></a>\r\n");
      out.write("\t\t                                     <a href=\"/myblog/JournalEditOrDelete?id=");
      out.print(journal.getJournal_id());
      out.write("&do=delete\"><input type=\"submit\" name=\"button\" value=\"delete\" onclick=\"return alert('您确认要删除该文章么？')\" class=\"btn btn-danger button_delete\"/></a>\r\n");
      out.write("\t                                        </tr>\r\n");
      out.write("                                        ");
} 
      out.write("\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- content end-->\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <hr>\r\n");
      out.write("                <footer role=\"contentinfo\">\r\n");
      out.write("                    <p>&copy; 2015 <a href=\"#\" target=\"_blank\">Gc</a></p>\r\n");
      out.write("                </footer>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-2.0.3.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/twitter-bootstrap-hover-dropdown.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/datatables/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/DT_bootstrap.js\"></script>\r\n");
      out.write("        \r\n");
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
