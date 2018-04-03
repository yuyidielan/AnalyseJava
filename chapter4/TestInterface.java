//接口实例
interface StartStop{
	void start();
	void stop();
}
class Conference implements StartStop{
	public void start(){
		System.out.println("Start the conference!!!");
	}
	public void stop(){
		System.out.println("Stop the conference!!!");
	}

} 
class Car implements StartStop{
	public void start(){
		System.out.println("Insert key in ignition and trun");
	}
	public void stop(){
		System.out.println("Trun key in ignition and remove");
	}
}
class TestInterface{
	public static void main(String[] args){
		StartStop ss=new Car();
        ss.start();
        ss.stop();
        ss=new Conference();
        ss.start();
        ss.stop();
	}
}