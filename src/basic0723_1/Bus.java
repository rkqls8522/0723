package basic0723_1;

//Bus는 클래스라는 데이터타입임. int가 정수형 데이터 타입인 것처럼.
public class Bus { //설계도면
	int tire;
	int width;
	int height;
	String driver;
	
	
	//Bus()와 Bus(String a)는 함수 이름은 같지만 파라미터의 갯수 및 데이터 타입이 달라서 구별 가능 - > 생성자 오버로딩
	/*
	 * 밑의 add 두 개는 이름은 같지만 파라미터의 데이터 타입이 달라서 구별 가능하다 -> 메소드 오버로딩 add(int a, int b){
	 * } add(folat a, float b){ }
	 */
	Bus(String a){ //생성자, 클래스 이름과 동일한 함수, 문자열 파라미터 하나를 받는 함수
		//생성자는 반환값이 없지만 void를 사용하지 않음
		System.out.println(a + "를 감싸고 있는 생성자가 호출되었습니다.");
		this.driver = a;
	}
	Bus(){
		System.out.println("기본 생성자가 호출 되었습니다.");
		
	}
	
	//멤버함수(기능)메서드
	void drivingCar(String a) { //파라미터(매개변수)문자열 하나인 함수 반환값은 없음(void)
		//기능은 출력만 합니다. 파라미터로 받은 a의 변수에 저장된 문자열값과 +"가 운전합니다."를 결합한 문자열 출력
		System.out.println(a + "가 운전합니다.");
	}
	//메서드란? 클래스 안에 있는 함수?

	String getDriver() { //driver의 getter
		return this.driver;
	}
	void setDriver(String driver) {
		this.driver = driver;
	}

	int getTire() {
		return this.tire;
	}
	void setTire(int tire) {
		this.tire = tire;
	}
	
	int getWidth() {
		return this.width;
	}
	void setWidth(int width) {
		this.width = width;
	}
	
	int getHeight() {
		return this.height;
	}
	void setHeight(int height) {
		this.height = height;
	}
}

