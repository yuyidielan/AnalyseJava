import java.util.*;
class Customer{
		private ArrayList<OrderInfo>list;
		private String ID;
		private String name;
		public Customer (String ID,String name){
			list=new ArrayList();
			this.ID=ID;
			this.name=name;
		}
		public void selectProduct(String ProductID,int num){
			OrderInfo oinfo=new OrderInfo(ProductID,num);
			list.add(oinfo);
		}
		public ArrayList<OrderInfo> getProductList(){
			return list;
		}
		public String getID(){
			return ID;
		}
}