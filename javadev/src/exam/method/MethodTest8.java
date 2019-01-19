package exam.method;

public class MethodTest8 {//call by reference
	public static void main(String[] args) {
		int[] i = new int[1];
		i[0] = 10;
		cbr(i);//call by reference 참조에 의한 호출
		System.out.println("main의 값: "+ i[0]);
	}

	private static void cbr(int[] i) {
		i[0]++;
		System.out.println("cbr함수의 값: "+ i[0]);
	}
}
