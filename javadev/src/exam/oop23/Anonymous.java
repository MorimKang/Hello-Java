package exam.oop23;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("tv�� �մϴ�.");
		}

		@Override
		public void turnOff() {
			System.out.println("tv�� ���ϴ�.");
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			public void turnOn() {
				System.out.println("sound�� �ø��ϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("sound�� �����ϴ�");
			}
		};
		localVar.turnOn();	
	}
		
	void method2(RemoteControl remoteControl) {
		remoteControl.turnOn();
	}
}
