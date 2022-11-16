package Day03.conditional;
/*
 * [[조건문]]
 * 
 * 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문
 * 
 * if문 사용법
 * if(조건식){
 *     조건식이 true일떄 실행명령문
 * }else if(조건식){
 * 조건식이 true일떄 실행명령문
 * }esle{
 * 모든 조건식이 false일떄 실행명령문
 * }
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num=11;

		if(num%2==0) {
			System.out.println("num은 짝수입니다.");
		}
		
		if(num%2!=0) {
			System.out.println("num은 홀수입니다.");
		}
		
			//실행명령문이 한줄일떄 중괄호 생략가능!
		if(num%2==0) 
			System.out.println("3.num은 짝수입니다.");
		else if(num%2!=0) 
			System.out.println("3.num은 홀수입니다.");
		
				
		
	}

}
