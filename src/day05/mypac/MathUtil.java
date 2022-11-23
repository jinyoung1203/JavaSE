package day05.mypac;

/**
 * @author ITSC
 *
 */
public class MathUtil {
	
	public double pi=3.14149;//월주율 
	
	/**
	 * 원의 넓이를 구하는 메소드
	 * @param r 반지름의 값
	 * @return 월의 넓이
	 */
	public double getArea(int r) {//매게변수 반지름
	
		double area= pi*r*r; //원주율*반지름 제곱
		
		return area; //원 얿이
		
		
	}
	
	//두수합계
	public int sum(int a, int b) {
		int result =a+b;
		
		return result;
	}
	//세개의 합계(오버로딩)
	public int sum(int a,int b, int c) {
		int result =a+b+c;
		
		return result;
	}
	
	
	
	
	
}
