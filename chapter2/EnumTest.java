enum Season{
	spring,summer,autumn,winter
}
public class EnumTest{
	public static void main(String[] args){
		for (Season s:Season.values()){
			System.out.println(s+"ordinal:"+s.ordinal());
			switch(s){
				case spring:
				  System.out.println("spring");
				  break;
				 case summer:
				    System.out.println("summer");
				    break;
				case autumn:
                     System.out.println("autumn");
                     break;
                 case winter:
                     System.out.println("winter");
                     break;
			}
		}
	}
}