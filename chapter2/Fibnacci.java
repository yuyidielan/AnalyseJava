class Fibnacci{
	public static void main(String[] args){
		int f[]=new int[20];
		f[0]=f[1]=1;
		for(int i=2;i<f.length;i++){
              f[i]=f[i-2]+f[i-1];
		}
		for(int i=0;i<f.length;i++)
			System.out.println(" "+f[i]);
	}
}