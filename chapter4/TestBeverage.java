//抽象类和抽象方法的灵活使用
abstract class Beverage{
	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		System.out.println(type()+"Beverage is OK,please enjoy it");
	}
	public abstract void brew();
	public abstract String type();
	public void boilWater(){
		Syste.out.println("热水已经烧好了");
	}
	public void pourInCup(){
		System.out.pritnln(type()+"已经倒在杯子里了");
	}
}
class Tea extends Beverage{
	public void brew(){
		System.out.println("将茶叶放到热水里！！！");
	}
	public String type(){
		return "茶";
	}
}
class Coffee extends Beverge{
	public void brew(){
		System.out.println("将咖啡和糖放到热水里！！！");
	}
	public String type(){
		return "咖啡";
	}
}
public class TestBeverage{
	public static void main(String[] args){
		Beverage beverage=new Coffee();
		beverage.prepareRecipe();
		beverage=new Tea();
		beverage.prepareRecipe()
	}
}