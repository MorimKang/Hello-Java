package exam.oop1;

public class Point3D extends Point2D { //���
	private int z;
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	//method overriding 
	//���� ����� Point2D �ȿ� �ִ� print()�Լ��� �������ϰڴ�
	public void print() {
		super.print();//�θ� Ŭ������ print()�� �����ϰڴ�
		System.out.println("z= " + getZ());
	}
}
