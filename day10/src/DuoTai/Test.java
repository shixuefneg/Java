package DuoTai;

public class Test {
public static void main(String[] args) {
	//ʵ�����������˶���
			Master m= new Master();
			//��������
			Pet dog =m.getPet("��");
			m.feed(dog);
			m.play(dog);	
			Pet cat =m.getPet("è");
			//ι����
			m.feed(cat);
			m.play(cat);
			//ιʨ��
			Pet lion = m.getPet("ʨ��");
			m.feed(lion);
			m.play(lion);
}
}
