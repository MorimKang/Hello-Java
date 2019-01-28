package exam.exception;

public class ExceptionTest5 {
	public static void main(String[] args) {
	//jdk 7부터 예외처리 방식: try with resources
		try(MyResource myResource = new MyResource(); ){
			myResource.use();
		}catch(Exception e){
			System.out.println("my예외처리");
		} //autocloseable을 implement한 MyResource이기 때문에 따로 close해주지 않아도 알아서 close된다.
     	  //---> (((public class MyResource implements AutoCloseable)))
	}
}
