class LeapYear{
	public static void main(String[] args){
		int year=1949;
		do{
			if((year%4==0&&year%100!=0)||(year%400==0))
			 System.out.println(year +" is the Leap");
		else
			System.out.println(year +" isn't the Leap");
		year++;
		}while(year<=2006);
		
	}
}