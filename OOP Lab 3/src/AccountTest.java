// (실행 클래스)


import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		
//(2개 account 초기화)		--		** (아래에서 typecasting 필요!! 이렇게 상위 클래스로 지정할 수 있지만 나중에 typecasting을 해줘야 한다!)
		Account account1 = new CheckingAccount( 100, 50, 0.01, 0.07 );
		Account account2 = new SavingAccount( 100, 0.05 );

		Scanner scan = new Scanner(System.in);
		double amount;

//[1문단]
// CheckingAccount

	// (초기)
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.2f\n"
						account1.getBalance(), account1.getWithdrawableAccount() );
		// 파산 여부 확인 ( isBankrupt - 형변환 )

	// (1달 후)
		account1.passTime(1);
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.2f\n"
						account1.getBalance(), account1.getWithdrawableAccount() );
		// 파산 여부 확인 ( isBankrupt - 형변환 )


	// (5달 후)	-- (총 6달 후)
		account1.passTime(5);
		System.out.printf("Account1 balance: $ %.2f \t현재출금가능액: %.2f\n"
						account1.getBalance(), account1.getWithdrawableAccount() );
		// 파산 여부 확인 ( isBankrupt - 형변환 )
		
		
//[2문단]
// SavingAccount

	// (초기)
		
		

	// (6달 후)
		System.out.println("6 months later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액: %.2f\n"
						account2.getBalance(), account2.getWithdrawableAccount() );
		account2.debit(50);
		
		
	// (6달 후)	-- (총 12달 후)
		System.out.println("Next 6 months later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액: %.2f\n"
						account2.getBalance(), account2.getWithdrawableAccount() );
	
	// (1달 후)	-- (총 13달 후)
		System.out.println("Next 1 month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액: %.2f\n"
						account2.getBalance(), account2.getWithdrawableAccount() );
		
		account2.debit(50);
		System.out.printf("Account2 balance: $ %.2f \t현재출금가능액: %.2f\n"
						account2.getBalance(), account2.getWithdrawableAccount() );
		
	}

}