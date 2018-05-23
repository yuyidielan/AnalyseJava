//使用Pair类，生成若干对象
public class TestPair{
	public static void main(String[] args){
		Pair<Integer,String>pair1=new Pair(1,"Spring");
		Pair<String,String> pair2=new Pair("hello","World");
		System.out.println(""+pair1.getFirst()+"-"+pair1.getSecond());
		System.out.println(""+pair2.getFirst()+"-"+pair2.getSecond());
	}
}