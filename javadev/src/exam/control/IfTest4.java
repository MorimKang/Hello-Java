package exam.control;

import java.util.Scanner;

public class IfTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위는 1, 바위는 2, 보는 3을 입력>");
		int you = sc.nextInt();
		
//	 if(you == 1)System.out.println("you: 가위"); 
//	 else if(you ==2)System.out.println("you: 바위"); 
//	 else System.out.println("you: 보");
		 
		switch(you) {
		case 1: System.out.println("you: 가위"); break;
		case 2: System.out.println("you: 바위"); break;
		case 3: System.out.println("you: 보"); break;
		default: break;
		}
		
		int com = (int)(Math.random()*3+1);
		
//		if(com == 1)System.out.println("com: 가위");
//		else if(com == 2)System.out.println("com: 바위");
//		else System.out.println("com: 보");
		
		switch(com) {
		case 1: System.out.println("com: 가위"); break;
		case 2: System.out.println("com: 바위"); break;
		case 3: System.out.println("com: 보"); break;
		default: break;
		}
		
//		
//		if(you == 1) {
//			if(com == 1)System.out.println("무승부입니다.");
//			else if(com == 2)System.out.println("당신의 승리입니다.");
//			else if(com == 3)System.out.println("당신의 패배입니다.");
//		}
//		else if(you == 2) {
//			if(com == 2)System.out.println("무승부입니다.");
//			else if(com == 1)System.out.println("당신의 승리입니다.");
//			else if(com == 3)System.out.println("당신의 패배입니다.");
//		}
//		else if(you == 3) {
//			if(com == 3)System.out.println("무승부입니다.");
//			else if(com == 1)System.out.println("당신의 패배입니다.");
//			else if(com == 2)System.out.println("당신의 승리입니다.");
		
//		if((you ==1 && com == 3)||
//			(you ==2 && com == 1)||
//			(you ==3 && com == 1))System.out.println("당신의 승리");
//		else if (you ==com ) System.out.println("무승부"); 
//		else System.out.println("당신의 패배");
		
		switch(you) {
		case 1:
			switch(com){
				case 1: System.out.println("무승부입니다."); break;
				case 2: System.out.println("당신의 패배입니다.");break;
				case 3: System.out.println("당신의 승리입니다.");break;
			}
//			if(com == 1)System.out.println("무승부입니다.");
//			else if(com == 2)System.out.println("당신의 패배입니다.");
//			else if(com == 3)System.out.println("당신의 승리입니다.");
			break;
		case 2:
			switch(com){
				case 1: System.out.println("당신의 패배입니다."); break;
				case 2: System.out.println("무승부입니다.");break;
				case 3: System.out.println("당신의 승리입니다.");break;
		}
//			if(com == 2)System.out.println("무승부입니다.");
//			else if(com == 1)System.out.println("당신의 승리입니다.");
//			else if(com == 3)System.out.println("당신의 패배입니다.");
			break;
		case 3:
			switch(com){
				case 1: System.out.println("당신의 패배입니다."); break;
				case 2: System.out.println("당신의 승리입니다."); break;
				case 3: System.out.println("무승부입니다."); break;
		}
//			if(com == 3)System.out.println("무승부입니다.");
//			else if(com == 1)System.out.println("당신의 패배입니다.");
//			else if(com == 2)System.out.println("당신의 승리입니다.");
		default: break;
		}
		
		//계산해서 간단하게 케이스 나누기
		//(you - com + 3 )% 3
		//case 0:
		//case 1:
		//case 2:
		
		
	}
}
