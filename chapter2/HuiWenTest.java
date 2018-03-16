class HuiWenTest{
	String str;
	void setStr(String str1){
	str=str1;
	}
	boolean isHuiWen(){
	int i=0,j=str.length()-1;
	char c=' ';
	while(i<j){
		if(str.charAt(i)==str.charAt(j)){
			i++;
			j--;
		}else
		  return false;
	}
	return true;
	}
	public static void main(String[] args){
		HuiWenTest s=new HuiWenTest();
		s.setStr("ABCCBA");
		if(s.isHuiWen()==true)
			  System.out.println(s.str+" is plalindrome!");
		else
			System.out.println(s.str+" isn't plalindrome!");
	}
}