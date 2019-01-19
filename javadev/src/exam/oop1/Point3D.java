package exam.oop1;

public class Point3D extends Point2D { //상속
	private int z;
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	//method overriding 
	//내가 상속한 Point2D 안에 있는 print()함수를 재정의하겠다
	public void print() {
		super.print();//부모 클래스의 print()를 실행하겠다
		System.out.println("z= " + getZ());
	}
}
