class TestSwitch{
	public static void main(String[] args){
		String name="Joke",title="";
		String gender="man";
        switch(gender){
        	case "man":
        	  title="Mr."+name;
        	  break;
        	 case "woman":
        	    title="Ms."+name;
        	    break;
        	 default:
        	   title=name;
        }
        System.out.println(title);
	}
}