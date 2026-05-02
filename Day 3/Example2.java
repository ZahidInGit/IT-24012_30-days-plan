
class BankAccount {

    public String bankName = "Global Bank";
    private double balance;
    protected String accountType;
    String accountHolder;

    public BankAccount(String holder, double initialDeposit, String type) {
        this.accountHolder = holder;
        this.balance = initialDeposit;
        this.accountType = type;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
    }

    
}
public class Example2 {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Alex", 500.0, "Savings");

        System.out.println("Welcome to " + myAccount.bankName);

        myAccount.deposit(150.0);
        myAccount.checkBalance();
    }
}
