package basic;

public class Optest3 {
	public static void main(String[] args) {
		boolean a, b, c;
		a = false; b = true; c = true;
		
		System.out.println(a && b );
		System.out.println(a || b);
		System.out.println(!a);
		System.out.println(a ^ b);
		System.out.println(b ^ c);
	}
}
