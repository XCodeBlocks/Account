// (human 클래스)
// - (valuable 인터페이스를 '구현')


public class Human implements Valuable {
//[변수 선언]	
	private String name;
	private int age;
	
	//[생성자]
	public Human( String name, int age ) {
		this.name = name ;
		this.age = age   ;
	}
	
	@Override
	public double EstimateVaule(int month) {
		return Double.POSITIVE_INFINITY;	//(무조건 '무한 가치' 반환)
	}

}
