package exam.exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			//���ܰ� �߻��� ���� �ڵ� ��
			System.out.println(10/5);
			System.out.println("try after");
		} catch (Exception e) {
			//���� ó�� ��
			System.out.println("���� ó��");
		} finally {
			//���ܰ� �߻��ϵ� �߻����� �ʵ� �����ϴ� �� :�ڿ����������..����...
			System.out.println("finally");
		}
	}
}
