package exam.oop15;
//�������̽��� �������̽� ������ ��� ����. extends�� �̿��ؼ�.
//�������̽����� ����� ���߻���� ����!!!!!!!!!!!!
public interface Speaker extends Amp, Effector {
	public void soundUp();
	public void soundDown();
	public default void crunch() {}; //�� �������̽��� ���� Ŭ�������� crunch()�� �ȸ������ ��쿡��
	//�� default�� crunch()�� ����Ѵ�.
}
