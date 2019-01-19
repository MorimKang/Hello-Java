package exam.method;

public class MethodTest11 {//os에서 값 넘겨줄때는 무조건 문자열로 넘어감
	public static void main(String[] args) { 
		for(int i = 0; i< args.length; i++) {
			int n = Integer.parseInt(args[i]); //문자열로 받은 값을 내가 원하는 값-여기서는 정수로 변환
			//기본 자료형에 해당하는 클래스: Boxed Primitives
			
			System.out.println("args["+i+"]: " + n);
		}
	}
}
