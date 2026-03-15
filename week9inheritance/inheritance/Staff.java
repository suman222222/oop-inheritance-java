package inheritance;



public class Staff extends Person
{
    private int workingHours;
    private double ratePerHour;

    public Staff(int id, String name, int workingHours, double ratePerHour) {
        super(id, name, 0); // basicSalary not required for staff
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    public double calculateSalary() {
        return workingHours * ratePerHour;
    }
}
