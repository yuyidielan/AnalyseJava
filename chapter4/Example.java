/*
һ����˾������ͨԱ���͹�����Ա������Ա����ͨԱ���Ķ�����е����԰������������������ʣ�������Ա���������ս���
ʵ���������࣬���������������Ϣ
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
		System.out.println("����="+li.getName()+",��������="+li.getSalary());
		Manager he=new Manager();
		he.name="He Xia";
		he.salary=2400;
		he.bonus=12000;
		System.out.println("����="+he.getName()+",��������="+he.getSalary()+"�����ս�="+he.getBonus());
		
	}
}