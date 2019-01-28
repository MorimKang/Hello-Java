package exam.oop9;

public class ShapeTest {
	public static void main(String[] args) {
		printArea(new Circle());
		printArea(new Rectangle());
		printArea(new Triangle());
	}

	private static void printArea(Shape s) { 
		// printArea�� �Ķ���͸� Shape���� �༭ � Ÿ���� ������ �͵� 
		//�� �Լ� �ȿ��� ��ĳ�������� ó���ϵ����ϸ� printArea�Լ��� �ѹ��� ���� �ȴ�.
		s.area();
		if(s instanceof Circle) { //instanceof
			Circle c = (Circle) s;
			System.out.println("�������� "+ c.r +"�� ���� ���̴� "+ c.res+"�Դϴ�.");			
		}else if(s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			System.out.println("���ΰ� " + r.w +"�̰�, ���ΰ� " + r.h+"�� �簢���� ���̴� "+ r.res+"�Դϴ�.");
		}else if(s instanceof Triangle) {
			Triangle t = (Triangle) s;
			System.out.println("�غ��� " + t.w +"�̰�, ���̰� " + t.h+"�� �ﰢ���� ���̴� "+ t.res+"�Դϴ�.");
		}	
	}
}
