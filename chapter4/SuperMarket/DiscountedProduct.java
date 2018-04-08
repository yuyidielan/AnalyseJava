import java.util.*;
import java.text.*;
class DiscountedProduct extends Product {
        private Calendar startDate;
        private Calendar endDate;
        private double discount;
        public DiscountedProduct(String ID,double price,String productName,String dw,Calendar startDate,Calendar endDate,double discount){
        	super(ID,price,productName,dw);
        	this.startDate=startDate;
        	this.endDate=endDate;
        	this.discount=discount;
        }
        public double getPrice(){
        	DecimalFormat precision=new DecimalFormat("0.00");
        	double price=super.getPrice();
        	Calendar rightNow=Calendar.getInstance();
        	if(rightNow.after(startDate)&&rightNow.before(endDate)){
        		String strPrice=precision.format(price*(1-(100-discount)/100));
        		return Double.parseDouble(strPrice);
        	}
        	else 
        		return price;
        }
        public String toString(){
        	return super.toString()+"’€ø€¬ £∫"+(discount/10)+"’€";
        }
}