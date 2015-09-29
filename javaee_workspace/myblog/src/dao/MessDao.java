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
	
}