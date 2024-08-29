package javaproject23wh1a5i4;
import java.util.Scanner;
class shape {
	void getArea(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of square:");
		int l=sc.nextInt();
	
		System.out.println(l*l);
		
		
		
	}
class rectangle extends shape{
		void getArea(){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter length and breadth of rectangle:");
			int l=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(l*b);
		}
		
}
public class shape_inheritance {
	public static void main(String[] args) {
		shape obj=new shape();
		obj.getArea();
	}
}

}
