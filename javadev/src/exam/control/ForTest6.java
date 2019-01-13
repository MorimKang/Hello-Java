package exam.control;

public class ForTest6 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) { //행
			for(int j = 1; j <= i; j++) { //열
				System.out.print("★");
			}//end of j
			System.out.println();
		}//end of i
		System.out.println("종료");
	}
}
