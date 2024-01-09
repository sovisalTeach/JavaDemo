package TaskSeventh;

public class PartTimeEmployee extends  Employee{
    public double getHourWage() {
        return hourWage;
    }

    public void setHourWage(double hourWage) {
        this.hourWage = hourWage;
    }

    public double getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(double totalHour) {
        this.totalHour = totalHour;
    }

    private double hourWage;
    private double totalHour;
    public PartTimeEmployee(int employeeId, String employeeName, String employeePhone, double hourWage, double totalHour){
        super(employeeId, employeeName, employeePhone);
        this.hourWage = hourWage;
        this.totalHour = totalHour;
    }
    @Override
    public double calculateSalary() {

        return this.totalHour*this.hourWage;
    }

    @Override
    public String toString(){
        return "["+super.toString()+" Total Working Hour: "+this.totalHour+" , Hourly Wage: "+this.hourWage+" , Salary: "+this.calculateSalary()+"]";
    }
}
