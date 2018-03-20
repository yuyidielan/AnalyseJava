import java.util.*;
public class AddressBook{
	public static void main(String[] args){
		ContactList addressList=new ContactList();
		Scanner reader=new Scanner(System.in);
		String input=null;
		do{
			System.out.println("L-�г�ͨѶ¼��������ϵ��");
			System.out.println("A-���һ����ϵ�˵�ͨѶ¼");
			System.out.println("D-ɾ��ͨѶ¼��ָ������ϵ��");
			System.out.println("F-����ͨѶ¼�з�����������ϵ��");
			System.out.println("X-�˳�����");
			if(reader.hasNextLine())
				input=reader.nextLine();
			if(input.compareTo("L")==0){
				System.out.println("ͨѶ¼��������ϵ�˵���Ϣ����:");
				System.out.println(addressList.toString());
			}else if(input.compareTo("A")==0){
				System.out.println("������һ����ϵ�˵���Ϣ����ʽΪ����������ַ���绰��ÿ����Ӣ�Ķ��Ÿ�����");
				if(reader.hasNextLine())
					input=reader.nextLine();
				String[] additem=input.split(",");
				if(additem.length==3){
					addressList.addContact(new Contact(additem[0],additem[1],additem[2]));
					System.out.println("�����ϵ�˳ɹ�!\n");
				}else{
					System.out.println("�������ϵ����Ϣ�д���");
				}
			}else if(input.compareTo("D")==0){
				System.out.println("������ɾ������ϵ�˵�����");
				if(reader.hasNextLine())
					input=reader.nextLine();
				addressList.removeContact(input);
			}else if(input.compareTo("F")==0){
				System.out.println("������Ҫ���ҵ���ϵ�˵�����:");
				if(reader.hasNextLine())
					input=reader.nextLine();
				Contact item=addressList.findContact(input);
				System.out.println("���ҵ�����Ϊ��"+input+"��������¼�����ҵĽ��Ϊ��");
				System.out.println(item.toString());
			}
		}while(input.compareTo("X")==0);
	}
}