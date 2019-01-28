package exam.oop15;
//인터페이스와 인터페이스 간에도 상속 가능. extends를 이용해서.
//인터페이스간의 상속은 다중상속이 가능!!!!!!!!!!!!
public interface Speaker extends Amp, Effector {
	public void soundUp();
	public void soundDown();
	public default void crunch() {}; //이 인터페이스를 쓰는 클래스에서 crunch()를 안만들었을 경우에는
	//이 default의 crunch()를 사용한다.
}
