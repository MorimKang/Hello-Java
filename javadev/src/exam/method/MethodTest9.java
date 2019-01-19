package exam.method;

public class MethodTest9 {
	public static void main(String[] args) {
		print(1);
		print(2,3);
		print(4,5,6);
	}

	//가변형 파라미터
	//매개변수가 몇개일지 모를 때 ...
	private static void print(int... i) { 
		for(int j=0; j < i.length; j++) {
		System.out.print(i[j] + "\t");
		}
		System.out.println();
	}	
}
