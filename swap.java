package javaprogrammes_5i4;

public class swap {

	public static void swap() {
		// TODO Auto-generated constructor stub
		int x=5;
		int y=10;
		int temp;
		
		System.out.println("before swapping:");
		System.out.println("x=" +x);
		System.out.println("y=" +y);
		
		temp=x;
		x=y;
		y=temp;
		System.out.println("after swapping:" );
		System.out.println("x=" +x);
		System.out.println("y=" +y);
		
		
	}
	public static void main(String[] args) {
		swap();
		
	}
	

}
