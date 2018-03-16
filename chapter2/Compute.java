class Compute{
	public static void main(String[] args){
	int x=0,y=0,z=0;
	for(x=0;x<=20;x++)
	  for(y=0;y<=33;y++){
	  z=100-x-y;
	  if(5*x+3*y+z/3==100){
	  System.out.println("you can buy:cock,"+x+",hen:"+y+",poult,"+z);
	  }
	  }
	}
}