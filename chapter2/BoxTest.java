class Box{
	double width,height,depth;
	void setWidth(double w){
		width=w;
	}
	void setHeight(double h){
		height=h;
	}
	void setDepth(double d){
		depth=d;
	}
	public String toString(){
		return "Dimensions are "+width+" by "+depth+" by "+height+".";
	}
}
class BoxTest{
	public static void main(String[] args){
		Box b=new Box();
		b.setWidth(10);
		b.setHeight(12);
		b.setDepth(14);
		String s="Box b:"+b;
		System.out.println(b);
		System.out.println(s);

	}
}