package exam.exception;

public class ExeptionTest3 {
	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("java.lang.String2");
			String str = null;
			System.out.println("str.toString");
		} catch (ClassNotFoundException | NullPointerException e) { //(Exception e)��ĳ�������� �����൵ �˾Ƽ� ó����.
			//����exception���� �� �� ���� �׳� Exception���� ���� �� ����. 
			System.out.println(e.toString());
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		} catch (Exception e) {
			System.out.println("�� �� ���� ó��");
		} finally {
			System.out.println("���ܿ� ������� ������ �����ϴ� ��: finally");
		}
		System.out.println("end");
	}
}
