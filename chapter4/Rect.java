//抽象类与抽象方法
abstract class Shape{
	abstract double computeArea();
}
class Rect extends Shape{
	double width;
	double height;
	public Rect(double w,double h){
		width=w;
        height=h;
	}
	double computeArea(){
		return width*height;
	}
	public static void main(String[] args){
		Shape s=new Rect(4,5);
        System.out.println("Area="+s.computeArea());
	}

}