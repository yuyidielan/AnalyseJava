class TestParam{
    public static void sort(int a,int b){
    int tmp;
    if(a>b){
    tmp=a;
    a=b;
    b=tmp;
    }
    System.out.println("a="+a+",b="+b);
    }
	public static void main(String[] args){
          int x=5,y=2;
          System.out.println("x="+x+",y="+y);
          sort(x,y);
          System.out.println("x="+x+",y="+y);
	}
}