package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.JournalDao;
import empty.Journal;

/**
 * Servlet implementation class ReleaseJournal
 */
@WebServlet(name="releaseJournal", urlPatterns={"/ReleaseJournal"})
public class ReleaseJournal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReleaseJournal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("this is servler!!");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		Journal journal = new Journal();
		journal.setTitle(request.getParameter("article_title"));
		journal.setAuthor(request.getParameter("article_author"));
		journal.setSummary(request.getParameter("article_summary"));
		journal.setContent(request.getParameter("article_content"));
		journal.setClassify(Integer.parseInt(request.getParameter("article_classify")));
		journal.setImgpath("111");
		if(request.getParameter("isprivate")!=null&&request.getParameter("isprivate").equals("1")){
			System.out.println("11111111111111111111");
			journal.setPrivate_is(1);
			if(request.getParameter("private_pass").equals("") || request.getParameter("private_pass")==null){
				journal.setPrivate_pass(0);
			}else{
				journal.setPrivate_pass(Integer.parseInt(request.getParameter("private_pass")));
			}
		}else{
			System.out.println("0000000000000000000");
			journal.setPrivate_is(0);
			journal.setPrivate_pass(-1);
		}
		
		
		journal.setDatetime(new Date());
		//System.out.println(journal);
		JournalDao.journalInsert(journal);
		
		response.sendRedirect("jsp/back/back_journal_release.jsp");
	}

}
