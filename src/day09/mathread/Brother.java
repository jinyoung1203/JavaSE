package day09.mathread;

public class Brother extends Thread{
	public Wallet wallet;  //지갑객체
	public int money;      //인출한돈을 저장 할 변수

	public Brother(Wallet wallet) {
		this.wallet = wallet;
		
	}
	
	@Override
	public void run() {
		while(true) {
			int returnedMoney = wallet.getMoney();
			if(returnedMoney==0)//지갑잔고가 0이면
				break;
			
			money = money + returnedMoney;
		}
		System.out.println("Brothe의 총 계산:"+money);
	}
	
}
