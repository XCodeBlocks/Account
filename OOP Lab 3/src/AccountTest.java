import java.util.Scanner;

// (실행 클래스)


public class AccountTest {
	
	public static void main(String[] args) {
		
		double input;
		
		//(2개 account 초기화)
		Account account1 = new Account(50.00);
		Account account2 = new Account();
		/*
		Account account1 = new Account();
		Account account2 = new Account();
		account1.credit(50.00);
		// account2.credit(0.00);
		*/
		
		System.out.print("account1 balance: ");
		account1.balance();
		System.out.print("account2 balance: ");
		account2.balance();
		
		
//		account1.debit();
		System.out.print("Enter withdrawl amount for account1: ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextDouble();
		account1.debit(input);				//(25.67)
		
		System.out.print("account1 balance: ");
		account1.balance();
		System.out.print("account2 balance: ");
		account2.balance();
		
		
		System.out.print("Enter withdrawl amount for account2: ");
//		sc = new Scanner(System.in);		//(이미 sc 객체를 만들었으니 선언 생략)
		input = sc.nextDouble();
		account2.debit(input);				//(10.00)
		
		System.out.print("account1 balance: ");
		account1.balance();
		System.out.print("account2 balance: ");
		account2.balance();
		
	}

}