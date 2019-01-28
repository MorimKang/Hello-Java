package exam.enum01;

public enum PowerState {

	OFF("전원이 꺼졌습니다."), 
	ON("전원이 켜졌습니다."), 
	SUSPEND("현재 먹통상태입니다.");
	
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
