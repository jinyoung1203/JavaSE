package day09.mypac;

public class HandPhone {
	public String model;//전역변수 초기화하지않으면
						//null
	
	static{
		System.out.println("Static 초기화 블럭");
	}
	
	{
		System.out.println("초기화 블럭");
	}
	//static 활용잘안함
	
	//생성자-클래스명과 똑같다
	public HandPhone() {
		this.model="갤럭시";
		System.out.println("디폴트 생성자가 호출되었습니다.");
		
	}
	//오버로딩 생성자
	public HandPhone(String model) {
	this.model=model;
	System.out.println("생성자로 "+model+"이 전달되었습니다.");
	}
}
