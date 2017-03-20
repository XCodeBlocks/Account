// (실사용 클래스)


import java.util.Scanner;

public class Account
{
	//[변수]
	private double balance;
	
	public Account() {					//(초기화: 0)
	}
	public Account(double input) {		//(초기화)
		this.balance = input; 
	}
	
	public void credit(double input) {				//(입금)
		this.balance += input;
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
	
	public void balance() {							//(출력)
		System.out.println(this.balance);
		System.out.printf("%.2f" ,this.balance);
	}
	
	
	
}
