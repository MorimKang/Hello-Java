package exam.exception;
//왜 미루냐 왜 이렇게 쓰냐? :1. 비슷한 예외처리가 발생하는 여러메소드들이 있을떄
//							: 2.모듈화하고싶어서. 다른 사람이 쓸때 예외처리 커스터마이징해서 쓸 수있도록(댜른플랫폼에서도 쓸수있꼬...)
public class ExceptionTest6 {
	public static void main(String[] args) {
		try { 										//여기서 thorwException()메소드를 호출했으니까 여기서 처리하게 되는것.
			throwException();						// 여기서도 또 throws해버리면 예외처리안한게됨. 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void throwException() throws Exception { // 나를 호출한 쪽에서 예외처리하도록 만드는것.
		Class.forName("java.lang.String");
	}
}
