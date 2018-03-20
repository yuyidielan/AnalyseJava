class Student{
	private String name;
	private int score;
	public int getScore(){
	return score;
	}
	public void setScore(int x){
	if(x>=0&&x<=100)
	   score=x;
	else
	System.out.println("the score is not between 0 and 100!!");
	}
}
class TestStudent{
	public static void main(String[] args){
	Student stu=new Student();
	
	stu.setScore(50000);
	}
}