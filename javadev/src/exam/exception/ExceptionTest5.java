package exam.exception;

public class ExceptionTest5 {
	public static void main(String[] args) {
	//jdk 7���� ����ó�� ���: try with resources
		try(MyResource myResource = new MyResource(); ){
			myResource.use();
		}catch(Exception e){
			System.out.println("my����ó��");
		} //autocloseable�� implement�� MyResource�̱� ������ ���� close������ �ʾƵ� �˾Ƽ� close�ȴ�.
     	  //---> (((public class MyResource implements AutoCloseable)))
	}
}
