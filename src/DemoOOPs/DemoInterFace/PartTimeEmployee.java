package DemoOOPs.DemoInterFace;

public class PartTimeEmployee extends Employee implements IEmployee{
    private double totalHour;
    private double hourWage;
    public PartTimeEmployee(String nameEmployee, String phoneEmployee, String genderEmployee, double totalHour, double hourWage){
        super(nameEmployee, phoneEmployee, genderEmployee);
        this.totalHour = totalHour;
        this.hourWage = hourWage;
    }

    @Override
    public double calculateSalary() {
        return totalHour*hourWage;
    }

    @Override
    public void checkIn() {
        System.out.println("8am");
    }
}
