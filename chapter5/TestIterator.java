//����һ��ArrayList�����򼯺϶����������Ԫ��
//Ȼ��ʹ�õ����������ü��ϲ������ЩԪ��
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
       	System.out.println("\nɾ���������:"+all);
       }
}