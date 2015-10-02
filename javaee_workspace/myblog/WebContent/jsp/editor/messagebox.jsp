<%@page import="empty.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>留言板</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <!--引入导航栏nav.css-->
    <link href="css/nav.css" rel="stylesheet">
    <!--引入 fontawesom-4.2.0-->
    <link rel="stylesheet" type="text/css" href="fontawesome-4.2.0/css/font-awesome.min.css">
    <!--[if IE]>
    <link rel="stylesheet" type="text/css" href="fontawesome-4.2.0/css/font-awesome-ie7.min.css">
    <![endif]-->
    <!--引入massagebox.css-->
    <link rel="stylesheet" type="text/css" href="css/messagebox.css">
    <!--引入wangEditor.css-->
    <link rel="stylesheet" type="text/css" href="css/wangEditor-1.1.0-min.css">
    <!--引入bootstrap.min.css-->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>

    <style type="text/css">
    </style>

    <!--引入 jquery.js-->
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>

    <!--引入 wangEditor.js-->
    <script type="text/javascript" src='js/wangEditor-1.1.0-min.js'></script>
    <script type="text/javascript">
        $(function(){
            $('#spanTime').text((new Date()).toString());

            //一句话，即可把一个div 变为一个富文本框！o(∩_∩)o 
            var $editor = $('#txtDiv').wangEditor();

            //显示 html / text
            var $textarea = $('#textarea'),
                $btnHtml = $('#btnHtml'),
                $btnText = $('#btnText'),
                $btnHide = $('#btnHide');
            $textarea.hide();
            $btnHtml.click(function(){
                $textarea.show();
                $textarea.val( $editor.jsp() );
            });
            $btnText.click(function(){
                $textarea.show();
                $textarea.val( $editor.text() );
            });
            $btnHide.click(function(){
                $textarea.hide();
            });
        });
    </script>
</head>
<body class="b">
<div class="all">
<!--导航开始-->
	<!-- java start -->
	<%
		//获取Session user
		session = request.getSession();
		User user = null;
		if(session.getAttribute("user") != null){
			user = (User)session.getValue("user");
		}
	%>
<!-- java end -->
  <div id="nav">
    <ul class="nav-menu clearfix unstyled">
      <li><a href="../nav/index.jsp" class="three-d ">
        主页
        <span class="three-d-box"><span class="front">主页</span><span class="back">主页</span></span>
      </a></li>
      <li><a href="../Journal/Journal.jsp" class="three-d">
        日志
        <span class="three-d-box"><span class="front">日志</span><span class="back">日志</span></span>
      </a></li>
      <li><a href="#" class="three-d">
        TA
        <span class="three-d-box"><span class="front">TA</span><span class="back">TA</span></span>
      </a></li>
      <li><a href="../information/information.jsp" class="three-d">
        博主
        <span class="three-d-box"><span class="front">博主</span><span class="back">博主</span></span>
      </a></li>
      <li><a href="#" class="three-d">
        空间
        <span class="three-d-box"><span class="front">空间</span><span class="back">空间</span></span>
      </a></li>
      <li><a href="#" class="three-d active">
        留言板
        <span class="three-d-box"><span class="front">留言板</span><span class="back">留言板</span></span>
      </a></li>
      <li><a href="../back/back_login.jsp" class="three-d">
        后台
        <span class="three-d-box"><span class="front">后台</span><span class="back">后台</span></span>
      </a></li>
      <%
      	if(user == null){
      %>
      <li><a href="#" class="three-d">
        登陆/注册
        <span class="three-d-box"><span class="front">登陆/注册</span><span class="back">登陆/注册</span></span></a>
        <ul class="clearfix unstyled drop-menu">
          <li><a href="../login/login.jsp" class="three-d">
              登陆
              <span class="three-d-box"><span class="front">登陆</span><span class="back">登陆</span></span>
          </a></li>
          <li><a href="../registered/registered.jsp" class="three-d">
            注册
            <span class="three-d-box"><span class="front">注册</span><span class="back">注册</span></span>
          </a></li>
        </ul>
      </li>
      <%}else{ %>
      <li><a href="#" class="three-d">
        登陆成功/登出
        <span class="three-d-box"><span class="front">登陆成功/登出</span><span class="back"><%=user.getUser_nick()%></span></span></a>
        <ul class="clearfix unstyled drop-menu">
          <li><a href="/myblog/SessionDo" class="three-d">
            登出
            <span class="three-d-box"><span class="front">登出</span><span class="back">登出</span></span>
          </a></li>
        </ul>
      </li>
      <%} %>
    </ul>
  </div>
