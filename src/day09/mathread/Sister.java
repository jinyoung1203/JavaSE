package day09.mathread;

public class Sister extends Thread{
	public Wallet wallet;  //지갑객체
	public int money;      //인출한돈을 저장 할 변수

	public Sister(Wallet wallet) {
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
		
		System.out.println("sister 총계산:"+money);
	}
}
