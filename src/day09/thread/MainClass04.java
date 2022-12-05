package day09.thread;
/*
 * synchronized - 동기화를 시켜주는 예약어
 * 
 */


import day09.mathread.Brother;
import day09.mathread.Sister;
import day09.mathread.Wallet;

public class MainClass04 {
public static void main(String[] args) {
	//Wallet 객체 생성
	Wallet wallet = new Wallet();
	
	//sister객체 생성
	Sister sister = new Sister(wallet);
	
	//
	Brother brother = new Brother(wallet);
	
	//각각의 객체를 이용해서 두개의 스레드 싱행하기
	sister.start();
	brother.start();
	 System.out.println("메인스레드가 종료됩니다");
}
}
