//定义Pair类，声明两个变量：first,second,变量类型可以为任意类型
//此类为成员变量提供getter,setter方法，定义相应的构造方法
public class Pair<K,V>{
	private K first;
	private V second;
	public Pair(){
		first=null;
		second=null;
	}
	public Pair(K first,V second){
		this.first=first;
		this.second=second;
	}
	public K getFirst(){
		return first;
	}
	public void setFirst(K first){
		this.first=first;
	}
	public V getSecond(){
		return second;
	}
	public void setSecond(V second){
		this.second=second;
	}
}