package java5i4;
import java.util.Scanner;
public class Calsi {
	

	public static void main(String[] args) {
		
				Scanner var = new Scanner(System.in);
					int n=var.nextInt();
					int x=var.nextInt();
					int y=var.nextInt();

					
					switch(n)
					{
					case 1:
						System.out.println("addition");
						System.out.println(x+y);
						break;
					case 2:
						System.out.println("substraction");
						System.out.println(x-y);
						break;
					case 3:
						System.out.println("Multiplication");
						System.out.println(x*y);
						break;
					case 4:
						System.out.println("Division");
						System.out.println(x/y);
						break;
					case 5:
						System.out.println("modulo");
						System.out.println(x%y);
						break;
					default:
						System.out.println("enter valid number");
						
					
				
					}
	}
	

	}


