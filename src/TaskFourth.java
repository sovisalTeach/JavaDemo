import java.util.Arrays;
import java.util.Scanner;

public class TaskFourth {
    public void exerciseOne(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        int choice;
        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Count the number of characters in the sentence.");
            System.out.println("2. Count the number of words in the sentence.");
            System.out.println("3. Convert the sentence to uppercase.");
            System.out.println("4. Convert the sentence to lowercase.");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();


            switch (choice) {
                case 1:
                    int charCount = sentence.length();
                    System.out.println("Number of characters: " + charCount);
                    break;
                case 2:
                    String[] words = sentence.split(" ");
                    int wordCount = words.length;
                    System.out.println("Number of words: " + wordCount);
                    break;
                case 3:
                    String uppercaseSentence = sentence.toUpperCase();
                    System.out.println("Uppercase sentence: " + uppercaseSentence);
                    break;
                case 4:
                    String lowercaseSentence = sentence.toLowerCase();
                    System.out.println("Lowercase sentence: " + lowercaseSentence);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 0);

        input.close();
    }
    public void exerciseTwo(){
        Scanner input = new Scanner(System.in);

        int inventorySize = 3;

        String[] products = new String[inventorySize];
        int[] quantities = new int[inventorySize];
        int productCount = 0;

        int choice;
        do {
            System.out.println("\nInventory Management System:");
            System.out.println("1. View available products and quantities");
            System.out.println("2. Add a new product to inventory");
            System.out.println("3. Update product quantity");
            System.out.println("4. Remove a product from inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Current Inventory:");
                    if (productCount == 0) {
                        System.out.println("Inventory is empty.");
                    } else {
                        for (int i = 0; i < productCount; i++) {
                            System.out.println("Product: "+products[i] + " - Quantity: " + quantities[i]);
                        }
                    }
                    break;
                case 2:
                    if (productCount < inventorySize) {
                        System.out.print("Enter product name to add: ");
                        String newProduct = input.next();
                        System.out.print("Enter quantity for " + newProduct + ": ");
                        int quantity = input.nextInt();

                        products[productCount] = newProduct;
                        quantities[productCount] = quantity;
                        productCount++;

                        System.out.println(newProduct + " added to inventory with quantity: " + quantity+" Successfully!!!");
                    } else {
                        System.out.println("Inventory is full. Cannot add more products.");
                    }
                    break;
                case 3:
                    System.out.print("Enter product name to update quantity: ");
                    String productToUpdate = input.next();
                    int productToUpdateIndex = Arrays.binarySearch(products, productToUpdate);
                    if (productToUpdateIndex<0) {
                        System.out.println("Product not found in inventory.");
                    } else {
                        System.out.print("Enter new quantity for " + productToUpdate + ": ");
                        int newQuantity = input.nextInt();
                        quantities[productToUpdateIndex] = newQuantity;
                        System.out.println(productToUpdate + " quantity updated to: " + newQuantity+" Successfully!!!");
                    }
                    break;
                case 4:
                    System.out.print("Enter product name to remove: ");
                    String productToRemove = input.next();
                    int productToRemoveIndex = Arrays.binarySearch(products,productToRemove);
                    if (productToRemoveIndex<0) {
                        System.out.println("Product not found in inventory.");

                    } else {
                        for (int i = productToRemoveIndex; i < productCount - 1; i++) {
                            products[i] = products[i + 1];
                            quantities[i] = quantities[i + 1];
                        }
                        productCount--;
                        System.out.println(productToRemove + " removed from inventory."+" Successfully!!!");
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 5);

        input.close();
    }
}
