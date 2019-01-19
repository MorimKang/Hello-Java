package exam.control;

import java.util.Calendar;
import java.util.Scanner;

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

public class CalendarTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년> ");  int year = sc.nextInt();
		System.out.println("월> ");  int month = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1); 								 //사용자가 입력한 달의 1일로 날짜설정.
		int week = c.get(Calendar.DAY_OF_WEEK); 				 //1일이 무슨요일인지 알아내기.일요일이 =1 월요일이 2 ....
		int end_day = c.getActualMaximum(Calendar.DAY_OF_MONTH); //마지막 날 날짜 알아내기
		
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("---------------------");
		for(int d = 1; d < week; d++) System.out.print("   "); 	 //1일의 요일 전까지는 공백 출력
		
		for(int d = 1, w=week; d <= end_day; d++,w++) {
			System.out.print(d < 10? " "+ d + " " : d + " ");    //날짜가 한자리 숫자일때는 앞뒤로 공백 찍고
																 //두자리일 때는 숫자찍고 뒤에만 공백.																
			if(w%7 ==0)System.out.println(); 					 //w가 7의 배수라면 토요일이니까 거기서 줄바꿈 해주면 된다.
		}		
	}
}






