//���췽���ĵ���ʵ��
class Art{
	Art(){
		System.out.println("Art constructor");
	}
}
class Drawing extends Art{
	Drawing(){
		System.out.println("Drawing constructor");
	}
	public static void main(String[] args){
		Drawing x=new Drawing();
	}
}