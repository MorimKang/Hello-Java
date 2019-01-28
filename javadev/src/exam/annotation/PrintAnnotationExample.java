package exam.annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] declareMethods = Service.class.getDeclaredMethods(); //����.Ŭ���� �ȿ� �ִ� ��� �޼ҵ��� ������ �����ٰ� �迭�� ��´�.
		
		for(Method method:declareMethods) {
			System.out.println("["+ method.getName()+"]");
		
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class); 
			for(int i = 1; i <= printAnnotation.number(); i++) {
				System.out.print(printAnnotation.value());
			}
			System.out.println();
			
			try {
				method.invoke(new Service());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
