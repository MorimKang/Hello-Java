package exam.exception;

public class ExceptionTest1 {
	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.toString()); //throw new NullPointerException()
			System.out.println("���� ���� �߻� �� �������� ����.");
		} catch (Exception e) { // Exception e = new NullPointerException()
			System.out.println("����ó����");
		}
		System.out.println("end");
	}
}
