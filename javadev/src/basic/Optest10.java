package basic;

import java.util.Scanner;

public class Optest10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요: ");
		int n = sc.nextInt();
		
		System.out.println((n%2) == 0 ? "짝수" : "홀수");
	}
}
