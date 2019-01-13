package exam.control;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("È¦Â¦ ÆÇº°-¼ýÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä: ");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println("Â¦¼ö");
		}else {
			System.out.println("È¦¼ö");
		}
	}
}
