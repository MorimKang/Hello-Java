package exam.exception;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest09 {
	public static void main(String[] args) {

		UserDTO[] registUsers = {
			new UserDTO("wonbean","����","1111"),
			new UserDTO("donggun","�嵿��","2222"),
			new UserDTO("depp","���ϵ�","3333"),
			new UserDTO("leo","���������� ��ī������","4444")
		};
		
		showRegistUsers(registUsers);
		
		 
		Scanner sc = new Scanner(System.in);
		UserDTO userDTO = new UserDTO();
		System.out.print("id : ");
		userDTO.setUser_id(sc.next());

		System.out.print("pw : ");
		userDTO.setUser_pw(sc.next());
		
		UserDTO userInfo = null;
		try {
			userInfo = login(userDTO, registUsers);
			System.out.println(
					userInfo.getUser_name() + "���� �α��� �ϼ̽��ϴ�");
				
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static UserDTO login(UserDTO userDTO, UserDTO[] registUsers) throws IOException {
		for(int i=0; i < registUsers.length; i++) {
			if (userDTO.getUser_id().equals(registUsers[i].getUser_id())) {
				if (userDTO.getUser_pw().equals(registUsers[i].getUser_pw())) {
					return registUsers[i];
				} else {
					throw new LoginFailException(userDTO, "�н����尡 Ʋ���ϴ�");
				}
			}
		}
		throw new LoginFailException(userDTO, "ȸ���� �������� �ʽ��ϴ�");
	}

	private static void showRegistUsers(UserDTO[] registUsers) {
		System.out.println("��ü ȸ�� ���");
		for(UserDTO userDTO:registUsers) {
			System.out.println(userDTO);
		}
		System.out.println("--------------------------");
	}
}
