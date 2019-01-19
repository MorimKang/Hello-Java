package exam.control;

//for(int i = 1; i <= 5; i++) { 	  //青
//	for(int j = 1; j <= 6-i; j++) { //凯
//		System.out.print("≮");
//	}//end of j
//	System.out.println();
//}//end of i
//System.out.println("辆丰");
//
//
////1青 12345
////2青 2345
////3青 345
////4青 45
////5青 5

public class DoWhileTest5 {
	public static void main(String[] args) {
		int i = 1;
		while(i<=5) {
			int j = 1;
			while(j <= 6-i) {
				System.out.print("≮");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println("辆丰");
	}
}
