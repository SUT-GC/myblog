package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import empty.Journal;

public class JournalDao {
	private static Statement stmt;

	/*
	 * 静态初始化框
	 */
	static {
		stmt = new DB_Data("wb").getStmt();
	}

	/*
	 * 插入wb_article表函数 接受journal参数，把journal相关数据插入到数据库里
	 * 插入之间判断journal里title属性，summary属性，content属性是否为空 如果为空，分别返回2,3,4
	 * 如果插入成功，会返回有效插入的条数 如果插入故障，返回5
	 */
	public static int journalInsert(Journal journal) {
		if (journal.getTitle().equals("")) {
			return 2;
		} else if (journal.getSummary().equals("")) {
			return 3;
		} else if (journal.getContent().equals("")) {
			return 4;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int a = 0;
		String sql = "insert into " + "wb_article(article_title, article_author, "
				+ "article_content, article_summary, article_classify,"
				+ "article_image, article_date, article_private_is, article_private_pass)" + "values('"
				+ journal.getTitle() + "','" + journal.getAuthor() + "','" + journal.getContent() + "','"
				+ journal.getSummary() + "','" + journal.getClassify() + "','" + journal.getImgpath() + "','"
				+ sdf.format(journal.getDatetime()) + "','" + journal.getPrivate_is() + "','"
				+ journal.getPrivate_pass() + "')";

		try {
			a = stmt.executeUpdate(sql);
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
			return 5;
		}
		return a;
	}

	/*
	 * select *from wb_article 查询函数
	 * 返回ArrayList<Journal> list 返回查询的结果
	 */
	public static ArrayList journalSelect() {
		ArrayList<Journal> list = new ArrayList<>();
		try {
			ResultSet rs = stmt.executeQuery("select * from wb_article");
			while (rs.next()) {
				Journal journal = new Journal();
				journal.setJournal_id(rs.getInt(1));
				journal.setTitle(rs.getString(2));
				journal.setAuthor(rs.getString(3));
				journal.setContent(rs.getString(4));
				journal.setSummary(rs.getString(5));
				journal.setClassify(rs.getInt(6));
				journal.setImgpath(rs.getString(7));
				journal.setDatetime(rs.getTimestamp(8));
				journal.setPrivate_is(rs.getInt(9));
				journal.setPrivate_pass(rs.getInt(10));
				list.add(journal);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (Journal a : list) {
			System.out.println(a);
		}
		return list;
	}

	/*
	 * sql: select * from wb_article where article_id = id; 
	 * 函数名 selectByID 参数int
	 * id 返回值 Journal的一个对象
	 */
	public static Journal selectByID(int id) {
		Journal journal = null;
		String sql = "select * from wb_article where article_id = " + id;
		try {
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				journal = new Journal();
				journal.setJournal_id(id);
				journal.setTitle(rs.getString(2));
				journal.setAuthor(rs.getString(3));
				journal.setContent(rs.getString(4));
				journal.setSummary(rs.getString(5));
				journal.setClassify(rs.getInt(6));
				journal.setImgpath(rs.getString(7));
				journal.setDatetime(rs.getDate(8));
				journal.setPrivate_is(rs.getInt(9));
				journal.setPrivate_pass(rs.getInt(10));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return journal;
	}

	/*
	 * sql: delete from wb_article where article_id = id; 
	 * 函数名字 deleteJournal 参数
	 * int id 返回值，删除之后的结果 1
	 */
	public static int deleteJournal(int id) {
		int result = 0;
		String sql = "delete  from wb_article where article_id = " + id;
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			return result;
		}
		return result;
	}
}
