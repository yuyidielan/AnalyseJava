class TwoDimensionArray{
	public static void main(String[] args){
	int[][] matrix={{1,2,3,4,5},{2,3,4,5},{3,4,5},
	{4,5},{5}};
	System.out.println("the length of matrix:"+matrix.length);
    for(int i=0;i<5;i++){
        System.out.println("matrix["+i+"] length:"+matrix[i].length);
    }
	}
}