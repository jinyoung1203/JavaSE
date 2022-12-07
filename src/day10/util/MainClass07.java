package day10.util;

import java.util.Calendar;

/*
 * [[Calendar CLass]]
 *  -날짜관련객체
 *  
 * 
 * 
 */
public class MainClass07 {
	public static void main(String[] args) {
		//Calendar 객체 참조값 얻어오기
		//getInstane 메소드 통해서만 객체생성
		Calendar calNow = Calendar.getInstance(); //싱글톤 패턴(디자인패턴)
		
		int year = calNow.get(Calendar.YEAR);
		System.out.println("올해 년도:" + year);
		
		int month = calNow.get(Calendar.MONTH)+1;
		System.out.println("월:"+month);
		
		int day =calNow.get(Calendar.DAY_OF_MONTH);
		System.out.println("일:"+day);
		
		int hour = calNow.get(Calendar.HOUR);
		int min = calNow.get(Calendar.MINUTE);
		int sec = calNow.get(Calendar.SECOND);
		System.out.println(hour+":" +min+":" +sec);
		
		
		
		
	}
}
