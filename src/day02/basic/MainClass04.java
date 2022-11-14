package day02.basic;

/*
 * [[기본자료형]]
 * 3. 정수형 
 *	 -선언하는방법
 *		 byte 변수명;   -128~127
 *		 short 변수명;  -32,768~32,767
 * 		int변수명;		-2,147,483,648~2,147,483,647
 * 		long 변수명;
 * 
 * 	-같은 정수형이지만 표현범위가 다르다
 * byte(1byte)<short(2byte),int(4byte)<long(8bytr)(
 * 
 */

	public class MainClass04 {
		
		public static void main(String[] args) {
			byte iBite=10;
			short iShort=100;
			int iInt=1000;
			long iLong=10000;
			
			System.out.println("byte형:"+iBite);
			System.out.println("iShort형:"+iShort);
			System.out.println("iInt혈:"+iInt);
			System.out.println("iLong형:"+iLong);
		}
}
