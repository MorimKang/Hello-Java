package exam.oop4;

public class Point2D {
	int x; //�������member variable, field �ʵ� --> �ڵ����� �ʱ�ȭ��.
	int y;
	
	public Point2D() {  //������ �����ϴ� ����� �̿��ϴ� ���� ����. ������Ʈ ���̱�����. --������ �����ε�
//		this.x = 1;
//		this.y = 2;		
		
		//������ ���ο��� �ٸ� �����ڸ� ȣ���Ҷ��� �� �����ڿ��� ���� ó���� �;��Ѵ�.
//		System.out.println("Point2D ����");  
//		this(1, 2); 							//�̷��� ������
		
		
		this(1, 2); 
		System.out.println("Point2D() ����");
	}
	
	public Point2D(int x, int y) {
		//super(); //�� Ŭ������ �ƹ��͵� ������� �ʾƵ� class object�� �⺻���� ��ӹޱ⶧���� ������ ��.
		
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x,y) ����");
	}

}
