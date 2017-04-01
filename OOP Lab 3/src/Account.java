// (실사용 클래스)


public abstract class Account
{
	//[변수]
	protected double balance;
	
	public Account(double input) {			//(초기화)
		balance = input; 
	}
	
	public void credit(double input) {				//(입금)
		balance += input;
	}
	
	public void debit(double minus) {				//(인출)
		//(if문 구현 필요) -- (아니면 Exception handling)
		if (balance < minus) {
			System.out.println("Debit amount exceeded account balance.");
		}
		else {
			balance -= minus;
		}
	}
	
	public double getBalance() {							//(출력)
		return balance;
		//System.out.printf("%.2f" ,balance);
	}
	/*
	public void setBalance() {
		
	}
	*/
	
	
}
