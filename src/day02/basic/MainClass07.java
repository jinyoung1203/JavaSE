package day02.basic;
/*
 * [[참조형 데이터형(레퍼런스형)]]
 * 
 * String형 (문자열)
 * -선언하는방법
 * String 변수명;
 * -문자열을 저장할수있다.
 * 
 * 기본혈- boolean,char,byte,short,int,long,float,double
 * *참조형-기본형을 제외한 모든 클래스
 * 
 */
public class MainClass07 {
	public static void main(String[] args) {
		//변수선언과 동시에 값 대입하기
		String str="안녕하세요";
		System.out.println("str:"+str);
		
		String addr = "서울 특별시 서대문구 신촌";
		boolean isContain = addr.contains("특별시");
		if(isContain) {	// true 이면 실행
			System.out.println("addr 에는 특별시 라는 문자열이 있어요!");
		}
		}
		
}



