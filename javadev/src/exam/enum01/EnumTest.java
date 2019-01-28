package exam.enum01;
import static exam.enum01.PowerState.OFF;
import static exam.enum01.PowerState.ON;
import static exam.enum01.PowerState.SUSPEND;

public class EnumTest {
	public static void main(String[] args) {
		
		Computer c = new Computer();
		c.setState(ON);
		c.setState(OFF);
		c.setState(SUSPEND);
	}
}
