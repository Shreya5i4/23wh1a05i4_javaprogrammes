package java5i4;
import java.util.Scanner;
public class Scannerclass{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter your name : ");
		String s=input.nextLine();
		System.out.println("my name is :" +s);
		System.out.println("enter a number:");
		int a=input.nextInt();
		System.out.println("enter another number:");
		int b=input.nextInt();
		
		
		System.out.println("sum of a and b is :" +(a+b));
		
	}

}
