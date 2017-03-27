// (실행 클래스)


import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		
		double input;
//[1문단]		
		//(2개 account 초기화)
		CheckingAccount account1 = new CheckingAccount(100.00);
		CheckingAccount account2 = new CheckingAccount(100.00);
		
		System.out.print("account1 balance: ");
		account1.getBalance();
		System.out.print("account2 balance: ");
		account2.getBalance();
		
		System.out.print("Enter deposit amount for ccount1: ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextDouble();
		account1.credit(input);				//(900)

//[2문단]
		System.out.print("account1 balance: ");
		account1.getBalance();
		System.out.print("account2 balance: ");
		account2.getBalance();
		System.out.println();
		
		
		System.out.print("Enter withdrawl amount for account2: ");
		//	sc = new Scanner(System.in);		//(이미 sc 객체를 만들었으니 선언 생략)
		input = scan.nextDouble();
		account2.debit(input);				//(10.00)
		
//[3문단]
		System.out.print("account1 balance: ");
		account1.getBalance();
		System.out.print("account2 balance: ");
		account2.getBalance();
		System.out.println();
		
//[4문단]
		System.out.println("next month!");
		account1.nextMonth();
		account2.nextMonth();
		
		System.out.print("account1 balance: ");
		account1.getBalance();
		System.out.print("account2 balance: ");
		account2.getBalance();
		System.out.println();
		
	}

}