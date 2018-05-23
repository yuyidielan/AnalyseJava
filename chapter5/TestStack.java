//栈的输入和输出
import java.util.Stack;
public class TestStack{
	public static void main(String[] args){
		Stack<String> stack=new Stack<String>();
        String str="Tom and Jerry";
        System.out.prinln("字符串初值-->"+str);
        System.out.print("入栈然后出栈的结果:--->");
        for(String s:str.split(" ")){
        	stack.push(s);
        }
        while(!stack.empty()){
        	System.out.print(stack.pop()+" ");
        }
	}
}