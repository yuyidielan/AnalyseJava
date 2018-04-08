import java.util.*;
abstract class Employee{
	String ID;
	String name;
	String pass;
	public Employee(String num,String n,String pwd){
		ID=num;
		name=n;
		pass=pwd;
	}
	public boolean login(){
		Scanner scanner =new Scanner (System.in);
		System.out.println("«Î ‰»Î‘±π§±‡¬Î");
		String num=scanner.nextLine();
		System.out.println("«Î ‰»Î√‹¬Î");
		String pwd=scanner.nextLine();
		if(num.equals(ID)&&pwd.equals(pass))
			 return true;
		else return false;
	}
}