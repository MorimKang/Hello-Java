package exam.oop6;

public class Singletontest {
	public static void main(String[] args) {
//		Test t1 = new Test();
//		Test t2 = new Test(); //Test �����ڰ� private�̱� ������ ���� �� ����
		
		Test t1 =Test.getInstance();
		Test t2 = Test.getInstance();
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
}
