package DemoOOPs.DemoInterFace;

public class FulltimeEmployee extends Employee implements IEmployee{
    private double salaryEmployee;
    public FulltimeEmployee(String nameEmployee, String phoneEmployee, String genderEmployee, double salaryEmployee){
        super(nameEmployee,phoneEmployee,genderEmployee);
        this.salaryEmployee = salaryEmployee;
    }

    @Override
    public double calculateSalary() {
        return salaryEmployee;
    }

    @Override
    public void checkIn() {
        System.out.println("9am");
    }
}
