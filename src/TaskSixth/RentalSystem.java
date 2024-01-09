package TaskSixth;

import java.util.Scanner;

public class RentalSystem {
    public void rentVehicle(Vehicle vehicle, int rentalDays) {
        vehicle.setRentalDays(rentalDays);
        double totalCost;
        if(rentalDays>=30){
            totalCost = vehicle.calculateRentalCost(0.2);
        }else{
            totalCost = vehicle.calculateRentalCost();
        }
        System.out.println("\nRented a " + vehicle.getYear() + " " + vehicle.getManufacturer() + " " + vehicle.getModel() + " for " + rentalDays + " days. Total cost: $" + totalCost);
    }

    public RentalSystem(){
        Car myCar = new Car("Toyota", "Corolla", 2021, 50.0, 5);
        Motorcycle myMotorcycle = new Motorcycle("Honda", "CBR500R", 2022, 30.0, true);
        Scanner input = new Scanner(System.in);
        int choice;
        int rentalDays=0;

        do{
            System.out.println("=======================================================================================");
            System.out.println("Wellcome to Java Vehicle Renting Application ");
            System.out.println("\nHere is the avaiable options for you to choose:");
            System.out.println("1. A "+ myCar.getYear() + " " + myCar.getManufacturer() + " " + myCar.getModel() + " with " + myCar.getNumberOfSeats() + " seats" + " for $" + myCar.getBaseRentalPrice() + " per day");
            System.out.println("2. A "+ myMotorcycle.getYear() + " " + myMotorcycle.getManufacturer() + " " + myMotorcycle.getModel() + " for $" + myMotorcycle.getBaseRentalPrice() + " per day");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("=======================================================================================");
                    System.out.println("\nYou will get 20% discount if you rent more than 30days!");
                    System.out.print("\nHow many days do you want to rent? : ");
                    rentalDays = input.nextInt();
                    rentVehicle(myCar,rentalDays);
                    break;
                case 2:
                    System.out.println("=======================================================================================");
                    System.out.println("\nYou will get 20% discount if you rent more than 30days!");
                    System.out.print("\nHow many days do you want to rent? : ");
                    rentalDays = input.nextInt();
                    rentVehicle(myMotorcycle,rentalDays);
                    break;
                case 3:
                    System.out.println("=======================================================================================");
                    System.out.println("Thank for using our application. Goodbye!");
                    break;
                default:
                    System.out.println("Invild Choice!!!");
            }
        }while (choice!=3);
        input.close();

    }
}