<!--导航结束-->
<!--留言板start-->
    <div class="messagebox">
        <h2 class="messgebox-zh">留言板:</h2>
        <div class="messagebox-sendword">
            <h3 class="messagebox-sendword-title">主人寄语</h3>
            <p class="messagebox-sendword-content">这是主人寄语的内容（阿迪几啊考虑到加拉看的叫卡拉胶打卡机打卡机都卡死了加大了肯定就爱看劳动局阿卡拉）</p>
        </div>
        <!--文本编写框start-->
        <div class="writeword">
            <div class="send-words-prompt">请填写并您的留言</div>
            <div id='txtDiv' style='border:1px solid #cccccc; height:150px;'>
                <p>请输入内容...</p>
            </div>

            <div style='margin-top:10px;'>
                <button id='btnHtml'>发表留言</button>
                <button id='btnText'>清除内容</button>
                <textarea id='textarea' style='width:100%; height:1000px; margin-top:10px;'></textarea>
            </div>
        </div>
        <!--文本编写框end-->
        <div class="messagebox-message">
            <div class="messagebox-message-num">
                留言(<a href="#">1081</a>)
            </div>
            <!--留言列表start-->
            <div class="messagebox-message-content">
                <!--每个人的留言楼层start-->
                <div class="messagebox-message-content-floor">
                    <div class="floor-left">
                        <img src="img/01.png">
                    </div>
                    <div class="floor-right">
                        <div class="floor-username_floor-num">
                            <a class="username">gc</a>
                            <span class="floornum">第1081楼</span>
                        </div>
                        <div class="floor-content">
                            <pre class="content">你好 这是一段文章内容
                                #include <iostream>
                                using namespace std;
                            </pre>
                        </div>
                        <div class="floor-right-bottom">
                            <span class="msgtime">2015-09-09 09:26</span>
                            <button class="reply-button">回复</button>
                        </div>
                        <hr/>
                        <!--回复列表start-->
                        <div class="reply">
                            <div class="reply-left">
                                <img src="img/02.png">
                            </div>
                            <div class="reply-right">
                                <div class="reply-right-top">
                                    <a class="reply-username">gc</a>
                                </div>
                                <div class="reply-content">
                                    <pre class="reply-content-text">你好 这是回复
                                    </pre>
                                </div>
                                <div class="reply-time">2015-09-09 09:33</div>
                            </div>
                        </div>
                        <!--回复列表end-->
                    </div>
                </div>
                <hr/>
                <!--每个人的留言楼层end-->
                <!--每个人的留言楼层start-->
                <div class="messagebox-message-content-floor">
                    <div class="floor-left">
                        <img src="img/01.png">
                    </div>
                    <div class="floor-right">
                        <div class="floor-username_floor-num">
                            <a class="username">gc</a>
                            <span class="floornum">第1080楼</span>
                        </div>
                        <div class="floor-content">
                           <pre>你好 这是一段文章内容
                                #include "stdio.h"
                                int main(){
                                    ******;
                                }
                            </pre>
                        </div>
                        <div class="floor-right-bottom">
                            <span class="msgtime">2015-09-09 09:26</span>
                            <button class="reply-button">回复</button>
                        </div>
                        <hr/>
                        
                    </div>
                </div>
                <hr/>
                <!--每个人的留言楼层end-->
                <!--每个人的留言楼层start-->
                <div class="messagebox-message-content-floor">
                    <div class="floor-left">
                        <img src="img/01.png">
                    </div>
                    <div class="floor-right">
                        <div class="floor-username_floor-num">
                            <a class="username">gc</a>
                            <span class="floornum">第1079楼</span>
                        </div>
                        <div class="floor-content">
                            <pre class="content">你好 这是一段文章内容
                                #include &ltiostream>
                                using namespace std;
                            </pre>
                        </div>
                        <div class="floor-right-bottom">
                            <span class="msgtime">2015-09-09 09:26</span>
                            <button class="reply-button">回复</button>
                        </div>
                        <hr/>
                        <!--回复列表start-->
                        <div class="reply">
                            <div class="reply-left">
                                <img src="img/02.png">
                            </div>
                            <div class="reply-right">
                                <div class="reply-right-top">
                                    <a class="reply-username">gc</a>
                                </div>
                                <div class="reply-content">
                                    <pre class="reply-content-text">你好 这是回复
                                    </pre>
                                </div>
                                <div class="reply-time">2015-09-09 09:33</div>
                            </div>
                        </div>
                        <!--回复列表end-->
                    </div>
                </div>
                <hr/>
                <!--每个人的留言楼层end-->
                <!--每个人的留言楼层start-->
                <div class="messagebox-message-content-floor">
                    <div class="floor-left">
                        <img src="img/01.png">
                    </div>
                    <div class="floor-right">
                        <div class="floor-username_floor-num">
                            <a class="username">gc</a>
                            <span class="floornum">第1078楼</span>
                        </div>
                        <div class="floor-content">
                            <pre class="content">你好 这是一段文章内容
                                #include <iostream>
                                using namespace std;
                            </pre>
                        </div>
                        <div class="floor-right-bottom">
                            <span class="msgtime">2015-09-09 09:26</span>
                            <button class="reply-button">回复</button>
                        </div>
                        <hr/>
                        <!--回复列表start-->
                        <div class="reply">
                            <div class="reply-left">
                                <img src="img/02.png">
                            </div>
                            <div class="reply-right">
                                <div class="reply-right-top">
                                    <a class="reply-username">gc</a>
                                </div>
                                <div class="reply-content">
                                    <pre class="reply-content-text">你好 这是回复
                                    </pre>
                                </div>
                                <div class="reply-time">2015-09-09 09:33</div>
                            </div>
                        </div>
                        <!--回复列表end-->
                    </div>
                </div>
                <hr/>
                <!--每个人的留言楼层end-->
                <!--每个人的留言楼层start-->
                <div class="messagebox-message-content-floor">
                    <div class="floor-left">
                        <img src="img/01.png">
                    </div>
                    <div class="floor-right">
                        <div class="floor-username_floor-num">
                            <a class="username">gc</a>
                            <span class="floornum">第1077楼</span>
                        </div>
                        <div class="floor-content">
                            <pre class="content">你好 这是一段文章内容
                                #include <iostream>
                                using namespace std;
                            </pre>
                        </div>
                        <div class="floor-right-bottom">
                            <span class="msgtime">2015-09-09 09:26</span>
                            <button class="reply-button">回复</button>
                        </div>
                        <hr/>
                        <!--回复列表start-->
                        <div class="reply">
                            <div class="reply-left">
                                <img src="img/02.png">
                            </div>
                            <div class="reply-right">
                                <div class="reply-right-top">
                                    <a class="reply-username">gc</a>
                                </div>
                                <div class="reply-content">
                                    <pre class="reply-content-text">你好 这是回复
                                    </pre>
                                </div>
                                <div class="reply-time">2015-09-09 09:33</div>
                            </div>
                        </div>
                        <div class="reply">
                            <div class="reply-left">
                                <img src="img/02.png">
                            </div>
                            <div class="reply-right">
                                <div class="reply-right-top">
                                    <a class="reply-username">gc</a>
                                </div>
                                <div class="reply-content">
                                    <pre class="reply-content-text">你好 这是回复
                                    </pre>
                                </div>
                                <div class="reply-time">2015-09-09 09:33</div>
                            </div>
                        </div>
                        <!--回复列表end-->
                    </div>
                </div>
                <hr/>
                <!--每个人的留言楼层end-->
                <!--分页start-->
                <div class="messagebox-nav">
                    <nav>
                      <ul class="pagination">
                        <li>
                          <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                          </a>
                        </li>
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li>
                          <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                          </a>
                        </li>
                      </ul>
                    </nav>
                </div>
            <!--分页end-->
            </div>
            <!--留言列表end-->
        </div>
    </div>
<!--留言板end-->
</div>
</body>
</html>