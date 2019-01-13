package exam.control;

public class WhileTest2 {
	public static void main(String[] args) {
//		for(int i=1; i <= 3; i++) {
//			sum += i;
//		}
//		System.out.println("1부터 3까지 정수의 합계: " + sum);
		
		int sum = 0;
		int i = 1;
		
		while(i <= 3) {
			sum += i;
			i++;
		}
		System.out.println("1부터 3까지 정수의 합계: " + sum);
		System.out.println("종료");
	}
}
