package basic0723_1;

import java.util.Scanner;

public class classTest_main {

	public static void main(String[] args) {

		classTest test = new classTest();
		System.out.println("이름을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("주소를 입력하세요");
		String juso = sc.nextLine();
		System.out.println("성별을 입력하세요");
		String sex = sc.nextLine();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("만나이를 입력하세요");
		int man_age = sc.nextInt();		
		
		
		
		test.setName(name);
		test.setJuso(juso);
		test.setSex(sex);
		test.setAge(age);
		test.setMan_age(man_age);
		
		System.out.println("이름 : " + test.getName());
		System.out.println("주소 : " + test.getJuso());
		System.out.println("성별 : " + test.getSex());
		System.out.println("나이 : " + test.getAge());
		System.out.println("만나이 : " + test.getMan_age());
		
		System.out.println();
		
		test.arrayMake(5);
		test.arraySee();
	}
	
}
