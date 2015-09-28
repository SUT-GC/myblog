import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.bouncycastle.util.encoders.Hex;

public class MDTest {


	public static void main(String[] args) {
		String src1 = "12345";
		String src2 = "12345";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] md5bytes1 = md.digest(src1.getBytes());
			byte[] md5bytes2 = md.digest(src2.getBytes());
			System.out.println(new String(Hex.encode(md5bytes1)));
			System.out.println(new String(Hex.encode(md5bytes2)));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
