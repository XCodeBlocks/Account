import java.util.ArrayList;

// (실사용 클래스)


public abstract class Account implements Valuable	//(상위 클래스 '구현' -> 하위 클래스 같이 적용됨!)
{
	//[변수]
	protected double balance	;		// (잔고)
	protected int    month		;		// (누적 경과 월수)
	protected double interest	;		// (이자) -- (하위 클래스에서 쓸 것임!)
	
	/*		//(생성자 필요 없어짐!)
	public Account(double input) {			//(초기화)
		balance = input; 
	}
	*/
	
	public void credit(double input) {				//(입금)
		balance += input;
	}
	
	public void debit(double minus) throws Exception {
		balance -= minus;
	}
		
	public abstract double getWithdrawableAmount();
	public abstract void passTime(int next);
		
	public double getBalance() {							//(출력)
		return balance;
		//System.out.printf("%.2f" ,balance);
	}
	/*
	public void setBalance() {
		
	}
	*/
	
//[2017/05/08] -- (추가 메소드들): Generic)	
	public static double sumForAccount( ArrayList<? extends Account> list ) {		//[ <> 부분: 그 안의 마지막 부분의 subclass를 모두 지정할 수 있게 해줌! -- wildcard]		//(Object: typecasting이 필요하므로... 어짜피 그냥 않됨)
		double sum = 0;
		for (Account account : list) {		//[확장형 for문: (형태) '자료형 반복참조자 : 반복대상'] -- (자료형 - 참조하는 대상의 자료형)
			sum += account.getBalance() ;
		}
		return sum;
	}
	public static void passTimeForList( ArrayList<? extends Account> list, int month) {
		for (Account account : list) {		//[확장형 for문: (형태) '자료형 반복참조자 : 반복대상'] -- (자료형 - 참조하는 대상의 자료형)
			account.passTime( month ) ;
		}
		
		
	}	
	
	
}
