package exam.method;

import java.util.Scanner;

public class MethodTest6 {
	public static void main(String[] args) {
		//1.���ڸ� �Է¹޾Ƽ� �������, ��������, ����� ������ �ƴ��� �Ǵ�	
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���> ");
		int num = sc.nextInt();
		
		if(num > 0 ) {
			System.out.println("�Է��Ͻ� ���� " + num + "��/�� ����Դϴ�.");
		}else if(num < 0) {
			System.out.println("�Է��Ͻ� ���� " + num + "��/�� �����Դϴ�.");
		}else System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		
		//2.������� �Ǻ� �޼ҵ� �и�1
		Scanner sc2 = new Scanner(System.in);
		System.out.println("---------�޼ҵ�� �غ���1-------- ");
		System.out.println("���ڸ� �Է��ϼ���> ");
		int num2 = sc2.nextInt();
		whatnumber(num2);
		
		//2.������� �Ǻ� �޼ҵ� �и�2
		Scanner sc3 = new Scanner(System.in);
		System.out.println("---------�޼ҵ�� �غ���2-------- ");
		System.out.println("���ڸ� �Է��ϼ���> ");
		int num3 = sc3.nextInt();
		System.out.println(getPNZ(num3));
	}

	private static String getPNZ(int num) {
		if(num > 0) {
			return "�Է��Ͻ� ���� " + num + "��/�� ����Դϴ�.";
		}else if(num < 0) {
			return "�Է��Ͻ� ���� " + num + "��/�� �����Դϴ�.";
		}else return "�Է��Ͻ� ���� " + num + "�� 0�Դϴ�.";
	}

	private static void whatnumber(int num) {
		if(num > 0) {
			System.out.println("�Է��Ͻ� ���� " + num + "��/�� ����Դϴ�.");
		}else if(num < 0) {
			System.out.println("�Է��Ͻ� ���� " + num + "��/�� �����Դϴ�.");
		}else System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
	}
}
