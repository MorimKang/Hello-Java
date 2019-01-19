package exam.control;

import java.util.Calendar;
import java.util.Scanner;

//*****�޷�¥��********
//1���� ������������
//�� ���� ���ϱ��� �ִ��� �˾Ƴ�����.
//
//
//��ĳ�ʷ� ��¥ �Է¹ް�.
//Ķ���� ����
//��¥ ����
//�����̶� �̴��� ������ �� ���ϸ�
//�޷� ���� �� �ִ�.

public class CalendarTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��> ");  int year = sc.nextInt();
		System.out.println("��> ");  int month = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1); 								 //����ڰ� �Է��� ���� 1�Ϸ� ��¥����.
		int week = c.get(Calendar.DAY_OF_WEEK); 				 //1���� ������������ �˾Ƴ���.�Ͽ����� =1 �������� 2 ....
		int end_day = c.getActualMaximum(Calendar.DAY_OF_MONTH); //������ �� ��¥ �˾Ƴ���
		
		System.out.println("�� �� ȭ �� �� �� ��");
		System.out.println("---------------------");
		for(int d = 1; d < week; d++) System.out.print("   "); 	 //1���� ���� �������� ���� ���
		
		for(int d = 1, w=week; d <= end_day; d++,w++) {
			System.out.print(d < 10? " "+ d + " " : d + " ");    //��¥�� ���ڸ� �����϶��� �յڷ� ���� ���
																 //���ڸ��� ���� ������� �ڿ��� ����.																
			if(w%7 ==0)System.out.println(); 					 //w�� 7�� ������ ������̴ϱ� �ű⼭ �ٹٲ� ���ָ� �ȴ�.
		}		
	}
}






