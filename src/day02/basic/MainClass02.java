package day02.basic;

/*
 * [[기본 자료형]]
 * 1.논리형(BOOLEAN)
 * 
 * -선언방법 
 * boolean 변수명
 * -가질수없는 범위 :true,false 두가지값 저장가능
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		// 논리형 변수 선언하기
		boolean isWait;
		// 선언한 변수값에 대입하기
		isWait = true;
		// 저장된 값읋 문자열로 출력하기
		System.out.println("논리형 변수에 저장된 값:" + isWait);
		// 지역변수는 일반적으로 선언과 동시에 값을 넣어주어야한다

		boolean canRun = false;// 변수 선언과 동시에 값 대입
		// 변스에 저장된 값을 실행도중에 바꿀수있떠

		isWait = false;
		canRun = true;

		System.out.println("isWait:" + isWait);
		System.out.println("canRun:" + canRun);
		boolean iaArea; // 초기화
		// System.out.println(is Area);
	}

}
