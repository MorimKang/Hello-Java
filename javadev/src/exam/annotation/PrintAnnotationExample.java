package exam.annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] declareMethods = Service.class.getDeclaredMethods(); //서비스.클래스 안에 있는 모든 메소드의 정보를 가져다가 배열에 담는다.
		
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
