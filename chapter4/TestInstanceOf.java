//instanceof关键字的使用
class Shape{
	static public void draw(Shape s){
		if(s instanceof Line){
			Line line=(Line)s;
			line.drawLine();
		}
		if(s instanceof Circle){
			Circle c=(Circle)s;
			c.drawCircle();
		}
	}
}
class Circle extends Shape{
	public void drawCircle(){
		System.out.println("Draw Circle");
	}
}
class Line extends Shape{
	public void drawLine(){
		System.out.println("Draw Line");
	}
}
class TestInstanceof{
	public static void main(String[] args){
		Line line=new Line();
		Shape.draw(line);
		
	}
}