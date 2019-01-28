package exam.oop11;
public class XiaomiTV implements TV {
	private Speaker speaker = new AppleSpeaker();
	
	public void powerOn() {
		System.out.println("XiaomiTV: ������ �մϴ�.");
	}
	public void powerOff() {
		System.out.println("XiaomiTV: ������ ���ϴ�.");
	}
	public void channelUp() {
		System.out.println("XiaomiTV: ä���� �ø��ϴ�.");
	}
	public void channelDown() {
		System.out.println("XiaomiTV: ä���� �����ϴ�.");
	}
	public void soundUp() {
		if(speaker == null) {
			System.out.println("XiaomiTV: �Ҹ��� �ø��ϴ�.");
		}else {
			speaker.soundUp();
		}	
	}
	public void soundDown() {
		if(speaker == null) {
			System.out.println("XiaomiTV: �Ҹ��� �����ϴ�.");
		}else {
			speaker.soundDown();
		}
	}
}
