import java.util.ArrayList;

// (실사용 클래스)


public abstract class Account implements Valuable	//(상위 클래스 '구현' -> 하위 클래스 같이 적용됨!)
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
	
	public void debit(double minus) throws Exception {
		balance -= minus;
	}
		
	public abstract double getWithdrawableAmount();
	public abstract void passTime(int next);
		
	public double getBalance() {							//(출력)
		return balance;
		//System.out.printf("%.2f" ,balance);
	}
	/*
	public void setBalance() {
		
	}
	*/
	
	public static double sumForAccount( ArrayList<? extends Object> list ) {
		double sum = 0;
		for (int element : list) {
			sum += account.getBalance() ;
		}
		return sum;
	}
	
	
}
