//������������������
class Vehicle{
	void print(){
		System.out.println("Vehicle");
	}
	public void drive(){}
}
class Car extends Vehicle{
	String brand="BMW";
	public void drive(){
		System.out.println("Car is friving");
	}
	public String getBrand(){   
		return brand;
	}
}
class TestVehicle{
	public static void main(String[] args){
		Vehicle v=new Car();
		v.print();
		v.drive();
	}
}