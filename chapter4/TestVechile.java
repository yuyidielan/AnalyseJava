//¶àÌ¬ÐÔÊµÀý
abstract class Vechile{
	abstract public void drive();
}
class Car extends Vechile{
	public void drive(){
		System.out.println("Car is driving!!!");
	}

}
class Ship extends Vechile{
	public void drive(){
		System.out.println("Ship is driving!!!");
	}
}
public class TestVechile{
	public static void drive(Vechile v){
		v.drive();
	}
	public static void main(String[] args){
		Vechile[] v={new Car(),new Ship()};
		for(int i=0;i<v.length;i++){
			drive(v[i]);
		}
	}
}