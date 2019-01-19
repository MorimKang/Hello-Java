package exam.method;

public class MethodTest7 {//call by value
	public static void main(String[] args) {
		int i = 10;
		cbv(i); //call by value 값에 의한 호출
		System.out.println("main의 i값: " + i);
	}

	private static void cbv(int i) {
		i++;
		System.out.println("cbv함수의 i값: " + i);
	}
}	
