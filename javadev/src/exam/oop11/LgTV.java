package exam.oop11;

public class LgTV implements TV { //�ٲٷ��� �ܾ ����Ŭ���� ���� ��Ʈ�� ����. 
	public void powerOn() {
		System.out.println("LGTV: ������ �մϴ�.");
	}
	public void powerOff() {
		System.out.println("LGTV: ������ ���ϴ�.");
	}
	public void channelUp() {
		System.out.println("LGTV: ä���� �ø��ϴ�.");
	}
	public void channelDown() {
		System.out.println("LGTV: ä���� �����ϴ�.");
	}
	public void soundUp() {
		System.out.println("LGTV: �Ҹ��� �ø��ϴ�.");
	}
	public void soundDown() {
		System.out.println("LGTV: �Ҹ��� �����ϴ�.");
	}
}
