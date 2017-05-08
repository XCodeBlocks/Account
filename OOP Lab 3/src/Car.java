// (car 클래스)
// - (valuable 인터페이스를 '구현')


public class Car implements Valuable {
//[변수 선언]
	final double DEPRECIATION_PERC = 0.01;	//(감가상각 비율) -- (const는 자바에 없으므로 final로 대체!) 
	
	private int month;		//(경과 월수)
	
	private String name;	//(이름)
	// private double price;	//(원 가격)
	private double init_value;	//(가치)
	
	//[생성자]
	public Car( String name, double price ) {
		this.name = name;
		//this.price = price;
		init_value = (0.8) * price ;		//(초기 감가상각: 20% 감소)
	}
	
	@Override
	public double estimateValue(int month) {
		return ( init_value * Math.pow( (1 - DEPRECIATION_PERC), month ) ) ;	//( 초기 가치 * (1 - 감가상각 비율)^(월수) )
	}
	//[overloading]
	public double estimateValue() {
		return ( init_value * Math.pow( (1 - DEPRECIATION_PERC), 1 ) ) ;	//( 초기 가치 * (1 - 감가상각 비율)^(월수) )
	}

}
