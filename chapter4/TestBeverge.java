//������ͳ��󷽷������ʹ��
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
		System.out.println("��ˮ�Ѿ��պ���");
	}
	public void pourInCup(){
		System.out.println(type()+"�Ѿ����ڱ�������");
	}
}
class Tea extends Beverage{
	public void brew(){
		System.out.println("����Ҷ�ŵ���ˮ�����");
	}
	public String type(){
		return "��";
	}
}
class Coffee extends Beverage{
	public void brew(){
		System.out.println("�����Ⱥ��Ƿŵ���ˮ�����");
	}
	public String type(){
		return "����";
	}
}
public class TestBeverge{
	public static void main(String[] args){
		Beverage beverage=new Coffee();
		beverage.prepareRecipe();
		beverage=new Tea();
		beverage.prepareRecipe();
	}
}