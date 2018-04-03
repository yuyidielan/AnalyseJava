/*类继承中static方法*/
class A{
	static int i=5;
	public static void test(){
		System.out.println(i);
	}
}
class B extends A{
	public static void main(String[] args){
		B b=new B();
		B.test();
		System.out.println(b.i);
		B.i=36;
		System.out.println(A.i);
		System.out.println(b.i);
	}
}
/*对于可以直接访问的静态成员变量、父类、子类、父类对象及子类对象均共享同一个变量*/