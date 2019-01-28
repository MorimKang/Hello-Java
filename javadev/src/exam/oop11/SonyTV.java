package exam.oop11;

public class SonyTV implements TV{
	private Speaker speaker = new OrangeSpeaker();
	
	public void powerOn() {
		System.out.println("SonyTV: ������ �մϴ�.");
	}
	public void powerOff() {
		System.out.println("SonyTV: ������ ���ϴ�.");
	}
	public void channelUp() {
		System.out.println("SonyTV: ä���� �ø��ϴ�.");
	}
	public void channelDown() {
		System.out.println("SonyTV: ä���� �����ϴ�.");
	}
	public void soundUp() {
		if(speaker == null) {
			System.out.println("SonyTV: �Ҹ��� �ø��ϴ�.");
		}else {
			speaker.soundUp();
		}	
	}
	public void soundDown() {
		if(speaker == null) {
			System.out.println("SonyTV: �Ҹ��� �����ϴ�.");
		}else {
			speaker.soundDown();
		}
	}
 
}
