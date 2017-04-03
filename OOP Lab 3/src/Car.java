// (car 클래스)
// - (valuable 인터페이스를 '구현')


public class Car implements Valuable {
//[변수 선언]
	private int month;		//(경과 월수)
	
	private String name;	//(이름)
	private double price;	//(원 가격)
	private double value;	//(가치)

	//[생성자]
	public Car( String name, double price ) {
		this.name = name;
		this.price = price;
		value = (0.8) * price ;		//(초기 감가상각)
	}
	
	@Override
	public double EstimateVaule(int month) {
		
		return 0;
	}

}
