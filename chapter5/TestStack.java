//ջ����������
import java.util.Stack;
public class TestStack{
	public static void main(String[] args){
		Stack<String> stack=new Stack<String>();
        String str="Tom and Jerry";
        System.out.prinln("�ַ�����ֵ-->"+str);
        System.out.print("��ջȻ���ջ�Ľ��:--->");
        for(String s:str.split(" ")){
        	stack.push(s);
        }
        while(!stack.empty()){
        	System.out.print(stack.pop()+" ");
        }
	}
}