package exam.method;

public class MethodTest11 {//os���� �� �Ѱ��ٶ��� ������ ���ڿ��� �Ѿ
	public static void main(String[] args) { 
		for(int i = 0; i< args.length; i++) {
			int n = Integer.parseInt(args[i]); //���ڿ��� ���� ���� ���� ���ϴ� ��-���⼭�� ������ ��ȯ
			//�⺻ �ڷ����� �ش��ϴ� Ŭ����: Boxed Primitives
			
			System.out.println("args["+i+"]: " + n);
		}
	}
}
