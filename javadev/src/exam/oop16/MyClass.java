package exam.oop16;

public class MyClass {
	class NestedClass{
		
	}
	
	void testMethod() {
		class MethodNestedClass{ //메소드 안에 있는 클래스 -->로컬클래스 
			//정적필드는 네스틍ㄴ에 들어갈 ㅜㅅ 었바.
			//메소드안에서 로컬클래스만들땐는 static 을 못씀../?
		}
	}
	
	void testMethods() {
		class Hi{
			
		}
	}
}
