package day10.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass11 {
	public static void main(String[] args) {
	
	}
	public static void getDateAndDay() {
		//날짜객체
		Date date = new Date();
		//날짜포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		
		//요일값 반환 0~6
		int sday = date.getDay();
		
		String strDay;
		switch (sday) {
		case 0 :
			strDay ="일";
			break;
		
		case 1 :
			strDay ="월";
			break;
			
		case 2 :
			strDay ="화";
			break;
			
		case 3 :
			strDay ="수";
			break;
			
		case 4 :
			strDay ="목";
			break;
			
		case 5 :
			strDay ="금";
			break;
			
		case 6 :
			strDay ="토";
			break;
			
			
			
		}
		
		
	}
}
