package exam.method;

import java.util.Scanner;

public class MethodTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���>> ");
		String name = sc.nextLine();
		
		//System.out.println(name.hashCode());
		
		callname(name);
		System.out.println(callname2("callname2" + name));
	}

	private static String callname2(String name) {  ///�ٸ� ���α׷������� ������ �� ���°� ����.
		return name;
	}

	private static void callname(String name) {
		if(name.equals("���븸"))		//�⺻�ڷ� �̿��� �ڷ����� ==���� ����. equals() ���
			System.out.println(name);
		else if(name.equals("��ġ��"))
			System.out.println("��ġ��ġ��ġ��ġ��");
		else 
			System.out.println("�ٺ��ٺ��ٺ��ٺ��ٺ�"+ name);
		return;
	}
}
