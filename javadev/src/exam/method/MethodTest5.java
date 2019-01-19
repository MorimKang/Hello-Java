package exam.method;

import java.util.Scanner;

public class MethodTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위는 1, 바위는 2, 보는 3을 입력>");
		int you = sc.nextInt();
		int com = (int)(Math.random()*3+1); 
	
		
//		switch(you) {
//		case 1: System.out.println("you: 가위"); break;
//		case 2: System.out.println("you: 바위"); break;
//		case 3: System.out.println("you: 보"); break;
//		default: break;
//		}
		
		//int com = (int)(Math.random()*3+1);
		
//		switch(com) {
//		case 1: System.out.println("com: 가위"); break;
//		case 2: System.out.println("com: 바위"); break;
//		case 3: System.out.println("com: 보"); break;
//		default: break;
//		}
		System.out.print("you: ");
		rps(you);
		System.out.print("com: ");
		rps(com);
	
		switch(you) {
		case 1:
			switch(com){
				case 1: System.out.println("무승부입니다."); break;
				case 2: System.out.println("당신의 패배입니다.");break;
				case 3: System.out.println("당신의 승리입니다.");break;
			}
			break;
		case 2:
			switch(com){
				case 1: System.out.println("당신의 패배입니다."); break;
				case 2: System.out.println("무승부입니다.");break;
				case 3: System.out.println("당신의 승리입니다.");break;
		}
			break;
		case 3:
			switch(com){
				case 1: System.out.println("당신의 패배입니다."); break;
				case 2: System.out.println("당신의 승리입니다."); break;
				case 3: System.out.println("무승부입니다."); break;
		}
		default: break;
		}		
	}

	private static void rps(int val) {
		switch(val) {
			case 1: System.out.println(" 가위"); break;
			case 2: System.out.println(" 바위"); break;
			case 3: System.out.println(" 보"); break;
			default: System.out.println("에러");break;
		}		
	}
}
