package basic;

public class Optest11 {//형변환
	public static void main(String[] args) {
		int i = 10;
		long ii = i; //자동 형변환(묵시적형변환)
		double iii = i; //자동 형변환
		
		System.out.println(i);
		System.out.println(ii);
		System.out.println(iii);
		
		//i = 3.14; 데이터 값이 버려지기 때문에 에러!
		i = (int) 3.14; // 강제 형변환(명시적형변환) --> 소수점 이하를 버림
		System.out.println(i); 
	}
}
