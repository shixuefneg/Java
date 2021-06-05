
public class LnStudent extends Student{
	public int kpi;
	
	public int getKpi(){
		return kpi;
	}
	
	public void setKpi (int kpi){
		this.kpi=kpi;
	}
	
	public  LnStudent(){
		super();
		
	}
	public LnStudent(String name, int age, String sex, int kpi) {
		super(name, age, sex);
		this.kpi = kpi;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("学生姓名:"+name+"，年龄:"+age+"，性别:"+sex+"，kpi:"+kpi);
	}
	
	
	
}
