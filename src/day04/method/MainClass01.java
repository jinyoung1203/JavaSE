package day04.method;

/*
 * 
 * [[메소드]]
 * 어떤 특정 작업을 수핼하기위한 명령문의 집합
 * 
 *접근제어자(정적) 반환타입 메소드이름 (매게변수타입 매게변수명){//선언부)
 *   명령문   //구현부
 *   
 *   return 반환값;
 *   
 *}
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass01 {
	public static String name; //전역변수 
	
	
	
	public static void main(String[] args) {
		System.out.println("main method 시작");

		
		//hello메소드 호출하기
		hello();
		
			printName("안진영");
		
		setName("피카츄");
		
		String strName=getName();
		
		System.out.println("전역변수name:"+strName);
		
		String eMon=getEvolution("꼬부기");
		System.out.println(eMon);
	}
	
	
	//인자 x 리턴x -> 실행하고 끝나는 메소드
	
	public static void hello() {
		System.out.println("hello,world");
	}
	
	//인자(매게변수)o 리턴x
	
	
	//오버로딩메소드 
	public static void printName(String name){
		System.out.println("이름:"+name);
		
		
	}
	
	
	public static void setName(String name) {
		MainClass01.name=name;
		
	}
	
	
	public static String getName() {
		return name;
	}
	
	public static String getEvolution(String mon) {
		String eMon="";
		if(mon.equals("꼬부기")) {
			eMon="어니부기";
		}else if(mon.equals("어니부기")) {
			eMon="거북왕";
		}
		
		return eMon;
		}
		
	}
	

	

