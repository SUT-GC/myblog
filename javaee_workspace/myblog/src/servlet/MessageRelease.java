package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MessDao;
import empty.Message;

/**
 * Servlet implementation class MessageRelease
 */
@WebServlet(name = "messageRelease", urlPatterns = {"/MessageRelease"})
public class MessageRelease extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageRelease() {
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
		/*
		 * 对request与response进行utf-8的解码
		 */
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		/*
		 * 读取页面输出字节流
		 */
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		/*
		 * 变量errmsg返回发布留言的后台验证信息
		 * 0:用户未登录，不能进行留言
		 * 1:request中的留言内容参数未找到
		 * 2:留言内容不能为空
		 * 3:用户留言成功
		 */
		int errmsg = -1;
		
		/*
		 * 进行检验
		 */
		int maxfloorid = -1;
		String firstMessContent = "";
		Message message = new Message();
		if(!request.getParameter("userid").equals("-1")){
			maxfloorid = MessDao.countFirstMess();
			if(request.getParameter("firstmessage")!=null){
				firstMessContent = request.getParameter("firstmessage");
				System.out.println("~"+firstMessContent+"~");
				if(firstMessContent.split(" ").length != 0 && !firstMessContent.equals("")){
					firstMessContent = firstMessContent.replaceAll("<", "&lt");
					message.setFloor_id(maxfloorid+1);
					message.setUser_id(Integer.parseInt(request.getParameter("userid")));
					message.setTouser_id(0);
					message.setMessbox_reply(firstMessContent);
					message.setMessbox_date(new Date());
					if(MessDao.insertMess(message) == 1){
						errmsg = 3;
					}
				}else{
					errmsg = 2;
				}
			}else{
				errmsg = 1;
			}
		}else{
			errmsg = 0;
		}
		
		response.sendRedirect("jsp/editor/messagebox.jsp?errmsg="+errmsg);
		
		out.println(maxfloorid);
		out.println(firstMessContent);
		out.print(message);
	}

}
