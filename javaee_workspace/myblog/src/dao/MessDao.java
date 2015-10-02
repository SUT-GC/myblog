package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import empty.Message;

public class MessDao {
	private static DB_Data db_data;
	private static Statement stmt;
	static{
		db_data = new DB_Data("wb");
		stmt = db_data.getStmt();
	}
	
	/*
	 * 1
	 * 功能: 查出所有的留言记录
	 * sql: select * from wb_messbox;
	 * 函数名:selectMess
	 * 参数: 无
	 * 返回值: ArrayList <Message>
	 */
	public static ArrayList<Message> selectMess(){
		ArrayList<Message> list = null;
		String sql = "select * from wb_messbox;";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			list = new ArrayList<>();
			while(rs.next()){
				Message message = new Message();
				message.setMessbox_id(rs.getInt(1));
				message.setFloor_id(rs.getInt(2));
				message.setUser_id(rs.getInt(3));
				message.setTouser_id(rs.getInt(4));
				message.setMessbox_reply(rs.getString(5));
				message.setMessbox_date(rs.getTimestamp(6));
				list.add(message);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/*
	 * 2
	 * 功能: 按照messbox_id搜索留言记录
	 * sql: select * from wb_messbox where messbox_id = '0';
	 * 方法名: selectMessByID
	 * 参数:int messbox_id
	 * 返回值: Message message
	 * null:为搜索到任何留言记录
	 */
	public static Message selectMessByID(int messbox_id){
		Message message  = null;
		String sql = "select * from wb_messbox where messbox_id = '"+messbox_id+"';";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				message = new Message();
				message.setMessbox_id(rs.getInt(1));
				message.setFloor_id(rs.getInt(2));
				message.setUser_id(rs.getInt(3));
				message.setTouser_id(rs.getInt(4));
				message.setMessbox_reply(rs.getString(5));
				message.setMessbox_date(rs.getTimestamp(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return message;
	}
	
	/*
	 * 3
	 * 功能:根据messbox_id删除留言记录
	 * sql: delete from wb_messbox where messbox_id = '3';
	 * 方法名: deleteMessByID
	 * 参数:int messbox_id
	 * 返回值: int result
	 * -1:执行sql失败或者没执行sql
	 * 0:数据库受影响行数为0
	 * 1:数据库受影响行数为1
	 */
	public static int deleteMessByID(int messbox_id){
		int result = -1;
		String sql ="delete from wb_messbox where messbox_id = '"+messbox_id+"';";
		try {
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/*
	 * 4
	 * 功能: 查询出所有留言为一级留言的记录
	 * sql: select * from wb_messbox where touser_id = '0';
	 * 方法名: selectMessTouseridIsFloor
	 * 参数: 空
	 * 返回值: ArrayList <Message> list;
	 * null: 没有记录
	 */
	public static ArrayList <Message> selectMessTouseridIsFloor(){
		ArrayList<Message> list = null;
		String sql = "select * from wb_messbox where touser_id = '0';";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			list = new ArrayList<>();
			while(rs.next()){
				Message message = new Message();
				message.setMessbox_id(rs.getInt(1));
				message.setFloor_id(rs.getInt(2));
				message.setUser_id(rs.getInt(3));
				message.setTouser_id(rs.getInt(4));
				message.setMessbox_reply(rs.getString(5));
				message.setMessbox_date(rs.getTimestamp(6));
				list.add(message);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
