//在Example2基础上，给普通员工和管理人员这两个两个类添加方法计算一年的总收入
class Employee3{
   private String name;
   private double salary;
   public Employee3(String name,double sal){
		this.name=name;
		salary=sal;
	}
	public double getSalary(){
	   return salary;
	}
	public String getName(){
		return name;
	}
	public double getTotalIncome(){
		return 12*salary;
	}

}
class Manager3 extends Employee3{
	double bonus;
	public Manager3(String name,double sal,double bonus){
		super(name,sal);
		this.bonus=bonus;
	}
	public void setBouns(double b){
		bonus=b;
	}
	public double getBonus(){
		return bonus;
	}
	public double getTotalIncome(){
		return super.getTotalIncome()+bonus;
	}
}
public class Example3{
	public static void main(String[] args){
        Employee3 li=new Employee3("Li Ming",1200);
		System.out.println("姓名="+li.getName()+",基本工资="+li.getSalary()+"，全年总工资:"+li.getTotalIncome());
		Manager3 he=new Manager3("He xia",2400,12000);
		System.out.println("姓名="+he.getName()+",基本工资="+he.getSalary()+"，年终奖="+he.getBonus()+",全年总收入:"+he.getTotalIncome());
		
	}
}