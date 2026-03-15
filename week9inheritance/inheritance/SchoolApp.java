package inheritance;



public class SchoolApp
{
    public static void main(String[] args) {

        Teacher teacher =
                new Teacher(101, "Suman", 40000,
                        "Computer Science", 50000);

        Staff staff =
                new Staff(201, "Ramesh", 160, 500);

        System.out.println("Teacher Annual Salary: " +
                teacher.calculateAnnualSalary());

        System.out.println("Staff Salary: " +
                staff.calculateSalary());

        System.out.println("College Name: " +
                Person.collegeName);
    }
}