package exam.exception;
//�� �̷�� �� �̷��� ����? :1. ����� ����ó���� �߻��ϴ� �����޼ҵ���� ������
//							: 2.���ȭ�ϰ�;. �ٸ� ����� ���� ����ó�� Ŀ���͸���¡�ؼ� �� ���ֵ���(�����÷��������� �����ֲ�...)
public class ExceptionTest6 {
	public static void main(String[] args) {
		try { 										//���⼭ thorwException()�޼ҵ带 ȣ�������ϱ� ���⼭ ó���ϰ� �Ǵ°�.
			throwException();						// ���⼭�� �� throws�ع����� ����ó�����ѰԵ�. 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void throwException() throws Exception { // ���� ȣ���� �ʿ��� ����ó���ϵ��� ����°�.
		Class.forName("java.lang.String");
	}
}
