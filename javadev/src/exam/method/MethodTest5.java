package exam.method;

import java.util.Scanner;

public class MethodTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ 1, ������ 2, ���� 3�� �Է�>");
		int you = sc.nextInt();
		int com = (int)(Math.random()*3+1); 
	
		
//		switch(you) {
//		case 1: System.out.println("you: ����"); break;
//		case 2: System.out.println("you: ����"); break;
//		case 3: System.out.println("you: ��"); break;
//		default: break;
//		}
		
		//int com = (int)(Math.random()*3+1);
		
//		switch(com) {
//		case 1: System.out.println("com: ����"); break;
//		case 2: System.out.println("com: ����"); break;
//		case 3: System.out.println("com: ��"); break;
//		default: break;
//		}
		System.out.print("you: ");
		rps(you);
		System.out.print("com: ");
		rps(com);
	
		switch(you) {
		case 1:
			switch(com){
				case 1: System.out.println("���º��Դϴ�."); break;
				case 2: System.out.println("����� �й��Դϴ�.");break;
				case 3: System.out.println("����� �¸��Դϴ�.");break;
			}
			break;
		case 2:
			switch(com){
				case 1: System.out.println("����� �й��Դϴ�."); break;
				case 2: System.out.println("���º��Դϴ�.");break;
				case 3: System.out.println("����� �¸��Դϴ�.");break;
		}
			break;
		case 3:
			switch(com){
				case 1: System.out.println("����� �й��Դϴ�."); break;
				case 2: System.out.println("����� �¸��Դϴ�."); break;
				case 3: System.out.println("���º��Դϴ�."); break;
		}
		default: break;
		}		
	}

	private static void rps(int val) {
		switch(val) {
			case 1: System.out.println(" ����"); break;
			case 2: System.out.println(" ����"); break;
			case 3: System.out.println(" ��"); break;
			default: System.out.println("����");break;
		}		
	}
}
