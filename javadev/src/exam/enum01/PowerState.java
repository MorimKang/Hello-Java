package exam.enum01;

public enum PowerState {

	OFF("������ �������ϴ�."), 
	ON("������ �������ϴ�."), 
	SUSPEND("���� ��������Դϴ�.");
	
	private String description;

	private PowerState(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String toString() {
		return getDescription();
	}
}
