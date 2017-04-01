// ( saving account )


public class SavingAccount extends Account {

	//[변수(필드) 선언]
	private double	interest;
	
	//[생성자]
	public SavingAccount(double init_balance, double input_interest) {
		balance		= init_balance	 ;	//(100)
		interest	= input_interest ;	//(0.05)
		//(복리 수령금 계산 -- 기간 정해져있다면 일정한 값만 나오므로!)+(예시 출력에서도 값이 고정이므로!)
		( balance ) *= Math.pow( (1 + interest) ,  12 ) ;		//(12달 고정)
	}


	@Override
	public void debit(double minus) {
		if ( month <= 12 ) {			//(기간 전)
			System.out.println("아직 출금할 수 없습니다.");
		} else {						//(기간 후)
			
		}
		
	}
	
	@Override
	public double getWithdrawableAccount() {
		return balance;
	}
	
	@Override
	public void passTime(int next) {
		//(해당 달의 값 계산은 생략)
		
	}


}
