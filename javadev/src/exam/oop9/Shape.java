package exam.oop9;

public abstract class Shape { //추상클래스 //추상메소드를 하나 이상가질수도 있고 추상메소드를 안가질수도 있음..
	double res;	
	public abstract void area(); //추상메소드 --> 바디가 없음. 자식클래스에서 area()를 오버라이딩하지 않으면 동작이안됨.
	

//          클래스 내부  / 같은패키지 / 상속/ 관ㄱ예없음
//private       o            x          x       x
//default       o           o             x     x
//protected     o           o           o       x
//public        o           o            o      o
}
