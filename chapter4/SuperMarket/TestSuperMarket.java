public class TestSuperMarket{
	public static void main(String[] args){
		System.out.println("��ӭ�����й���!");
		Customer s1=new Customer("101","����");
		s1.selectProduct("101",20);
		s1.selectProduct("102",22);
		
		VIPCustomer s2=new VIPCustomer("102","����",1023);
	    s2.selectProduct("103",3);
	    Operator o1=new Operator("1","Ա��1","123","08:00:00","18:00:00");
	    o1.login();
	    o1.checkOut(s1);
	    o1.checkOut(s2);
	    System.out.println("****������Ա����鿴�����б�****");
	    sellEvents events=sellEvents.getInstance();
	    Manager m=new Manager("2","����1","102","��ҵ����");
	    m.viewSell();
	    
	}
}