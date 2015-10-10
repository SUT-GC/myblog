package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import empty.Reply;

public class ReplyDao {
	private static Statement stmt;

	/*
	 * 静态初始化框
	 */
	static {
		stmt = new DB_Data("wb").getStmt();
	}
	
	/*
	 * 1
	 * 功能: 向wb_reply中插入Reply
	 * sql: insert wb_reply (reply_content, article_id, user_id, reply_date) values('sada', '4', '17', '2015-02-12 13:22:00');
	 * 方法名: insertReply
	 * 参数:Reply reply
	 * 返回值 int result
	 * 1:插入成功
	 * 0:插入失败
	 */
	public static int insertReply(Reply reply){
		int result = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sql = "insert wb_reply (reply_content, article_id, user_id, reply_date) values ('"
							+reply.getReplycontent()+"','"
							+reply.getArticleid()+"','"
							+reply.getUserid()+"','"
							+sdf.format(reply.getReplydate())+"');";
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	 * 2
	 * 功能: 根据article_id 查询出reply记录
	 * sql: select * from wb_reply where article_id = '28';
	 * 方法名: selectReply
	 * 参数: int articleid
	 * 返回值: ArrayList <Reply> list
	 */
	public static ArrayList<Reply> selectReply(int articleid){
		ArrayList<Reply> list = null;
		String sql = "select * from wb_reply where article_id = '"+articleid+"';";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			list = new ArrayList<>();
			while(rs.next()){
				Reply reply = new Reply();
				reply.setReplycontent(rs.getString(2));
				reply.setUserid(rs.getInt(4));
				reply.setArticleid(rs.getInt(3));
				reply.setReplydate(rs.getTimestamp(5));
				list.add(reply);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/*
	 * 3
	 * 功能: 根据article_id 计算出该article的回复数量
	 * sql: select count(*) from wb_reply where article_id = '28'; 
	 * 方法名: countReplyByArticleID
	 * 参数: int articleid
	 * 返回值: int result;
	 */
	public static int countReplyByArticleID(int articleid){
		int result = 0;
		String sql = "select count(*) from wb_reply where article_id = '"+articleid+"'; ";
		 try {
			ResultSet rs  = stmt.executeQuery(sql);
			while(rs.next()){
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
