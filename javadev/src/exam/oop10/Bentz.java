package exam.oop10;

public class Bentz implements Car{//Car�� ���� �����ؾ���
	//Car�� ������ ������ Bentz
	//Car�� Ŭ������ �ƴ����� Bentz�� superŸ���̴�. ����� �ƴ����� ���ٿ�ĳ������ �����ϴ�.

	@Override
	public void powerOn() {
		System.out.println("�õ��� �̴ϴ�.");
	}

	@Override
	public void powerOff() {
		System.out.println("�õ��� ���ϴ�.");
	}

	@Override
	public void speedUp() {
		System.out.println("�ӵ��� �ø��ϴ�.");
	}

	@Override
	public void speedDown() {
		System.out.println("�ӵ��� �����ϴ�.");
	} 
}
