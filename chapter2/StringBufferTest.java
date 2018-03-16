class StringBufferTest{
	public static void main(String[] args){
	String s1="abcdef";
	String s2="abc"+"def";
	System.out.println(s1==s2);
	String str=s2+"hijk";
    String str1="abcdefhijk";
	System.out.println(str==str1);
	StringBuffer s3=new StringBuffer(s2);
    StringBuffer s4=s3.append("hijk");
    System.out.println(s3==s4);

	}
}