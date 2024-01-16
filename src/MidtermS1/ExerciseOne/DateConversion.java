package MidtermS1.ExerciseOne;

import java.util.Scanner;

public class DateConversion {
    public String getMonthName(String month) {
        switch (month) {
            case "1":
                return "January";
            case "01":
                return "January";
            case "2":
                return "February";
            case "02":
                return "February";
            case "3":
                return "March";
            case "03":
                return "March";
            case "4":
                return "April";
            case "04":
                return "April";
            case "5":
                return "May";
            case "05":
                return "May";
            case "6":
                return "June";
            case "06":
                return "June";
            case "7":
                return "July";
            case "07":
                return "July";
            case "8":
                return "August";
            case "08":
                return "August";
            case "9":
                return "September";
            case "09":
                return "September";
            case "10":
                return "October";
            case "11":
                return "November";
            case "12":
                return "December";
            default:
                return "Invalid Month";
        }
    }
    public DateConversion(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.next();

        String temp[] = shortDate.split("-");
        if(getMonthName(temp[1]).equalsIgnoreCase("Invalid Month")){
            System.out.println("Wrong Format!!! Please input short date (YYYY-MM-DD)");
        }
        else{

            String year = temp[0];
            String month = temp[1];
            String day = temp[2];
            String monthName = getMonthName(month);
            String fullDate = monthName + " " + day + ", " + year;

            System.out.println("Full date representation: " + fullDate);
        }
        scanner.close();
    }
}
