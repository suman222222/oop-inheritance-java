package inheritance;



class Person {
    protected int id;
    protected String name;
    protected double basicSalary;
    static String collegeName = "Islington College";

    // Constructor
    public Person(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Annual salary calculation
    public double calculateAnnualSalary() {
        return basicSalary * 12;
    }
}
