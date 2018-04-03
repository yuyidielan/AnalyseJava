//构造方法调用顺序
class X{
	protected int xMask=0x00ff;
	protected int fullMask;
	public X(){
		System.out.println(fullMask);
		fullMask=xMask;
	}
}
class Y extends X{
	protected int yMask=0xff00;
    public Y(){
    	fullMask|=yMask;
    }
    public static void main(String[] args){
    	Y y=new Y();
    	System.out.println(y.fullMask);
    }
}