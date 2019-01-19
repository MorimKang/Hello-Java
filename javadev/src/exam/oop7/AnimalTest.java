package exam.oop7;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal a1 = new Animal();
//		System.out.println(a1);
//		
//		Bird b1 = new Bird();
//		System.out.println(b1);
//		
//		Eagle e1 = new Eagle();
//		System.out.println(e1);
	
		
		//up casting *****중요한 개념 핵심 개념***** 
		//자동형변환이 된다.
//		Bird b2 =  new Eagle(); 
//		System.out.println(b2.fly());
		
//		//down casting  *****중요한 개념 핵심 개념*****
//		Animal a2 = new Eagle();
//		//System.out.println(a2.fly());  --> 에러. Animal에는 fly()가 없기때문
//		Bird b3 = (Bird) a2; //명시적 형변환을 해줘야 한다!!
//		System.out.println(b3.fly());
//		
//		Object o = new Eagle(); 
		
		Animal a3 = new Bird();
//		Bird   b4 = (Bird) a3;
//		System.out.println(b4.fly());
		
		///에러!
//		Eagle e2 = (Eagle) a3; //원래 처음에 만들었던 실체가 Bird()이기 때문에 Bird 아래에 있는 Eagle로는 변환할 수 없음
//		System.out.println(e2); //실체 수준까지만 down casting이 가능
		
		Animal a4 = new Cat(); //원래 실체가 속해있는 상속관계의 흐름 안에서만 업 다운 캐스팅이 가능.
//		Bird b5 = (Bird) a4;  //에러에러!
		if(a4 instanceof Bird) {
			Bird b5 = (Bird) a4;
			System.out.println(b5);
		}else {
			System.out.println("형변환 불가. 종이 다름.");
		}
		
		if(a4 instanceof Cat) {
			Cat c = (Cat) a4;
			System.out.println(c);
		}else {
			System.out.println("형변환 불가. 종이 다름.");
		}
		
		
	}
}





