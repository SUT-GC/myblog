package classtest;

import Encryption.Base64;
import Encryption.Md5;

public class Test {
	public static void main(String[] args){
		String src = "12345";
		String result = "";
		result = Base64.base64Encoder(src);
		System.out.println(result);
		result = Base64.base64Decoder(result);
		System.out.println(result);
	}
}
