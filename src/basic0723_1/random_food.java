//식사메뉴 정하기

package basic0723_1;

public class random_food {

	public static void main(String[] args) {

		int rn = (int)(Math.random()*10);
		String rf;
		
		switch(rn) {
		case 0 : rf = "분식";break;
		case 1 : rf = "일식";break;
		case 2 : rf = "중식";break;
		case 3 : rf = "피자";break;
		case 4 : rf = "치킨";break;
		case 5 : rf = "디저트";break;
		case 6 : rf = "육류";break;
		case 7 : rf = "어류";break;
		case 8 : rf = "다이어트식";break;
		default : rf = "한식";break;
		}
		
		System.out.println(rf + "어떠세요?");
		
	}
}
