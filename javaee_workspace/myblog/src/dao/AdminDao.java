package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import empty.Admin;

public class AdminDao {
    private static DB_Data db_data;
    private static Statement stmt;
    
    static{
    	db_data = new DB_Data("wb");
    	stmt = db_data.getStmt();
    }
    
    /*
     * 功能:查询出wb_admin数据库中所有记录
     * sql:select * from wb_admin;
     * 方法名:selectAdmins
     * 参数:无
     * 返回值:ArrayList<Admin> list
     * null:未查到记录
     */
    public static ArrayList<Admin> selectAdmins(){
    	ArrayList <Admin> list = null;
    	String sql = "select * from wb_admin;";
    	try {
			ResultSet rs = stmt.executeQuery(sql);
			list = new ArrayList<>();
			while(rs.next()){
				Admin admin = new Admin();
				admin.setAdmin_id(rs.getInt(1));
				admin.setAdmin_username(rs.getString(2));
				admin.setAdmin_password(rs.getString(3));
				list.add(admin);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return list;
    }
}
