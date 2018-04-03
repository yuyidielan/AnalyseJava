//构造方法的调用实例
class Art{
	Art(){
		System.out.println("Art constructor");
	}
}
class Drawing extends Art{
	Drawing(){
		System.out.println("Drawing constructor");
	}
	public static void main(String[] args){
		Drawing x=new Drawing();
	}
}