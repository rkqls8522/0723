package basic0723_1;

public class classTest {

	String name;
	String juso;
	String sex;
	int age;
	int man_age;
	float height;
	
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getJuso() {
		return this.juso;
	}
	void setJuso(String juso) {
		this.juso = juso;
	}
	String getSex() {
		return this.sex;
	}
	void setSex(String sex) {
		this.sex = sex;
	}
	int getAge() {
		return this.age;
	}
	void setAge(int age) {
		this.age = age;
	}
	int getMan_age() {
		return this.man_age;
	}
	void setMan_age(int man_age) {
		this.man_age = man_age;
	}
	int sum = 0;
	int test[] = new int[10];
	void arrayMake(int arrayInt) {
		System.out.println("test.length : " +test.length);
		for(int i = arrayInt,j=0; j < 10; i++,j++) {
			test[j] = i;
			sum++;
		}
	}
	
	void arraySee() {
		for(int i = 0; i < test.length; i++)
			System.out.println(test[i]);
		System.out.println("sum : " +sum);
	}
	
	
}
