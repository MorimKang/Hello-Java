package exam.oop11;
//������ ������ �� �ִ� Ŭ������ �������̽��� �߻� ���� ����ΰ� 
//�׿� ���� ����� ���߿� �ٲٱ� ����.
public interface TV {
	int volt = 200; //�̷��� �س��� ������ ������ ���� �Ҵ�Ȱ� �ƴ� 
	//static final�� ������ ������ �����ϸ��.
	//Ÿ������ �����ϸ� ��.
	
	public void powerOn(); //abstract�� ������ ���¶�����.
	public void powerOff(); 
	public void channelUp(); 
	public void channelDown(); 
	public void soundUp();
	public void soundDown(); 
}
