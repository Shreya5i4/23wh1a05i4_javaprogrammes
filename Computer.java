package javaproject23wh1a5i4;
class Comp{

	String brand = "hp";

	String speed ="4567mbps";

	

	class Processor{

		public void display() {



		System.out.println(brand);

		System.out.println(speed);



		}

		

		

 }

}

public class Computer{

	public static void main(String[] args) {

		Comp obc = new Comp();

		Comp.Processor obp = obc.new Processor();

		obp.display();

		

		

	}

}

