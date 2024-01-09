package TaskSeventh;

public class EmployeeManagementSystem {
    public EmployeeManagementSystem(){
        FullTImeEmployee employee1 = new FullTImeEmployee(1,"Sok Mov","092888555",500);
        PartTimeEmployee employee2 = new PartTimeEmployee(2,"Ly Dara","012888999",5,34);

        System.out.println("Full-Time Employee Details:");
        System.out.println("Id: "+employee1.getEmployeeId());
        System.out.println("Name: "+employee1.getEmployeeName());
        System.out.println("Phone: "+employee1.getEmployeePhone());
        System.out.println("Salary: "+employee1.calculateSalary());


        System.out.println("\nPart-Time Employee Details:");
        System.out.println("Id: "+employee2.getEmployeeId());
        System.out.println("Name: "+employee2.getEmployeeName());
        System.out.println("Phone: "+employee2.getEmployeePhone());
        System.out.println("Total Hour: "+employee2.getTotalHour());
        System.out.println("Hour Rate: "+employee2.getHourWage());
        System.out.println("Salary: "+employee2.calculateSalary());


    }
}
