
public class ValuableTest {
	public static void main(String[] args) {
		//(초기선언)
		Valuable[] objectList = new Valuable[4];	//(인터페이스(interface) 배열)
		//(각각 할당)
		objectList[0] = CheckingAccount( 100, 50, 0.01, 0.07 );
		objectList[1] = SavingAccount( 100, 0.05 );
		objectList[2] = Human("Mark", 20 );
		objectList[3] = Car("MyCar", 5000 );
		
		//(6개월 후의, 각각의 가치 계산)
		for (Valuable objectItem : objectList) {
			System.out.printf("%s \n", objectItem.toString() );
			System.out.printf("6 month later... Valuable : %.2f\n\n", objectItem.estimateValue(6) );
		}
	}

}
