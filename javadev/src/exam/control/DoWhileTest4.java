package exam.control;

public class DoWhileTest4 {
// fortest6�� while dowhile�� ¥����
//	for(int i = 1; i <= 5; i++) { //��
//		for(int j = 1; j <= i; j++) { //��
//			System.out.print("��");
//		}//end of j
//		System.out.println();
//	}//end of i
//	System.out.println("����");
	public static void main(String[] args) {
		int i = 1;
		
//		System.out.println("DoWhile");
//		do{
//			int j = 1;
//			do {
//				System.out.print("��");
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
				System.out.print("��");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("����");
	}
}




