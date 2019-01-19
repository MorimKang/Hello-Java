package exam.control;

public class ForTest8 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) { //青
			for(int j = 1; j <= 5; j++) { //凯
				if(i <= j) System.out.print("≮");
				else System.out.print("　");
			}//end of j
			 System.out.println("　");
		}//end of i
		System.out.println("辆丰");
	}
}
//1青 12345
//2青  2345
//3青   345
//4青    45
//5青     5