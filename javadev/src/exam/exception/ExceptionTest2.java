package exam.exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			//예외가 발생할 만한 코드 블럭
			System.out.println(10/5);
			System.out.println("try after");
		} catch (Exception e) {
			//예외 처리 블럭
			System.out.println("예외 처리");
		} finally {
			//예외가 발생하든 발생하지 않든 수행하는 블럭 :자원해지라던가..보통...
			System.out.println("finally");
		}
	}
}
