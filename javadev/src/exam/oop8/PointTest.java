package exam.oop8;

public class PointTest{
	public static void main(String[] args) {
		Point2D pt = new Point3D();
		pt.setX(100);
		pt.setY(200);
		
		Point3D dn = (Point3D) pt;
		dn.setZ(300);
		
		System.out.println("x = " + dn.getX());
		System.out.println("y = " + dn.getY());
		System.out.println("z = " + dn.getZ());
	}
}
