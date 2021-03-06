// ( checking account )


public class CheckingAccount extends Account {
	
	//[변수선언]
	private double	credit_limit	;
	private double	loan_interest	;
	
	//[생성자]
	CheckingAccount (double init_balance,   double input_limit,
					 double input_interest, double input__loan_interest)
	{
		balance 		= init_balance			;	//	100	;
		credit_limit   = - input_limit			;	// -50	;
		interest		= input_interest		;	// 0.01	;
		loan_interest	= input__loan_interest	;	// 0.07	;
	}
	
	@Override
	public void debit (double input) throws Exception		//(여기서 try-catch문 쓰지 말 것!!)
	{
		if ( balance - input < credit_limit ) {		//(한도보다 많이 출금하려하면)
			//System.out.println("Cannot withdraw: credit limit exceeded!");	//(Lab6 실습을 위해서...)
			throw new OtherExceptions();	//[처리 넘기기]
		}
		else if ( input < 0 ) {
			throw new OtherExceptions();	//[처리 넘기기]
		}
		else
		{
			// balance -= input;	//(아래로 대체!)
			super.debit(input);		//( <- 문제의 조건!)
			/*		//(debug)
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
	public double getWithdrawableAmount() {
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
		if (balance >= 0) {						//( (+)이자 추가)
			balance += ( balance * interest ) * next ;
		} else {								//(대출이자 붙음 (-) )
			balance += ( balance * loan_interest ) * next ;
		}
	}
	public void passTime() {		//(고정 1달 경과) -- [overloading]
		month += 1;
	//[잔액에 따라 적용할 방법 선택]
		if (balance >= 0) {						//( (+)이자 추가)
			balance += ( balance * interest ) ;
		} else {								//(대출이자 붙음 (-) )
			balance += ( balance * loan_interest ) ;
		}
	}
	
	public boolean isBankrupt() {		//(출력문 없이, 현재 잔액이 대출 가능액을 초과했는지 확인)
		return (balance < credit_limit) ;	//(개선: 조건식의 결과를 바로 return 가능!)
	}
	
	@Override
	public double estimateValue(int month) {	//( <-인터페이스 )
		passTime(month);			//(Lab7 요구조건에 맞춰 추가!)
		return balance;
	}
	public double estimateValue() {				//( <-인터페이스 )		//[overloading]
		passTime();					//(Lab7 요구조건에 맞춰 추가!)
		return balance;
	}
	
}
