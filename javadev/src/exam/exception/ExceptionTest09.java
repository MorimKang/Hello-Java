package exam.exception;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest09 {
	public static void main(String[] args) {

		UserDTO[] registUsers = {
			new UserDTO("wonbean","원빈","1111"),
			new UserDTO("donggun","장동건","2222"),
			new UserDTO("depp","조니뎁","3333"),
			new UserDTO("leo","레오나르도 디카프리오","4444")
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
					userInfo.getUser_name() + "님이 로그인 하셨습니다");
				
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
					throw new LoginFailException(userDTO, "패스워드가 틀립니다");
				}
			}
		}
		throw new LoginFailException(userDTO, "회원이 존재하지 않습니다");
	}

	private static void showRegistUsers(UserDTO[] registUsers) {
		System.out.println("전체 회원 목록");
		for(UserDTO userDTO:registUsers) {
			System.out.println(userDTO);
		}
		System.out.println("--------------------------");
	}
}
