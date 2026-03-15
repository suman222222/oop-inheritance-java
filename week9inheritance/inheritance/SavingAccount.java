package inheritance;



public class SavingAccount extends BankAccount
    
{
    private double interestRate;

    public SavingAccount(int accountNumber, String accountHolderName,
                         double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    // Calculate interest
    public double calculateInterest() {
        return super.getBalance() * interestRate / 100;
    }
}