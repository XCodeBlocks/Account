// (interface(인터페이스) 정의)


public interface Valuable {
	double estimateValue( int month );		//(기본적으로 public abstract로 취급되므로 생략 가능!)
	double estimateValue();				//(overloading을 위해 추가해야하는 코드 -- 상위 부분에도 필요!!)
}