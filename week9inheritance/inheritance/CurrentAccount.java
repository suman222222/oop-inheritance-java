package inheritance;



 class CurrentAccount extends BankAccount
{
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolderName,
                          double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Withdraw with overdraft support
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Withdrawal denied. Overdraft limit exceeded.");
            return false;
        }
    }
}