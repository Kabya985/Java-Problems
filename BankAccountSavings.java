class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw " + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest applied: " + interest + ". New balance: " + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        // Create a regular bank account
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);
        account.checkBalance();

        account.deposit(4000.0);
        account.withdraw(3000.0);

        // Create a savings account with 5% interest
        SavingsAccount savings = new SavingsAccount("987654321", "Jane Smith", 2000.0, 5.0);
        savings.checkBalance();
        savings.deposit(100.0);
        savings.applyInterest();

        System.out.println("Savings account balance: " + savings.balance);
    }
}