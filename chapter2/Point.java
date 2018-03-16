class Point{
	double x,y;
	double distanceToOrigin(){
	return Math.sqrt(x*x+y*y);
	}
	double distanceTo(Point p){
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));

	}
	public static void main(String[] args){
		Point p=new Point();
		p.x=3;
		p.y=5;
		Point p1=new Point();
		p1.x=2;
		p1.y=4;
		System.out.println("the distance between p and (0,0):"+p.distanceToOrigin());
		System.out.println("the distance between p and p1:"+p.distanceTo(p1));
	}
}