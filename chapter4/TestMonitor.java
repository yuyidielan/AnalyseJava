//��ʾ�����εļ̳�ʵ��
class Monitor{
	public void displayGraphics(){

	}
}
class LCDMonitor extends Monitor{
	public void displayGraphics(){
        System.out.println("Һ����ʾ����ʾͼ��");
	}
} 
class CRTMonitor extends Monitor{
	public void displayGraphics()
	{
		System.out.println("�������߹���ʾ����ʾͼ��");
	}
}
class PlasmaMonitor extends Monitor{
	public void displayGraphics()
	{
		System.out.println("��������ʾ����ʾͼ��");
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