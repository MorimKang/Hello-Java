package basic;

import java.util.Scanner;

//import ����Ű control + shift + o 
//������ �� �ڵ����� ����Ʈ ���ִ°� �������� �����۷��� �ڹ� ���̺� �׼�,���� ��������

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
