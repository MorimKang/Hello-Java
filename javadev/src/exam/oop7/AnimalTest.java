package exam.oop7;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal a1 = new Animal();
//		System.out.println(a1);
//		
//		Bird b1 = new Bird();
//		System.out.println(b1);
//		
//		Eagle e1 = new Eagle();
//		System.out.println(e1);
	
		
		//up casting *****�߿��� ���� �ٽ� ����***** 
		//�ڵ�����ȯ�� �ȴ�.
//		Bird b2 =  new Eagle(); 
//		System.out.println(b2.fly());
		
//		//down casting  *****�߿��� ���� �ٽ� ����*****
//		Animal a2 = new Eagle();
//		//System.out.println(a2.fly());  --> ����. Animal���� fly()�� ���⶧��
//		Bird b3 = (Bird) a2; //����� ����ȯ�� ����� �Ѵ�!!
//		System.out.println(b3.fly());
//		
//		Object o = new Eagle(); 
		
		Animal a3 = new Bird();
//		Bird   b4 = (Bird) a3;
//		System.out.println(b4.fly());
		
		///����!
//		Eagle e2 = (Eagle) a3; //���� ó���� ������� ��ü�� Bird()�̱� ������ Bird �Ʒ��� �ִ� Eagle�δ� ��ȯ�� �� ����
//		System.out.println(e2); //��ü ���ر����� down casting�� ����
		
		Animal a4 = new Cat(); //���� ��ü�� �����ִ� ��Ӱ����� �帧 �ȿ����� �� �ٿ� ĳ������ ����.
//		Bird b5 = (Bird) a4;  //��������!
		if(a4 instanceof Bird) {
			Bird b5 = (Bird) a4;
			System.out.println(b5);
		}else {
			System.out.println("����ȯ �Ұ�. ���� �ٸ�.");
		}
		
		if(a4 instanceof Cat) {
			Cat c = (Cat) a4;
			System.out.println(c);
		}else {
			System.out.println("����ȯ �Ұ�. ���� �ٸ�.");
		}
		
		
	}
}





