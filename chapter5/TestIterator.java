//创建一个ArrayList对象，向集合对象添加若干元素
//然后使用迭代器遍历该集合并输出这些元素
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class TestIterator{
       public static void main(String[] args){
       	List<String>all=new ArrayList<String>();
       	all.add("hello");
       	all.add("world");
       	all.add("kitty");
       	Iterator<String>iter=all.iterator();
       	while(iter.hasNext()){
       		String str=iter.next();
       		System.out.print(str+" ");
       		if("world".equals(str)){
       			iter.remove();
       		}
       	}
       	System.out.println("\n删除后的内容:"+all);
       }
}