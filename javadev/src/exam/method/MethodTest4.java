package exam.method;

import java.util.Scanner;

public class MethodTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요>> ");
		String name = sc.nextLine();
		
		//System.out.println(name.hashCode());
		
		callname(name);
		System.out.println(callname2("callname2" + name));
	}

	private static String callname2(String name) {  ///다른 프로그램에서도 쓰려면 이 형태가 나음.
		return name;
	}

	private static void callname(String name) {
		if(name.equals("정대만"))		//기본자료 이외의 자료형은 ==쓸수 없음. equals() 사용
			System.out.println(name);
		else if(name.equals("최치수"))
			System.out.println("최치수치수치최치수");
		else 
			System.out.println("바보바보바보바보바보"+ name);
		return;
	}
}
