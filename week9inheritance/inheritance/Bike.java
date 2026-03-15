package inheritance;

public class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(int vehicleId, String brand, double basePrice, int engineCapacity) {
        super(vehicleId, brand, basePrice);
        this.engineCapacity = engineCapacity;
    }

    // Final Price = basePrice + tax
    public double calculateFinalPrice() {
        return basePrice + calculateTax();
    }

    public void displayBikeDetails() {
        super.displayVehicleInfo();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}