// ( checking account )


public class CheckingAccount extends Account {
	
	//[변수선언]
	private double	credit_limit	;
	private double	interest		;
	private double	loan_interest	;
	
	//[생성자]
	CheckingAccount (double init_balance, double input_limit,
					 double input_interest, double input__loan_interest)
	{
		balance 		= init_balance			;	//	100
		credit_limit   = - input_limit			;	// -50	;
		interest		= input_interest		;	// 0.01	;
		loan_interest	= input__loan_interest	;	// 0.07	;
	}
	
	@Override
	public void debit (double input)
	{
		if ( balance - input < credit_limit ) {		//(한도보다 많이 출금하려하면)
			System.out.println("Cannot withdraw: credit limit exceeded!");
		}
		else
		{
			balance -= input;
			/*
			if (balance < input) {						//(잔금이 마이너스면 출력 - 문제 조건)
				System.out.println("You now have - balance");
			}
			*/
		}
		
	}
	
/*		//(passTime 메소드로 변경!)
	public void nextMonth()
	{
		if (balance >= 0) {						//(이자 추가)
			balance += ( balance * interest ) ;
		} else {								//(대출이자 붙음)
			balance += ( balance * loan_interest ) ;
		}
	}
*/
	
	@Override				//(현재 출금 가능한 금액 확인(반환))
	public double getWithdrawableAccount() {
		if ( balance + (- credit_limit) < 0 ) {		//(-일때)
			return 0;								//(...무조건 0)
		} else {
			return ( balance + (- credit_limit) );
		}
	}
	
	@Override
	public void passTime(int next) {
		month += next;				//(시간 경과)
	//[잔액에 따라 적용할 방법 선택]
		if (balance >= 0) {						//(이자 추가)
			balance += ( balance * interest ) * next ;
		} else {								//(대출이자 붙음)
			balance += ( balance * loan_interest ) * next ;
		}
	}
	
	public boolean isBankrupt() {		//(출력문 없이, 현재 잔액이 대출 가능액을 초과했는지 확인)
		if (balance < credit_limit) {
			return true;
		} else {
			return false;
		}
	}
	
}
