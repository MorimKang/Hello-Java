package exam.control;

//for(int i = 1; i <= 5; i++) { //��
//	for(int j = 1; j <= 5; j++) { //��
//		if(i <= j) System.out.print("��");
//		else System.out.print("��");
//	}//end of j
//	 System.out.println("��");
//}//end of i
//System.out.println("����");
//1�� 12345
//2��  2345
//3��   345
//4��    45
//5��     5

public class DoWhileTest6 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 5) {
			int j = 1;
			while(j <= 5) {
				if(i <= j) System.out.print("��");
				else System.out.print("��");
				j++;
			}
			System.out.println();
			i++;
			
		}
		System.out.println("����");
	}
}
