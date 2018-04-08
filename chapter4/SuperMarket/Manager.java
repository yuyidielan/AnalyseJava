import java.util.*;
class Manager extends Employee{
	String department;
	public Manager(String num,String n,String pwd,String d){
		super(num,n,pwd);
		department=d;
	}
	public void viewSell(){
		sellEvents events=sellEvents.getInstance();
		sellEvent[] s=new sellEvent[events.size()];
		s=events.toArray(s);
		Arrays.sort(s);
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}
}