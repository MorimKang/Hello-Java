package exam.control;

public class BreakTest {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		for(; ; i++) {
			sum += i;
			if(sum >= 100)break;
		}
		System.out.println("1부터 " + i + "까지의 합계: "+ sum);
		System.out.println("종료");
	}
}
