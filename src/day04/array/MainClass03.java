package day04.array;


public class MainClass03 {
	public static void main(String[] args) {
		//new연산자 사용하ㄱ지 않고ㅓ 직접 배열 값 대입하기
		String[] names= {"피카츄","라이츄 ","파이리"};

		
		//배열의 내용 출력하기
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		
		//확장for문
		for(String tmp:names) {
			System.out.println(tmp);
		}
		
		
		}
	}


