package exam.control;

//for(int i = 1; i <= 5; i++) { //행
//	for(int j = 1; j <= 5; j++) { //열
//		if(j >= 6-i) System.out.print("★");
//		else System.out.print("　");
//	}//end of j
//	 System.out.println();
//}//end of i
//System.out.println("종료");
//1행 5열
//2행 45열
//3행 345열
//4행 2345열
//5행 12345열 
//  *
// **
//***
//****
//***** 
public class DoWhileTest7 {
	public static void main(String[] args) {
		int i = 1;
		while(i <=5) {
			int j = 1;
			while(j <=5) {
				if(j >= 6-i) System.out.print("★");
				else System.out.print("　");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("종료");
	}
}
