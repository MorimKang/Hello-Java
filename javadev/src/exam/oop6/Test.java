package exam.oop6;

public class Test {
	private static Test test = null;
	//�׳��̷����ص���1//private static Test test = new Test();
	
	private Test() { 
		
	}
	
	public static Test getInstance() {
		if(test == null) test = new Test(); //test�� null������ ���ʿ��� �� �ν��Ͻ��� ������ְ�
		return test; //�������� ��쿡�� �׳� �⺻�� test�� return
		
		//�׳��̷����ص���1//return test;
	}
	
	//make singleton
	//1.constructor�� private��.
	//2.�ڱ��ڽ��� �ν��Ͻ��� ������ �� �ִ� ������ staticŸ������ ����
	//3.���� 1���� �ν��Ͻ��� �����Ͽ� �����ϴ� ������ �������ִ� �޼ҵ� �ۼ�
	//4.�޼ҵ� getInstance() �ۼ�
	//5.Ÿ�Ը�.getInstance() ȣ��
}
