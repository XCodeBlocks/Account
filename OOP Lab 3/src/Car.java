// (car 클래스)
// - (valuable 인터페이스를 '구현')


public class Car implements Valuable {
//[변수 선언]
	private String name;
	private double price;
	
	public Car( String name, double price ) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public double EstimateVaule(int month) {
		// TODO Auto-generated method stub
		return 0;
	}

}