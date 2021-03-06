// ( saving account )


public class SavingAccount extends Account {

	//[변수(필드) 선언]
	private boolean is_modified	;	//(복리 이자 적용 여부 스위치)	-- (필드값은 기본적으로 false!)
	
	//[생성자]
	public SavingAccount(double init_balance, double input_interest) {
		balance		= init_balance	 ;	//(100)
		interest	= input_interest ;	//(0.05)
	}


	@Override
	public void debit(double minus) throws Exception {
		if ( month <= 12 ) {			//(기간 전)
			System.out.println("아직 출금할 수 없습니다.");
		}
		else							//(기간 후)
		{
			if ( minus < 0 ) {		//[음수 입력 - 예외]
				//	throw new OtherExceptions();	//[처리 넘기기]
				throw new Exception() ;
			}			
			else if ( minus > balance ) {		//['남은 금액'보다 많이 출금하려하면]
				// System.out.println("Cannot withdraw: credit limit exceeded!");	//(Lab6 실습을 위해서...)
				//	throw new OtherExceptions();	//[처리 넘기기]
				throw new Exception() ;
			}
			else {			//[정상]
				// balance -= minus		//(Lab6 실습을 위해서...)
				super.debit(minus);
			}
		}
	}
	
	@Override
	public double getWithdrawableAmount() {
		return balance;
	}
	
	@Override
	public void passTime(int next) {		//(일단 입력 month < 0 인 경우는 생각하지 않기로 한다!)
		month += next ;
		//(해당 달의 값 계산은 생략)
		if ( month >= 12 && is_modified == false )		//(기간 지나고나서 잔고가 갱신되지 않았을때만 갱신!)
		{	//(복리 수령금 계산)
			( balance ) *= Math.pow( (1 + interest) , 12 ) ;		//(12달 고정)
			is_modified = true;		//(추가 복리적용 금지!)
		}
	}
	public void passTime() {			//(기간 1달로 고정)	//[overloading]
		month += 1 ;
		//(해당 달의 값 계산은 생략)
		if ( month >= 12 && is_modified == false )		//(기간 지나고나서 잔고가 갱신되지 않았을때만 갱신!)
		{	//(복리 수령금 계산)
			( balance ) *= Math.pow( (1 + interest) , 12 ) ;		//(12달 고정)
			is_modified = true;		//(추가 복리적용 금지!)
		}
	}


	@Override
	public double estimateValue(int month) {	//( <-인터페이스 )
		return ( balance * Math.pow( (1 + interest) , month ) );
	}
	public double estimateValue() {				//( <-인터페이스 )		//(1달로 고정)	//[overloading]
		return ( balance * Math.pow( (1 + interest) , 1 ) );
	}

}
