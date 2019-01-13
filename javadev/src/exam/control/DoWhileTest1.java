package exam.control;

public class DoWhileTest1 {
	public static void main(String[] args) {
		//열번 나무 찍기-dowhile ver.
		
		int i = 1;
		do {
			System.out.println("나무를 "+ i + "번 찍었습니다.");
			i++;
		}while(i <= 10); 
		System.out.println("나무가 쓰러졌습니다.");
		
	}
}
