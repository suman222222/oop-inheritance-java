package inheritance;



public class EmployeeApp
{
    public static void main(String[] args) {

        PermanentEmployee pe =
                new PermanentEmployee(101, "Suman", 50000, 8000, 6000);

        ContractEmployee ce =
                new ContractEmployee(202, "Sadip", 40000, 12);

        System.out.println("=== Permanent Employee ===");
        pe.displayPermanentEmployee();

        System.out.println("\n=== Contract Employee ===");
        ce.displayContractEmployee();
    }
}