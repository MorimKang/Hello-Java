package exam.control;

public class WhileTest4 {
	public static void main(String[] args) {
		//1부터 1000까지 3의 배수의 합계
		int i = 1;
		int sum = 0;
		while(i <= 1000) {
			if(i%3==0)sum += i;
			i++;
		}
		System.out.println("합계: "+ sum);
	}
}
