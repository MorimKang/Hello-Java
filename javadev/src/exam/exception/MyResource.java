package exam.exception;

public class MyResource implements AutoCloseable{
	public void use() {
		System.out.println("�ڿ� �̿� ��");
	}
	@Override
	public void close() throws Exception {
		System.out.println("�ڿ��� �����Ѵ�!");
	}	
}
