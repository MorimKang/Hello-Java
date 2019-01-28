package exam.exception;

public class ExeptionTest3 {
	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("java.lang.String2");
			String str = null;
			System.out.println("str.toString");
		} catch (ClassNotFoundException | NullPointerException e) { //(Exception e)업캐스팅으로 적어줘도 알아서 처리됨.
			//무슨exception인지 잘 모를 때는 그냥 Exception으로 쓰는 게 안전. 
			System.out.println(e.toString());
			System.out.println("클래스가 존재하지 않습니다.");
		} catch (Exception e) {
			System.out.println("그 외 예외 처리");
		} finally {
			System.out.println("예외와 상관없이 무조건 수행하는 블럭: finally");
		}
		System.out.println("end");
	}
}
