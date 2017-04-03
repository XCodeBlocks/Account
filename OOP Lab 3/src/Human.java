// (human 클래스)
// - (value 인터페이스를 '구현')


public class Human implements Valuable {
	
	public Human( String name, int age ) {
		
	}
	
	@Override
	public double EstimateVaule(int month) {
		return Double.POSITIVE_INFINITY;	//(무조건 '무한 가치' 반환)
	}

}
