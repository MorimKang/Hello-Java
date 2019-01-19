package exam.arrays;

public class ArrayTest5 {
	public static void main(String[] args) {
		String[] team = {
				"채치수",
				"권준호",
				"정대만",
				"송태섭",
				"강백호",
				"서태웅"
		};
		
		//java 5 new feature : enhanced for //일반적인 for문보다 속도가 좀 더 빠르긴한데 그냥 필요한 걸로 가져다쓰면 오케이.
		for(String name:team) {//변수 name으로 배열 team에 있는 인자들을 하나씩 가져와서 루프돌림, 인자가 더 없을 때까지.
			System.out.print(name + "\t");
		}
		System.out.println();
		
		for(int i=0; i<team.length; i++) {
			System.out.print(team[i] + "\t");
		}
		System.out.println();
		
		int len = team.length;
		for(int i=0; i<len; i++) {
//			if(i == len-1) System.out.print(team[i]);
//			else System.out.print(team[i]+ ",\t");	
		
//			if(i != len-1) System.out.print(team[i]+ ",\t"); 
//			else System.out.print(team[i]);				
	
			//아니면 첫번쨰는 그냥 출력하고 두번째부터 , 강백호 라고 출력 하면 값이 나옴
//			if(i!=0)System.out.print(", " );
//		    System.out.print(team[i]);
		}
		System.out.println();
		
	
	}
}
