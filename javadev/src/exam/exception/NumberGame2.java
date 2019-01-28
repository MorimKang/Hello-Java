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
			System.out.println("1~99 ������ ���ڸ� �Է��ϼ��� > ");
			try {
				you = Integer.parseInt(sc.nextLine());
				num++;
				if(you<1 || you>99) 
					throw new InputMismatchException();
				
				if(x > you) 
					System.out.println("x�� "+you+"���� Ů�ϴ�.");
				else if(x < you)
					System.out.println("x�� "+you+"���� �۽��ϴ�.");
				else break;
			}catch(InputMismatchException | NumberFormatException e){
				System.out.println("�߸��� �Է��Դϴ�. ���� ���� ������ �Է��ϼ���.");
			}
		}
		System.out.println("�����Դϴ�. \n"+ num+"������ ���߼̽��ϴ�.\n x�� "+ x +"�Դϴ�.");
		
	}
}
