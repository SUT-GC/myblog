package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import empty.Journal;

public class test {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/wb?useUnicode=true&characterEncoding=utf-8", "root", "gc");
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("insert into wb_article(article_title, article_author, article_content, article_summary, article_classify,article_image, article_date, article_private_is, article_private_pass)"
				+"values('我','我','我','我','1','我','2015-08-09 21:22:22','0','0');");
			
//			stmt.executeUpdate("insert into test2(name) values('勾超');");
			ResultSet rs =  stmt.executeQuery("select * from wb_article");
			List <Journal> list = new ArrayList<Journal>();
			while(rs.next()){
				Journal journal = new Journal();
				journal.setJournal_id(rs.getInt(1));
				journal.setTitle(rs.getString(2));
				journal.setAuthor(rs.getString(3));
				journal.setContent(rs.getString(4));
				journal.setSummary(rs.getString(5));
				journal.setClassify(rs.getInt(6));
				journal.setImgpath(rs.getString(7));
				journal.setDatetime(rs.getDate(8));
				journal.setPrivate_is(rs.getInt(9));
				journal.setPrivate_pass(rs.getInt(10));
				
				list.add(journal);
			}
//			ResultSet rs =  stmt.executeQuery("select * from test2");
//			while(rs.next()){
//				System.out.println(rs.getString(1));
//			}
			for(Journal a:list){
				System.out.println(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}
