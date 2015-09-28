package classtest;

import Encryption.Base64;
import Encryption.Md5;
import dao.UserDao;
import empty.User;

public class Test {
	public static void main(String[] args){
		String src = "123";
		System.out.println(Md5.md5Encode(src));
	}
}
