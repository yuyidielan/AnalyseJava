class Base{
	public String str="Base";
	public void show(){
		System.out.println("父类Base中show方法的输出:"+str);
	}
}
class Derived extends Base{
	public String str="ExtendStr";
	public void show(){
		System.out.println("子类Base中show方法的输出:"+str);
	}
	public void showParent(){
		super.show();
	}
	public static void main(String[] args){
		Derived ext=new Derived();
		Base sup=ext;
		sup.show();
		ext.show();
		System.out.println("sup.str="+sup.str);
		System.out.println("ext.str="+ext.str);
		ext.showParent();
	}
}