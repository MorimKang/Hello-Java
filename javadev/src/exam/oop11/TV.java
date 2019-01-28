package exam.oop11;
//변경이 가해질 수 있는 클래스는 인터페이스로 추상 명세를 적어두고 
//그에 따라 만들면 나중에 바꾸기 쉽다.
public interface TV {
	int volt = 200; //이렇게 해놔도 실제로 변수에 값이 할당된게 아님 
	//static final이 생략된 상수라고 생각하면됨.
	//타입으로 생각하면 됨.
	
	public void powerOn(); //abstract가 생략된 상태라고보면됨.
	public void powerOff(); 
	public void channelUp(); 
	public void channelDown(); 
	public void soundUp();
	public void soundDown(); 
}
