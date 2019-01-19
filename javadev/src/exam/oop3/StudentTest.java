package exam.oop3;

public class StudentTest {
	public static void main(String[] args) {
		StudentDTO student = new StudentDTO();
		student.setName("°­¸ð¸²");
		student.setKor(100);
		student.setEng(100);
		student.setMat(90);
		student.setPhi(95);
		
		System.out.println(student.getStudentScore());
		
//		System.out.print(student.getName() + "\t" );
//		System.out.print(student.getKor() + "\t" );
//		System.out.print(student.getEng() + "\t" );
//		System.out.print(student.getMat() + "\t" );
//		System.out.print(student.getPhi() + "\t" );	
//		System.out.print(student.getTotal() + "\t");
//		System.out.print(student.getAvg() +"\n");	
	}
}
