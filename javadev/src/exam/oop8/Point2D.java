package exam.oop8;
//final�� ���� ������ �� �����Ѵ�. ���� �ʱⰪ�� �����
//Ŭ������ ���̸� ����� �ȵǰ�
//�޼ҵ忡 ���̸� �������̵��� �ȵǰ�
//������ ���̸� �� �Ҵ��� �ȵ� - �ʱⰪ���θ� ��������(�ʱ��Ҵ��ϰų� �����ڿ���������)
//static final variable -->���ȭ 
public class Point2D { //final ���̸� �ٸ����� point2d�� ��ӹ��� ������. 
	private int x;//���⿡ final���̸� �ʱⰪ�� ����� ������ ������.��
	private int y;
	//�޼ҵ忡 final���̸� �ٸ����� �������̵� �ȵ�.
	public int getX() {
		return x;
	}
	public void setX(int x) {//x�� final�� �� ��쿡�� ���⼭ ���� �����Ҽ� ���⶧���� ���Ҽ� ������
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
