package TaskFifth;

import java.util.Scanner;

public class BankAccountManagementSystem {
    public BankAccountManagementSystem(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount(accountNumber, balance, customerName, email, phoneNumber);
        account.displayAccountDetails();

        int choice;
        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit Funds");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. View Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    account.depositFunds(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdrawFunds(withdrawAmount);
                    break;
                case 3:
                    account.displayAccountDetails();
                    break;
                case 4:
                    System.out.println("Thank You For Using The Service in Our Bank!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 4);

        input.close();
    }
}
