package exam.oop11;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new XiaomiTV(); //업캐스팅. 자동형변환.
//		System.out.println(TV.volt);
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();	
	}
}
