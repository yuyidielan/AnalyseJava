class AnIntegerNamedX{
	int x;
	int getX(){
	return x;
	}
	void setX(int newX){
	x=newX;
	}

}
class Compare_test{
	public static void main(String[] args){
	AnIntegerNamedX myX=new AnIntegerNamedX();
	AnIntegerNamedX anotherX=new AnIntegerNamedX();
	myX.setX(1);
	anotherX.x=2;
	System.out.println("myX.x="+myX.getX());
	System.out.println("anotherX.x="+anotherX.getX());
	}
}