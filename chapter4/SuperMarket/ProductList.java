import java.util.*;
class ProductList extends HashMap<String,Product>{

	public ProductList(){
		Calendar startDate=Calendar.getInstance();
		startDate.set(2005, 0,11);
		Calendar endDate=Calendar.getInstance();
		endDate.set(2008, 1,1);
        put("101",new Product("10",35.4,"ºì¾Æ","Æ¿"));
        put("102",new DiscountedProduct("20",55.4,"°×¾Æ","Æ¿",startDate,endDate,90));
        put("103",new Product("30",354,"ºì¾Æ","Æ¿"));
	}
}
