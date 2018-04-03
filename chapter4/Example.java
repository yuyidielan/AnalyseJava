/*
一个公司，有普通员工和管理人员两类人员。普通员工的对象具有的属性包括：姓名，基本工资，管理人员还包括年终奖金
实现这两个类，并创建对象并输出信息
*/
class Employee{
	String name;
	double salary;
	public double getSalary(){
	   return salary;
	}
	public String getName(){
		return name;
	}

}
class Manager extends Employee{
	double bonus;
	public double getBonus(){
		return bonus;
	}
}
public class Example{
	public static void main(String[] args){
		Employee li=new Employee();
		li.name="Li Ming";
		li.salary=1200;
		System.out.println("姓名="+li.getName()+",基本工资="+li.getSalary());
		Manager he=new Manager();
		he.name="He Xia";
		he.salary=2400;
		he.bonus=12000;
		System.out.println("姓名="+he.getName()+",基本工资="+he.getSalary()+"，年终奖="+he.getBonus());
		
	}
}