//�ӿڻص�����
interface  PCI{
	String show();
	void operate();
}
class NetWorkCarrd implements PCI{
	public String show(){
        return "����";
	}
	public void operate(){
		System.out.println("���ڴ�����������");
	}
}
class SoundCard implements PCI{
	public String show(){
		return "����";
	}
	public void operate(){
		System.out.println("���ڲ�������");
	}

}
class MontherBoard{
	PCI pci;
	MontherBoard(){
		System.out.println("��������");
	}
	void plugin(PCI in){
		pci=in;
		System.out.println(in.show()+"���뵽PCI�����");
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