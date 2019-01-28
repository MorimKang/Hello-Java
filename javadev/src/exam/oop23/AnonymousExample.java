package exam.oop23;



public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		
		anony.method1();
		
		anony.method2(new RemoteControl() {
			public void turnOn() {
				System.out.println("�Ҹ��� �ø��ϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("�Ҹ��� �����ϴ�");
			}
		});
	}	
}
