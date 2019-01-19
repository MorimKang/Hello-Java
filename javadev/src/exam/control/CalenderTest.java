package exam.control;

import java.util.Calendar;

//*****달력짜기********
//1일이 무슨요일인지
//그 달이 몇일까지 있는지 알아내야함.
//
//
//스캐너로 날짜 입력받고.
//캘린더 만들어서
//날짜 설정
//요일이랑 이달의 마지막 날 구하면
//달력 만들 수 있다.

public class CalenderTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); //new는 getInstance()에서 자동으로 생성하니까 따로 붙일 필요 없음
		System.out.println("년: "+ c.get(Calendar.YEAR));
		System.out.println("월: "+ (c.get(Calendar.MONTH)+1)); //+1하는 이유?: 배열?에넣으니까 첫번째 인덱스가 0부터 시작해서.
		System.out.println("일: "+ c.get(Calendar.DATE));
		System.out.println("요일: "+ c.get(Calendar.DAY_OF_WEEK));	
		System.out.println("마지막 날: "+ c.getActualMaximum(Calendar.DAY_OF_MONTH));
		//마지막날 찾기 방법1
		//다음달 1일을 찾아서 거기서 1빼는방법
		//마지막날 찾기 방법2
		//c.getActualMaximum(Calendar.DAY_OF_MONTH)
			
		
		c.set(2019,2-1,1); //2019년 2월 1일로 날짜 설정.
		System.out.println("년: "+ c.get(Calendar.YEAR));
		System.out.println("월: "+ (c.get(Calendar.MONTH)+1)); //+1하는 이유?: 배열?에넣으니까 첫번째 인덱스가 0부터 시작해서.
		System.out.println("일: "+ c.get(Calendar.DATE));
		System.out.println("요일: "+ c.get(Calendar.DAY_OF_WEEK));
		System.out.println("마지막 날: "+ c.getActualMaximum(Calendar.DAY_OF_MONTH));
				
	}
}
