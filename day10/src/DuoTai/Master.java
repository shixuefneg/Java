package DuoTai;

/**
 * ������
 * @author KingWin
 */
public class Master {
	
	/**
	 * ι����
	 * �Ը���������Ϊ��ʽ����
	 * @param pet
	 */
	public void feed(Pet pet){
		//���Զ���
		pet.eat();
	}
	
	/**
	 * ��������
	 * �Ը���������Ϊ�����ķ���ֵ����
	 * @return
	 */
	public Pet getPet(String type){
		Pet pet = null;
		if (type.equals("��")) {
			pet = new Dog("����", 100, 100, "��������Ȯ");
		}else if(type.equals("è")){
			pet = new Cat("����", 90, 90, "����");
		}else{
			pet = new Lion("����", 100, 100, "��ɫ");
		}
		return pet;
	}
	
	/**
	 * �ͳ������
	 * @param pet
	 */
	public void play(Pet pet){
		System.out.println("�����������ںͳ��������");
		if (pet instanceof Dog) {
			Dog dog = (Dog)pet;
			dog.catchFlyingDisc();
		}else if(pet instanceof Cat){
			Cat cat = (Cat)pet;
			cat.catchBall();
		}
	}
	
}
