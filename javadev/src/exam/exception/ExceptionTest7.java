package exam.exception;

import java.util.Scanner;

public class ExceptionTest7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("���̵�   >");
		//String user_id = sc.nextLine();
		memberDTO.setUser_id(sc.nextLine()); 
		
		System.out.println("��й�ȣ   >");
		//String user_pw = sc.nextLine();
		memberDTO.setUser_pw(sc.nextLine());
		
		try {
			if(memberDTO.getUser_id().equals("morim") && memberDTO.getUser_pw().equals("d404559f602eab6fd602ac7680dacbfaadd13630335e951f097af3900e9de176b6db28512f2e000b9d04fba5133e8b1c6e8df59db3a8ab9d60be4b97cc9e81db")) {
				memberDTO.setUser_name("Kang Morim");
				System.out.println(memberDTO.getUser_name()+"("+
				memberDTO.getUser_id()+")���� �α����ϼ̽��ϴ�.");
				return;
			}else {
				throw new RuntimeException("���̵� Ȥ�� ��й�ȣ�� Ʋ���ϴ�.");
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("���α׷� ����: "+ e.getMessage());
		}
		System.out.println("End");
		
	}
}
