//定义Fiboacci类，该类实现Generator接口，
//接口声明的next()的功能是返回斐波那契数列的下一项
interface Generator<T>{
	T next();
}
public class Fibonacci implements Generator<Integer>{
	private int count=0;
	public Integer next(){
		return fib(count++);
	}
	private int fib(int n){
		if(n<2)
			return 1;
	    else
	    	return fib(n-2)+fib(n-1);
	}
	public static void main(String[] args)
	{
		Fibonacci gen=new Fibonacci();
		for(int i=0;i<18;i++){
			System.out.print(gen.next()+" ");
		}
	}
}