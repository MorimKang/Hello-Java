package exam.oop11;

public class AppleSpeaker implements Speaker{
	@Override
	public void soundUp() {
		System.out.println("AppleSpeaker: �Ҹ��� Ű��ϴ�.");
	}

	@Override
	public void soundDown() {
		System.out.println("AppleSpeaker: �Ҹ��� ���Դϴ�.");
	}
}
