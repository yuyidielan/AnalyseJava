public class Contact{
	private String name;
	private String address;
	private String telephone;
	private static int itemCount=0;
	public Contact(String name,String address,String telephone){
		this.name=name;
		this.address=address;
		this.telephone=telephone;
		itemCount++;
	}
	public Contact(){
		name=null;
		address=null;
        telephone=null;
        itemCount++;
	}
	public Contact(Contact aItem){
		this(aItem.name,aItem.address,aItem.telephone);
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setTelephone(String telephone){
		this.telephone=telephone;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getTelephone(){
		return telephone;
	}
	public static int getItemCount(){
		return itemCount;
	}
	public String toString(){
		return name+" "+address+" "+telephone;
	}

}