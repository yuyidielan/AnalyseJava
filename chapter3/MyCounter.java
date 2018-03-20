public class MyCounter{
	int count=0;
	MyCounter inc(int i){
	  count=count+1;
	  this.print();
	  return this;
	}
	MyCounter inc(){
		count++;
		return this;
	}
	void print(){
         System.out.println("ÊýÁ¿ÊÇ:"+count);
	}
	public static void main(String[] args){
		MyCounter  c=new MyCounter();
		c.inc().inc().inc().inc().inc(2);
	}
}