package exam.oop4;

public class Point2D {
	int x; //멤버변수member variable, field 필드 --> 자동으로 초기화됨.
	int y;
	
	public Point2D() {  //기존에 존재하는 기능은 이용하는 것이 낫다. 업데이트 줄이기위해. --생성자 오버로딩
//		this.x = 1;
//		this.y = 2;		
		
		//생성자 내부에서 다른 생성자를 호출할때는 그 생성자에서 가장 처음에 와야한다.
//		System.out.println("Point2D 수행");  
//		this(1, 2); 							//이러면 에러남
		
		
		this(1, 2); 
		System.out.println("Point2D() 수행");
	}
	
	public Point2D(int x, int y) {
		//super(); //이 클래스가 아무것도 상속하지 않아도 class object를 기본으로 상속받기때문에 나오는 것.
		
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x,y) 수행");
	}

}
