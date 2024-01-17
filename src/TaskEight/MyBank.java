package TaskEight;

public class MyBank extends BankAccount implements IATM {
    private double balance;

    public MyBank(String userName, String userEmail, String accountNumber, double balance){
        super(userName,userEmail,accountNumber);
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        }
        else {
            balance += amount;
        }

    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Insufficient funds.");
        }
        else {
            balance -= amount;
        }

    }

    @Override
    public void checkBalance() {
        System.out.println("\n==================================================");
        System.out.println("Username: "+getUserName());
        System.out.println("Email: "+getUserEmail());
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Balance: "+balance);
        System.out.println("==================================================");
    }
}
