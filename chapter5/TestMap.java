//hashMap测试
import java.util.HashMap;
import java.util.Map;
class Employee{
	private String name;
	private double salary;
	public Employee(String n){
		name=n;
		salary=0;
	}
	public String toString(){
		return"[姓名="+name+",薪水="+salary+"]";

	}
}
public class TestMap{
	public static void main(String[] args){
		Map<String,Employee>staff=new HashMap<String,Employee>();
		staff.put("124-25-9527",new Employee("张三"));
		staff.put("129-35-9528",new Employee("李四"));
		staff.put("177-89-9529",new Employee("王五"));
		staff.put("823-47-9530",new Employee("赵六"));
		System.out.println("初始值为->"+staff+"\n");
		staff.remove("129-35-9528");
		System.out.println("删除李四后->"+staff+"\n");

		staff.put("823-47-9530",new Employee("张三丰"));
		System.out.println("把赵六替换成张三丰后->"+staff+"\n");
		System.out.println("输出823-47-9530对应的值->"+staff.get("823-47-9530"));
		for(Map.Entry<String ,Employee>entry:staff.entrySet()){
			String key=entry.getKey();
			Employee value=entry.getValue();
			System.out.println("key="+key+",value="+value);
		}
	}
}