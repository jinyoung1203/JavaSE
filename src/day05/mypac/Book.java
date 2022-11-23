package day05.mypac;

public class Book {
	public String subject="JAVA Programing";//전역변수
	public String writter="안진영";
	
	public void read() {
		int page = 10;//지역변수
		System.out.println(subject+ " "+ page+ "페이지를 읽어요!");
	}		
	public void pillow() {
		System.out.println( " 베개로 사용해요!");
	}
	
	
}
