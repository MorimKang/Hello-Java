package exam.control;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		int c1, c2, c3;
		int h1, h2, h3;
		int s, b;
		int count = 0;
		
		c1 = (int)(Math.random()*10);
		do {
			c2 = (int)(Math.random()*10);
		}while(c2 == c1);
		do {
			c3 = (int)(Math.random()*10);
		}while(c3 == c1 || c3 == c2);
		
		Scanner sc = new Scanner(System.in);
		
		do {
			//strike와 ball 초기화
			s = b = 0; 
			
			//스캐너로 입력받기: ex) 1 2 3 (숫자 사이에 스페이스 한번)
			System.out.println("0부터 9사이의 중복되지 않은 숫자 3개 입력 ex) 1 2 3");
			
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			
			//strike와 ball 개수 세기
			if(h1 == c1) s++;
			else if(h1 == c2 || h1 == c3) b++;
			if(h2 == c2) s++;
			else if(h2 == c1 || h2 == c3) b++;
			if(h3 == c3) s++;
			else if(h3 == c1 || h3 == c2) b++;
			
			//strike와 ball 개수 출력
			
			System.out.println("Strike: " + s);
			System.out.println("Ball: " + b);
		
			count++;
		}while(s != 3);//또는 (s < 3)
		
		System.out.println("축하합니다. " + count + "번만에 맞추셨습니다.");
	}
}
