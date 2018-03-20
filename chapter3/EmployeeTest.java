class Employee{
	private String name;
	private double salary;
	public Employee(String n,double s){
	name=n;
	salary=s;
	}
	public String getName(){
	return name;
	}
	public double getSalary(){
	return salary;
	}
	public void raiseSalary(double byPercent){
	double raise=salary*byPercent/100;
	salary+=raise;
	}
	public String toString(){
	return name+"'s salary is "+salary;
	}
}
public class EmployeeTest{
	public static void main(String[] args){
		Employee[] staff=new Employee[3];
		staff[0]=new Employee("Jack",2200);
		staff[1]=new Employee("Tom",2600);
		staff[2]=new Employee("John",3000);
		System.out.println("before raising the salary .....");
		for(int i=0;i<staff.length;i++){
			System.out.println(staff[i].getName()+"'s salary is "+staff[i].getSalary());

		}
		for (Employee e:staff){
			e.raiseSalary(5);
		}
		System.out.println("after raising 5% of salary .....");
		for(Employee e:staff)
			System.out.println(e);
	}
}