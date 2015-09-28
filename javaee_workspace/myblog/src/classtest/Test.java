package classtest;

import Encryption.Md5;

public class Test {
	public static void main(String[] args){
		String src = "12345";
		System.out.println(Md5.md5Encode(src));
	}
}
