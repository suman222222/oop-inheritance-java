package inheritance;


   public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int vehicleId, String brand, double basePrice, int numberOfDoors) {
        super(vehicleId, brand, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    public double calculateFinalPrice() {
        return basePrice + calculateTax();
    }

    public void displayCarDetails() {
        super.displayVehicleInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}