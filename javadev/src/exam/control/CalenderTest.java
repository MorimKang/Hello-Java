package exam.control;

import java.util.Calendar;

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

public class CalenderTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); //new�� getInstance()���� �ڵ����� �����ϴϱ� ���� ���� �ʿ� ����
		System.out.println("��: "+ c.get(Calendar.YEAR));
		System.out.println("��: "+ (c.get(Calendar.MONTH)+1)); //+1�ϴ� ����?: �迭?�������ϱ� ù��° �ε����� 0���� �����ؼ�.
		System.out.println("��: "+ c.get(Calendar.DATE));
		System.out.println("����: "+ c.get(Calendar.DAY_OF_WEEK));	
		System.out.println("������ ��: "+ c.getActualMaximum(Calendar.DAY_OF_MONTH));
		//�������� ã�� ���1
		//������ 1���� ã�Ƽ� �ű⼭ 1���¹��
		//�������� ã�� ���2
		//c.getActualMaximum(Calendar.DAY_OF_MONTH)
			
		
		c.set(2019,2-1,1); //2019�� 2�� 1�Ϸ� ��¥ ����.
		System.out.println("��: "+ c.get(Calendar.YEAR));
		System.out.println("��: "+ (c.get(Calendar.MONTH)+1)); //+1�ϴ� ����?: �迭?�������ϱ� ù��° �ε����� 0���� �����ؼ�.
		System.out.println("��: "+ c.get(Calendar.DATE));
		System.out.println("����: "+ c.get(Calendar.DAY_OF_WEEK));
		System.out.println("������ ��: "+ c.getActualMaximum(Calendar.DAY_OF_MONTH));
				
	}
}
