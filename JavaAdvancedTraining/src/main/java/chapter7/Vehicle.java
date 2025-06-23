package chapter7;
/*Vehicle class uses the default constructor*/
public class Vehicle {
    //Instance variables
    String color;
    int numOfWheels;
    int capacity;
    int numOfDoors;
    String brand;
    String model;

    //default constructor
    public Vehicle(){
        this.color = "Red";
        this.numOfWheels = 4;
        this.numOfDoors = 4;
        this.brand = "BMW";
        this.model = "None";
        this.capacity = 2;
    }

    void displayDetails(){
        System.out.println(this.brand + " (" + this.model + ")");
        System.out.println("Color: " + this.color);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Doors: " + this.numOfDoors);
        System.out.println("Wheels: " + this.numOfWheels);
    }

}
