package basic0723_1;

//Bus�� Ŭ������� ������Ÿ����. int�� ������ ������ Ÿ���� ��ó��.
public class Bus { //���赵��
	int tire;
	int width;
	int height;
	String driver;
	
	
	//Bus()�� Bus(String a)�� �Լ� �̸��� ������ �Ķ������ ���� �� ������ Ÿ���� �޶� ���� ���� - > ������ �����ε�
	/*
	 * ���� add �� ���� �̸��� ������ �Ķ������ ������ Ÿ���� �޶� ���� �����ϴ� -> �޼ҵ� �����ε� add(int a, int b){
	 * } add(folat a, float b){ }
	 */
	Bus(String a){ //������, Ŭ���� �̸��� ������ �Լ�, ���ڿ� �Ķ���� �ϳ��� �޴� �Լ�
		//�����ڴ� ��ȯ���� ������ void�� ������� ����
		System.out.println(a + "�� ���ΰ� �ִ� �����ڰ� ȣ��Ǿ����ϴ�.");
		this.driver = a;
	}
	Bus(){
		System.out.println("�⺻ �����ڰ� ȣ�� �Ǿ����ϴ�.");
		
	}
	
	//����Լ�(���)�޼���
	void drivingCar(String a) { //�Ķ����(�Ű�����)���ڿ� �ϳ��� �Լ� ��ȯ���� ����(void)
		//����� ��¸� �մϴ�. �Ķ���ͷ� ���� a�� ������ ����� ���ڿ����� +"�� �����մϴ�."�� ������ ���ڿ� ���
		System.out.println(a + "�� �����մϴ�.");
	}
	//�޼����? Ŭ���� �ȿ� �ִ� �Լ�?

	String getDriver() { //driver�� getter
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

