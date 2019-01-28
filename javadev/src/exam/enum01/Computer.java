package exam.enum01;
import static exam.enum01.PowerState.OFF;
import static exam.enum01.PowerState.ON;
import static exam.enum01.PowerState.SUSPEND;

public class Computer extends ElectricDevice {
	private PowerState state = OFF;	

	public void turnOn() {
		state = ON;
	}
	
	public void turnOff() {
		state = OFF;
	}
	
	public void suspend() {
		state = SUSPEND;
	}
	
	public void setState(PowerState state) {
		switch (state) {
		case OFF:
			turnOff();
			break;

		case ON:
			turnOn();
			break;

		case SUSPEND:
			suspend();
			break;
		}
		System.out.println(this.state);
	}
	
}
