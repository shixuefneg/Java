package test7;

public class TestPet {
	public static void main(String[] args) {
		Dog dog = new Dog("����", 100, 100, "��������Ȯ");
		System.out.println(dog.toString());
		
		//����    new  ����
		//cat ������������  ��������Pet
		//������������һ������cat����
		Pet cat = new Cat("����", 90, 90, "����");
		System.out.println(cat.toString());
		
		
	}
}
