import java.util.*;
public class AddressBook{
	public static void main(String[] args){
		ContactList addressList=new ContactList();
		Scanner reader=new Scanner(System.in);
		String input=null;
		do{
			System.out.println("L-列出通讯录中所有联系人");
			System.out.println("A-添加一个联系人到通讯录");
			System.out.println("D-删除通讯录中指定的联系人");
			System.out.println("F-查找通讯录中符合条件的联系人");
			System.out.println("X-退出程序");
			if(reader.hasNextLine())
				input=reader.nextLine();
			if(input.compareTo("L")==0){
				System.out.println("通讯录的所有联系人的信息如下:");
				System.out.println(addressList.toString());
			}else if(input.compareTo("A")==0){
				System.out.println("请输入一个联系人的信息，格式为：姓名，地址，电话，每项用英文逗号隔开：");
				if(reader.hasNextLine())
					input=reader.nextLine();
				String[] additem=input.split(",");
				if(additem.length==3){
					addressList.addContact(new Contact(additem[0],additem[1],additem[2]));
					System.out.println("添加联系人成功!\n");
				}else{
					System.out.println("输入的联系人信息有错误");
				}
			}else if(input.compareTo("D")==0){
				System.out.println("请输入删除的联系人的名字");
				if(reader.hasNextLine())
					input=reader.nextLine();
				addressList.removeContact(input);
			}else if(input.compareTo("F")==0){
				System.out.println("请输入要查找的联系人的姓名:");
				if(reader.hasNextLine())
					input=reader.nextLine();
				Contact item=addressList.findContact(input);
				System.out.println("查找的姓名为："+input+"的这条记录，查找的结果为：");
				System.out.println(item.toString());
			}
		}while(input.compareTo("X")==0);
	}
}