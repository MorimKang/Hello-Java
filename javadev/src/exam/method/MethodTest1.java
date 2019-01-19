package exam.method;

public class MethodTest1 {
	public static void main(String[] args) {
		System.out.println("before");
		printmetamong("메타몽! 너로정했다!"); 
		System.out.println("end");
		printmetamong();
		
	}

	//메소드 오버로딩 method overloading
	private static void printmetamong(String name) {
		System.out.println("+-------------------+");
		System.out.println("|" + name + "|");
		System.out.println("+-------------------+");		
		//return;
	}
	private static void printmetamong() {
		System.out.println("+-----------+");
		System.out.println("|메에에-타몽|");
		System.out.println("+-----------+");		
		//return;
	}
}
