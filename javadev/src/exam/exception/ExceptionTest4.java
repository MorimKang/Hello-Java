package exam.exception;

public class ExceptionTest4 {
	public static void main(String[] args) {
		MyResource myResource = null;
		try {
			myResource = new MyResource();
			myResource.use();
		}catch(Exception e){
			System.out.println("my예외처리");
		}finally {
			if(myResource != null) {
				try {
					myResource.close();
					myResource = null;
				}catch(Exception e){}
			}
		}
	}
}
