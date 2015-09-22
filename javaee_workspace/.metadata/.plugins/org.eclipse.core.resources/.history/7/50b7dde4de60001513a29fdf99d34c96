package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import empty.Journal;

public class JournalDao {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url ="jdbc:mysql://localhost:3306/wb";
	private static String user ="root";
	private static String password ="gc";
	
	public static int journalInsert(Journal journal) {
		if(journal.getTitle().equals("")){
			return 2;
		}else if(journal.getSummary().equals("")){
			return 3;
		}else if(journal.getContent().equals("")){
			return 4;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int a = 0;
		String sql = "insert into " + "wb_article(article_title, article_author, "
				+ "article_content, article_summary, article_classify,"
				+ "article_image, article_date, article_private_is, article_private_pass)" + "values('"
				+ journal.getTitle() + "','"+journal.getAuthor()+"','" + journal.getContent() + "','" + journal.getSummary() + "','"
				+ journal.getClassify() + "','" + journal.getImgpath() + "','" + sdf.format(journal.getDatetime())+ "','"
				+ journal.getPrivate_is() + "','" + journal.getPrivate_pass() + "')";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
//			System.out.println(journal);
			a = stmt.executeUpdate(sql);
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return a;
	}
	
}
