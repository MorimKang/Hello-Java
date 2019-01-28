package exam.oop11;
public class XiaomiTV implements TV {
	private Speaker speaker = new AppleSpeaker();
	
	public void powerOn() {
		System.out.println("XiaomiTV: 전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("XiaomiTV: 전원을 끕니다.");
	}
	public void channelUp() {
		System.out.println("XiaomiTV: 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("XiaomiTV: 채널을 내립니다.");
	}
	public void soundUp() {
		if(speaker == null) {
			System.out.println("XiaomiTV: 소리를 올립니다.");
		}else {
			speaker.soundUp();
		}	
	}
	public void soundDown() {
		if(speaker == null) {
			System.out.println("XiaomiTV: 소리를 내립니다.");
		}else {
			speaker.soundDown();
		}
	}
}
