package TaskEight;

public class OtherBank extends BankAccount implements IATM{
    private double balance;
    private double fee = 2;
    private String originBank;
    public OtherBank(String userName, String userEmail, String accountNumber, double balance, String originBank){
        super(userName,userEmail,accountNumber);
        this.balance = balance;
        this.originBank = originBank;
    }
    @Override
    public void deposit(double amount){
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        }
        else {
            balance += amount-fee;
            System.out.println("Successfully deposit amount: "+amount);
            System.out.println("Fee for using Cross-Banking: $"+fee);
            System.out.println("Total balance: "+balance);
        }
    }

    @Override
    public void withdraw(double amount){
        if (amount <= 0 || (amount+fee) > balance) {
            System.out.println("Insufficient funds.");
        }
        else {
            balance -= amount+fee;
            System.out.println("Successfully Deposit Amount: "+(amount));
            System.out.println("Fee for using Cross Banking: $"+fee);
            System.out.println("Total balance: "+balance);
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("\n==================================================");
        System.out.println("Username: "+getUserName());
        System.out.println("Email: "+getUserEmail());
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Balance: "+balance);
        System.out.println("Bank: "+originBank);
        System.out.println("==================================================");
    }
}
