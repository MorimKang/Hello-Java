package exam.oop11;

public class LgTV implements TV { //바꾸려는 단어를 더블클릭한 다음 컨트롤 에프. 
	public void powerOn() {
		System.out.println("LGTV: 전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("LGTV: 전원을 끕니다.");
	}
	public void channelUp() {
		System.out.println("LGTV: 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("LGTV: 채널을 내립니다.");
	}
	public void soundUp() {
		System.out.println("LGTV: 소리를 올립니다.");
	}
	public void soundDown() {
		System.out.println("LGTV: 소리를 내립니다.");
	}
}
