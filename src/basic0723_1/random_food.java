//�Ļ�޴� ���ϱ�

package basic0723_1;

public class random_food {

	public static void main(String[] args) {

		int rn = (int)(Math.random()*10);
		String rf;
		
		switch(rn) {
		case 0 : rf = "�н�";break;
		case 1 : rf = "�Ͻ�";break;
		case 2 : rf = "�߽�";break;
		case 3 : rf = "����";break;
		case 4 : rf = "ġŲ";break;
		case 5 : rf = "����Ʈ";break;
		case 6 : rf = "����";break;
		case 7 : rf = "���";break;
		case 8 : rf = "���̾�Ʈ��";break;
		default : rf = "�ѽ�";break;
		}
		
		System.out.println(rf + "�����?");
		
	}
}
