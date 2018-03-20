class TestParamByRef{
	public static void sort(int a[]){
	int tmp;
	if(a[0]>a[1]){
	tmp=a[0];
	a[0]=a[1];
	a[1]=tmp;
	}
	System.out.println("a[0]="+a[0]+",a[1]="+a[1]);
	}
	public static void main(String[] args){
	int x[]=new int[2];
	x[0]=5;
	x[1]=2;
	System.out.println("x[0]="+x[0]+",x[1]="+x[1]);
	sort(x);
	System.out.println("x[0]="+x[0]+",x[1]="+x[1]); 
	}
}