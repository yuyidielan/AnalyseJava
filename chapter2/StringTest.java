public class StringTest{
	public static void main(String[] args){
	String str="This is a Test!";
	str=str.replace('s','a');
	System.out.println("str="+str);
	String str1=str.toLowerCase();
	String str2=str.toUpperCase();
	System.out.println("str1="+str1);
	System.out.println("str2="+str2);
	str1=str.trim();
	System.out.println("str1="+str1);
	}
} 