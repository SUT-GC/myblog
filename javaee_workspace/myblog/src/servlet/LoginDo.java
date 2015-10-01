package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginDo
 */
@WebServlet(name="loginDo", urlPatterns={"/LoginDo"})
public class LoginDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//将request,response转码为utf-8
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		/*
		 * 对于检查各个输入而进行检查
		 */
		//-2: 内容为空, -1:email 格式不符合,  0: email冲突
		int emailresult = -1;
		//-1: nick 为空
		int nickresult = -1;
		//-2: pw 为空, -1: 密码没有达到6-16字符的要求 
		int pwresult = -1;
		//-1: rpw 为空
		int rpwresult = -1;
		
		/*
		 * 对错误消息进行储存别且进行传送
		 */
		//存总的错误信息
		String errall = "";
		//存email错误信息
		String erremail = "";
		//存nick错误信息
		String errnick = "";
		//存密码错误信息
		String errpw = "";
		//存验证的错误信息
		String errrpw = "";
		
		/*
		 * 存储注册成功的信息
		 */
		String succreg = "";
		
		//读取request带来的信息
		String email = request.getParameter("email");
		String nick = request.getParameter("nick");
		String password = request.getParameter("password");
		String repeat = request.getParameter("repeatpassword");
		
		//测试是否接受到
		System.out.println(email+" "+nick+" "+password+" "+repeat);
		
		//对每个信息进行判断
		if(email.split(" ").length == 0 || email.equals("")){
			emailresult = -2;
			erremail += "邮箱不能为空&";
		}else if(email.matches("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.)(com|cn|org|net|gov)")){
			emailresult = 1;
		}else{
			erremail += "email格式不符合&";
			emailresult = -1;
		}
		
		if(nick.split(" ").length != 0 && !nick.equals("")){
			nickresult = 1;
		}else{
			errnick += "昵称不能为空&";
			nickresult = -1;
		}
		
		if(password.length() <6 && password.length() > 16){
			pwresult = -2;
			errpw +=  "密码需要6-16个字符&";
		}else if(password.split(" ").length != 0 && !password.equals("")){
			pwresult = 1;
		}else{
			errpw += "密码不能为空&";
			pwresult = -1;
		}
		
		if(repeat.split(" ").length != 0 && !password.equals("") && repeat.equals(password)){
			rpwresult = 1;
		}else{
			errrpw = "两次密码输入不一致&";
			rpwresult = -1;
		}
		
		//测试何种报错的数据
		System.out.println(emailresult+" "+nickresult+" "+pwresult+" "+rpwresult);
		if((emailresult + nickresult + pwresult + pwresult) == 4){
			succreg += "恭喜您，注册成功" ;
			response.sendRedirect("jsp/login/login.jsp?Rm="+succreg);
		}else{
			errall += erremail + errnick + errpw + errrpw;
			response.sendRedirect("jsp/registered/registered.jsp?Rm="+errall);
		}
		
		
	}

}
