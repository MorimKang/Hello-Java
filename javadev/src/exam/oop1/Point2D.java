package exam.oop1;

public class Point2D {
	private int x; //멤버 변수 , 필드
	private int y; //alt + shift + a
	
	//alt + shift + s --> generate getter and setter --> select all -> generate
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
		
	public void print() {
		System.out.println("x= " + getX());
		System.out.println("y= " + getY());
	}
	
}
