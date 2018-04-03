//方法覆盖：在子类中重新定义父类的方法
class Point{
	void print(){
	    System.out.println("This is the superclass!");
	}
}
class Point3d extends Point{
	void print(){
		System.out.println("This is the subclass!!");
	}
	public static void main(String[] args){
           Point suprep=new Point();
           suprep.print();
           Point3d subp=new Point3d();
           subp.print();
	}
}