//hashMap����
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
		return"[����="+name+",нˮ="+salary+"]";

	}
}
public class TestMap{
	public static void main(String[] args){
		Map<String,Employee>staff=new HashMap<String,Employee>();
		staff.put("124-25-9527",new Employee("����"));
		staff.put("129-35-9528",new Employee("����"));
		staff.put("177-89-9529",new Employee("����"));
		staff.put("823-47-9530",new Employee("����"));
		System.out.println("��ʼֵΪ->"+staff+"\n");
		staff.remove("129-35-9528");
		System.out.println("ɾ�����ĺ�->"+staff+"\n");

		staff.put("823-47-9530",new Employee("������"));
		System.out.println("�������滻���������->"+staff+"\n");
		System.out.println("���823-47-9530��Ӧ��ֵ->"+staff.get("823-47-9530"));
		for(Map.Entry<String ,Employee>entry:staff.entrySet()){
			String key=entry.getKey();
			Employee value=entry.getValue();
			System.out.println("key="+key+",value="+value);
		}
	}
}