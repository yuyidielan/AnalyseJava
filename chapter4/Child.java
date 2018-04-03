//成员变量隐藏
class Father{
	double y=10.5;
	void printF(){
		y=y-10;
		System.out.println(y);
	}
}
class Child extends Father{
	double y=0.0;
	void print(){
		y=y+100;
		System.out.println("super.y="+super.y+",y="+y);
	}
	public static void main(String[] args){
		Child b=new Child();
		b.y=-100;
		b.printF();
		b.print();
	}
}