package exam.method;

public class MethodTest1 {
	public static void main(String[] args) {
		System.out.println("before");
		printmetamong("��Ÿ��! �ʷ����ߴ�!"); 
		System.out.println("end");
		printmetamong();
		
	}

	//�޼ҵ� �����ε� method overloading
	private static void printmetamong(String name) {
		System.out.println("+-------------------+");
		System.out.println("|" + name + "|");
		System.out.println("+-------------------+");		
		//return;
	}
	private static void printmetamong() {
		System.out.println("+-----------+");
		System.out.println("|�޿���-Ÿ��|");
		System.out.println("+-----------+");		
		//return;
	}
}
