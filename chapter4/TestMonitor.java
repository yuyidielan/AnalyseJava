//显示器类层次的继承实例
class Monitor{
	public void displayGraphics(){

	}
}
class LCDMonitor extends Monitor{
	public void displayGraphics(){
        System.out.println("液晶显示器显示图像");
	}
} 
class CRTMonitor extends Monitor{
	public void displayGraphics()
	{
		System.out.println("阴极射线管显示器显示图像");
	}
}
class PlasmaMonitor extends Monitor{
	public void displayGraphics()
	{
		System.out.println("等离子显示器显示图像");
	}
}
class TestMonitor{
	public static void powerOn(Monitor monitor){
		monitor.displayGraphics();
	}
	public static void main(String[] args){
		powerOn(new LCDMonitor());
		powerOn(new CRTMonitor());
		powerOn(new PlasmaMonitor());
	}
}