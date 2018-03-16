class InsertTest{
	public static void main(String[] args){
	int i=0,s=0,x=63;
	int a[]={162,127,105,87,68,54,28,18,6,3};
	for(i=0;i<10;i++)
	if(x>a[i]){
	  for(s=8;s>=i;s--)
	     a[s+1]=a[s];
	      break;
	}
	a[i]=x;
	for(i=0;i<a.length;i++)
	   System.out.print(a[i]+"\t");
	}
}