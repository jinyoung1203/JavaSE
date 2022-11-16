package Day03.operator;

/*
 * 4.논리 연산자
 * 
 * &&: and 조건,교집합개념,양쪽모두 true일떄만 true
 * ||:or 조건,합집합의 개념, 어느 한쪽이 true이면 true
 * !:not 조건, 여집합개념, 논리값을 반전 시킨다
 * 
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		boolean result=true&&true;
		System.out.println("&&:"+result);
		
		result=true||false;
		System.out.println("||:"+result);
		
		result=!false;
		System.out.println("!:"+result);
		
		result=(10<20)||(5==4);
		if((10<20)||(5==4)){
			System.out.println("조전 중 하나이상 true입니다");
		}
		System.out.println("||:"+result);
		result=true|false||false||false;
		System.out.println(result);
		
		result=(true&&true&&true)||false;
		System.out.println(result);
				
}
}
