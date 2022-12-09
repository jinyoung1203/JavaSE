package day11.pattern;


/*
 * 싱글톤 패턴
 * 공유하는객체
 * 메모리가 좋다
 * 
 * 
 * 
 * 
 */
public class Singleton {

	private static Singleton instance;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		
		return instance;
		
	}
	
}
