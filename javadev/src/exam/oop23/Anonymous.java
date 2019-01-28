package exam.oop23;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("tv를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("tv를 끕니다.");
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			public void turnOn() {
				System.out.println("sound를 올립니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("sound를 내립니다");
			}
		};
		localVar.turnOn();	
	}
		
	void method2(RemoteControl remoteControl) {
		remoteControl.turnOn();
	}
}
