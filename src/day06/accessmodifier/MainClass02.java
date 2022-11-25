package day06.accessmodifier;

import day06.mapac.MemberVO;

public class MainClass02 {
	
	public static void main(String[] args) {
		/*
		 * 아이디: young
		 * 비밀번호:young1234
		 * 이름:지녕
		 * 전화번호:010-1234-1234
		 * 주소:서울시 서대문구 신촌동
		 * 
		 */
		
		MemberVO memberVO =new MemberVO();
		memberVO.setId("young");
		memberVO.setPassword("young1234");
		memberVO.setName("지녕");
		memberVO.setPhoneNumber("010-1234-1234");
		memberVO.setAddress("서울시 서대문구 신촌동");
		
		String id = memberVO.getId();
		String password = memberVO.getPassword();
		String name= memberVO.getName();
		String phoneNumber = memberVO.getPhoneNumber();
		String address = memberVO.getAddress();
		
		System.out.println(id);
		System.out.println(password);
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println(address);
		
	}
}
