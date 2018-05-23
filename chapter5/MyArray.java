//泛型方法实例
class MyArray{
	public static<T> void print(T[] arrays){
		for(int i=0;i<arrays.length;i++){
			System.out.println(arrays[i]+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args){
		Integer[] a={1,2,3,4,5};
		MyArray.<Integer>print(a);
		Double[] b={2.3,4.6,7.8,9.4};
		MyArray.<Double>print(b);
	}
}