package exam.arrays;

public class ArrayTest1 {
	public static void main(String[] args) {
		//int[] n = new int[3]; //new --> ���α׷� ���� �� �����Ҵ�
		/*
		 * n[0] = 80; 
		 * n[1] = 90; 
		 * n[2] = 80;
		 */ 
		
		//int[] n = new int[] {80,90,80};
		
		int[] n = {80,90,70,60}; //'��'�̶�� �����ϸ� ����. �������迭.
	    //int n[] = {80,90,80}; // --> c��� ��Ÿ��.
		
//		System.out.println(n[0]);
//		System.out.println(n[1]);
//		System.out.println(n[2]);
		
		//n.length --> �迭 ���� ��ȯ.
		int s = 0;
		for(int i = 0; i < n.length; i++) { //���ǽ� ����! �迭�� �� �ε��� ����!
			System.out.println(n[i]); 
			s += n[i];
		}
		System.out.println("�հ�: " + s);
		System.out.println("���: " + s/n.length);
	}
}
