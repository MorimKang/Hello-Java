package exam.oop1;

public class PointTest {
	public static void main(String[] args) {
		Point3D pt = new Point3D(); //pt -> 참조 변수, 인스턴스명.
		//참조변수를 안만들고 그냥 new Point2D();만 하면 다음 줄에서 바로 소멸되어버림.
		//참조하는 변수가 없으면 사라져버림.
		
		pt.setX(100);
		pt.setY(200);
		pt.setZ(300);
		
		pt.print();
		
	}
}
