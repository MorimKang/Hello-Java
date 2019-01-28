package exam.oop23;



public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		
		anony.method1();
		
		anony.method2(new RemoteControl() {
			public void turnOn() {
				System.out.println("소리를 올립니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("소리를 내립니다");
			}
		});
	}	
}
