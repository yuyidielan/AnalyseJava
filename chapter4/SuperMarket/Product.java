import java.util.*;
import java.text.*;
class Product{
	private String  productName;
	private double price;
	private String ID;
	private String unit;
	public Product(String ID,double price,String productName,String unit)
	{
		this.ID=ID;
		this.productName=productName;
		this.price=price;
		this.unit=unit;
	}
	public double getPrice(){
		return price;
	}
	public String toString(){
		return "��Ʒ����:"+productName+"�۸�"+price+"��λ"+unit;
	}
	public String getID(){
		return ID;
	}
}