package exam.oop11;

public class SamsungTV implements TV {
	public void powerOn() {
		System.out.println("SamsungTV: ������ �մϴ�.");
	}
	public void powerOff() {
		System.out.println("SamsungTV: ������ ���ϴ�.");
	}
	public void channelUp() {
		System.out.println("SamsungTV: ä���� �ø��ϴ�.");
	}
	public void channelDown() {
		System.out.println("SamsungTV: ä���� �����ϴ�.");
	}
	public void soundUp() {
		System.out.println("SamsungTV: �Ҹ��� �ø��ϴ�.");
	}
	public void soundDown() {
		System.out.println("SamsungTV: �Ҹ��� �����ϴ�.");
	}
}
