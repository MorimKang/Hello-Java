package exam.oop11;

public class SamsungTV implements TV {
	public void powerOn() {
		System.out.println("SamsungTV: 전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV: 전원을 끕니다.");
	}
	public void channelUp() {
		System.out.println("SamsungTV: 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("SamsungTV: 채널을 내립니다.");
	}
	public void soundUp() {
		System.out.println("SamsungTV: 소리를 올립니다.");
	}
	public void soundDown() {
		System.out.println("SamsungTV: 소리를 내립니다.");
	}
}
