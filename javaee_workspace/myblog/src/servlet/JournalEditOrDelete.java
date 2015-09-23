package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JournalEditOrDelete
 */
@WebServlet(name = "journalEditOrDelete", urlPatterns = { "/JournalEditOrDelete" })
public class JournalEditOrDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JournalEditOrDelete() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String journalDo = request.getParameter("do");
		String journalID = request.getParameter("id");
		
		if(journalDo.equals("edit")){
			response.sendRedirect("jsp/back/back_journal_edit.jsp?id="+journalID);
		}
	}

}
