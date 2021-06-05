package com.lening.BookBiz;

public class book {
	//姓名数组
	
		String[] names=new String[30];
		//初始化姓名数组的数据
		public void initNames(){
			names[0] = "三国";
			names[1] = "红楼梦";
			names[2] = "水浒";
			names[3] = "西游";
			names[4] = "守塔";
		}
		//初始化菜单
		public void initMenu(){
			System.out.println("============学生姓名管理系统=============");
			System.out.println("\t1.添加图书名");
			System.out.println("\t2.查询所有图书名");
			System.out.println("\t3.删除图书");
			System.out.println("\t4.修改图书名");
			System.out.println("\t5.在指定范围内查找名字是否存在");
			System.out.println("\t6.退出");
			System.out.println("========================================");
		}
		//添加图书名
		public void addName(String name){
			for(int i=0;i<name.length();i++){
				//判断第一个没有名字的位置
				if(names[i]==null){
					//将名字添加在该下标的位子
					names[i]=name;
					break;
				}
			}
		}
		//遍历数组信息
		public void showName(){
			System.out.println("===========遍历数组信息=============");
			for(int i=0;i<names.length;i++){
				if(names[i]!=null){
					System.out.println(names[i]+"\t");
					if((i+1)%5==0){
						//换行
						System.out.println();
					}
				}
			}
			System.out.println("\n===================================");
			
		}
		//删除图书名
		public boolean delName(String delName){
			boolean flag = false;
			for(int i=0;i<names.length;i++){
				if(delName.equals(names[i])){
					//要删除的名字存在，可以删除
					flag=true;
					names[i]=null;
				}
			}
			return flag;
		}
		//修改图书名
		public boolean updateName(String oldName,String newName){
			/*1、先查询原始姓名是否存在
			 * 2、如果存在，则修改----赋值
			 * 如果不存在，则提示修改失败
			 * **/
			boolean flag = false;
			for(int i =0;i<names.length;i++){
				if(oldName.equals(names[i])){
					//注意：不要null指针异常
					flag=true;
					//存在，则修改该下标位置的值
					names[i]=newName;
				}
			}
			return flag;
		}
		/**
		 * 在某个区间内查找指定姓名是否存在
		 * @param start	开始位置
		 * @param end	结束位置
		 * @param name	要查找的姓名
		 * @return 是否存在
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
