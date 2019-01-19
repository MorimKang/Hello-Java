package exam.method;

import java.util.Scanner;

public class MethodTest6 {
	public static void main(String[] args) {
		//1.숫자를 입력받아서 양수인지, 음수인지, 양수도 음수도 아닌지 판단	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요> ");
		int num = sc.nextInt();
		
		if(num > 0 ) {
			System.out.println("입력하신 숫자 " + num + "은/는 양수입니다.");
		}else if(num < 0) {
			System.out.println("입력하신 숫자 " + num + "은/는 음수입니다.");
		}else System.out.println("입력하신 숫자는 0입니다.");
		
		//2.양수음수 판별 메소드 분리1
		Scanner sc2 = new Scanner(System.in);
		System.out.println("---------메소드로 해보기1-------- ");
		System.out.println("숫자를 입력하세요> ");
		int num2 = sc2.nextInt();
		whatnumber(num2);
		
		//2.양수음수 판별 메소드 분리2
		Scanner sc3 = new Scanner(System.in);
		System.out.println("---------메소드로 해보기2-------- ");
		System.out.println("숫자를 입력하세요> ");
		int num3 = sc3.nextInt();
		System.out.println(getPNZ(num3));
	}

	private static String getPNZ(int num) {
		if(num > 0) {
			return "입력하신 숫자 " + num + "은/는 양수입니다.";
		}else if(num < 0) {
			return "입력하신 숫자 " + num + "은/는 음수입니다.";
		}else return "입력하신 숫자 " + num + "은 0입니다.";
	}

	private static void whatnumber(int num) {
		if(num > 0) {
			System.out.println("입력하신 숫자 " + num + "은/는 양수입니다.");
		}else if(num < 0) {
			System.out.println("입력하신 숫자 " + num + "은/는 음수입니다.");
		}else System.out.println("입력하신 숫자는 0입니다.");
	}
}
