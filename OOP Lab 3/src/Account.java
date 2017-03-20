// (실사용 클래스)


import java.util.Scanner;

public class Account
{
	//[변수]
	private double money;
	
	public Account() {					//(초기화: 0)
	}
	public Account(double input) {		//(초기화)
		this.money = input; 
	}
	
	public void credit(double input) {				//(입금)
		this.money += input;
	}
	
	public void debit(double minus) {				//(인출)
		//(if문 구현 필요) -- (아니면 Exception handling)
		if (money < minus) {
			System.out.println("Debit amount exceeded account balance.");
		}
		else {
			money -= minus;
		}
	}
	
	public void balance() {							//(출력)
		System.out.println(this.money);
		System.out.printf("%.2f" ,this.money);
	}
	
	
	
}
