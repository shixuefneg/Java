package DuoTai;

public class TestPet {
	public static void main(String[] args) {
		//ʵ�����������˶���
		Master m = new Master();
		
		//ι��
		//����ת��    ����ת����    �Զ�ת��
		Pet dog = new Dog("����", 100, 100, "��������Ȯ");
		m.feed(dog);
		
		//ιè
		Pet cat = new Cat("����", 90, 90, "����");
		m.feed(cat);
		
		//����ת��     ����ת����     ǿת
		Dog dog2 = (Dog)dog;
	}
}
