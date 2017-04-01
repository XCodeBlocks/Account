
public class CheckingAccount extends Account {
	
	//[변수선언]
	private int		credit_limit	;
	private double	interest		;
	private double	loan_interest	;
	
	//[생성자]
	CheckingAccount(double input) {
		super(input);
		credit_limit	= -50	;
		interest		= 0.01	;
		loan_interest	= 0.07	;
	}
	
	@Override
	public void debit (double input)
	{
		if ( balance - input < credit_limit ) {		//(한도보다 많이 출금하려하면)
			System.out.println("Cannot withdraw: credit limit exceeded!");
		}
		else {
			balance -= input;
			if (balance < input)						//(잔금이 마이너스면 출력 - 문제 조건)
			{
				System.out.println("You now have - balance");
			}
		}
		
	}
	
/*
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
		return balance;
	}
	
	@Override
	public void passTime(int next) {
		month += next;				//(시간 경과)
	//[잔액에 따라 적용할 방법 선택]
		if (balance >= 0) {						//(이자 추가)
			balance += ( balance * interest ) ;
		} else {								//(대출이자 붙음)
			balance += ( balance * loan_interest ) ;
		}
	}
	
	public boolean isBankrupted() {		//(출력문 없이, 현재 잔액이 대출 가능액을 초과했는지 확인)
		if (balance < credit_limit) {
			return true;
		} else {
			return false;
		}
	}
	
}
