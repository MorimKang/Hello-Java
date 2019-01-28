package exam.oop8;
//final은 값을 변경할 수 없게한다. 따라서 초기값을 줘야함
//클래스에 붙이면 상속이 안되고
//메소드에 붙이면 오버라이딩이 안되고
//변수에 붙이면 값 할당이 안됨 - 초기값으로만 지정가능(초기할당하거나 생성자에서값지정)
//static final variable -->상수화 
public class Point2D { //final 붙이면 다른데서 point2d를 상속받을 수없음. 
	private int x;//여기에 final붙이면 초기값을 안줬기 때문에 에러나.ㅁ
	private int y;
	//메소드에 final붙이면 다른데서 오버라이드 안됨.
	public int getX() {
		return x;
	}
	public void setX(int x) {//x에 final을 줄 경우에는 여기서 값을 변경할수 없기때문에 셋할수 ㅇ벗음
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
