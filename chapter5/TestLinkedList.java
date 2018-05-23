//创建两个链表，先将第二个链表合并到第一个链表
//然后从第二链表中每隔一个元素删除一个元素
//最后测试removeAll()方法
import java.util.*;
public class TestLinkedList{
	public static void main(String[] args){
		List<String>a=new LinkedList<String>();
		a.add("张三");
		a.add("李四");
		a.add("王五");
		List<String>b=new LinkedList<String>();
		b.add("张三丰");
		b.add("李四丰");
		b.add("王五丰");
		b.add("赵六丰");
		ListIterator<String> aIter=a.listIterator();
		Iterator<String> bIter=b.iterator();
		while(bIter.hasNext()){
			if(aIter.hasNext())
				aIter.next();
			aIter.add(bIter.next());
		}
			
	System.out.println(a);
	bIter=b.iterator();
	while(bIter.hasNext()){
		bIter.next();
		if(bIter.hasNext()){
			bIter.next();
			bIter.remove();
		}
		System.out.println(b);
		a.removeAll(b);
		System.out.println(a);
	}
}
	
}
