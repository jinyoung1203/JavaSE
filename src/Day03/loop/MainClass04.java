package Day03.loop;
/*
 * 반복문 조건문 연습
 주말숙제 2중 for문 if문 코드 분석하기 
 * 
 * 2번 숙제
 *       *
 *      **
 *     *** 
 *    ****   
 *   *****    
 *  ******    
 * *******
 * 
 *     3번
 *     *
 *    *** 
 *   *****
 *  *******  
 * 
 * 4번
 *      *
 *     ***
 *    *****  
 *   *******
 *    *****
 *     ***
 *      * 
 * 
 */
public class MainClass04 {
public static void main(String[] args) {
	
	
	for(int i=0; i<7;i++) {   //줄(행)을 의미
		for(int j=0; j<=i; j++) { //칸(열)을 의미
		System.out.print("*");
		
		} 
		System.out.println();
	}
	
	//1번숙제분석
	for(int i=0; i<7;i++) {
		for(int j=0; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		
	}
}
}
