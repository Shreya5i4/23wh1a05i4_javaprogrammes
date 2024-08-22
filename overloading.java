package java5i4;

public class overloading {
	public int sum(int x) {
		return x;
	}
	public int sum(int x,int y,int z) {
		return (x+y+z);
	}
	public double sum(double x,double y)
	{
		return (x+y);
		
	}
	public float sum(int x,float y) {
		return (x+y);
	}
	public static void main(String[] args) {
		overloading s= new overloading();
		System.out.println(s.sum(2));
		System.out.println(s.sum(5,6,7));
		System.out.println(s.sum(5.6,7.9));
		System.out.println(s.sum(5,7.9));
	}

}
