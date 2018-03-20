public class Contact{
	private String name;
	private String address;
	private String telephone;
	Contact(String n,String addr,String tele){
	name=n;
	address=addr;
	telephone=tele;
	}
	public static void main(String[] args){
		Contact obj=new Contact("Jack","Chongqing","02312345678");
	}
}