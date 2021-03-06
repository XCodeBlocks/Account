// (human 클래스)
// - (valuable 인터페이스를 '구현')


public class Human implements Valuable {
//[변수 선언]	
	private String name;	//(이름)
	private int age;		//(나이)
	
	//[생성자]
	public Human( String name, int age ) {
		this.name = name ;
		this.age = age   ;
	}
	
	@Override
	public double estimateValue(int month) {
		return Double.POSITIVE_INFINITY;	//(무조건 '무한 가치' 반환)
	}
	public double estimateValue() {			//[overloading]
		return Double.POSITIVE_INFINITY;	//(무조건 '무한 가치' 반환)
	}
}
