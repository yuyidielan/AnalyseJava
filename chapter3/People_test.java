class People{
	static String nation;
	String name;
	public String toString(){
	return "name="+name+" nation="+nation;
	}
}
class People_test{
	public static void main(String[] args){
	People.nation="China";
	People p1=new People();
	p1.name="John";
	System.out.println(p1);
	People p2=new People();
	p2.name="Jack";
	System.out.println(p2);
	p1.name="Tom";
	p1.nation="The public nation of people";
	System.out.println("after alter....");
	System.out.println(p2);
	System.out.println("People.nation="+People.nation);
	}
}