package exam.control;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요: ");
		int n = sc.nextInt();
		
		if(n == 1){
			System.out.println("남자");
		}else if(n == 2){
			System.out.println("여자");
		}else {
			System.out.println("오류");
		}
		
		System.out.println("종료");
	}
}
