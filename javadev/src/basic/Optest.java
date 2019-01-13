package basic;

import java.util.Scanner;

//import 단축키 control + shift + o 
//저장할 때 자동으로 임폴트 해주는거 윈도우즈 프레퍼런스 자바 세이브 액션,에서 설정했음

public class Optest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("i: ");
		int i = sc.nextInt();
		
		System.out.print("j: ");
		int j = sc.nextInt();
		
		System.out.println(i + "+" + j + "=" + (i + j));
		System.out.println(i + "-" + j + "=" + (i - j));
		System.out.println(i + "*" + j + "=" + (i * j));
		System.out.println(i + "/" + j + "=" + (i / j));
		System.out.println(i + "%" + j + "=" + (i % j));
		
		//sc.close();
	}
}
