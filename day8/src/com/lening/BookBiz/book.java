package com.lening.BookBiz;

public class book {
	//��������
	
		String[] names=new String[30];
		//��ʼ���������������
		public void initNames(){
			names[0] = "����";
			names[1] = "��¥��";
			names[2] = "ˮ�";
			names[3] = "����";
			names[4] = "����";
		}
		//��ʼ���˵�
		public void initMenu(){
			System.out.println("============ѧ����������ϵͳ=============");
			System.out.println("\t1.���ͼ����");
			System.out.println("\t2.��ѯ����ͼ����");
			System.out.println("\t3.ɾ��ͼ��");
			System.out.println("\t4.�޸�ͼ����");
			System.out.println("\t5.��ָ����Χ�ڲ��������Ƿ����");
			System.out.println("\t6.�˳�");
			System.out.println("========================================");
		}
		//���ͼ����
		public void addName(String name){
			for(int i=0;i<name.length();i++){
				//�жϵ�һ��û�����ֵ�λ��
				if(names[i]==null){
					//����������ڸ��±��λ��
					names[i]=name;
					break;
				}
			}
		}
		//����������Ϣ
		public void showName(){
			System.out.println("===========����������Ϣ=============");
			for(int i=0;i<names.length;i++){
				if(names[i]!=null){
					System.out.println(names[i]+"\t");
					if((i+1)%5==0){
						//����
						System.out.println();
					}
				}
			}
			System.out.println("\n===================================");
			
		}
		//ɾ��ͼ����
		public boolean delName(String delName){
			boolean flag = false;
			for(int i=0;i<names.length;i++){
				if(delName.equals(names[i])){
					//Ҫɾ�������ִ��ڣ�����ɾ��
					flag=true;
					names[i]=null;
				}
			}
			return flag;
		}
		//�޸�ͼ����
		public boolean updateName(String oldName,String newName){
			/*1���Ȳ�ѯԭʼ�����Ƿ����
			 * 2��������ڣ����޸�----��ֵ
			 * ��������ڣ�����ʾ�޸�ʧ��
			 * **/
			boolean flag = false;
			for(int i =0;i<names.length;i++){
				if(oldName.equals(names[i])){
					//ע�⣺��Ҫnullָ���쳣
					flag=true;
					//���ڣ����޸ĸ��±�λ�õ�ֵ
					names[i]=newName;
				}
			}
			return flag;
		}
		/**
		 * ��ĳ�������ڲ���ָ�������Ƿ����
		 * @param start	��ʼλ��
		 * @param end	����λ��
		 * @param name	Ҫ���ҵ�����
		 * @return �Ƿ����
		 */
		public boolean findNameExists(int start,int end,String name){
			boolean flag = false;
			for (int i = start; i <= end; i++) {
				if (name.equals(names[i])) {
					flag = true;
				}
			}
			return flag;
		}
}
