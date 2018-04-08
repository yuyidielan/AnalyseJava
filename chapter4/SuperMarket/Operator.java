import java.util.*;
class Operator extends Employee{
	private String startTime;
	private String endTime;
	public Operator(String num,String n,String pwd,String startTime,String endTime){
		super(num,n,pwd);
		this.startTime=startTime;
		this.endTime=endTime;
	}
	public void checkOut(Customer s){
		double price =0.0;
		ArrayList<OrderInfo>list =s.getProductList();
		for(int i=0;i<list.size();i++){
			String pID=list.get(i).getProductID();
			int num=list.get(i).getNum();
			ProductList pList=new  ProductList();
			Product p=pList.get(pID);
			double temp=p.getPrice();
			price+=temp*num;
		}
		if(s instanceof VIPCustomer){
			VIPCustomer v=(VIPCustomer)s;
			v.setFen((int)(price/100));
			price=price-(v.getFen()/1000)*5;
		}
		sellEvent se=new sellEvent(ID,s.getID(),list,price);
		sellEvents events=sellEvents.getInstance();
		events.add(se);
		System.out.println(se);
	}
}