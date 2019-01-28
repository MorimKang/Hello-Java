package exam.exception;

import org.apache.commons.codec.digest.DigestUtils;

public class CodecTest {
	public static void main(String[] args) {
		String str = "1234";
		
		System.out.println(DigestUtils.sha512Hex(str));
	}
}
