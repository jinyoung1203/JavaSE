package day09.mathread;

public class Wallet {
	public int totalMoney;
	
	public Wallet() {
		this.totalMoney = 10000;
	}
	//Thred safe 메소드synchronized
	public synchronized int getMoney() {
		
		if(totalMoney==0) 
			return 0;
		
		totalMoney = totalMoney -1;
		System.out.println("현재 지갑의 금액:"+ totalMoney);
		return 1;
	
	
	}

}
