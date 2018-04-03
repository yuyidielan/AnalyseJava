//接口回调过程
interface  PCI{
	String show();
	void operate();
}
class NetWorkCarrd implements PCI{
	public String show(){
        return "网卡";
	}
	public void operate(){
		System.out.println("我在传输网络数据");
	}
}
class SoundCard implements PCI{
	public String show(){
		return "声卡";
	}
	public void operate(){
		System.out.println("我在播放声音");
	}

}
class MontherBoard{
	PCI pci;
	MontherBoard(){
		System.out.println("我是主板");
	}
	void plugin(PCI in){
		pci=in;
		System.out.println(in.show()+"插入到PCI插槽中");
	}
	void operate(){
		pci.operate();
	}
}
class PC{
	public static void main(String[] args){
		MontherBoard m=new MontherBoard();
		m.plugin(new NetWorkCarrd());
		m.operate();
		m.plugin(new SoundCard());
		m.operate();
		
	}
}