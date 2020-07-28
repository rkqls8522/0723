package basic0723_1;

public class BusTest {

	public static void main(String[] args) {
		int a = 5;
		Bus b = new Bus();//생성자 : 함수를 이용하여 객체 생성 클래스이름과 동일한 함수
		//여기에서 b객체를 생성시 Bus()기본 생성자가 호출괴면서 b객체 생성됨
		Bus c = new Bus("홍말자");
		System.out.println(c.getDriver());
		//Bus("홍말자") 생성자를 이용하여 c객체 생성됨 자동으로 객체 생성시 호출됨
		//기본 생성자(파라미터가 없는 클래스와 이름이 같은 함수)는 내가 클래스 설계시 정의하지 않으면 자동을 생성됨
		//그러나 내가 필요한 생성자를 정의하면 기본 생성자가 생성되징 ㅏㄶ아서 내가 추가해주어야 함
		
		b.drivingCar("홍길동"); //이것은 나중에 호출 및 실행됨
		
		//객체 지향 언어 3가지 특징 중 하나인 은닉(데이터 보호)
		//getter(읽기용), setter(저장용) 생성하여 데이터 접근 해야 함
		//함수
		//getter는 멤버변수 이름에 get을 붙이고 기능은 멤버변수의값을 반환함
		//setter는 멤버변수 이름에 set을 붙이고 기능은 파라미터로 받은 값을 멤버변수에 저장함
		
		Bus test = new Bus();
		test.setHeight(5);
		System.out.println(test.getHeight());
		
	}

}
