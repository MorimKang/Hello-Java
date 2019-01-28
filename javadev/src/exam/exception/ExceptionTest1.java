package exam.exception;

public class ExceptionTest1 {
	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.toString()); //throw new NullPointerException()
			System.out.println("윗줄 예외 발생 시 수행하지 않음.");
		} catch (Exception e) { // Exception e = new NullPointerException()
			System.out.println("예외처리블럭");
		}
		System.out.println("end");
	}
}
