class Circle{
	double radius;
	double area(){
		return Math.PI*radius*radius;
	}
	double circumference(){
		return 2*Math.PI*radius;
	}
	public static void main(String[] args){
		Circle c1=new Circle();
		c1.radius=5.3;
		System.out.println("area="+c1.area()+" circumference="+c1.circumference());
	}
}