package exam.arrays;

public class ArrayTest5 {
	public static void main(String[] args) {
		String[] team = {
				"äġ��",
				"����ȣ",
				"���븸",
				"���¼�",
				"����ȣ",
				"���¿�"
		};
		
		//java 5 new feature : enhanced for //�Ϲ����� for������ �ӵ��� �� �� �������ѵ� �׳� �ʿ��� �ɷ� �����پ��� ������.
		for(String name:team) {//���� name���� �迭 team�� �ִ� ���ڵ��� �ϳ��� �����ͼ� ��������, ���ڰ� �� ���� ������.
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
	
			//�ƴϸ� ù������ �׳� ����ϰ� �ι�°���� , ����ȣ ��� ��� �ϸ� ���� ����
//			if(i!=0)System.out.print(", " );
//		    System.out.print(team[i]);
		}
		System.out.println();
		
	
	}
}
