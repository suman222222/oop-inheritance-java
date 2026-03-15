package inheritance;



public class Vehicleapp
{
    public static void main(String[] args) {

        Car car = new Car(1, "Honda", 3000000, 4);
    Bike bike = new Bike(2, "Yamaha", 400000, 150);

        System.out.println("=== Car Information ===");
        car.displayCarDetails();

        System.out.println("\n=== Bike Information ===");
        bike.displayBikeDetails();
    }
}