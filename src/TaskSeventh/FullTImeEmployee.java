package TaskSeventh;

public class FullTImeEmployee extends Employee{
    private double monthlySalary;
    public FullTImeEmployee(int employeeId, String employeeName, String employeePhone, double monthlySalary){
        super(employeeId,employeeName,employeePhone);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculateSalary() {

        return monthlySalary;
    }

    @Override
    public String toString(){
        return "["+super.toString()+" Monthly Salary: "+this.monthlySalary+"]";
    }
}
