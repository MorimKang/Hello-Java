package exam.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoginFailException extends RuntimeException {
	public LoginFailException(String message) {
		super(message);
	}
	
	public LoginFailException(Object obj, String message) throws IOException {
		super(message);
		File file = new File("log.txt");
		FileWriter fw = new FileWriter(file, true);
		if (obj instanceof UserDTO) {
			UserDTO memberVO = (UserDTO) obj;
			fw.write("�Ʒ��� ���� ������ �α��� �õ��� �־���\n");
			fw.write(memberVO.toString() + "\n");
			fw.close();
		}
	}
}
