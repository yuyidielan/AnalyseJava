//在Example的基础上给普通员工与管理人员这两个类加上构造方法
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
		System.out.println("姓名="+li.getName()+",基本工资="+li.getSalary());
		Manager2 he=new Manager2("He xia",2400,12000);
		System.out.println("姓名="+he.getName()+",基本工资="+he.getSalary()+"，年终奖="+he.getBonus());
		
	}
}