package day10.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * [[HashMap class]]
 * 
 *  -Map인터페이스를 구형한 클래스이다
 *  -Key값 value
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass05 {
public static void main(String[] args) {
	
	HashMap<String,String>map1= new HashMap<>();
	
	map1.put("HELLO", "안녕하세요");
	map1.put("CAR", "자동차");
	map1.put("TIGER", "호랑이");
	
	String value = map1.get("HELLO");
	
	System.out.println("value : " +value);
	
	Set<String>set=map1.keySet();
	
	Iterator<String>it = set.iterator();
	while(it.hasNext()) {
		String keyValue = it.next();
		
		String value2 = map1.get(keyValue);
		
		System.out.println(value2);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
