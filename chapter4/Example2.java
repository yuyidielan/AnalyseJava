//��Example�Ļ����ϸ���ͨԱ���������Ա����������Ϲ��췽��
class Employee2{
	private String name;
	private double salary;
	public Employee2(String name,double sal){
		this.name=name;
		salary=sal;
	}
	public double getSalary(){
	   return salary;
	}
	public String getName(){
		return name;
	}

}
class Manager2 extends Employee2{
	double bonus;
	public Manager2(String name,double sal,double bonus){
		super(name,sal);
		this.bonus=bonus;
	}
	public void setBouns(double b){
		bonus=b;
	}
	public double getBonus(){
		return bonus;
	}
}
public class Example2{
	public static void main(String[] args){
        Employee2 li=new Employee2("Li Ming",1200);
		System.out.println("����="+li.getName()+",��������="+li.getSalary());
		Manager2 he=new Manager2("He xia",2400,12000);
		System.out.println("����="+he.getName()+",��������="+he.getSalary()+"�����ս�="+he.getBonus());
		
	}
}