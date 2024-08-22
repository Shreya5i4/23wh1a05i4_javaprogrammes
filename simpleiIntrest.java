package java5i4;
import java.util.Scanner;
public class simpleiIntrest {
	public static void main(String args []) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter amount:");
	 int amount=sc.nextInt();
	 System.out.println("enter time period:");
	 int no_of_days=sc.nextInt();
	 
	 System.out.println("enter r:");
	 float r=sc.nextFloat();
	 System.out.println((amount*no_of_days*r)/100);
	 }

}
