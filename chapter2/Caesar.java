class Caesar{
	String s;
	int key;
    void setString(String str){
    	s=str;
    }
    void setKey(int k){
    	key=k;
    }
    String process(){
    	String es="";
    	for(int i=0;i<s.length();i++){
    		char c=s.charAt(i);
    		if(c>='a'&&c<='z'){
    			c+=key%26;
    			if(c<'a')
    				c+=26;
    			if(c>'z')
    				c-=26;

    		}else if(c>='A'&&c<='Z'){
    			c+=key%26;
    			if(c<'A')
    				c+=26;
    			if(c>'Z')
    				c-=26;
    		}
    		es+=c;
    	}
    	return es;
    }
    public static void main(String args[]){
    	String s="hello";
    	Caesar c=new Caesar();
    	c.setString(s);
        c.setKey(2);
        String str=c.process();
        System.out.println("the encryption of the string:"+str);
        Caesar c1=new Caesar();
        c1.setString(str);
        c1.setKey(-2);
        str=c1.process();
        System.out.println("the  deciphering of the string:"+str);
    }
}