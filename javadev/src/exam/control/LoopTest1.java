package exam.control;

public class LoopTest1 {//구구단 출력
	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i += 4) {
			for(int j = 1; j <=9; j++) {
				for(int q = i; q <= (i+3); q++ ) {
					System.out.print(q + "*" + j + "=" + q*j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
//		for(int i = 2; i <= 9; i += 4) {
//			for(int j = 1; j <=9; j++) {
//				for(int k = i; k <= i+3; q++ ) {
//					System.out.print(k + "*" + j + "=" + k*j + "\t");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
	}
}
