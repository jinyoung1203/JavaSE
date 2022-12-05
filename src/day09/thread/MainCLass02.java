package day09.thread;

import day09.mathread.CountThread;

public class MainCLass02 {
public static void main(String[] args) {
	System.out.println("메인 스레드가 실행됩니다.");
	
	new CountThread().start();
			
			System.out.println("메인 스레드가 종료됩니다");
}
}
