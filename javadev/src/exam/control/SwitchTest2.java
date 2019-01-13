package exam.control;

import java.util.Scanner;

public class SwitchTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요> ");
		int num = sc.nextInt();
		
		switch(num){
			case 1:
			case 3:
				System.out.println("남자");
				break;
			case 2:
			case 4:
				System.out.println("여자");
				break;
			default:
				System.out.println("에러");
				break;
		}
	}
}
