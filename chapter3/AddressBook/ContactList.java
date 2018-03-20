public class ContactList{
	private Contact contactList[]=new Contact[100];
	private int total;
	public ContactList(){
		contactList[0]=new Contact("Joke","chongqing","02312345678");
		contactList[1]=new Contact("John","beihing","1234456789099");
		contactList[2]=new Contact("Tom","shanghai","0211234556788");
		total=3;
	}
	public int getTotal(){
		return total;
	}
    public  void addContact(Contact aItem){
    	contactList[total]=new Contact(aItem);
    	total++;
    }
    public void removeContact(String aName){
    	int k=-1;
    	for(int i=0;i<total;i++){
    		if(contactList[i].getName().compareTo(aName)==0)
    			k=i;
    	}
    	if(k!=-1){
    		for(int i=k;i<total-1;i++)
    			contactList[i]=contactList[i+1];
    		total--;
    		contactList[total]=null;
    	}
    	else{
    		System.out.println("未查找到匹配的条目");
    	}
    }
    public Contact findContact(String aName){
    	int i,k;
    	for(i=0;i<total;i++){
    		if(contactList[i].getName().compareTo(aName)==0){
    			k=i;
    			break;
    		}
    	}
    	if(i<total)
    		return new Contact(contactList[i]);
    	else
    		return new Contact();
    }
    public String toString(){
    	StringBuffer str=new StringBuffer("");
    	for(int i=0;i<total;i++){
    		str=str.append(contactList[i].toString()).append("\n");
    	}
    	return str.toString();
    }
}