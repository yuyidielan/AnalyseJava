//定义Info接口，使接口中声明的print()方法可以输出任意对象的提示信息
 interface Info<T>{
     void print(T ob);
 }
 class Animal{
 	public String toString(){
 		return "I am animal";
 	}
 }
 class Cat extends Animal{
 	private String name;
 	public Cat(String name){
 		this.name=name;
 	}
 	public String toString(){
 		return "My name is "+name;
 	}

 }
 class Mouse extends Animal{
 	private String name;
 	public Mouse (String name){
 		this.name=name;
 	}
 	public String toString(){
 		return "My name is "+name;
 	} 

 }
 public class AnimalInfo<T extends Animal> implements Info<T>{
 	public void print(T ob){
 		System.out.println(ob.toString());
 	}
 	public static void main(String[] args){
 		AnimalInfo<Animal>ag=new AnimalInfo();
 		for(int i=0;i<5;i++){
 			if(i%2==0)
 				ag.print(new Cat("Tom"));
 			else
 				ag.print(new Mouse("Micky"));
 		}
 	}
 }