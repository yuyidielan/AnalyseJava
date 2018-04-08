public class TestSuperMarket{
	public static void main(String[] args){
		System.out.println("欢迎到超市购物!");
		Customer s1=new Customer("101","张三");
		s1.selectProduct("101",20);
		s1.selectProduct("102",22);
		
		VIPCustomer s2=new VIPCustomer("102","李四",1023);
	    s2.selectProduct("103",3);
	    Operator o1=new Operator("1","员工1","123","08:00:00","18:00:00");
	    o1.login();
	    o1.checkOut(s1);
	    o1.checkOut(s2);
	    System.out.println("****管理人员按序查看销售列表****");
	    sellEvents events=sellEvents.getInstance();
	    Manager m=new Manager("2","经理1","102","企业管理部");
	    m.viewSell();
	    
	}
}