package exam.arrays;

public class ArrayTest1 {
	public static void main(String[] args) {
		//int[] n = new int[3]; //new --> 프로그램 수행 중 동적할당
		/*
		 * n[0] = 80; 
		 * n[1] = 90; 
		 * n[2] = 80;
		 */ 
		
		//int[] n = new int[] {80,90,80};
		
		int[] n = {80,90,70,60}; //'열'이라고 생각하면 쉬움. 일차원배열.
	    //int n[] = {80,90,80}; // --> c언어 스타일.
		
//		System.out.println(n[0]);
//		System.out.println(n[1]);
//		System.out.println(n[2]);
		
		//n.length --> 배열 길이 반환.
		int s = 0;
		for(int i = 0; i < n.length; i++) { //조건식 주의! 배열의 끝 인덱스 주의!
			System.out.println(n[i]); 
			s += n[i];
		}
		System.out.println("합계: " + s);
		System.out.println("평균: " + s/n.length);
	}
}
