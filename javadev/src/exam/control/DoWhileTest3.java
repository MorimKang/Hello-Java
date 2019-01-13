package exam.control;

public class DoWhileTest3 {
	public static void main(String[] args) {
		//1~1000까지 정수 중 4의 배수의 합계
		int sum = 0;
		int i = 1;
		do {
			if(i%4==0)sum += i;
			i++;
		}while(i <= 1000);
		System.out.println("합계: "+ sum);
		System.out.println("종료");
	}
}
