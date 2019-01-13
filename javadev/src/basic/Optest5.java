package basic;

public class Optest5 { //축약형 
	public static void main(String[] args) {
		int i = 5;
		
	//	i = i + 1;
		
		i++; //후위 증가
		System.out.println(i);
		++i; //전위 증가
		System.out.println(i);
		
		i--;
		System.out.println(i);
		--i;
		System.out.println(i);
		
		
		i += 2;
		System.out.println(i);
		i -= 2;
		System.out.println(i);
		i *= 2;
		System.out.println(i);
		i /= 2;
		System.out.println(i);
		i %= 2;
		System.out.println(i);
		
	}
}
