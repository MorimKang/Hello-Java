package basic;

//산술. 관계. 논리. 축약형. 조건 . 형변환

public class Optest4 { //두 변수의 값 바꾸기
	public static void main(String[] args) {
		int i = 7;
		int j = 4;
		int temp;
		
		System.out.println(i);
		System.out.println(j);
		
		temp = i;
		i = j;
		j = temp;
		System.out.println(i);
		System.out.println(j);
		
	//참고: XOR를 이용해서 바꾸는 방법
		i = i ^ j;
		j = j ^ i;
		i = i ^ j;
		
		//i ^= j;
		//j ^= i;
		//i ^=j;
	}
}
