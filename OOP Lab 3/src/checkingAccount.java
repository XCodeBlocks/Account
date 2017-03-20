
public class checkingAccount extends Account {
	
	//[변수선언]
	private int		credit_limit	;
	private double	interest		;
	private double	loan_interest	;
	
	//[생성자]
	checkingAccount(double input) {
		super(input);
		credit_limit	= 50	;
		interest		= 0.01	;
		loan_interest	= 0.07	;
	}
	
	
}
