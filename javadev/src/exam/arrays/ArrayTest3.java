package exam.arrays;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[][][] score = //[ǥ][��][��]
				{
					{	
						{100,90,80,70},
						{ 90,80,70,60},
						{ 80,70,60,50}
					},		
					{	
						{100,100,90,80},
						{100,90,80,70},
						{ 90,80,70,60}
					}
				};
		
		for(int tab = 0; tab < score.length; tab++) {
			System.out.println((tab+1) + "�б� ����");
			System.out.println("����\t����\t����\tö��\t����\t���");	
			for(int row =0; row < score[tab].length; row++) {
				int sum = 0;
				for(int col=0; col < (score[tab][row].length); col++) {
					System.out.print(score[tab][row][col]+ "\t");
					sum += score[tab][row][col];
				}
				System.out.print(sum+ "\t"+ (sum/score[tab][row].length));
				System.out.println();
			}
			System.out.println();
		}	
	}
}
