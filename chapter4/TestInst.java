//instanceof运算符在接口的作用
interface A1{}
class B1{}
class C1 implements A1{}
class TestInst{
	public static void main(String[] args){
		B1 b=new B1();
		C1 c=new C1();
		System.out.println(b instanceof A1);
		System.out.println(c instanceof A1);
	}
}