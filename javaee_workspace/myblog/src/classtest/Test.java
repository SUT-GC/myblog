package classtest;

import Encryption.Base64;
import Encryption.Md5;
import dao.UserDao;
import empty.User;

public class Test {
	public static void main(String[] args){
		User user = new User();
		user.setUser_id(1);
		user.setUser_email("123");
		user.setUser_imagepath("123");
		user.setUser_nick("123");
		user.setUser_pass("123");
		user.setUser_isadmin(1);
		
		UserDao.insertUser(user);
	}
}
