//�������������Ƚ��ڶ�������ϲ�����һ������
//Ȼ��ӵڶ�������ÿ��һ��Ԫ��ɾ��һ��Ԫ��
//������removeAll()����
import java.util.*;
public class TestLinkedList{
	public static void main(String[] args){
		List<String>a=new LinkedList<String>();
		a.add("����");
		a.add("����");
		a.add("����");
		List<String>b=new LinkedList<String>();
		b.add("������");
		b.add("���ķ�");
		b.add("�����");
		b.add("������");
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
