package exam.method;

public class MethodTest7 {//call by value
	public static void main(String[] args) {
		int i = 10;
		cbv(i); //call by value ���� ���� ȣ��
		System.out.println("main�� i��: " + i);
	}

	private static void cbv(int i) {
		i++;
		System.out.println("cbv�Լ��� i��: " + i);
	}
}	
