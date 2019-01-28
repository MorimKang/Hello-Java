package exam.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGame2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = (int)(Math.random()*99+1);
		
		int you = -999;
		int num = 0;
		while(true) {
			System.out.println("1~99 사이의 숫자를 입력하세요 > ");
			try {
				you = Integer.parseInt(sc.nextLine());
				num++;
				if(you<1 || you>99) 
					throw new InputMismatchException();
				
				if(x > you) 
					System.out.println("x는 "+you+"보다 큽니다.");
				else if(x < you)
					System.out.println("x는 "+you+"보다 작습니다.");
				else break;
			}catch(InputMismatchException | NumberFormatException e){
				System.out.println("잘못된 입력입니다. 범위 안의 정수를 입력하세요.");
			}
		}
		System.out.println("정답입니다. \n"+ num+"번만에 맞추셨습니다.\n x는 "+ x +"입니다.");
		
	}
}
