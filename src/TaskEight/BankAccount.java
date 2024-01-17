package TaskEight;

public class BankAccount {
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    private String userName;
    private String userEmail;
    private String accountNumber;

    public BankAccount(String userName, String userEmail, String accountNumber){
        this.userName = userName;
        this.userEmail = userEmail;
        this.accountNumber = accountNumber;
    }
}
