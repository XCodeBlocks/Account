// (실사용 클래스)


public abstract class Account
{
	//[변수]
	protected double balance	;		// (잔고)
	protected int    month		;		// (누적 경과 월수)
	protected double interest	;		// (이자) -- (하위 클래스에서 쓸 것임!)
	
	/*		//(생성자 필요 없어짐!)
	public Account(double input) {			//(초기화)
		balance = input; 
	}
	*/
	
	public void credit(double input) {				//(입금)
		balance += input;
	}
	
	public abstract void debit(double minus);
		
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int next);
		
	public double getBalance() {							//(출력)
		return balance;
		//System.out.printf("%.2f" ,balance);
	}
	/*
	public void setBalance() {
		
	}
	*/
	
	
}
