package exam.oop22;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		
		anony.method1();
		
		anony.method2(new Person() {
			void study(){
				System.out.println("�����մϴ�.");
			}
					
			@Override
			void wake() {
				System.out.println("9�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});
	}	
}
