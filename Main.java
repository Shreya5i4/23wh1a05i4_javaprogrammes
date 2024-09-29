/*(a)Write a Java program to create a class called Vehicle with a method called drive(). Create
a subclass called Car that overrides the drive() method to print "Repairing a car".
*/
// Base class Vehicle
class Vehicle {
    
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    
    public void drive() {
        System.out.println("Repairing a car");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Vehicle myCar = new Car();
        
        myCar.drive(); 
    }
}

