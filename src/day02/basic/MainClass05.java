package day02.basic;
/*
 * [[기본자료형]]
 * 
 * 4.실수형
 * 	-선언하는방법
 * 		float 변수명;
 * double변수명;
 * float(4byte)<double(8byte)\
 * 
 * 실수계산 부등소수점오차 예외처리하기!
 * 
 */
public class MainClass05 {
	public static void main(String[] args) {
		//실수형 변수 ㅇ선언과 동시에 값 대입하기
		float iFloat=10.1f;
		double iDouble=10.1d;
		double iDouble2=10.1; //double 은 d생략가능
		
		System.out.println("float 형:"+iFloat);
		System.out.println("iDouble형:"+iDouble);
		System.out.println("iDouble2형:"+iDouble2);
			
	}

}
