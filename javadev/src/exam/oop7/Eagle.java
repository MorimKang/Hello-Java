package exam.oop7;

public class Eagle extends Bird{
	public String toString() {
		return "Eagle 입니다.";
	}
	
	@Override
	public String fly() {
		return "계~~~속 비행합니다.";
	}
}
