package exam.method;

public class MethodTest2 {
	public static void main(String[] args) {
		System.out.println(add(add(10,5),7)); //���� �޼ҵ� ���� ����. ���� --> �ٱ���
		
		System.out.println(dice());
	}

	private static int dice() {
		return (int)(Math.random()*6)+1;
	}

	private static int add(int i, int j) {
		return i+j;
	}
}
