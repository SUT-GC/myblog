/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.63
 * Generated at: 2015-10-08 14:10:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.back;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Encryption.Base64;

public final class back_005fjournal_005frelease_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>日志发布界面</title>\r\n");
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
      out.write("        <!-- Vendors -->\r\n");
      out.write("        <link href=\"vendors/bootstrap-datepicker/css/datepicker.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        <link href=\"css/datepicker.fixes.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        <link href=\"vendors/uniform/themes/default/css/uniform.default.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        <link href=\"css/uniform.default.fixes.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        <link href=\"vendors/chosen.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        <link href=\"vendors/bootstrap-wysihtml5-rails-b3/vendor/assets/stylesheets/bootstrap-wysihtml5/core-b3.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("        <link href=\"css/back_journal_release.css\" rel=\"stylesheet\" >\r\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("           <script type=\"text/javascript\" src=\"js/html5shiv.js\"></script>\r\n");
      out.write("           <script type=\"text/javascript\" src=\"js/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bootstrap-admin-with-small-navbar\">\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-inverse navbar-fixed-top \" role=\"navigation\">\r\n");
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
      out.write("                  <li><a href=\"/myblog/AdminSessionLogout\">退出登录</a></li>\r\n");
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
      out.write("               <div class=\"col-md-2 bootstrap-admin-col-left\">\r\n");
      out.write("                     <ul class=\"nav navbar-collapse collapse bootstrap-admin-navbar-side\">\r\n");
      out.write("                        <li >\r\n");
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
      out.write("                        <li class=\"active\">\r\n");
      out.write("                            <a href=\"back_journal_release.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 日志发布</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"back_journal_admin.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 日志管理</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"back_users.jsp\"><i class=\"glyphicon glyphicon-chevron-right\"></i> 用户管理</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li >\r\n");
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
      out.write("\r\n");
      out.write("                <!-- content start -->\r\n");
      out.write("                <div class=\"col-md-10\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <div class=\"text-muted bootstrap-admin-box-title\">日志发布</div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <h3 class=\"journal_release_title\">Please input informations of the article:</h3>\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                    <div class=\"image_upload\">\r\n");
      out.write("                    <form action=\"/myblog/FileUpload\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                    \t <span class=\"is_private uploadlabel\">Please upload a image for this article</span>\r\n");
      out.write("                    \t <input class=\"uploadfile\" type=\"file\" name=\"file\"/>\r\n");
      out.write("                    \t ");

                    	 	String image="";
                    	 	if(request.getParameter("ilr") != null){
                    		 		if(request.getParameter("ilr").equals("1")){
                    		 			if(request.getParameter("fn")!=null && !Base64.base64Decoder(request.getParameter("fn")).equals("")){
                    		 				image = Base64.base64Decoder(request.getParameter("fn"));
                    		 				out.print("<h3 style='color:#00FF00'>上传成功:"+Base64.base64Decoder(request.getParameter("fn"))+"</h3>");
                    		 			}else{
                    		 				out.print("<h3 style='color:#00FF00'>上传成功</h3>");                    		 				
                    		 			}
                    		 		}else if(request.getParameter("ilr").equals("2")){
                    		 			out.print("<h3 style='color:#FF0000'>上传失败</h3>");
                    		 		}else if(request.getParameter("ilr").equals("2.1")){
                    		 			out.print("<h3 style='color:#FF0000'>上传失败,格式不正确</h3>");
                    		 		}else if(request.getParameter("ilr").equals("2.2")){
                    		 			out.print("<h3 style='color:#FF0000'>上传失败,大小超过10M</h3>");
                    		 		}else if(request.getParameter("ilr").equals("3")){
                    		 			out.print("<h3 style='color:#FF0000'>上传失败,已经有该文件</h3>");
                    		 		}
                    	 		}
                    	 
      out.write("\r\n");
      out.write("                    \t <input type=\"submit\"  name=\"fileupload\" value =\"UpLoad\"class=\" uploadbtn btn btn-primary input_buttons_submit\"/>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                    <form id=\"journal_release_form_id\" class=\"journal_release_form_class\" method=\"post\" action=\"/myblog/ReleaseJournal\">\r\n");
      out.write("                    ");

                    	request.setAttribute("image", image);
                    
      out.write("\r\n");
      out.write("                        <div class=\"input_title\">\r\n");
      out.write("                            <span class=\"input_title_label\">the title of your article:</span>\r\n");
      out.write("                            <input name=\"article_title\" type=\"text\" class=\"form-control input_title_content\" placeholder=\"title...\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr/>\r\n");
      out.write("                        <div class=\"input_title\">\r\n");
      out.write("                            <span class=\"input_title_label\">the author of your article:</span>\r\n");
      out.write("                            <input name=\"article_author\" type=\"text\" class=\"form-control input_title_content\" placeholder=\"author...\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr/>\r\n");
      out.write("                        <div class=\"input_summary\">\r\n");
      out.write("                            <span class=\"input_title_label\">the summary of your article:</span>\r\n");
      out.write("                            <textarea name=\"article_summary\" class=\"input_summary_textarea\" cols=\"65\" rows=\"3;\"></textarea><br/><br/><br/><br/><br/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr/>\r\n");
      out.write("                        <div class=\"input_content\">\r\n");
      out.write("                            <span class=\"input_title_label\">the content of your article:</span>\r\n");
      out.write("                            <textarea name=\"article_content\" class=\"input_content_textarea\" cols=\"77\" rows=\"10;\"></textarea><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr/>\r\n");
      out.write("                        <div class=\"input_submit\">\r\n");
      out.write("                            <span class=\"input_title_label\">Classification:</span>\r\n");
      out.write("                            <select name=\"article_classify\" id=\"select_classify\">\r\n");
      out.write("                                <option value=\"1\">java</option>\r\n");
      out.write("                                <option value=\"2\">算法</option>\r\n");
      out.write("                                <option value=\"3\">Html/css/js</option>\r\n");
      out.write("                                <option value=\"4\">生活随笔</option>\r\n");
      out.write("                                <option value=\"5\">读书笔记</option>\r\n");
      out.write("                                <option value=\"6\">其他</option>\r\n");
      out.write("                                <option value=\"7\" disabled>预留</option>\r\n");
      out.write("                                <option value=\"8\" disabled>预留</option>\r\n");
      out.write("                            </select>   \r\n");
      out.write("                            <span class=\"is_private\">is private ?</span>\r\n");
      out.write("                            <input class=\"is_private_check\"type=\"checkbox\" name=\"isprivate\" value=\"1\"/>\r\n");
      out.write("                            <span class=\"is_private\">if this is private, please input your password !</span>\r\n");
      out.write("                            <input name=\"private_pass\" class=\"input_password\" type=\"text\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr/>\r\n");
      out.write("                        <div class=\"input_buttons\">\r\n");
      out.write("                            <input type=\"submit\" onclick=\"return confirm('是否发布该文章？');\" value =\"Release\"class=\"btn btn-success input_buttons_submit\"/>\r\n");
      out.write("                            <input type=\"reset\"  onclick=\"return confirm('是否清空您输入的所有？');\"value =\"Reset\"class=\"btn btn-primary input_buttons_reset\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr style=\"margin-top:80px;\"/>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- content end -->\r\n");
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
      out.write("        <script type=\"text/javascript\" src=\"vendors/uniform/jquery.uniform.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/chosen.jquery.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/bootstrap-datepicker/js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/bootstrap-wysihtml5-rails-b3/vendor/assets/javascripts/bootstrap-wysihtml5/wysihtml5.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/bootstrap-wysihtml5-rails-b3/vendor/assets/javascripts/bootstrap-wysihtml5/core-b3.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/twitter-bootstrap-wizard/jquery.bootstrap.wizard-for.bootstrap3.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"vendors/boostrap3-typeahead/bootstrap3-typeahead.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
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
