package TaskSeventh;

public abstract class Employee {
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    private int employeeId;
    private String employeeName;
    private String employeePhone;

    public Employee(int employeeId, String employeeName, String employeePhone){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;

    }


    public String toString(){
        return "[Employee ID: "+this.employeeId+" , Employee Name: "+this.employeeName+" ,Employee Phone: "+this.employeePhone+"]";
    }
    public abstract double calculateSalary();

}
