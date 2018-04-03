//接口的继承
interface Shape{
	double pi=3.1415;
	void setColor(String str);
}
interface Shape2D extends Shape{
	double area();
}
class Circle implements Shape2D{
	double radius;
	String color;
	public Circle(double r){
		radius=r;
	}
	public double area(){
		return (pi*radius*radius);
	}
	public void setColor(String str){
		color=str;
		System.out.println("color="+color);
	}
}
class TestExtendsInterface{
	public static void main(String[] args){
		Circle cir;
		cir=new Circle(2.0);
		cir.setColor("blue");
		System.out.println("Area="+cir.area());
	}
}