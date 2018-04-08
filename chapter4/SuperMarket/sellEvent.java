import java.util.*;
class sellEvent implements Comparable<sellEvent>{
	private Calendar sellDate=Calendar.getInstance();
	private String operatorID;
	private ArrayList<OrderInfo>sellList;
	private double price;
	private String CustomerID;
	private double sid;
	static private double ID=0;
	public sellEvent(String oid,String cid ,ArrayList<OrderInfo>sellList,double price){
		sid=++ID;
		operatorID=oid;
		CustomerID=cid;
		this.sellList=sellList;
		this.price=price;
	}
	public String toString(){
		String str="****�˿͹����嵥*********\n";
		str+="����Ա��"+operatorID+"\t ����"+sellDate.getTime().toString()+"�˿ͱ�ţ�"+CustomerID
+" "+"\t ��ˮ��:"+sid+"\n";	
		for(int i=0;i<sellList.size();i++){
			String pID=sellList.get(i).getProductID();
			int num=sellList.get(i).getNum();
			ProductList pList=new ProductList();
			Product p=pList.get(pID);
			str+=p.toString()+" ����:"+num+"\n";
		}
		str+="�տ��ܶ�:"+price;
		return str;
     }
	 
	public int compareTo(sellEvent other) {
		 if(price>other.price) return 1;
		 if(price<other.price) return -1;
		return 0;
	}
}