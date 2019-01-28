package exam.exception;

public class MyResource implements AutoCloseable{
	public void use() {
		System.out.println("자원 이용 중");
	}
	@Override
	public void close() throws Exception {
		System.out.println("자원을 해지한다!");
	}	
}
