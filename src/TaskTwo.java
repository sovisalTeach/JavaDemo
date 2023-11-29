import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public void exerciseOne(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 50;
        int randomNumber = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess a number between " + min + " and " + max);

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            if(guess<min || guess>max){
                System.out.println("Invild number ( Range from "+min+" to "+max+" )");
                continue;
            }

            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            }
            else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations! The random number is " + randomNumber + " and you have try it correctly for " + attempts + " attempts.");

        input.close();
    }
    public void exerciseTwo(){
        String[] items = {"Coke", "Pepi", "Milk", "Water"};
        String[] prices = {"1.25", "1.50", "0.75", "0.25"};
        int[] stock = {10, 10, 10, 10};
        Scanner input = new Scanner(System.in);
        BigDecimal balance = new BigDecimal("10");
        System.out.println("Welcome to the JAVA Vending Machine!");
        while (true) {
            System.out.println("Items Available:");
            for (int i = 0; i < items.length; i++) {
                System.out.println((i + 1) + ". " + items[i] + " - $" + prices[i] + " (" + stock[i] + " in stock)");
            }

            System.out.print("\nEnter the number of the item you wish to purchase (or 0 to exit): ");
            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for using the Vending Machine. Your remaining balance is: $" + balance);
                break;
            } else if (choice < 1 || choice > items.length) {
                System.out.println("Invalid selection. Please enter a valid item number.");
                continue;
            }

            int index = choice - 1;
            BigDecimal priceItem = new BigDecimal(prices[index]);
            if (stock[index] > 0) {
                if (balance.compareTo(priceItem) >= 0 ) {
                    System.out.println("Dispensing " + items[index] + ". Enjoy your " + items[index] + "!");
                    balance = balance.subtract(priceItem);
                    stock[index]--;
                    System.out.println("Your remaining balance is: $" + balance);
                    System.out.println();
                } else {
                    System.out.println("Insufficient balance. Please insert more money.");
                    System.out.println();
                }
            } else {
                System.out.println("Sorry, " + items[index] + " is out of stock.");
            }
        }

        input.close();
    }
}
