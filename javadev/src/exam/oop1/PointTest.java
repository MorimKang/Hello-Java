package exam.oop1;

public class PointTest {
	public static void main(String[] args) {
		Point3D pt = new Point3D(); //pt -> ���� ����, �ν��Ͻ���.
		//���������� �ȸ���� �׳� new Point2D();�� �ϸ� ���� �ٿ��� �ٷ� �Ҹ�Ǿ����.
		//�����ϴ� ������ ������ ���������.
		
		pt.setX(100);
		pt.setY(200);
		pt.setZ(300);
		
		pt.print();
		
	}
}
