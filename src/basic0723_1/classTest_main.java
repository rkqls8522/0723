package basic0723_1;

import java.util.Scanner;

public class classTest_main {

	public static void main(String[] args) {

		classTest test = new classTest();
		System.out.println("�̸��� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("�ּҸ� �Է��ϼ���");
		String juso = sc.nextLine();
		System.out.println("������ �Է��ϼ���");
		String sex = sc.nextLine();
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		System.out.println("�����̸� �Է��ϼ���");
		int man_age = sc.nextInt();		
		
		
		
		test.setName(name);
		test.setJuso(juso);
		test.setSex(sex);
		test.setAge(age);
		test.setMan_age(man_age);
		
		System.out.println("�̸� : " + test.getName());
		System.out.println("�ּ� : " + test.getJuso());
		System.out.println("���� : " + test.getSex());
		System.out.println("���� : " + test.getAge());
		System.out.println("������ : " + test.getMan_age());
		
		System.out.println();
		
		test.arrayMake(5);
		test.arraySee();
	}
	
}
