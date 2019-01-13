package exam.control;

public class ForTest3 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i <= 3; i++) {
			sum += i;
		}
		System.out.println("1부터 3까지 정수의 합계: " + sum);
	}
}
