package javaproject23wh1a5i4;

public class Dog {
	String name;
	String Color;

	public Dog(String s,String c)
	{
		name=s;
		Color=c;
	}
	public static void main(String[] args) {
		Dog var= new Dog("puppy","white");
		System.out.println(var.name);
		System.out.println(var.Color);
	}
	

}
