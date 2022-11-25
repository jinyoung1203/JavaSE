package day05.var;

import day05.mypac.Card;

/*
 * [[변수(variable)]]
 *  * 변수란
 * 메모리공간에 붙여진 이름
 * JAVA 프로그램 사용되는 모든 값을 메모리공간에 저장
 * 메모리공간에 이름을 붙여 접근가능
 * 
 * 변수 선언 및 초기화
 * 자료형 변수명=값
 * 
 * 1.타입의 따른 볌수
 * 		기본형 -예약어, 소문자로 시작, 값을 가지고 있음 
 * 			8가지  boolean, byte, short, int, long, char, float, double
 * 		참조형- 대문자로 시작을 하고, 주소값을 가지고 있다.
 * 			기본형 외 나머지 전부!
 * 			ex)String
 * 		
 * 2.선언하는 위치에 따른 변수
 * 		전역변수(global 변수) - 믈래스 안에 선언(멤버변수)
 * 		지역변수(local 변수) - 메소드 또는 생산자 안에 선언.
 * 							중괄호{} 안에 선언된 변수.
 * 							반드시 초기화 해줘야 한다. (컴파일 에러)
 * 
 * 3.정적(static) / 동적 변수
 * 		
 * 
 * 
 * !초기화 = 처음값을 대입
 * 
 */
public class MainClass01 {
	
	
	public static void main(String[] args) {
			Card c1 = new Card();
			Card c2= new Card();
			
			System.out.println( );
			
		
			
			c2.cardType="heart";
			c2.number="k";
			c2.width=65;
			c2.height=90;
			
			System.out.println("c2.cardType :"+c2.cardType);
			System.out.println("c2.number:"+c2.number);
			System.out.println("c2,width:"+c2.width);
			System.out.println("c2.height:"+c2.height);
			
			System.out.println("c1.cardType:"+c1.cardType);
			System.out.println("c1.number:"+c1.number);
			System.out.println("c1.width:"+c1.width);
			System.out.println("c1.height:"+c1.height);
		
			System.out.println();
			
		
	
	
	}
	
	
	
	
	
}
