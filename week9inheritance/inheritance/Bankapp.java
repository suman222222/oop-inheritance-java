package inheritance;



public class Bankapp
{
    public static void main(String[] args) {

        SavingAccount sa =
                new SavingAccount(1001, "Suman", 50000, 5);

        CurrentAccount ca =
                new CurrentAccount(2001, "Kapri", 30000, 10000);

        System.out.println(" Saving Account ");
        sa.deposit(5000);
        System.out.println("Current Balance: " + sa.getBalance());
        System.out.println("Interest: " + sa.calculateInterest());

        System.out.println("\n Current Account ");
        ca.deposit(2000);
        ca.withdraw(35000);
        System.out.println("Current Balance: " + ca.getBalance());
    }
}