package exam.control;

public class ForTest5 {
	public static void main(String[] args) {
		//결과: 
		//나무를 1번 찍었습니다.
		//나무를 2번 찍었습니다.
		//나무를 3번 찍었습니다.
		//나무를 4번 찍었습니다.
		//나무를 5번 찍었습니다.
		//나무를 6번 찍었습니다.
		//...
		System.out.println("결과: ");
		for(int i = 1; i <= 10; i++) {
			System.out.println("나무를 "+ i + "번 찍었습니다.");
		}System.out.println("나무가 쓰러졌습니다.");
	}
}
