package chapter7;

public class VehicleRunner {
    public static void main(String[] args) {
        //create an object of vehicle class
        Vehicle objCar = new Vehicle();
//        objCar.color = "Red";
//        objCar.brand = "BMW";
//        objCar.capacity = 4;
        objCar.model = "330i";
//        objCar.numOfDoors = 5;
//        objCar.numOfWheels = 4;

        Vehicle objTruck = new Vehicle();
        objTruck.color = "White";
        objTruck.brand = "ISUZU";
        objTruck.capacity = 3;
        objTruck.model = "N Series";
        objTruck.numOfDoors = 3;
        objTruck.numOfWheels = 6;

        Vehicle objBicycle = new Vehicle();
        objBicycle.color = "Blue";
        objBicycle.brand = "BMX";
        objBicycle.capacity = 1;
        objBicycle.model = "XXX";
        objBicycle.numOfDoors = 0;
        objBicycle.numOfWheels = 2;

        System.out.println("===================CAR========================");
        objCar.displayDetails();

        System.out.println("\n===================TRUCK========================");
        objTruck.displayDetails();

        System.out.println("\n===================BICYCLE========================");
        objBicycle.displayDetails();


    }
}
