package exam.control;

public class DoWhileTest4 {
// fortest6번 while dowhile로 짜보기
//	for(int i = 1; i <= 5; i++) { //행
//		for(int j = 1; j <= i; j++) { //열
//			System.out.print("★");
//		}//end of j
//		System.out.println();
//	}//end of i
//	System.out.println("종료");
	public static void main(String[] args) {
		int i = 1;
		
//		System.out.println("DoWhile");
//		do{
//			int j = 1;
//			do {
//				System.out.print("★");
//				j++;
//			}while(j <= i);
//			
//			System.out.println();
//			
//			i++;	
//			
//		}while(i <= 5);
		
		
		System.out.println("While");
		while(i <=5) {
			int j = 1;
			while(j <= i) {
				System.out.print("★");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("종료");
	}
}




