package day02.basic;
/*
 * [[기본자료형]
 * 2.문자열(char)
 * 선언하는방법
 * cahr변수명;
 * -전 세계에서 쓰이는 문자 형태 대부분 표현가능
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
			//char 형 변수 선언과 동시에 값 대입하기
		char ch1='A';
		//출력해보기
		System.out.println("char 형 변수에 저장되는 문자:"+ch1);
		char ch2='安';
		char ch3='뿅';
		
		int num=ch1;//char 형을 int형으로 형변환
		System.out.println("대문자A에 해당하는 숫자코드:"+num);
			
		int num2= 110;
		char ch4= (char)num2; //imt형을 char형으로 강제 형변환
		System.out.println(ch4);
		}

}
