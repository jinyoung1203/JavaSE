package day17.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainClass01 {
	public static void main(String[] args) throws UnknownHostException {
		//InetAddress는 IP를 관리하는 클래스
		//getLocalHost() 로컬
		InetAddress ia = InetAddress.getLocalHost();
		
		
		//getHostName
		System.out.println("host name:" + ia.getHostName());
		//getHostAddress 호스트 ip 반환
		System.out.println("host ip :" + ia.getHostAddress());
		//getByName()는 특정사이트의; ip 를 InetAdderss로 반환
		ia = InetAddress.getByName("www.naver.com");
		System.out.println("host name :" + ia.getHostName());
		System.out.println("host ip: " + ia.getHostAddress());
		
		
	}
}
