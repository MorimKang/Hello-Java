package exam.oop10;

public class Bentz implements Car{//Car의 명세를 구현해야함
	//Car의 스펙대로 구현한 Bentz
	//Car는 클래스가 아니지만 Bentz의 super타입이다. 상속이 아니지만 업다운캐스팅이 가능하다.

	@Override
	public void powerOn() {
		System.out.println("시동을 겁니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("시동을 끕니다.");
	}

	@Override
	public void speedUp() {
		System.out.println("속도를 올립니다.");
	}

	@Override
	public void speedDown() {
		System.out.println("속도를 내립니다.");
	} 
}
