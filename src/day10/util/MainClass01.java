package day10.util;

import java.util.Stack;
/*
 * [[stack class]]
 *  -배열성 클래스 (COLLECTION)
 *  -선입후출(FILO):먼저 들어온 값이 마지막에 나간다
 * 
 *  Generic 
 *  1. 잘못된 타입 들어오는거 방지
 *  2. 변환(cast) 필요없다
 * 
 */

public class MainClass01 {
public static void main(String[] args) {
	//stack 객체생성
	//<제네릭> - 배열성 객체 들어간 데이터 타입 정할수있다.
	Stack<String> stack = new Stack<>();
	
	//생성된 객체에 자료 저장하기
	stack.push("피카츄");
	stack.push("라이츄");
	stack.push("파이리");

	//현재저장하고 있는 데이터 개수
	System.out.println("데이처의 개수:" +stack.size());
	
	//데이터 하나씩 뺴오기
	//System.out.println("1:"+stack.pop());
	//System.out.println("2:"+stack.pop());
	//System.out.println("3:"+stack.pop());
	
	//가장위에 있는 데이터 출력
	System.out.println("가장위에 있는 데이터:"+ stack.peek());
	
	while(!stack.empty()) {
		String name = stack.pop();
		System.out.println("pop한 데이터:" + name);
	}
	
	
}
}
