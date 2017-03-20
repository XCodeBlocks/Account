import java.util.Scanner;

// (실사용 클래스)


public class Account
{
	//[변수]
	private double money;
	
	public Account() {					//(초기화: 0)
	}
	public Account(double money) {		//(초기화)
		this.money = money; 
	}
	
	public void credit(double money) {				//(입금)
		this.money += money;
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
	/*
	public void debit() {				//(인출)
		//System.out.println("");		//(클래스 이름 넘기는 방법?)
		
		Scanner sc = new Scanner(System.in);
		double minus = sc.nextDouble();
		
		//(if문 구현 필요) -- (아니면 Exception handling)
		if (money < minus) {
			System.out.println("Debit amount exceeded account balance.");
		}
		else {
			money -= minus;
		}
	}
	*/
	
	public void balance() {		//(출력)
		System.out.println(this.money);
		System.out.printf("%.2f" ,this.money);
	}
	
	
	
}
