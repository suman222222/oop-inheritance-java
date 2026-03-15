package inheritance;



public class Vehicle
{
    protected int vehicleId;
    protected String brand;
    protected double basePrice;

    // Constructor
    public Vehicle(int vehicleId, String brand, double basePrice) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.basePrice = basePrice;
    }

    // Display vehicle information
    public void displayVehicleInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Base Price: " + basePrice);
    }

    // Calculate tax (10% of base price)
    public double calculateTax() {
        return basePrice * 0.10;
    }
}