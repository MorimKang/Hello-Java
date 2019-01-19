package exam.oop6;

public class Test {
	private static Test test = null;
	//그냥이렇게해도됨1//private static Test test = new Test();
	
	private Test() { 
		
	}
	
	public static Test getInstance() {
		if(test == null) test = new Test(); //test가 null상태인 최초에만 새 인스턴스를 만들어주고
		return test; //나머지의 경우에는 그냥 기본의 test를 return
		
		//그냥이렇게해도됨1//return test;
	}
	
	//make singleton
	//1.constructor를 private로.
	//2.자기자신의 인스턴스를 참조할 수 있는 변수를 static타입으로 생성
	//3.최초 1번만 인스턴스를 생성하여 참조하는 변수를 리턴해주는 메소드 작성
	//4.메소드 getInstance() 작성
	//5.타입명.getInstance() 호출
}
