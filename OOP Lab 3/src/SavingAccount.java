// ( saving account )


public class SavingAccount extends Account {

	//[변수(필드) 선언]
	private double	interest	;
	private boolean is_modified	;	//(복리 이자 적용 여부 스위치)	-- (필드값은 기본적으로 false!)
	
	//[생성자]
	public SavingAccount(double init_balance, double input_interest) {
		balance		= init_balance	 ;	//(100)
		interest	= input_interest ;	//(0.05)
	}


	@Override
	public void debit(double minus) {
		if ( month <= 12 ) {			//(기간 전)
			System.out.println("아직 출금할 수 없습니다.");
		}
		else							//(기간 후)
		{
			if ( minus > balance ) {		//('남은 금액'보다 많이 출금하려하면)
				System.out.println("Cannot withdraw: credit limit exceeded!");
			}
			else {			
				balance -= minus;
			}
		}
	}
	
	@Override
	public double getWithdrawableAccount() {
		return balance;
	}
	
	@Override
	public void passTime(int next) {
		month += next ;
		//(해당 달의 값 계산은 생략)
		if ( month > 12 && is_modified == false )		//(기간 지나고나서 잔고가 갱신되지 않았을때만 갱신!)
		{	//(복리 수령금 계산)
			( balance ) *= Math.pow( (1 + interest) ,  12 ) ;		//(12달 고정)
			is_modified = true;		//(추가 복리적용 금지!)
		}
	}


}
